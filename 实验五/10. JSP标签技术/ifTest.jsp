<%@ taglib prefix="demo" uri="http://www.mydomain.com/sample" %>
<% boolean debug = request.getParameter("debug").equals("true"); %>
<html><body>
Hello<br>
<demo:if condition="<%= debug %>" >
DEBUG INFO:...
</demo:if>
</body></html>
