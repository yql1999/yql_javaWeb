<%
String username=request.getParameter("username");
String pwd=request.getParameter("password");
%>
这是pageContext.forward()方法转发过来的，其中username=<%=username%>,pwd=<%=pwd%>




