<%@ page contentType="text/html; charset=gb2312" %>
<%@ page errorPage="errorHandler.jsp" %>
<html>
<body>
<%
if (request.getParameter("name")==null){
throw new RuntimeException("û��ָ��name ���������");
}
%>
Hello, <%=request.getParameter("name")%>
</body>
</html>
