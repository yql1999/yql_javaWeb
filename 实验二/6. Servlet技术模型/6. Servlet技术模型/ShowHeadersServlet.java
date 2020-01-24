package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;

public class ShowHeadersServlet extends HttpServlet{
public void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
            response.setContentType("text/html;charset=gb2312");
PrintWriter out = response.getWriter();
out.println("<html><body>");
out .println("下面是服务器收到的请求头信息<p>");
            out.println(request.getMethod()+" "
    	        +request.getRequestURI()+" "
    	        +request.getQueryString()+" "
    	        +request.getProtocol()+"<br>");

Enumeration headers = request.getHeaderNames();
while(headers.hasMoreElements()){
String header = (String) headers.nextElement();
String value = request.getHeader(header);
out .println(header+" = "+value+"<br>");
}
out .println("</body></html>");
}
}
