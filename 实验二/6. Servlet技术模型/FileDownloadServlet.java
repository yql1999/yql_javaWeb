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
       // 返回Web应用程序文档根目录
       String path = this.getServletContext().getRealPath("/");
       String mnumber = request.getParameter("mnumber");
       
       Part p = request.getPart("fileName");

       String message="";
       if(p.getSize() >1024*1024){    // 上传的文件不能超过1MB大小
          p.delete();
          message = "文件太大，不能上传！";
       }else{
          path = path + "\\student\\" +mnumber;
          File f = new File(path);
          if( !f.exists()){  // 若目录不存在，则创建目录
            f.mkdirs();
       }
       String h = p.getHeader("content-disposition");
       // 得到文件名
       String fname = h.substring(h.lastIndexOf("=")+2, h.length()-1);  
       p.write(path + "\\"+ fname);
       message = "文件上传成功！";
    }
    request.setAttribute("message", message);
    RequestDispatcher rd = request.getRequestDispatcher("/fileUpload.jsp");
    rd.forward(request, response);
  }
}

