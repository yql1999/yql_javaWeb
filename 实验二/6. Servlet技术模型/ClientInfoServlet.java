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
		   out.println("<title>��ȡ�ͻ�����Ϣ</title></head>");
		   out.println("<body>");
		   out.println("<h4>�ͻ�����Ϣ��</h4>");
		   out.println("<table border=��1��>");
		   out.println("<tr><td>�ͻ�������</td>");
		   out.println("<td>" + request.getRemoteHost() + "</td></tr>");
		   out.println("<tr><td>�ͻ�IP��ַ</td>");
		   out.println("<td>" + request.getRemoteAddr() + "</td></tr>");
		   out.println("<tr><td>�˿�</td>");
		   out.println("<td>" + request.getRemotePort() + "</td></tr>");
		   out.println("<tr><td>���󷽷�</td>");
		   out.println("<td>" + request.getMethod() + "</td></tr>");
		   out.println("<tr><td>����Э��</td>");
		   out.println("<td>" + request.getProtocol() + "</td></tr>");
        out.println("<tr><td>����URI</td>");
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
