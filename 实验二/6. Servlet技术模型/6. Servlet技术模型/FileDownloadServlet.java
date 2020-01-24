package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FileDownloadServlet extends HttpServlet{
   public void doGet(HttpServletRequest request, 
                    HttpServletResponse response)
                throws ServletException, IOException{
    response.setContentType("application/jar");
    // 设置响应头，将响应内容以指定的文件名存储到客户机上
response.setHeader("Content-Disposition","attachment;filename=students.xml");
    File f = new File("C:\\students.xml");
    FileInputStream is = new FileInputStream(f);
    ServletOutputStream os = response.getOutputStream();
    byte[] bytearray = new byte[1024];
    int bytesread = 0;
    while( (bytesread = is.read(bytearray) ) != -1 ){
      os.write(bytearray, 0, bytesread);
    }
os.flush();
  }  
}
