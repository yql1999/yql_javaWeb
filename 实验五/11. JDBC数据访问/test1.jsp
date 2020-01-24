<%@ page contentType="text/html; charset=gb2312" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>JDBC连接ACCESS数据库示例-配置ODBC数据源</title>
</head>

<body>
<%

Connection conn=null;//定义数据库连接变量
Statement stmt=null; //定义SQL语句服务变量
ResultSet rs=null;   //定义执行SQL语句后所返回的结果变量

//1. 加载数据库驱动程序
try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //加载JDBC-ODBC驱动类，区分大小写
}
catch(ClassNotFoundException e){
	out.print("<font color=red size=7>");
    out.print(e);
    out.print("</font><br>");
}

//2. 连接ACCESS数据库
try{
    String url = "jdbc:odbc:myaccessodbc"; //设置数据库连接URL，不区分大小写
    out.println("数据库连接URL是："+url+"<br><br><br>");

    //建立数据库连接
    conn= DriverManager.getConnection(url); //使用这句话建立数据库连接
    out.println("数据库连接成功！");
}catch(Exception ex){
	out.print("<font color=red size=7>");
	out.println("数据库连接发生异常：");
    out.print(ex);
    out.print("</font>");
}

//3. 检索test.mdb数据库中的student中的数据，暂时可以不用管
try{
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM student");   //取得Student表中的记录
    out.println("Student表数据如下："+"<br><br><br>");
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