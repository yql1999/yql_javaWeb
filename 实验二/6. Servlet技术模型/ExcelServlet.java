package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="ExcelServlet",urlPatterns={"/excel.do"})
public class ExcelServlet extends HttpServlet{
   public void doGet(HttpServletRequest request, 
HttpServletResponse response)
                      throws ServletException, IOException{
    //ָ��ҳ���ڴ��������ʹ�õı��뷽ʽ
    response.setHeader("Content-Encoding","gb2312");
// ������Ӧ����������
response.setContentType("application/vnd.ms-excel;charset=gb2312");
    PrintWriter out = response.getWriter();
   
    out.println("ѧ��\t����\t�Ա�\t����\t����ϵ");
    out.println("95001\t����\t��\t20\t��Ϣ");
    out.println("95002\t����\tŮ\t19\t��ѧ");
  }
}
