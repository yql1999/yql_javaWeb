<%
request.setCharacterEncoding("gb2312");
String username=request.getParameter("username");
String pwd=request.getParameter("password");
if(username.trim().equals("") || pwd.trim().equals(""))
{
response.sendError(400,"�û���������Ϊ�գ���¼ʧ�ܣ�");
}
else
{

response.sendRedirect("request1.jsp?info=��¼�ɹ�&username=" + username);
}
%>



