package com.mytag;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag implements SimpleTag{
	    JspContext jspContext = null;
	    JspTag parent = null;
	    public void setJspContext(JspContext jspContext){
		   this.jspContext = jspContext;
	    }
	    public void setParent(JspTag parent){
		   this.parent = parent;
	    }
	    public void setJspBody(JspFragment jspBody){
	    }
	    public JspTag getParent(){
		    return parent;
	    }
    public void doTag() throws JspException, IOException{
        JspWriter out = jspContext.getOut();
out.print("<font color='blue'>Hello, A simple tag.</font><br>");
out.print("现在时间是："+ new java.util.Date());
    }
}
