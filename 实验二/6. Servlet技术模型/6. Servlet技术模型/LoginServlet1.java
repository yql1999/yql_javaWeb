package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet1 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     
String username = request.getParameter("username");
      String password = request.getParameter("password");
      String location="";
      	
      if(username.equals("admin")&&password.equals("admin")){
          request.setAttribute("username", username);
          location = "/hello1.jsp";
      }
      else{
          location = "/login1.html";
      }
      RequestDispatcher dispatcher = request.getRequestDispatcher(location);
      dispatcher.forward(request, response);
   }
}
