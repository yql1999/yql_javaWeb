<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getParameter("username") %>>
${username}
<jsp:useBean id="u" class="com.mvc.beans.User" scope="request"/>
欢迎您：<jsp:getProperty name="u"
property="username" />
<a href="Controller?action=coupon">领券</a>
</body>
</html>