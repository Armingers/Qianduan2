package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Warning_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>提示登陆界面</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    <link href=\"Warning.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"onepage\">\n");
      out.write("        <div class=\"onepage-bg\" id=\"onepage\"></div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <div class=\"modal-dialog\" style=\"margin-top: -35%;\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("            <h4 class=\"modal-title text-center text-danger\" id=\"myModalLabel\"><strong>提示</strong></h4>\n");
      out.write("            <br>\n");
      out.write("            <h3 class=\"modal-title text-center text-default\" id=\"myModalLabel\"><strong>请先登录</strong></h3>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <h3 class=\"modal-title text-center text-default\" id=\"myModalLabel\"><strong>\n");
      out.write("                    <img src=\"images/hushi.jpg\" style=\"width: 30%\">登录后使用更多功能<img src=\"images/hushi2.jpg\" style=\"width: 30%\">\n");
      out.write("                </strong></h3>\n");
      out.write("        </div>\n");
      out.write("        <center><a class=\"btn btn-primary form-inline\" href=\"http://localhost:8084/men_zhen_System/Login.jsp\" role=\"button\">登录</a></center>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </body>\n");
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
