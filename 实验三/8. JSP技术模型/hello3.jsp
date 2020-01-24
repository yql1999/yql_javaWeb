<%@ page contentType="text/html;charset = gb2312" %>
<html>
  <head><title>Hello</title></head>
  <body bgcolor="white">
    <img src="images/duke.gif"> 
    My name is Duke. What is yours?
    <form action="" method="get">
      <input type="text" name="username" size="25">
      <input type="submit" value="Submit">
      <input type="reset" value="Reset">
    </form>
    <%! String userName="Duke"; %>
    <%@include file="response3.jsp" %>
  </body>
</html>
