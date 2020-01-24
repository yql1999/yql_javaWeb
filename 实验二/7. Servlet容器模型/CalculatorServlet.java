package com.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculatorServlet extends HttpServlet{
   private int result;
   private int sleepTime;
   
   public void init(){
   	String sleep_time = getInitParameter("sleep.time");
   	sleepTime = getNumber(sleep_time);
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException,ServletException {
     request.setCharacterEncoding("gb2312");
String value1 = request.getParameter("value1");
     int v1 = getNumber(value1);
     String value2 = request.getParameter("value2");
     int v2 = getNumber(value2);
     String op = request.getParameter("submit");
     if(op.equals("相加")){
     	result = v1 + v2;
     }else{
     	result = v1 - v2;
     }
     try{
     	Thread.sleep(sleepTime);
     }catch(InterruptedException e){
     	log("Exception during sleeping.");
     }
     
     try{
     	response.setContentType("text/html ;charset=gb2312");
     	PrintWriter out = response.getWriter();
     	out.println("<html><body>");
     	out.println(v1 +"与"+ v2 + op +"结果是"+result);
     	out.println("</body></html>");
     }catch(Exception e){
     	log("Error writing output.");
     }
   }
   private int getNumber(String s){
   	int result = 0;
 try{
   	  result = Integer.parseInt(s);
   	}catch(NumberFormatException e){
   	  log("Error Parseing "+s);
   	}
   	return result;
   }
}
