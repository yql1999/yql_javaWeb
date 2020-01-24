<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.sql.*" %>

<html><head><title>Call Procedure</title></head>
<body>
<%
Connection conn = null;
CallableStatement cstmt = null;
String sql = null;

String driver = "org.postgresql.Driver";
String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
String username = "bookstore";
String password = "bookstore";
try{
  Class.forName(driver); //�������ݿ���������
  //�������ݿ����Ӷ���
  conn = DriverManager.getConnection(dburl,username,password);
}catch(ClassNotFoundException e1){
}catch(SQLException e2){}

try {
sql = "{call set_price(?,?)}";
cstmt = conn.prepareCall(sql);
cstmt.setString(1,"203");
cstmt.setDouble(2, 50.00);
cstmt.executeUpdate ();
out.println("set_price�����ɹ�ִ��<br>");

sql = "{? = call get_price(?)}";
cstmt = conn.prepareCall(sql);
cstmt.setString(2, "203");
cstmt.registerOutParameter(1,java.sql.Types. DOUBLE);
cstmt.execute ();
out.println("get_price�����ɹ�ִ��<br>");
out.println("203�޸ĺ��ֵΪ��"+cstmt.getDouble(1));

}catch(SQLException e){
  out.println(e);
}
finally{
conn.close();
}
%>
</body>
</html>
