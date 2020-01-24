package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.model.CustomerBean1;
import com.model.SampleDAO;

public class InsertCustomerServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,
                  HttpServletResponse response)
                       throws ServletException,IOException{

response.setContentType("text/html;charset=gb2312");
SampleDAO dao = new SampleDAO();
CustomerBean1 customer = new CustomerBean1 ();
String message = null;
try{
customer.setCustName(request.getParameter("custName"));
customer.setEmail(request.getParameter("email"));
customer.setPhone(request.getParameter("phone"));
boolean success = dao.insertCustomer(customer);
     if(success){
         message = "<li>成功插入一条记录！</li>";
     }else{ 
         message = "<li>插入记录错误！</li>";
      }
    }catch(Exception e){
       message = "<li>插入记录错误！</li>";
    }
    request.setAttribute("result", message);
RequestDispatcher view = 
getServletContext().getRequestDispatcher("/insertCustomer.jsp");
  view.forward (request,response);
  }
}
