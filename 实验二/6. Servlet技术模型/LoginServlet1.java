package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="LoginServlet",urlPatterns={"/login1.do"})
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request, 
HttpServletResponse response)
               throws ServletException, IOException {
String username = request.getParameter("username");
      String password = request.getParameter("password");
      // �û����Ϳ����Ϊadmin����Ϊ��¼�ɹ�
      if(username.equals("admin")&&password.equals("admin")){
          request.setAttribute("username", username);
          RequestDispatcher rd = 
request.getRequestDispatcher("/welcome.jsp");
          rd.forward(request, response);
      }else{
          RequestDispatcher rd = 
request.getRequestDispatcher("/login.jsp");
         rd.forward(request, response);
      }
   }
}
