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
       // 创建实例并设置属性
       CustomerBean customer = new CustomerBean();
       customer.setCustName(request.getParameter("custName"));
       customer.setEmail(request.getParameter("email"));
       customer.setPhone(request.getParameter("phone"));

       // 得到用户名建立文件路径
       String name = request.getParameter("custName");
       String  relativePath =
              "/WEB-INF/classes/customerData/" + name+ ".ser";
       String realPath = getServletContext().getRealPath(relativePath);
       // 将对象序列化到文件中
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
