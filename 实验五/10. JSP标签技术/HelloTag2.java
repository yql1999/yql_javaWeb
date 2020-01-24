package sampleLib;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag2 extends SimpleTagSupport {
  private String user; 
  public void setUser(String user) {
    this.user = user; 
  }
  public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    try{
     if (user==null){
       out.print("Hello, Guest!<br>");
     }
     else{
       out.print("Hello, "+user+"!<br>");
     }
    } catch(Exception e){
       throw new JspException("Error in HelloTag.doTag()");
    }
 }
}
