<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="customer" class="com.demo.Customer" scope="session">
<jsp:setProperty name="customer" property="*"/>
</jsp:useBean>
<html><head> <title>��ʾ�ͻ���Ϣ</title></head>
<body>
<h4>�ͻ���Ϣ����</h4>
<table border="1">
<tr>
<td>�ͻ���:</td>
<td><jsp:getProperty name="customer" property="custName"/></td>
</tr>
<tr>
<td>Email��ַ:</td>
<td><jsp:getProperty name="customer" property="email"/></td>
</tr>
<tr>
<td>�绰:</td>
<td><jsp:getProperty name="customer" property="phone"/></td>
</tr>
</table>
</body></html>
