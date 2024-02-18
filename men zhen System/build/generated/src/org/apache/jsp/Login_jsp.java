package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>登陆界面</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    <link href=\"Login.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("\n");
      out.write("    <div class=\"onepage\">\n");
      out.write("        <div class=\"onepage-bg\" id=\"onepage\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-dialog\" style=\"margin-top: -30%;\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("            <h4 class=\"modal-title text-center\" id=\"myModalLabel\"><strong>登录</strong></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" id = \"model-body\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" class=\"form-control\"placeholder=\"用户名\" autocomplete=\"off\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"密码\" autocomplete=\"off\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-offset-0 col-sm-10\">\n");
      out.write("            <div class=\"checkbox\">\n");
      out.write("                <label>\n");
      out.write("                    <input type=\"checkbox\"> 记住我的账号\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <a class=\"btn btn-primary form-control\" href=\"http://localhost:8084/men_zhen_System/HomePage.jsp\" role=\"button\">登录</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <a class=\"btn btn-default form-control\" href=\"http://localhost:8084/men_zhen_System/register.jsp\" role=\"button\">注册</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div><!-- /.modal-content -->\n");
      out.write("</div><!-- /.modal -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
