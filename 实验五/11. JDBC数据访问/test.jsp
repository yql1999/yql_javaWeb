<%@ page contentType="text/html; charset=gb2312" %>
<html><body>
<%
    Connection conn;
    String driver = "org.postgresql.Driver";
    String dburl = "jdbc:postgresql://127.0.0.1:5432/bookstore";
    String username = "bookstore";
    String password = "bookstore";
    try{
      Class.forName(driver); //�������ݿ���������
      //�������ݿ����Ӷ���
      conn= DriverManager.getConnection(
      	                    dburl,username,password);
    }catch(ClassNotFoundException e1){
    }catch(SQLException e2){}
   
    //3. ����test.mdb���ݿ��е�student�е����ݣ���ʱ���Բ��ù�
    try{
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM books");   //ȡ�ñ��еļ�¼
    out.println("books���������£�"+"<br><br><br>");
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
