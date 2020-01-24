<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<% request.setCharacterEncoding("UTF-8"); %>
<title>用户登录成功页</title>
</head>
<body>
	<%
		Object msg=request.getAttribute("message");
		if(msg==null){
	%>
	您还未登录，请先注册登录！<br>
	<a href="Controller?action=userinfo01">注  册</a>&nbsp;&nbsp;
	<a href="Controller?action=userinfo02">登  录</a>
	<%	}
		else{
			out.println(msg);
	%>
	欢迎您：<%=request.getParameter("username") %>
	<h3>用户信息如下：</h3><br>
	姓名：${user.username}<br>
	性别：${user.sex}<br>
	年龄：${user.age}<br>
	地址：${user.address}<br>
	<%} %>
</body>
</html>