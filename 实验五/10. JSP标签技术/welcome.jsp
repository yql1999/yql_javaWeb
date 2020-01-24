<%@ taglib prefix="demo" uri="http://www.mydomain.com/sample" %>
<html><title>Welcome Tag</title><body>
  <h3><demo:welcome /></h3>
<h3><demo:welcome user="john" /></h3>
<h3><demo:welcome user="${param.userName}" /></h3>
<h3><demo:welcome user='<%= request.getParameter("userName") %>'/> </h3>
</body></html>
