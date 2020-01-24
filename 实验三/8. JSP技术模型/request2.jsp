<%@page contentType="text/html;charset=gb2312" %>
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
<!--网页主体 -->  
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
  msg = "<font color='red'>请选择性别</font><br>";
else 
  msg = sex.equals("男") ? "先生你好！" : "女士你好！";

if(len == 0)
{
  msg = msg+"你<font color='red'>无</font>爱好？";
  tag = false;
}

msg=msg+"<br>你的爱好有：";
for(int i = 0; i < len; i++)
{
  msg = msg + favorites[i] + "、";
}

msg = tag?msg.substring(0,msg.length()-1):msg;
out.print("<br>" + msg + "<br>谢谢参与.");
%>

<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>

