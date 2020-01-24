package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ClientInfoServlet")
public class ClientInfoServlet extends HttpServlet {
	    public void doGet(HttpServletRequest request,
HttpServletResponse response)
	                   	throws ServletException, IOException {
		   response.setContentType("text/html;charset=UTF-8");
		   PrintWriter out = response.getWriter();
		   out.println("<html><head>");
		   out.println("<title>获取客户端信息</title></head>");
		   out.println("<body>");
		   out.println("<h4>客户端信息：</h4>");
		   out.println("<table border=’1’>");
		   out.println("<tr><td>客户主机名</td>");
		   out.println("<td>" + request.getRemoteHost() + "</td></tr>");
		   out.println("<tr><td>客户IP地址</td>");
		   out.println("<td>" + request.getRemoteAddr() + "</td></tr>");
		   out.println("<tr><td>端口</td>");
		   out.println("<td>" + request.getRemotePort() + "</td></tr>");
		   out.println("<tr><td>请求方法</td>");
		   out.println("<td>" + request.getMethod() + "</td></tr>");
		   out.println("<tr><td>请求协议</td>");
		   out.println("<td>" + request.getProtocol() + "</td></tr>");
        out.println("<tr><td>请求URI</td>");
		   out.println("<td>" + request.getRequestURI() + "</td></tr>");
		   out.println("</table>");
		   out.println("</body></html>");
	}
	public void doPost(HttpServletRequest request,
HttpServletResponse response)
		                 throws ServletException, IOException {
		    doGet(request, response);
	    }
}
