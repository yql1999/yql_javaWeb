/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-04-21 12:49:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"login.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("使用外部链接CSS文件的方式\r\n");
      out.write("1）使用CSS样式定义使得“用户名”，“密码”，“校验密码”等文本输入框的背景色为淡蓝色(lightblue)，文字颜色为红色，文本框边框凹陷显示。\r\n");
      out.write("2）使用pseudo伪类选择符使超链接“注册帮助信息请点击这里”在访问前是蓝色，访问后是灰色，鼠标停留为红色，激活为黑色。-->\r\n");
      out.write("<style type=\"text/css\"> /*内部样式表建在head内*/\r\n");
      out.write("div {\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*让表格居中*/\r\n");
      out.write("* {\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*文字居中显示*/\r\n");
      out.write(".form-row-button, .form-row-click {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("        function check() {\r\n");
      out.write("            if (checkLength() && checkPassword() && checkInterest() && checkZzmm()) {\r\n");
      out.write("                alert(\"恭喜您！注册成功！\");\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*长度检查*/\r\n");
      out.write("        function checkLength() {\r\n");
      out.write("            var username = document.getElementById(\"username\");\r\n");
      out.write("            var password = document.getElementById(\"password\");\r\n");
      out.write("            var re_password = document.getElementById(\"re_password\");\r\n");
      out.write("            /*用户名长6~16位*/\r\n");
      out.write("            if (username.value.length > 16 || username.value.length < 6) {\r\n");
      out.write("                alert(\"用户名长度应为6~16个字符\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            /*密码中要有下划线，且长度不能少于8位*/\r\n");
      out.write("            else if (password.value.length > 16 || password.value.length < 8) {\r\n");
      out.write("                alert(\"密码长度应为8~16个字符\");\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (password.value.indexOf(\"_\") === -1) {\r\n");
      out.write("                alert(\"密码中要有下划线\");\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (re_password.value.length > 16 || re_password.value.length < 8) {\r\n");
      out.write("                alert(\"校验密码长度应为8~16个字符\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*兴趣爱好至少选择一项*/\r\n");
      out.write("        function checkInterest() {\r\n");
      out.write("            var interest = document.getElementsByName(\"interest\");\r\n");
      out.write("            var flag = false;\r\n");
      out.write("            for (var x = 0; x < interest.length; x++) {\r\n");
      out.write("                if (interest[x].checked) {\r\n");
      out.write("                    flag = true;\r\n");
      out.write("                    break;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            if (!flag)\r\n");
      out.write("                alert(\"至少选择一项兴趣爱好\");\r\n");
      out.write("            return flag;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*政治面貌至少选择一项*/\r\n");
      out.write("        function checkZzmm() {\r\n");
      out.write("            var zzmm = document.getElementsByName(\"zzmm\");\r\n");
      out.write("            var flag = false;\r\n");
      out.write("            for (var x = 0; x < zzmm.length; x++) {\r\n");
      out.write("                if (zzmm[x].checked) {\r\n");
      out.write("                    flag = true;\r\n");
      out.write("                    break;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            if (!flag)\r\n");
      out.write("                alert(\"至少选择一项政治面貌\");\r\n");
      out.write("            return flag;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //验证校验密码（和上面密码必须一致）\r\n");
      out.write("        function checkPassword() {\r\n");
      out.write("            var password = document.getElementById(\"password\").value.trim();\r\n");
      out.write("            var re_password = document.getElementById(\"re_password\").value.trim();\r\n");
      out.write("            //校验密码和上面密码必须一致\r\n");
      out.write("            if (re_password !== password) {\r\n");
      out.write("                alert(\"两次输入的密码不一致\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<section class=\"contacts\">\r\n");
      out.write("\t\t<fieldset class=\"contact-form\">\r\n");
      out.write("\t\t\t<!--表单-->\r\n");
      out.write("\t\t\t<form onsubmit=\"return check()\" action=\"login.do\" method=\"post\" id=\"contact\">\r\n");
      out.write("\t\t\t\t<!--表单的提交方法 表格校验-->\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"text-align: center\">用户注册信息</p>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>用户名</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"name\"></label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"username\" id=\"username\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\tautofocus=\"autofocus\" class=\"contact-input\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>密 码</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"password\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\trequired=\"required\" placeholder=\"\" class=\"contact-input\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>校验密码</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"re_password\" id=\"re_password\"\r\n");
      out.write("\t\t\t\t\t\t\trequired=\"required\" placeholder=\"\" class=\"contact-input\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>籍 贯</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select name=\"age\" id=\"age\" size=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">浙江</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">江苏</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\">安徽</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"4\">河北</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"5\">河南</option>\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>兴趣爱好</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label><input type=\"checkbox\" name=\"interest\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"interest1\" value=\"篮球\" />篮球</label> <label><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"interest\" id=\"interest2\" value=\"足球\" />足球</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label><input type=\"checkbox\" name=\"interest\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"interest3\" value=\"书法\" />书法</label> <label><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"interest\" id=\"interest4\" value=\"音乐\" />音乐</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" name=\"interest\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"interest5\" value=\"绘画\" />绘画</label> <label><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"interest\" id=\"interest6\" value=\"散打\" />散打</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" name=\"interest\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"interest7\" value=\"瑜伽\" />瑜伽</label> <label><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"interest\" id=\"interest8\" value=\"其他\" />其他</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"contact\"><strong>政治面貌</strong> </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"zzmm1\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"zzmm\" id=\"zzmm1\" value=\"党员\">党员\r\n");
      out.write("\t\t\t\t\t\t</label> <label for=\"zzmm2\"> <input type=\"radio\" name=\"zzmm\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"zzmm2\" value=\"团员\">团员\r\n");
      out.write("\t\t\t\t\t\t</label> <label for=\"zzmm3\"> <input type=\"radio\" name=\"zzmm\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"zzmm3\" value=\"群众\">群众\r\n");
      out.write("\t\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row-button\">\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"submit\" value=\"提   交\" class=\"send\">&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"button\" value=\"重   置\" class=\"send\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"form-row-click\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">注册帮助信息请点这里</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p> <!--超链接-->\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
