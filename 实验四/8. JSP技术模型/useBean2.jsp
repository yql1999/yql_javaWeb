<%@ page contentType="text/html;charset=gb2312" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META http-equiv=Content-Type content="text/html;charset=gb2312">
<title>计算机教程网 | IT在中国 | itZcn.com </title>
<!--外部链接-->
<LINK href="top_end/style.css" type=text/css rel=stylesheet>
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style></head>
<body >
<!--网站顶部--> 
<%@ include file="top_end/top.html" %> 
<%request.setCharacterEncoding("gb2312");%>
<!--网页主体 -->  
<jsp:useBean id="teacher" class="bean.example.Teacher" scope="session"></jsp:useBean>

<jsp:setProperty name="teacher" property="*"/>
 <%
   if(teacher.getName() == null)
   {
     response.sendRedirect("useBean1.jsp");
   }
   %>
    姓名:<jsp:getProperty name="teacher" property="name"/><br>
    年龄:<jsp:getProperty name="teacher" property="age"/><br>
    工资:<jsp:getProperty name="teacher" property="pay"/>
   
<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>