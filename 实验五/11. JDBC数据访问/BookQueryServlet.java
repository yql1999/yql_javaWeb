package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.model.BookBean;

public class BookQueryServlet extends HttpServlet{
  Connection dbConnection;
  public void init() {
    String driver = "org.postgresql.Driver";
    String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
    String username = "bookstore";
    String password = "bookstore";
    try{
      Class.forName(driver); //加载数据库驱动程序
      //创建数据库连接对象
      dbConnection = DriverManager.getConnection(
      	                    dburl,username,password);
    }catch(ClassNotFoundException e1){
    }catch(SQLException e2){}
  }
  public void doPost(HttpServletRequest request,HttpServletResponse response)
             throws ServletException,IOException{
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
  book.setPrice(rst.getDouble("price"));
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
  	  e.printStackTrace();
    }
}
public void destroy(){
try {
dbConnection.close();
}catch(Exception e){
e.printStackTrace();
}
}
}
