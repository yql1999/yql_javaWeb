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
<!--��ҳ���� -->  
<%
  String info = request.getParameter("info");
  byte[] temp;
  String info_cn="";
  String username = request.getParameter("username");
  if(info!=null){
      temp = info.getBytes("iso8859-1");  
      info_cn = new String(temp,"gb2312");
      out.print("<br><font color='red'>" + username + "�û�," + info_cn + "</font><br>");
  }
 %>
<form method="post" action="response2.jsp">
      �û�����<input name="username" type="text" id="username" size="20"><br><br>
      ��&nbsp;&nbsp;�룺<input name="password" type="password" id="password" size="20" >
      &nbsp;&nbsp;<input type="submit" name="Submit" value="�ύ">
</form>
<!--��ҳ�ײ� -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>
 
