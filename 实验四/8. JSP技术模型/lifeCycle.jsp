<%@ page contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<%!  
  int count = 0;   
  public void jspInit(){  // 覆盖jspInit()方法
	     System.out.println("jspInt...");
  }
  public void jspDestroy(){  // 覆盖jspDestroy()方法
	     System.out.println("jspDestroy...");
  }
%>
<html><head><title>jspInit and jspDestroy</title>
</head>
<body>
  <%count++;%>
    覆盖jspInit()方法和jspDestroy()方法！<br>
    该页面被访问<%=count%>次。
</body>
</html>
