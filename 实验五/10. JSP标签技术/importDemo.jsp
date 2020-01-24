<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html><head><title>Welcome Page</title></head>
<body>
<img src="images/duke.gif"> 
<font color="blue">You are welcome to my home page!</font>
<c:import url="/footer.jsp" context="/chap06" charEncoding="UTF-8" >
    <c:param name = "email" value="hacker@163.com" /> 
</c:import>
</body></html>
