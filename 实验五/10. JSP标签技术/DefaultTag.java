package com.mytag;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
public class DefaultTag extends SimpleTagSupport {
public void doTag() throws JspException,IOException{
       SwitchTag parent =(SwitchTag) getParent();
       if(parent.getCaseFound()){
   	       return;  
       }else{
   	       getJspBody().invoke(null);
       }	 
    }
}

