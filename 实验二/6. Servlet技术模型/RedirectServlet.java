package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="SendRedirect",urlPatterns={"/redirect.do"})
public class RedirectServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,
	                       HttpServletResponse response)
	                       throws IOException,ServletException{
	   String userAgent = request.getHeader("User-Agent");
	   // 在请求对象上存储一个属性
	   request.setAttribute("param1", "请求作用域属性");
	   // 在会话对象上存储一个属性
	   request.getSession().setAttribute("param2", "会话作用域属性");
	   if((userAgent!=null)&&(userAgent.indexOf("MSIE")!=-1)){
	       response.sendRedirect("welcome.jsp");
       }else{
           response.sendRedirect("http://localhost:8080/");
	   }
	}
}
