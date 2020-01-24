package com.model;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.ArrayList;
import com.model.CustomerBean1;

public class SampleDAO{
   private static InitialContext context= null;
   private DataSource dataSource = null;
   private static final String SELECT_SQL = "SELECT * FROM customer";
   private static final String GET_ONE_SQL = 
"SELECT custName,email,phone FROM customer WHERE custName=?";
   private static final String INSERT_SQL = "INSERT INTO customer VALUES(?,?,?)";
   private static final String DELETE_SQL = 
"DELETE FROM customers WHERE custName = ?";
   private static final String UPDATE_SQL = 
"UPDATE customers SET email=? , phone=? WHERE custName=?";
   
   public SampleDAO(){
   	try{
   	  if(context == null){
	       context = new InitialContext();
	      }
	      dataSource = (DataSource)context.lookup("java:comp/env/jdbc/sampleDS");
     }catch(NamingException e2){
     }
   }
   public Connection getConnection(){
Connection conn = null;
   try{
      conn = dataSource.getConnection();
   }catch(SQLException e){ } 
return  conn; 	
}
   // 查询所有客户信息
   public ArrayList<CustomerBean1> selectCustomer(){  	  
   	   Connection conn = null;
   	   PreparedStatement pstmt = null;
   	   ResultSet rst = null;
   	   CustomerBean1  customer = new CustomerBean1();
   	   ArrayList<CustomerBean1> custList = new ArrayList<CustomerBean1>();
   	   try{
   	     conn = dataSource.getConnection();
   	  	 pstmt = conn.prepareStatement(SELECT_SQL);
   	  	 rst = pstmt.executeQuery();
   	     while(rst.next()){
   	        customer.setCustName(rst.getString("custName"));
   	        customer.setEmail(rst.getString("email"));
   	        customer.setPhone(rst.getString("phone"));	
   	        custList.add(customer);	
   	     }
   	     pstmt.close();
   	     return custList;
   	   }catch(SQLException se){
   	  	 return null;
   	   }finally{
   	  	 try{
   	  	 	conn.close();
   	  	 }catch(SQLException se){
   	  	 }
   	   }
   }
   // 插入一条客户记录
   public boolean insertCustomer(CustomerBean1 customer){  	  
   	   Connection conn = null;
   	   PreparedStatement pstmt = null;
   	   try{
   	  	 conn = dataSource.getConnection();
   	  	 pstmt = conn.prepareStatement(INSERT_SQL); 
   	     pstmt.setString(1,customer.getCustName());
   	     pstmt.setString(2,customer.getEmail());
   	     pstmt.setString(3,customer.getPhone());
   	     pstmt.executeUpdate();
   	     pstmt.close();
   	     return true;
   	   }catch(SQLException se){
   	  	 return false;
   	   }finally{
   	  	  try{
   	  	 	conn.close();
   	  	  }catch(SQLException se){ }
   	   }
   }   
 // 按姓名检索客户记录
   public CustomerBean1 searchCustomer(String custName){  	  
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rst = null;
      CustomerBean1  customer = new CustomerBean1();
      try{
        conn = dataSource.getConnection();
   	  pstmt = conn.prepareStatement(GET_ONE_SQL); 
   	  pstmt.setString(1,custName);
   	  rst = pstmt.executeQuery();
   	  if(rst.next()){
   	    customer.setCustName(rst.getString("custName"));
   	    customer.setEmail(rst.getString("email"));
   	    customer.setPhone(rst.getString("phone"));
   	  }
   	  rst.close();
   	  pstmt.close();
   	 }catch(SQLException se){
   	  	return null;
   	 }finally{
   	  	 try{
   	  	 	conn.close();
   	  	 }catch(SQLException se){
   	  	 }
   	 }
   	 return customer;
   }   
}
