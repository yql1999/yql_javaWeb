<%@ page contentType="text/html;charset = gb2312" %>
<html>
  <head><title>Hello</title></head>
  <body bgcolor="white">
    <img src="images/duke.gif"> 
    My name is Duke. What is yours?
    <form action="" method="post">
      <input type="text" name="username" size="25">
      <input type="submit" value="Submit">
      <input type="reset" value="Reset">
    </form>
    <% 
       String userName = request.getParameter("username");
       request.setAttribute("username",userName);
    %>
    <jsp:include page="response4.jsp" />
  </body>
</html>
