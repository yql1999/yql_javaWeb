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
  <p><strong> 个人爱好（可以多选） </strong></p>
  <form name="form1" method="post" action="request2.jsp">
    <input type="checkbox" name="favorites" value="运动">运动 
    <input type="checkbox" name="favorites" value="读书">读书 
    <input type="checkbox" name="favorites" value="音乐">音乐
    <input type="checkbox" name="favorites" value="书法">书法 
    <input type="checkbox" name="favorites" value="其他">其他
    <p><strong>性别：</strong>
    <input type="radio" name="sex" value="男">男 
 <input type="radio" name="sex" value="女">女</p>
    <p> <input type="submit" name="Submit" value="提交"> </p>
  </form>
<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>