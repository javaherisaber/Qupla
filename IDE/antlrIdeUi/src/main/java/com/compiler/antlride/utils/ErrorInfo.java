package com.compiler.antlride.utils;

import android.graphics.drawable.Drawable;


public class ErrorInfo {
	
	public String errorType;
    public String errorIcon;
    public String errorContent;
    public int errorLine;

    protected static final String NAME_PREFIX = "";
    protected static final Drawable SURNAME_PREFIX = null;
    protected static final String EMAIL_PREFIX = "";
    
    public ErrorInfo (String errortype,String erroricon,String errorcontent,int errorline)
    {
    	this.errorType = errortype;
    	this.errorContent = errorcontent;
    	this.errorIcon = erroricon;
    	this.errorLine = errorline;
    }
}

