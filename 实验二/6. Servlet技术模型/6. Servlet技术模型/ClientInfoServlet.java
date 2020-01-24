package com.demo;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientInfoServlet extends HttpServlet {
	 public void doGet(HttpServletRequest request,HttpServletResponse response)
	                   	throws ServletException, IOException {
			response.setContentType("text/html;charset=GB2312");
			PrintWriter out = response.getWriter();

			out.println("<html><head>");
			out.println("<title>��ȡ�ͻ�����Ϣ</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h4>�ͻ�����Ϣ��</h4>");
			out.println("<table width=\"350\" border=\"1\">");

			out.println("<tr><td width=\"175\">�ͻ�������</td>");
			out.println("<td width=\"175\">" + request.getRemoteHost() + "</td>");
			out.println("</tr>");

			out.println("<tr><td>�ͻ�IP��ַ</td>");
			out.println("<td>" + request.getRemoteAddr() + "</td>");
			out.println("</tr>");
			
			out.println("<tr><td>�˿�</td>");
			out.println("<td>" + request.getRemotePort() + "</td>");
			out.println("</tr>");
			
			out.println("<tr><td>���󷽷�</td>");
			out.println("<td>" + request.getMethod() + "</td>");
			out.println("</tr>");
			
			out.println("<tr><td>����Э��</td>");
			out.println("<td>" + request.getProtocol() + "</td>");
			out.println("</tr>");
			
			out.println("<tr><td>���뷽ʽ</td>");
			out.println("<td>" + request.getCharacterEncoding() + "</td>");
			out.println("</tr>");

          out.println("<tr><td>��������</td>");
			out.println("<td>" + request.getContentType() + "</td>");
			out.println("</tr>");
					
          out.println("<tr><td>����URI</td>");
			out.println("<td>" + request.getRequestURI() + "</td>");
			out.println("</tr>");								
			out.println("</table>");
			out.println("</body></html>");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		                 throws ServletException, IOException {
		doGet(request, response);
	}
}
