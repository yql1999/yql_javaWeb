package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.dao.UserDao;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		String location="";
		
		if(action.equals("login")) {
			Cookie []cookies=request.getCookies();
			String username="123";
			String password="";

			if(cookies!=null) {
				for(int i=0;i<cookies.length;i++) {
					Cookie cookie=cookies[i];
					if(cookie.getName().equals("username"))
						username=cookie.getValue();
					if(cookie.getName().equals("password"))
						password=cookie.getValue();

					/*
					 * System.out.println(username); System.out.println(password);
					 */
				}
			}
			
			User user=UserDao.verifyAccount(username, password);
			
			//若登录成功
			if(user!=null) {
				HttpSession session=request.getSession();
				request.setAttribute("user", user);
				request.setAttribute("message", "恭喜你，登录成功！");
				location="userinfo.jsp";
			}
			else {
				HttpSession session=request.getSession();
				request.setAttribute("message", "<font color='red'>用户名或密码不正确，请重新登录！</font>");
				location="login.jsp";
			}
		}
		
		else if(action.equals("userinfo01")) {
			location="register.jsp";
		}
		
		else if(action.equals("userinfo02")) {
			location="login.jsp";
		}
		
		else if(action.equals("register")) {
			String username = request.getParameter("username");
			String sex = request.getParameter("sex");
			//字符串转整型
			int age = Integer.parseInt(request.getParameter("age"));
			String address = request.getParameter("address");
			String password = request.getParameter("password");
			
			User user = new User(username,password,sex,age,address);
			
			boolean isSuccess=UserDao.addUser(username, password, sex, age, address);
			if(isSuccess) {
				HttpSession session=request.getSession();
				request.setAttribute("message", "恭喜你，注册成功！");
				location="login.jsp"; 
			}
			else {
				HttpSession session=request.getSession();
				request.setAttribute("message", "对不起，注册失败！");
				location="register.jsp";
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(location);
		rd.forward(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		String location="";
		
		if(action.equals("login")) {
			String username="";
			String password="";
			username=request.getParameter("username");
			password=request.getParameter("password");
			
			User user=UserDao.verifyAccount(username, password);
			
			//若登录成功
			if(user!=null) {
				HttpSession session=request.getSession();
				request.setAttribute("user", user);
				request.setAttribute("message", "恭喜你，登录成功！");
				//如果用户选了自动登录复选框，就向浏览器发送两个Cookie
				if((request.getParameter("check"))!=null && (request.getParameter("check")).equals("check")) {
					Cookie nameCookie=new Cookie("username",username);
					Cookie pswdCookie=new Cookie("password",password);
					nameCookie.setMaxAge(60*60);
					pswdCookie.setMaxAge(60*60);
					response.addCookie(nameCookie);
					response.addCookie(pswdCookie);
				}
				location="userinfo.jsp";
			}
			else {
				HttpSession session=request.getSession();
				request.setAttribute("message", "<font color='red'>用户名或密码不正确，请重新登录！</font>");
				location="login.jsp";
			}
		}
		
		else if(action.equals("userinfo01")) {
			location="register.jsp";
		}
		
		else if(action.equals("userinfo02")) {
			location="login.jsp";
		}
		
		else if(action.equals("register")) {
			String username = request.getParameter("username");
			String sex = request.getParameter("sex");
			//字符串转整型
			int age = Integer.parseInt(request.getParameter("age"));
			String address = request.getParameter("address");
			String password = request.getParameter("password");
			
			User user = new User(username,password,sex,age,address);
			
			boolean isSuccess=UserDao.addUser(username, password, sex, age, address);
			if(isSuccess) {
				HttpSession session=request.getSession();
				request.setAttribute("message", "恭喜你，注册成功！");
				location="login.jsp"; 
			}
			else {
				HttpSession session=request.getSession();
				request.setAttribute("message", "对不起，注册失败！");
				location="register.jsp";
			}
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher(location);
		rd.forward(request,response);
	}
}
