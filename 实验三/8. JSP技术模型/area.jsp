<%@ page contentType="text/html; charset=uft-8" %>
<html><body>
�뾶Ϊ<%= r %>��Բ�����Ϊ��<br>
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
