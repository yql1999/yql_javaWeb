<%@ page contentType="text/html; charset=GB2312"%>
<html>
<head>
<title>Hello World</title>
</head>
<body bgcolor="#FFFFFF">
<center>
<font size= 6 color=blue>使用变量声明</font>
<center>
<br>
<hr>
<br>
<div align="center">
<%!
	int temp=36;
%>
<%
	String strTemp="test";
	out.println("<br>temp变量为："+temp);
	out.println("<br>strTemp变量为："+strTemp);	
%>
</div>
</body>
</html>