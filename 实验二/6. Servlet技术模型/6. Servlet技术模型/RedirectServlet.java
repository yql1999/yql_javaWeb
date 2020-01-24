package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws IOException,ServletException{
	  String userAgent = request.getHeader("User-Agent");
	  if((userAgent!=null)&&(userAgent.indexOf("MSIE")!=-1)){
	     response.sendRedirect("http://www.microsoft.com");
       return;
	  }else{
	     response.sendRedirect("http://home.netscape.com");
       return;
	  }
	}
}
