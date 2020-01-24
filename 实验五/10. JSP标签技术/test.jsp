<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>
<c:url value="/page.jsp" var="pagename">
    <c:param name="param1" value="${2*2}"/>
    <c:param name="param2" value="${3*3}"/>
</c:url>

<a href="${pagename }" >a url</a>
</body>
</html>