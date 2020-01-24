<%@ page contentType="text/html;charset=gb2312" %>
<html>
<body>
<% String msg=(String)request.getAttribute("msg");
    if(msg!=null)
     out.println(msg+"<br>");
%>
请输入客户信息：
<form action="savebean.do" method="post">
客户名: <input type="text" name="custName"><br>
Email 地址: <input type="text" name="email"><br>
电话: <input type="text" name="phone"><br>
<input type="submit" value="提交"><br>
</form>
</body>
</html>
