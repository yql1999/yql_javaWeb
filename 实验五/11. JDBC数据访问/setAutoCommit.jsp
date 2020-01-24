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
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('李世民','lishimin@163.com','tang2')");
    out.print("数据插入成功！新增"+Integer.toString(count)+"条记录");
  
    statement.close();
    conn.close();
  }catch(Exception e){
    out.print("数据插入失败");
    e.printStackTrace();
  }
%>