package sampleLib;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class SimpleTagExample extends SimpleTagSupport{
  public void doTag() throws JspException, IOException{
    JspWriter out = getJspContext().getOut();
    out.print("<font color='red'>输出标签体前<br></font><br />");
    // 获得标签体内容并发送到JSP显示
    getJspBody().invoke(null);
    out.print("<br /><font color='blue'>输出标签体后<br></font>");
  }
}
