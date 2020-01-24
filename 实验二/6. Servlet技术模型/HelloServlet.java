package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "helloServlet", urlPatterns = { "/helloServlet.do" })
public class HelloServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, 
HttpServletResponse response) 
throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<body><title>Hello Servlet</title>");
		    out.println("<h3 style='color:#00f'>Hello,World!</h3>");
		    out.println("现在的时间是:"+new java.util.Date());
		    out.println("</body>");
		    out.println("</html>");
	     }
}
