package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.model.BookBean;
import javax.sql.*;
import javax.naming.*;

public class BookQueryServlet1 extends HttpServlet{
  DataSource dataSource;
  
  public void init() {
    try {
      Context context = new InitialContext();
      dataSource = (DataSource)context.lookup("java:comp/env/jdbc/sampleDS");
    }catch(NamingException ne){
       log("Exception:"+ne);
    }
  }

  public void doPost(HttpServletRequest request,HttpServletResponse response)
             throws ServletException,IOException{
    Connection dbConnection=null;
    try{
        dbConnection = dataSource.getConnection();
        
    }catch(SQLException se){
       log("Exception111:"+se);
    }

    String bookid = request.getParameter("bookid");
    try{
      String sql="SELECT * FROM books WHERE bookid=?";
      PreparedStatement pstmt = dbConnection.prepareStatement(sql);
      pstmt.setString(1,bookid);
      ResultSet rst = pstmt.executeQuery();
      if(rst.next()){
        BookBean book = new BookBean();
        book.setBookid(rst.getString("bookid"));
        book.setTitle(rst.getString("title"));
        book.setAuthor(rst.getString("author"));
        book.setPrice(rst.getFloat("price"));
        book.setPublisher(rst.getString("publisher"));

        request.getSession().setAttribute("book", book);
        RequestDispatcher view =
                     request.getRequestDispatcher("/showBook.jsp");
        view.forward(request, response);
      }else{
        RequestDispatcher view =
                     request.getRequestDispatcher("/error.jsp");
        view.forward(request, response);
      }	
    }catch(SQLException e){
      log("∑¢…˙“Ï≥££∫",e);
    }finally{
      try{
      	dbConnection.close();	
      }catch(SQLException e){ }
    }
  }
}
