<%@ page contentType="text/html; charset=gb2312" %>
<html><body>
<%
    Connection conn;
    String driver = "org.postgresql.Driver";
    String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
    String username = "bookstore";
    String password = "bookstore";
    try{
      Class.forName(driver); //加载数据库驱动程序
      //创建数据库连接对象
      conn= DriverManager.getConnection(
      	                    dburl,username,password);
    }catch(ClassNotFoundException e1){
    }catch(SQLException e2){}
   
    //3. 检索test.mdb数据库中的student中的数据，暂时可以不用管
    try{
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM books");   //取得表中的记录
    out.println("books表数据如下："+"<br><br><br>");
    while(rs.next()){
      out.print(rs.getString(1)+" ");
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
</body></html>
