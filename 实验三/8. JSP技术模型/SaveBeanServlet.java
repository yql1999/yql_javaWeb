package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.model.CustomerBean;

public class SaveBeanServlet extends HttpServlet{
   public void doPost(HttpServletRequest request, HttpServletResponse response)
          throws IOException,ServletException {
     String message="";
     try {
       // ����ʵ������������
       CustomerBean customer = new CustomerBean();
       customer.setCustName(request.getParameter("custName"));
       customer.setEmail(request.getParameter("email"));
       customer.setPhone(request.getParameter("phone"));

       // �õ��û��������ļ�·��
       String name = request.getParameter("custName");
       String  relativePath =
              "/WEB-INF/classes/customerData/" + name+ ".ser";
       String realPath = getServletContext().getRealPath(relativePath);
       // ���������л����ļ���
       FileOutputStream fos = new FileOutputStream(realPath);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(customer);
       oos.close();
       message = "Successfully saved the bean as <br>" + realPath;
       request.setAttribute("msg",message);
    } catch(Exception e){
       message = "An Exception occured.<br>" +e;
       request.setAttribute("msg",message);
}
   getServletContext().getRequestDispatcher("/customer.jsp").forward(request,response);
  }
}
