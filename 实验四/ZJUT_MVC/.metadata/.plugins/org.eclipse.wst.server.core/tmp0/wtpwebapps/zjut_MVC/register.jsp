<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册页</title>
</head>
<body>
	<%
		Object msg=request.getAttribute("message");
		if(msg!=null)
			out.println(msg);
	%>
	<fieldset>
		<legend>请填写如下内容：</legend>
		<form action="Controller?action=register" method="post">
			<table style="margin-left: 40%">
				<caption>用户注册</caption>
				<tr>
					<td>用户名：</td>
					<td><input name="username" type="text" size="20"></td>
				</tr>
				<tr>
					<td>性 别:</td>
					<td><input name="sex" type="text" size="5"></td>
				</tr>
				<tr>
					<td>年 龄:</td>
					<td><input name="age" type="text" size="5"></td>
				</tr>
				<tr>
					<td>地址:</td>
					<td><input name="address" type="text" size="20"></td>
				</tr>
				<tr>
					<td>密 码:</td>
					<td><input name="password" type="password" size="20"></td>
				</tr>
			</table>
			<input type="submit" value="注  册"> &nbsp;&nbsp;
			 <input type="reset" value="重  置">
		</form>
	</fieldset>
</body>
</html>