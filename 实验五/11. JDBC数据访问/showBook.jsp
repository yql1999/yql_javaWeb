<%@ page contentType="text/html; charset=gb2312" %>
<jsp:useBean id="book" type="com.model.BookBean" scope="session" />

<html><body>
<table border="0">
<tr><td>���:</td>
<td><jsp:getProperty name="book" property="bookid"/></td>
</tr>	
  <tr><td>����: </td>
<td><jsp:getProperty name="book" property="title"/></td>
</tr>
<tr><td>����:</td>
<td><jsp:getProperty name="book" property="author"/></td>
</tr>
<tr><td>������:</td>
<td><jsp:getProperty name="book" property="publisher"/></td>
</tr>
<tr><td>�۸�:</td>
<td><jsp:getProperty name="book" property="price"/></td>
</tr>
</table>
</body></html>
