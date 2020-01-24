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
<!--网页主体 -->  
<br>
<%
  out.print("春暖花开<br>");
  out.print("当前可用缓冲区空间---1：" + out.getRemaining() + "<br>");
  out.print("<font color='red'>接着调用out.flush()方法</font><br>");
  out.flush();//注释掉可以看到另一番效果
  out.print("当前可用缓冲区空间---2：" + out.getRemaining());
  out.clearBuffer();
  out.print("当前可用缓冲区空间---3：" + out.getRemaining());
  out.flush();
 %>
<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>