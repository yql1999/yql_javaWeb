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
    count=statement.executeUpdate("insert into customer(custName,email,phone) values('������','lishimin@163.com','tang2')");
    out.print("���ݲ���ɹ�������"+Integer.toString(count)+"����¼");
  
    statement.close();
    conn.close();
  }catch(Exception e){
    out.print("���ݲ���ʧ��");
    e.printStackTrace();
  }
%>