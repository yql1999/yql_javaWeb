<%@ page contentType="text/html;charset=gb2312" %>
<html>
<body>
<% String msg=(String)request.getAttribute("msg");
    if(msg!=null)
     out.println(msg+"<br>");
%>
������ͻ���Ϣ��
<form action="savebean.do" method="post">
�ͻ���: <input type="text" name="custName"><br>
Email ��ַ: <input type="text" name="email"><br>
�绰: <input type="text" name="phone"><br>
<input type="submit" value="�ύ"><br>
</form>
</body>
</html>
