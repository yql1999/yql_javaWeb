<%@page import="java.util.Date" %>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Today's date</title></head>
<body>
<%
   DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
   String s = dateFormat.format(new Date());
%>
今天的日期是：<%=s%>
</body>
</html>
