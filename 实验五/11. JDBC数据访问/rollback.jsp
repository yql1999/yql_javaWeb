<%@page contentType="text/html;charset=gb2312" %>
<%@page import="java.sql.*" %>
SetAutoCommit()��������<br>
<%
  Connection conn=null; //�������ݿ�������
  int count=0;
  //������������
  try
  {
    String driver = "org.postgresql.Driver";
    String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
    String username = "bookstore";
    String password = "bookstore";
    Class.forName(driver); //�������ݿ���������
    //�������ݿ����Ӷ���
    conn = DriverManager.getConnection(dburl,username,password);
    Statement statement=null;

    conn.setAutoCommit(false); //���Զ����������ύ
  
    statement=conn.createStatement();

    count=statement.executeUpdate("insert into customer(custName,email,phone) values('������','li@163.com','tang2')");
    out.print("1.���ݲ���ɹ�������"+Integer.toString(count)+"����¼<br>");
    conn.commit();
    
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('����','liu@163.com','han4')");
    out.print("2.���ݲ���ɹ�������"+Integer.toString(count)+"����¼<br>");
    
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('����','ai@163.com','qing4')");
    out.print("3.���ݲ���ɹ�������"+Integer.toString(count)+"����¼<br>");
    conn.rollback();
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('���','yang@163.com','sui1')");
    out.print("4.���ݲ���ɹ�������"+Integer.toString(count)+"����¼<br>");
    
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