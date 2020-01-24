package com.demo;
import java.sql.*;
import java.util.ArrayList;
import com.demo.Customer;

public class CustomerDao extends BaseDao{
   // 插入一条客户记录
   public boolean addCustomer(Customer customer){  	  
   	   String sql = "INSERT INTO customers" +
   	   		"(cust_id,cname,email,balance)VALUES(?,?,?,?)";	   
   	   try(
   		 Connection conn = dataSource.getConnection();
   		 PreparedStatement pstmt = conn.prepareStatement(sql))
   	   { 
   	     pstmt.setString(1,customer.getCust_id());
   	     pstmt.setString(2,customer.getCname());
   	     pstmt.setString(3,customer.getEmail());
   	     pstmt.setDouble(4,customer.getBalance());
   	     pstmt.executeUpdate();
   	     return true;
   	   }catch(SQLException se){
   	  	  se.printStackTrace();
   		  return false;
   	   }
   } 
   // 按姓名检索客户记录
   public Customer findByName(String cname){ 
	      String sql = "SELECT cust_id,cname,email,balance" +
	  		             " FROM customers WHERE cname=?";
      Customer  customer = new Customer();
      try(
    	   Connection conn = dataSource.getConnection();
    	   PreparedStatement pstmt = conn.prepareStatement(sql)){ 
   	   pstmt.setString(1,cname);
   	   try(ResultSet rst = pstmt.executeQuery()){
   	     if(rst.next()){
   	       customer.setCust_id(rst.getString("cust_id"));
   	       customer.setCname(rst.getString("cname"));
   	       customer.setEmail(rst.getString("email"));
   	       customer.setBalance(rst.getDouble("balance"));
   	     }
   	    }
      }catch(SQLException se){
   	  	return null;
   	  }
   	  return customer;
   }
   // 查询所有客户信息
   public ArrayList<Customer> findAllCustomer(){  	  
   	  Customer  customer = new Customer();
   	  ArrayList<Customer> custList = new ArrayList<Customer>();
   	  String sql = "SELECT * FROM customers";
   	  try( 
   		 Connection conn = dataSource.getConnection();
   		 PreparedStatement pstmt = conn.prepareStatement(sql);
   		 ResultSet rst = pstmt.executeQuery()){  		 
   	      while(rst.next()){
   	        customer.setCust_id(rst.getString("cust_id"));
   	        customer.setCname(rst.getString("cname"));
   	        customer.setEmail(rst.getString("email"));
   	        customer.setBalance(rst.getDouble("balance"));	
   	        custList.add(customer);	
   	    }	     
   	     return custList;
   	  }catch(SQLException e){
   	      e.printStackTrace();
   		 return null;
   	  }
   }
}

