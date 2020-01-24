package sampleLib;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag1 extends SimpleTagSupport{
  public void doTag() throws JspException, IOException{
    JspWriter out = getJspContext().getOut();
    out.print("<font color='blue'>Hello, This is a simple tag extending from SimpleTagSupport.</font>");
  }
}
