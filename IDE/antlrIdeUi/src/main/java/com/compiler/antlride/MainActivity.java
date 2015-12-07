package com.compiler.antlride;

import java.util.ArrayList;
import java.util.List;

import com.compiler.antlride.antlr.QuplaCompile;
import com.compiler.antlride.utils.ErrorAdapter;
import com.compiler.antlride.utils.ErrorInfo;
import com.dahanservice.antlrideui.R;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	
	DrawerLayout mDrawerLayout;
	ErrorAdapter errorAdapter;
	RecyclerView errorRecyclerView;
	LinearLayoutManager layoutManager;
	EditText edtCode;
	ImageView imgLaughWhenErrorIsNull;
	List<String> codeList;
	String codeText = "";
	ArrayList<ErrorInfo> errorlist;
	boolean[] errorLineTrue;
	String result = "<html><body>";
	boolean isFirst = true;
	InputMethodManager imm;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initToolBar();
		initViews();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.main, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
        case android.R.id.home:
            mDrawerLayout.openDrawer(GravityCompat.START);
            return true;     
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void initViews(){
		errorRecyclerView = (RecyclerView) findViewById(R.id.errorRecyclerView);
		errorAdapter = new ErrorAdapter(MainActivity.this);
		layoutManager = new LinearLayoutManager(MainActivity.this);
        errorRecyclerView.setHasFixedSize(true);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.setSmoothScrollbarEnabled(true);                
        errorRecyclerView.setLayoutManager(layoutManager);  
	}
	
	private void initToolBar(){
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        toolbar.showOverflowMenu();
        edtCode = (EditText) findViewById(R.id.edtCodeText);
        imgLaughWhenErrorIsNull = (ImageView) findViewById(R.id.imgLaugh);
        imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);	
        setListenersAndViews();
	}
	
	private void setListenersAndViews(){
		NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
		navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
		        @Override
		        public boolean onNavigationItemSelected(MenuItem menuItem) {
		            menuItem.setChecked(true);
		            mDrawerLayout.closeDrawers();
		            Toast.makeText(MainActivity.this, menuItem.getTitle(), Toast.LENGTH_LONG).show();
		            return true;
		        }
		    });
				
		FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
        		imgLaughWhenErrorIsNull.setVisibility(View.INVISIBLE);
        		imm.hideSoftInputFromWindow(edtCode.getWindowToken(), 0);
				codeText = edtCode.getText().toString();
				codeText = codeText + System.getProperty("line.separator");
		    	String codeString = changeStringTohtml(codeText);
		    	codeString = codeString + System.getProperty("line.separator");
		        codeList = new ArrayList<String>();		    	
		    	String[] codeArray = codeString.split("\n");		    	
		    	for(int count = 0; count < codeArray.length; count++){
		    		//Log.i("Code of Line " + count, codeArray[count]);
		    		codeList.add(codeArray[count]);
		    	}
		    	errorLineTrue = new boolean[codeArray.length];
		    	
		    	// Enter Any code and  function for compile Here
		    	new LoadErrorsRecyclerView().execute();
		    	
		    }
		});		 
		
	}

	private String changeStringTohtml(String input){
		
		input = input.replace("&","&#38;");
		input = input.replace("<","&#60;");
		input = input.replace(">","&#62;");

		return input;		
	}
	
	
	private class LoadErrorsRecyclerView extends AsyncTask<Void, Void, Integer> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();            
        }

        @Override
        protected  Integer doInBackground(Void... params) {
            int isCorrect= 0;
            
            
            
           // Log.i("codeString is exactly : ", codeText);
            QuplaCompile qupla = new QuplaCompile(codeText);
            qupla.CompileCode();
            errorlist = qupla.GetErrors(); 
            
            errorAdapter = new ErrorAdapter(errorlist, MainActivity.this);
            return isCorrect;                
        }
        
        @Override
        protected void onPostExecute(Integer args) {
        	errorRecyclerView.setAdapter(errorAdapter);
        	
        	if(errorAdapter.getItemCount() == 0){
        		imgLaughWhenErrorIsNull.setVisibility(View.VISIBLE);
        	}
        	
        	 for(int count = 0; count<errorlist.size(); count++){
             	
                 int line = errorlist.get(count).errorLine;
             	if(line != -1 && (line-1) != codeList.size()){
             		errorLineTrue[line-1] = true;
             		Log.i("error", errorlist.get(count).errorContent);
             	}
             	
             }
              
             for(int count = 0; count<codeList.size(); count++){
             	if(errorLineTrue[count] == true){
             		result = result + "<font color='#F06292'>"+ codeList.get(count).toString()+"</font>" ;
             		if(count != codeList.size() - 1){
             			result = result + "<br>";
             		}
             	}
             	
             	else{
             		result = result + codeList.get(count).toString();
             		if(count != codeList.size() - 1){
             			result = result + "<br>";
             		}
             	}
             }
             
            result = result + "</body></html>";  	
        	edtCode.setText(Html.fromHtml(result));
        	edtCode.setSelection(edtCode.getText().length());
        	result = "";
        	codeList.clear();
        }
                
        @Override
        protected void onProgressUpdate(Void... values) {
        	
        	super.onProgressUpdate(values);
        }      
        
    }
	
}
