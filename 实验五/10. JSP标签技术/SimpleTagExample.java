package sampleLib;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class SimpleTagExample extends SimpleTagSupport{
  public void doTag() throws JspException, IOException{
    JspWriter out = getJspContext().getOut();
    out.print("<font color='red'>�����ǩ��ǰ<br></font><br />");
    // ��ñ�ǩ�����ݲ����͵�JSP��ʾ
    getJspBody().invoke(null);
    out.print("<br /><font color='blue'>�����ǩ���<br></font>");
  }
}
