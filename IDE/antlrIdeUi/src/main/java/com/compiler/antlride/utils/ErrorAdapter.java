package com.compiler.antlride.utils;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.dahanservice.antlrideui.R;

public class ErrorAdapter extends RecyclerView.Adapter<ErrorAdapter.ContactViewHolder> {

    private List<ErrorInfo> errorList;
	public static Context contextMain;
	
    public ErrorAdapter(List<ErrorInfo> errorList,Context context) {
        this.errorList = errorList;
        ErrorAdapter.contextMain = context;
    }

    public ErrorAdapter(Context context) {
        this.errorList = new ArrayList<ErrorInfo>();
        ErrorAdapter.contextMain = context;        
    }
    
    @Override
    public int getItemCount() {
        return errorList.size();
    }

    
    public void removeFirstItems(int count) {
        for (int i=0; i<count; i++) 
        	errorList.remove(0);
        notifyDataSetChanged();
    }
    
    public void insertItem(int count, ErrorInfo object) {
    	errorList.add(object);
        notifyDataSetChanged();
    }

    
    @Override
    public void onBindViewHolder(ContactViewHolder appViewHolder, final int position) {
    	
    	
        ErrorInfo appInfo = errorList.get(position);
        appViewHolder.errorType.setText(appInfo.errorType);
        appViewHolder.errorContent.setText(appInfo.errorContent);
        int id = getResourceId(appInfo.errorIcon, "drawable", "com.dahanservice.antlrideui");
        appViewHolder.errorImage.setImageResource(id);
        
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_item_app, viewGroup, false);
            ContactViewHolder error = new ContactViewHolder(itemView);
            return error;
       
    }
    
    public static int getResourceId(String pVariableName, String pResourcename, String pPackageName) 
    {
        try {
            return  contextMain.getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } 
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView errorType;
        protected TextView errorContent;
        protected ImageView errorImage;
        protected CardView item_card;

        public ContactViewHolder(View v) {
            super(v);
            
            contextMain = v.getContext();
            errorType =  (TextView) v.findViewById(R.id.txtErrorType);
            errorContent = (TextView)  v.findViewById(R.id.txtErrorContent);
            errorImage = (ImageView) v.findViewById(com.dahanservice.antlrideui.R.id.imgErrorIcon);
            item_card = (CardView) v.findViewById(R.id.card_view);
                  
        }
		
    } 

}