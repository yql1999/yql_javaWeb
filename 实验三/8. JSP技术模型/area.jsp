<%@ page contentType="text/html; charset=uft-8" %>
<html><body>
半径为<%= r %>的圆的面积为：<br>
<%=area(r)%>
<%! 
double area(double r) {
return r*r*pi;
} 
%> 
<%
double r = 10;
final double pi = 3.14159; %> 
</body> </html> 
