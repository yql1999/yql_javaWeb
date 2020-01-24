<%@page contentType="text/html;charset=gb2312" errorPage="exception2.jsp"%>
<%
   out.print("计算:5除以0的结果：");
   int iTemp = 5 / 0; //产生算术异常
%>