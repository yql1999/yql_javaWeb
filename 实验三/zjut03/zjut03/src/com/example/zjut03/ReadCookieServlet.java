package com.example.zjut03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ReadCookie")
public class ReadCookieServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String cookieName = "username";
		String cookieValue = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals(cookieName))
					cookieValue = cookie.getValue();
			}
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><title>��ȡCookie</title>");
		out.println("<body><h3>�����������һ��Cookie</h3>");
		out.println("Cookie��:" + cookieName + "<br>");
		out.println("Cookieֵ:" + cookieValue + "<br>");
		out.println("</body></html>");
	}
}
