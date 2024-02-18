package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>注册界面</title>\n");
      out.write("    <!-- 新 Bootstrap 核心 CSS 文件 -->\n");
      out.write("     <script src=\"http://www.htmleaf.com/js/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("    <link href=\"register.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 3px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        #b_box{\n");
      out.write("            border: 1px solid #A6A6A6;\n");
      out.write("            background-color: white;\n");
      out.write("            margin-top: 80px;\n");
      out.write("        }\n");
      out.write("        .p1{\n");
      out.write("            margin-top: 15px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #2e6da4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #lp{\n");
      out.write("            float: right;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        #biao{\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"onepage\">\n");
      out.write("        <div class=\"onepage-bg\" id=\"onepage\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\" id=\"box\">\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-8\" id=\"b_box\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <div>\n");
      out.write("                    <p class=\"p1\">新用户注册</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6\" id=\"biao\">\n");
      out.write("                <form class=\"form-horizontal\" <!--action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" method=\"post\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputUser3\" class=\"col-sm-3 control-label\">用户名</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputUser3\" placeholder=\"请输入账号\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">密码</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"请输入密码\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password2\" class=\"col-sm-3 control-label\">确认密码</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"password2\" placeholder=\"请确认密码\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Email</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"请输入Email\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputName3\" class=\"col-sm-3 control-label\">姓名</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputName3\" placeholder=\"请输入真实姓名\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPhone3\" class=\"col-sm-3 control-label\">手机号</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"inputPhone3\" placeholder=\"请输入您的手机号\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-sm-3 control-label\">性别</label>\n");
      out.write("                        <div class=\"col-sm-9 \">\n");
      out.write("                           <label class=\"radio-inline\">\n");
      out.write("   <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"option1\"> 男\n");
      out.write("</label>\n");
      out.write("<label class=\"radio-inline\">\n");
      out.write("  <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\"> 女\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputData3\" class=\"col-sm-3 control-label\">出生日期</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"inputData3\" placeholder=\"请输入真实姓名\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <center><button type=\"button\" class=\"btn btn-primary js-popover\" data-toggle=\"popover\" data-content=\"恭喜您注册成功\">注册</button></center>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <script src=\"jquery-2.1.1.min.js\"></script>\n");
      out.write("                        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("                        <script>\n");
      out.write("                            $(\".js-popover\").popover();\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("\n");
      out.write("                <div id=\"lp\">\n");
      out.write("                    <p>已有账号?<a href=\"http://localhost:8084/men_zhen_System/Login.jsp\">立即登录</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
