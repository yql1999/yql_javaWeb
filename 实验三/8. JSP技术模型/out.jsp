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
<br>
<%
  out.print("��ů����<br>");
  out.print("��ǰ���û������ռ�---1��" + out.getRemaining() + "<br>");
  out.print("<font color='red'>���ŵ���out.flush()����</font><br>");
  out.flush();//ע�͵����Կ�����һ��Ч��
  out.print("��ǰ���û������ռ�---2��" + out.getRemaining());
  out.clearBuffer();
  out.print("��ǰ���û������ռ�---3��" + out.getRemaining());
  out.flush();
 %>
<!--��ҳ�ײ� -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>