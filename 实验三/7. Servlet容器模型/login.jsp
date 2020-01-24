<%@ page contentType="text/html;charset=UTF-8"
           pageEncoding="UTF-8"%>
<html>
<head><title>登录页面</title></head>
<body>
 ${sessionScope.message}<br>
 <form action="CheckUserServlet" method="post">
      请输入用户名和口令：<br>
   	 用户名:<input type="text" name="username" /><br>
      口　令:<input type="password" name="password" /><br>
   	 <input type="checkbox" name="check" value="check" />自动登录<br>
   	 <input type="submit" value="提交"/>
   	 <input type="reset" value="重置"/>
   </form>	
</body>
</html>
