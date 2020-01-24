<%
  request.setCharacterEncoding("gb2312");
  //读取session对象中属性为"username"的值，并转换为字符型username保存。
  String username=(String)session.getAttribute("username");
  //判断name是否为空
  if(username==null)//如果为空，转向到example6.9.1.jsp注册页面
    response.sendRedirect("session4.jsp?info=无访问权限，请登录");
%>
