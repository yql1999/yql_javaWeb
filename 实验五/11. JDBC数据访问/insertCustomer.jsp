<%@ page contentType="text/html; charset=gb2312" %>
<html><head> <title>Input a Customer</title></head>
<body>
<% if(request.getAttribute("result")!=null)
     out.print(request.getAttribute("result"));
%>
<h4>Please Input a Customer</h4>
<form action = "insertCustomer.do" method = "post">
 <table>
  <tr><td>�ͻ�����</td> <td><input type="text" name="custName" ></td></tr>
  <tr><td>Email��ַ��</td><td><input type="text" name="email"></td></tr>      
  <tr><td>�绰��</td><td><input type="text" name="phone" ></td></tr>
  <tr><td><input type="submit" value="ȷ��" ></td>
      <td><input type="reset" value="����" ></td>
  </tr>
</table>
</form>
</body></html>
