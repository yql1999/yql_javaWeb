<%@ page contentType="text/html; charset=gb2312" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>JDBC����ACCESS���ݿ�ʾ��-����ODBC����Դ</title>
</head>

<body>
<%

Connection conn=null;//�������ݿ����ӱ���
Statement stmt=null; //����SQL���������
ResultSet rs=null;   //����ִ��SQL���������صĽ������

//1. �������ݿ���������
try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //����JDBC-ODBC�����࣬���ִ�Сд
}
catch(ClassNotFoundException e){
	out.print("<font color=red size=7>");
    out.print(e);
    out.print("</font><br>");
}

//2. ����ACCESS���ݿ�
try{
    String url = "jdbc:odbc:myaccessodbc"; //�������ݿ�����URL�������ִ�Сд
    out.println("���ݿ�����URL�ǣ�"+url+"<br><br><br>");

    //�������ݿ�����
    conn= DriverManager.getConnection(url); //ʹ����仰�������ݿ�����
    out.println("���ݿ����ӳɹ���");
}catch(Exception ex){
	out.print("<font color=red size=7>");
	out.println("���ݿ����ӷ����쳣��");
    out.print(ex);
    out.print("</font>");
}

//3. ����test.mdb���ݿ��е�student�е����ݣ���ʱ���Բ��ù�
try{
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM student");   //ȡ��Student���еļ�¼
    out.println("Student���������£�"+"<br><br><br>");
    while(rs.next()){
      out.print(rs.getInt(1)+" ");
      out.print(rs.getString(2)+"<br><br>");
    }
    rs.close();
    stmt.close();
    conn.close();
}catch(Exception ex){
	out.print("<font color=red size=7>");
    out.print(ex);
    out.print("</font>");
}
%>
</body>
</html>