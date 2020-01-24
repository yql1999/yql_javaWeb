package com.demo;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
// 这里省略了若干导入语句
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	   Connection dbconn = null;
	   public void init() {
	      String driver = "org.postgresql.Driver";
	      String dburl = "jdbc:postgresql://127.0.0.1:5432/postgres";
	      String username = "postgres";
	      String password = "postgres";
	      try{
	         Class.forName(driver); // 加载驱动程序
	         // 创建连接对象
	         dbconn = DriverManager.getConnection(
	      	                    dburl,username,password);
	      }catch(ClassNotFoundException e1){
	      }catch(SQLException e2){}
	   }
  
	   public void doGet(HttpServletRequest request,
	                        HttpServletResponse response)
	                        throws ServletException,IOException{
		     ArrayList<Product> prodList = null; 
		     prodList = new ArrayList<Product>();
		     try{
	           String sql="SELECT * FROM products WHERE prod_id < 'P4'";
	           PreparedStatement pstmt = dbconn.prepareStatement(sql);
	           ResultSet result = pstmt.executeQuery();
	           while(result.next()){
	              Product product = new Product();
	              product.setProd_id(result.getString("prod_id"));
	              product.setPname(result.getString("pname"));
	              product.setPrice(result.getDouble("price"));
	              product.setStock(result.getInt("stock"));
	              prodList.add(product);
	          }
	          if(!prodList.isEmpty()){
	    	        request.getSession().setAttribute("prodList",prodList);
	             response.sendRedirect("/chap07/showProduct.jsp");
	          }else{
	            response.sendRedirect("/chap07/error.jsp");
	         }
	       }catch(SQLException e){
	  	      e.printStackTrace();
	       }
	   }
}

