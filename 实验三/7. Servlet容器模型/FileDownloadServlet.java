package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fileDownload.do")
public class FileDownloadServlet extends HttpServlet{
     public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
         // �����ļ�����������
response.setContentType("image/gif");
// ����Content-Disposition��Ӧͷ��ָ���ļ���
response.setHeader("Content-Disposition",
"attachment;filename=duke.gif");
// ������������
OutputStream os = response.getOutputStream();
         ServletContext context = getServletContext();
         // ��������������
     InputStream is = 
context.getResourceAsStream("/files/duke.gif");
byte[] bytearray = new byte[1024]; 
         int bytesread = 0;
         // ���������ж�ȡ1K�ֽڣ�Ȼ��д���������
         while((bytesread = is.read(bytearray)) != -1 ){
            // �����ݷ��͵��ͻ���
os.write(bytearray, 0, bytesread);
         }
         os.flush();
         is.close();
     }
}
