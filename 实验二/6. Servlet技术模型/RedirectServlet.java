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
	   // ����������ϴ洢һ������
	   request.setAttribute("param1", "��������������");
	   // �ڻỰ�����ϴ洢һ������
	   request.getSession().setAttribute("param2", "�Ự����������");
	   if((userAgent!=null)&&(userAgent.indexOf("MSIE")!=-1)){
	       response.sendRedirect("welcome.jsp");
       }else{
           response.sendRedirect("http://localhost:8080/");
	   }
	}
}
