<%@ taglib uri="http://www.mydomain.com/sample" prefix="demo" %>
<html><body>
<demo:if condition="true">
<%-- ��condition����ֵΪtrueʱ�����ǩ�� --%>
�û���Ϊ��<%= request.getParameter("name") %>
</demo:if>
</body></html>
