<html><body>
<%!
int anInt = 3;
boolean aBool = true;
Integer anIntObj = new Integer(3);
Float aFloatObj = new Float(8.6);
String str = "some string";
StringBuffer sBuff = new StringBuffer();
char getChar(){ return 'A'; }
%>
<%= 500+380 %> <br>
<%= anInt*3.5/100-500 %><br>
<%= aBool %> <br>
<%= false %> <br>
<%= !false %> <br>
<%= getChar() %> <br>
<%= Math.random() %> <br>
<%= aFloatObj %> <br>
<%= aFloatObj.floatValue() %> <br>
<%= aFloatObj.toString() %>
</body></html>
