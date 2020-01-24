<%@ page import="java.io.*" %>
<%@ page contentType="text/html;charset = gb2312" %>
<%!
int count = 0;
String dbPath;
public void jspInit(){
try{
dbPath = getServletContext().getRealPath("/WEB-INF/counter.db");
FileInputStream fis = new FileInputStream(dbPath);
DataInputStream dis = new DataInputStream(fis);
count = dis.readInt();
dis.close();
}
catch(Exception e){
log("Error loading persistent counter", e);
}
}
%>
<%--下面是向浏览器输出的主要内容，
它将成为产生的_jspService()方法的一部分
--%>
<html><body>
<% count++; %>
该页面已被访问 <%= count %> 次。
</body></html>
<%!
public void jspDestroy(){
try{
FileOutputStream fos = new FileOutputStream(dbPath);
DataOutputStream dos = new DataOutputStream(fos);
dos.writeInt(count);
dos.close();
}
catch(Exception e){
log("Error storing persistent counter", e);
}
}
%>
