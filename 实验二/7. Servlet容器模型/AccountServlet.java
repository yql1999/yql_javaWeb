package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class AccountServlet extends HttpServlet {
   ServletContext context; 
   HashMap<String,String[]> data = new HashMap<String,String[]> ();

   public void init(){
     context = getServletContext();
data.put("ann", new String[]{ "01/01/2009 : 1000.00",
"01/02/2009 : 1300.00", "01/03/2009 : 900.00"} );
data.put("john", new String[]{ "01/01/2009 : 4500.00",
"01/02/2009 : 2100.00", "01/03/2009 : 2600.00"} );
data.put("mark", new String[]{ "01/01/2009 : 7800.00",
"01/02/2009 : 5200.00", "01/03/2009 : 1900.00"} );
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException{
      String username = (String)request.getAttribute("username");
      if(username != null){
String[] records = (String[]) data.get(username);
         response.setContentType("text/html;charset=gb2312");

PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<body>");
         out.println("您好！"+username+"，您的账户信息如下：<p>");
for(int i=0; i<records.length; i++){
out.println(records[i]+"<br>");
}
out.println("</body>");
out.println("</html>");
}else{
RequestDispatcher view =context.getRequestDispatcher("/login.html");
view.forward(request, response);
}
  }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
      doPost(request, response);
   }
}
