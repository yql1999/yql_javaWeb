package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  response.setContentType("text/html;charset=gb2312");
  PrintWriter out = response.getWriter();
  out.println("<html><body>");
  if(username.equals("admin")&&password.equals("admin")){
     out.println("��¼�ɹ�����ӭ���� "+username);
  }else{
   out.println("�Բ��������û��������벻��ȷ��");
  }
  out.println("</body></html>");
 }
 public void doGet(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException {
     doPost(request,response);
   }
}
