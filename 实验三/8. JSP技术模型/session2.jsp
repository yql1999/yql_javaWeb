<%@ page pageEncoding="gb2312"%>
<html>
<head>
<title>session2.jsp page</title>
</head>
<body>
<%
out.println("���������ص�ΨһsessionID��:"+session.getId()+"<br>");
out.println("���sessionID�Ƿ����������ɵ���"+session.isNew());
%>
</body>
</html>