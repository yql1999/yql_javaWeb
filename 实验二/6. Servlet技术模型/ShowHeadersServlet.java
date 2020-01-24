package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
     
@WebServlet("/ShowHeaders")
public class ShowHeadersServlet extends HttpServlet{
public void doGet(HttpServletRequest request, 
HttpServletResponse response)
throws ServletException, IOException{
      response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
out.println("<html><body>");
out.println("<head><title>����ͷ��Ϣ</title></head>");
out.println("�������յ�������ͷ��Ϣ<p>");
      out.println(request.getMethod()+" "
    	        +request.getRequestURI()+" "
    	        +request.getQueryString()+" "
    	        +request.getProtocol()+"<br>");

Enumeration<String> headers = request.getHeaderNames();
while(headers.hasMoreElements()){
String header = (String) headers.nextElement();
String value = request.getHeader(header);
out.println(header+" = "+value+"<br>");
}
out.println("</body></html>");
}
}
