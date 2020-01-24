package com.model;
import java.io.Serializable;

public class CustomerBean1 implements Serializable{
   private String custName;
   private String email;
   private String phone;
   
   public void setCustName(String custName){ 
   	  this.custName = custName; 
   }
   public void setEmail(String email) {
   	  this.email = email; 
   }
   public void setPhone(String phone) {
   	  this.phone = phone; 
   }
   public String getCustName(){
   	  return this.custName; 
   }
   public String getEmail() {
   	  return this.email; 
   }
   public String getPhone() {
   	  return this.phone; 
   }      
}
