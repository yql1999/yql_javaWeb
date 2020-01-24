package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="FileUploadServlet",urlPatterns={"/fileUpload.do"})
@MultipartConfig(location="D:\\",fileSizeThreshold=1024)
public class FileUploadServlet extends HttpServlet{
   public void doPost(HttpServletRequest request, 
                     HttpServletResponse response) 
                throws ServletException,IOException{
       // ����WebӦ�ó����ĵ���Ŀ¼
       String path = this.getServletContext().getRealPath("/");
       String mnumber = request.getParameter("mnumber");
       
       Part p = request.getPart("fileName");

       String message="";
       if(p.getSize() >1024*1024){    // �ϴ����ļ����ܳ���1MB��С
          p.delete();
          message = "�ļ�̫�󣬲����ϴ���";
       }else{
          path = path + "\\student\\" +mnumber;
          File f = new File(path);
          if( !f.exists()){  // ��Ŀ¼�����ڣ��򴴽�Ŀ¼
            f.mkdirs();
       }
       String h = p.getHeader("content-disposition");
       // �õ��ļ���
       String fname = h.substring(h.lastIndexOf("=")+2, h.length()-1);  
       p.write(path + "\\"+ fname);
       message = "�ļ��ϴ��ɹ���";
    }
    request.setAttribute("message", message);
    RequestDispatcher rd = request.getRequestDispatcher("/fileUpload.jsp");
    rd.forward(request, response);
  }
}

