<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
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
 String info = request.getParameter("info");
 byte[] temp;
 String info_cn="";
 if(info!=null){
    temp = info.getBytes("iso8859-1"); 
    info_cn = new String(temp,"gb2312");
    info_cn = "登录提示: " + info_cn;
%>
<font color="red"><%=info_cn%></font>
<%
 }
%>
<form name="form2" method="post" action="session5.jsp">
  <table >
      <tr><td>
        用户名：<input name="username" type="text" id="username" size="20">  
      </td></tr>
      <tr><td>
        密&nbsp;&nbsp;码：<input name="password" type="password" id="password" size="20">
      </td> </tr>
      <tr><td align="right"><input type="submit" name="Submit" value="提交"></td></tr>
  </table> </form>
  <a href="session6.jsp">账户管理</a>

<!--网页底部 -->
<iframe width="990" height="97" src="top_end/NewBottom.htm" frameborder="0"></iframe>
</BODY>
</HTML>

