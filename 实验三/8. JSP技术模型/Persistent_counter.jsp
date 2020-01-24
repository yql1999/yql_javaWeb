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
<%--��������������������Ҫ���ݣ�
������Ϊ������_jspService()������һ����
--%>
<html><body>
<% count++; %>
��ҳ���ѱ����� <%= count %> �Ρ�
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
