package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="LoginServlet",urlPatterns={"/login.do"})
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request, 
HttpServletResponse response)
                     throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if("admin".equals(username)&& "admin".equals(password)){
            out.println("��¼�ɹ�����ӭ���� "+username);
        }else{
            out.println("�Բ��������û��������벻��ȷ��");
        }
        out.println("</body></html>");
    }
}
