<%@page contentType="text/html;charset=gb2312" %>
<%@page import="java.sql.*" %>
SetAutoCommit()测试用例<br>
<%
  Connection conn=null; //定义数据库连接类
  int count=0;
  //加载驱动器类
  try
  {
    String driver = "org.postgresql.Driver";
    String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
    String username = "bookstore";
    String password = "bookstore";
    Class.forName(driver); //加载数据库驱动程序
    //创建数据库连接对象
    conn = DriverManager.getConnection(dburl,username,password);
    Statement statement=null;

    conn.setAutoCommit(false); //不自动进行事务提交
  
    statement=conn.createStatement();

    count=statement.executeUpdate("insert into customer(custName,email,phone) values('李世民','li@163.com','tang2')");
    out.print("1.数据插入成功！新增"+Integer.toString(count)+"条记录<br>");
    conn.commit();
    
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('刘彻','liu@163.com','han4')");
    out.print("2.数据插入成功！新增"+Integer.toString(count)+"条记录<br>");
    
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('玄烨','ai@163.com','qing4')");
    out.print("3.数据插入成功！新增"+Integer.toString(count)+"条记录<br>");
    conn.rollback();
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('杨坚','yang@163.com','sui1')");
    out.print("4.数据插入成功！新增"+Integer.toString(count)+"条记录<br>");
    
    conn.commit();
    
    statement.close();
    conn.close();
  
  }catch(Exception ex){
    //ex.printStackTrace();
    out.print("<font color=red size=7>");
	out.print(ex);
	out.print("</font>");
	conn.rollback();
  }
%>