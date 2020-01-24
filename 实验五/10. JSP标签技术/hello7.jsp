<%@ taglib prefix="demo" uri="http://www.mydomain.com/sample" %>
<html><body>
  <h3><demo:hello2 /></h3>
<h3><demo:hello2 user="john" /></h3>
<h3><demo:hello2 user="${param.userName}" /></h3>
<h3><demo:hello2 user='<%= request.getParameter("userName") %>'/> </h3>
</body></html>
