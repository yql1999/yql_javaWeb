package com.demo;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowTimeServlet extends HttpServlet{
  public void doGet(HttpServletRequest request, 
                    HttpServletResponse response)
                throws ServletException, IOException{
    response.setContentType("text/html;charset=gb2312");
    response.setHeader("Refresh","5");
    PrintWriter out = response.getWriter();
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
    String s = sdf.format(date);     // �����ڶ����ʽ��
    out.println("<html>");
    out.println("<body>");
    out.println("<h3 align=\"center\">ÿ5����ˢ��һ��ҳ��</h3><p>");
    out.println("<h3 align=\"center\">���ڵ�ʱ���ǣ�"+s+"</h3><p>");
    out.println("</body>");
    out.println("</html>");
  }  
}
