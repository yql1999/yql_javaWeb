<%@ page contentType="text/html;charset=UTF-8"
           pageEncoding="UTF-8"%>
<html>
<head><title>��¼ҳ��</title></head>
<body>
 ${sessionScope.message}<br>
 <form action="CheckUserServlet" method="post">
      �������û����Ϳ��<br>
   	 �û���:<input type="text" name="username" /><br>
      �ڡ���:<input type="password" name="password" /><br>
   	 <input type="checkbox" name="check" value="check" />�Զ���¼<br>
   	 <input type="submit" value="�ύ"/>
   	 <input type="reset" value="����"/>
   </form>	
</body>
</html>
