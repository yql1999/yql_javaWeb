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
  <p><strong> ���˰��ã����Զ�ѡ�� </strong></p>
  <form name="form1" method="post" action="request2.jsp">
    <input type="checkbox" name="favorites" value="�˶�">�˶� 
    <input type="checkbox" name="favorites" value="����">���� 
    <input type="checkbox" name="favorites" value="����">����
    <input type="checkbox" name="favorites" value="�鷨">�鷨 
    <input type="checkbox" name="favorites" value="����">����
    <p><strong>�Ա�</strong>
    <input type="radio" name="sex" value="��">�� 
 <input type="radio" name="sex" value="Ů">Ů</p>
    <p> <input type="submit" name="Submit" value="�ύ"> </p>
  </form>
<!--��ҳ�ײ� -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>