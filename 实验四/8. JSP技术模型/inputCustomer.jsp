<%@ page contentType="text/html; charset=UTF-8" %>
<html><head> <title>����ͻ���Ϣ</title></head>
<body>
<h4>����ͻ���Ϣ</h4>
<form action = "CustomerServlet" method = "post">
 <table>
  <tr><td>�ͻ�����</td> <td><input type="text" name="custName" ></td></tr>
  <tr><td>�ʼ���ַ��</td><td><input type="text" name="email"></td></tr>      
  <tr><td>�绰��</td><td><input type="text" name="phone" ></td></tr>
  <tr><td><input type="submit" value="ȷ��" ></td>
      <td><input type="reset" value="����" ></td>
  </tr>
</table>
</form>
</body></html>
