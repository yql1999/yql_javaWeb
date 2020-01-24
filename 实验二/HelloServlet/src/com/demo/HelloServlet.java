// HelloServlet.java
package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet(name = "HelloServlet", urlPatterns = { "/HelloServlet.do" })
public class HelloServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<font color = '#0000ff'>");
		out.println("<h3>Hello,World!</h3>");
		out.println("The time now is:" + new java.util.Date());
		out.println("</font>");
		out.println("</body>");
		out.println("</html>");
	}
}
