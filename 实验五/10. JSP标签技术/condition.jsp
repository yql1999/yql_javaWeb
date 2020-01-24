<%@ taglib uri="http://www.mydomain.com/sample" prefix="demo" %>
<html><body>
<demo:if condition="true">
<%-- 当condition属性值为true时输出标签体 --%>
用户名为：<%= request.getParameter("name") %>
</demo:if>
</body></html>
