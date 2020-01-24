<%
request.setCharacterEncoding("gb2312");
String username=request.getParameter("username");
String pwd=request.getParameter("password");
if(username.trim().equals("") || pwd.trim().equals(""))
{
   response.sendRedirect("session4.jsp?info=ÇëÖØÐÂÊäÈë");
}else{
   session.setAttribute("username",username);
   session.setAttribute("pwd",pwd);
   response.sendRedirect("session6.jsp");
}
%>
