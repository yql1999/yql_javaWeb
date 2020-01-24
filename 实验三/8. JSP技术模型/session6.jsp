<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META http-equiv=Content-Type content="text/html;charset=gb2312">
<title>计算机教程网 | IT在中国 | itZcn.com </title>
<!--外部链接-->
<LINK href="top_end/style.css" type=text/css rel=stylesheet>
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style></head>
<body >
<!--网站顶部--> 
<%@ include file="top_end/top.html" %> 
<!--网页主体 -->  
<%@ include file="session3.jsp"%>
<%
String name=(String)session.getAttribute("username");
if(name!=null){
%>
<h3><%=name %>已登录，具有管理权限</h3>
<%}%>
<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>



