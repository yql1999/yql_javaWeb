package zjut;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

//NOTE:乱码问题：加上str=new String(str.getBytes("ISO-8859-1"),"utf-8");绝对不会出错

@WebServlet(name = "LoginServlet", urlPatterns = { "/login.do" })
public class ShowInfoServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] interest=request.getParameterValues("interest");
		String zzmm=request.getParameter("zzmm");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		// 若登陆成功，则显示用户名，兴趣爱好和政治面貌
		/*if ("admin".equals(username) && "admin".equals(password)) {*/
			username=new String(username.getBytes("ISO-8859-1"),"utf-8");
			out.println("登录成功！欢迎您" + username+"<br>");
			out.println("用户名： " + username+"<br>");
			String str="";
			for(int i=0;i<interest.length;i++) {
				str+=interest[i];
			}
		
			str=new String(str.getBytes("ISO-8859-1"),"utf-8");
			zzmm=new String(zzmm.getBytes("ISO-8859-1"),"utf-8");
			
			out.println("兴趣爱好： "+str+"<br>");
			out.println("政治面貌： " + zzmm+"<br>");
		/*} else {
			out.println("对不起！您的用户名或密码不正确．");
		}*/
		out.println("</body></html>");
	}

}
