<%@ page contentType="text/html; charset=gb2312" %>
<html><head> <title>Input a Customer</title></head>
<body>
<% if(request.getAttribute("result")!=null)
     out.print(request.getAttribute("result"));
%>
<h4>Please Input a Customer</h4>
<form action = "insertCustomer.do" method = "post">
 <table>
  <tr><td>客户名：</td> <td><input type="text" name="custName" ></td></tr>
  <tr><td>Email地址：</td><td><input type="text" name="email"></td></tr>      
  <tr><td>电话：</td><td><input type="text" name="phone" ></td></tr>
  <tr><td><input type="submit" value="确定" ></td>
      <td><input type="reset" value="重置" ></td>
  </tr>
</table>
</form>
</body></html>
