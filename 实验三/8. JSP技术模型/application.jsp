<META http-equiv=Content-Type content="text/html;charset=gb2312">
<%
String str_counter=(String)application.getAttribute("counter");
if(str_counter!=null){
int int_counter=Integer.parseInt(str_counter);
int_counter+=1;
str_counter=Integer.toString(int_counter);
application.setAttribute("counter",str_counter);
}
else{
application.setAttribute("counter","1");
str_counter = "1";
}
out.print("页面被访问的次数"+ str_counter);
%>
