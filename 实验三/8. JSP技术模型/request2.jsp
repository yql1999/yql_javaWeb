<%@page contentType="text/html;charset=gb2312" %>
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
<!--��ҳ���� -->  
<%
request.setCharacterEncoding("gb2312");
String msg = null;
String sex = request.getParameter("sex");
String[] favorites = request.getParameterValues("favorites");

int len=0;
if(favorites!=null)
	len=favorites.length;

boolean tag = true;
if(sex == null)
  msg = "<font color='red'>��ѡ���Ա�</font><br>";
else 
  msg = sex.equals("��") ? "������ã�" : "Ůʿ��ã�";

if(len == 0)
{
  msg = msg+"��<font color='red'>��</font>���ã�";
  tag = false;
}

msg=msg+"<br>��İ����У�";
for(int i = 0; i < len; i++)
{
  msg = msg + favorites[i] + "��";
}

msg = tag?msg.substring(0,msg.length()-1):msg;
out.print("<br>" + msg + "<br>лл����.");
%>

<!--��ҳ�ײ� -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>

