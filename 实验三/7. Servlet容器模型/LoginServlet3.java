package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class LoginServlet3 extends HttpServlet {
   ServletContext context; 
   HashMap<String,String> users = new HashMap<String,String> ();
 
public void init() {
     context = getServletContext();
 users.put("ann", "aaa");
users.put("john", "jjj");
users.put("mark", "mmm");
}
public void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
      doPost(request, response);
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
                 throws ServletException, IOException{   
      String username = request.getParameter("username");
      String password = request.getParameter("password");
   
      if(username!= null && password != null &&
            password.equals(users.get(username))){
       request.setAttribute("username", username);
        RequestDispatcher view = 
     	        context.getRequestDispatcher("/account.do");
        view.forward(request, response);
        return;
     } else{
RequestDispatcher view = 
context.getRequestDispatcher("/error.html");
        view.forward(request, response);
        return;	
     }   
  }
}
