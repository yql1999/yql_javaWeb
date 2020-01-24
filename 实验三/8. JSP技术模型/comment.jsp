<%@ page contentType=    "text/html;charset=GB2312" %>          <%--jsp指令标记--%>
<html>   
<head><title> 注释大全 </title> </head>                        <!--HTML标记-->
<body  bgcolor="cyan">
   <font size=4>
   <% char begin='A';                                        /*Java程序片*/
      int  ix=13;
   %>
   <font color="blue"><p>蓝色输出前13个字母：<br>           <!--插入Html标记-->
 	 <%                                                  //Java程序片
      for(;begin<'A'+ix;begin++){
   %>
        <%= begin %>                                         <!--Java表达式-->
   <%
      }
   %>
   </font>
   <font color="green"><p>绿色输出后13个字母：<br>           <!--插入Html标记-->
   <% 
      for(;begin<'N'+ix;begin++){                            /**Java语句*/
   %>
	 <%= begin %>                                        
   <%
      }
   %>
   </font>
   </font>
</body>
</html>
