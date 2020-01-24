<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*,com.demo.User" %>
<% 
   Collection<User> userList = new ArrayList<User>();
   for(int i=0;i<5;i++){
     User user = new User();
     user.setUsername("User-"+(i+1));
     user.setPassword("password"+i);
     userList.add(user);
   }
   
   session.setAttribute("userList",userList);
 %>
<html><body> 
<p>用户列表</p>
<table border="1" >
<tr><td>用户名</td><td>密码</td></tr>
<c:forEach var="u" items="${userList}" begin="2" end="4" step="2">
 <tr>
    <td><c:out value="${u.username}" /></td>
    <td><c:out value="${u.password}" /></td>
 </tr>
</c:forEach>
</table> 
</body></html>
