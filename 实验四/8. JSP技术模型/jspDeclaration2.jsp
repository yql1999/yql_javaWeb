<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<HEAD>
<TITLE>声明变量是非线程安全的</TITLE>	
</HEAD>
<BODY >
 <%!
  int i=0;
  %>
  <%
  i++;
  %>
<P>您是第
   <%=i%>
  个访问本站的客户。
</BODY>
</HTML> 
