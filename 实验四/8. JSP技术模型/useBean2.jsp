<%@ page contentType="text/html;charset=gb2312" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META http-equiv=Content-Type content="text/html;charset=gb2312">
<title>������̳��� | IT���й� | itZcn.com </title>
<!--�ⲿ����-->
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
<!--��վ����--> 
<%@ include file="top_end/top.html" %> 
<%request.setCharacterEncoding("gb2312");%>
<!--��ҳ���� -->  
<jsp:useBean id="teacher" class="bean.example.Teacher" scope="session"></jsp:useBean>

<jsp:setProperty name="teacher" property="*"/>
 <%
   if(teacher.getName() == null)
   {
     response.sendRedirect("useBean1.jsp");
   }
   %>
    ����:<jsp:getProperty name="teacher" property="name"/><br>
    ����:<jsp:getProperty name="teacher" property="age"/><br>
    ����:<jsp:getProperty name="teacher" property="pay"/>
   
<!--��ҳ�ײ� -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>