package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet2 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     
String username = request.getParameter("username");
      String password = request.getParameter("password");
      String location="";
      	
      if(username.equals("admin")&&password.equals("admin")){
          request.setAttribute("username", username);
          location = "/hello1.jsp";
          RequestDispatcher dispatcher = request.getRequestDispatcher(location);
          dispatcher.forward(request, response);
      }
      else{
         response.sendError(400,"error username or password, login failed£¡");
      }
   }
}
