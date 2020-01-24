<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录页</title>
</head>
<body>
	<%
		Object msg=request.getAttribute("message");
		if(msg!=null)
			out.println(msg);
	%>
	<form action="Controller?action=login" method="post">
		<table>
			<h3>用户登录</h3>
			<tr>
				<td>登录名：</td>
				<td><input name="username" type="text" size="20"></td>
			</tr>
			<tr>
				<td>密  码:</td>
				<td><input name="password" type="password" size="20"></td>
			</tr>
		</table>
		<br>
		<input type="checkbox" name="check" value="check"/>自动登录<br>
		<br>
		<input type="submit" value="登  录"> &nbsp;&nbsp; <input type="reset"
			value="重  置">
	</form>
</body>
</html>