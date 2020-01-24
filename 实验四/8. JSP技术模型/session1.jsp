<%@ page pageEncoding="gb2312"%>
<html>
<head>
<title>session1.jsp page</title>
</head>
<body>
<%
out.println("服务器返回的唯一sessionID是:"+session.getId()+"<br>");
out.println("这个sessionID是服务器新生成的吗？"+session.isNew());
%>
</body>
</html>