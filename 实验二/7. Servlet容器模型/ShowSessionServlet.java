package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowSessionServlet")
public class ShowSessionServlet extends HttpServlet{
   public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                       throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      // �����򷵻��û��Ự����
HttpSession session = request.getSession(true); 
      String heading = null;
      // �ӻỰ�����м���accessCount����
Integer accessCount = (Integer)session.getAttribute("accessCount");
      if(accessCount==null){
           accessCount = new Integer(1);
     	 heading = "��ӭ�����״ε�¼��ҳ�棡";
      }else{
     	 heading = "��ӭ�����ٴη��ʸ�ҳ�棡";
     	 accessCount = accessCount+1;
      }
      // ��accessCount��Ϊ���Դ洢���Ự������
session.setAttribute("accessCount",accessCount);
      PrintWriter out = response.getWriter();
      out.println("<html><head>");
      out.println("<title>�Ự����ʾ��</title></head>");
      out.println("<body><center>");
      out.println("<h4>"+heading
+"<a href='ShowSessionServlet'>�ٴη���</a>"+"</h4>");
      out.println("<table border='0'>");
      out.println("<tr bgcolor=\"ffad00\"><td>��Ϣ</td><td>ֵ</td>\n");
      String state = session.isNew()?"�»Ự":"�ɻỰ";
      out.println("<tr><td>�Ự״̬��<td>"+state+"\n");
      out.println("<tr><td>�ỰID:<td>"+session.getId()+"\n");
      out.println("<tr><td>����ʱ��:<td>");
      out.println(""+new Date(session.getCreationTime())+"\n");
      out.println("<tr><td>�������ʱ��:<td>");
      out.println(""+new Date(session.getLastAccessedTime())+"\n");
      out.println("<tr><td>��󲻻ʱ��:<td>"+
session.getMaxInactiveInterval()+"\n");
      out.println("<tr><td>Cookie:<td>"+request.getHeader("Cookie")+"\n");
      out.println("<tr><td>�ѱ����ʴ���:<td>"+accessCount+"\n");
      out.println("</table>");
      out.println("</center></body></html>");
   }
}
