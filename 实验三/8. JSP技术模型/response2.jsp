<%
request.setCharacterEncoding("gb2312");
String username=request.getParameter("username");
String pwd=request.getParameter("password");
if(username.trim().equals("") || pwd.trim().equals(""))
{
response.sendError(400,"用户名或密码为空，登录失败！");
}
else
{

response.sendRedirect("request1.jsp?info=登录成功&username=" + username);
}
%>



