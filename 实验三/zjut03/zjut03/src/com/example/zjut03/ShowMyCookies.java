/*	1)首先读取客户端的Cookie，然后判断是否存在一个名称为“myCookie”的Cookie，如果存在则输出其值；
        	如果不存在则设置一个名称为“myCookie”，值为“Fedor”的Cookie，并提示用户“cookie has been set”。
	2)调整IE浏览器的Cookie安全设置，然后运行调试本程序。*/

package com.example.zjut03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowMyCookies")
public class ShowMyCookies extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String cookieName = "myCookie";
		String cookieValue = null;
		// 先用数组获取所有的Cookies
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				// 判断是否存在一个名为“myCookie”的Cookie
				if (cookie.getName().equals(cookieName))
					cookieValue = cookie.getValue();
			}
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><title>读取Cookie</title>");
		
		if (cookieValue != null) {
			out.println("<body><h3>从浏览器读回一个名为“myCookie”的Cookie</h3>");
			out.println("Cookie名:" + cookieName + "<br>");
			out.println("Cookie值:" + cookieValue + "<br>");
		}
		//如果不存在则设置一个名称为“myCookie”，值为“Fedor”的Cookie，并提示用户“cookie has been set”
		else {
			out.println("<body><h3>浏览器中不存在一个名为“myCookie”的Cookie</h3>");
			Cookie userCookie = new Cookie("myCookie", "Fedor");
			userCookie.setMaxAge(60 * 60 * 24 * 7);
			response.addCookie(userCookie);
			out.println("Cookie has been set!"+"<br>");
		}
		out.println("</body></html>");
	}
}
