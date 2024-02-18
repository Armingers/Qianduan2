package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.*;

public final class yaokuchange2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Title</title>\n");
      out.write("    <!-- 新 Bootstrap 核心 CSS 文件 -->\n");
      out.write("     <script src=\"http://www.htmleaf.com/js/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
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
      out.write("<body style=\"background:url(https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F123162067%2Fb8376c0cc370c6581e1a0d251e0cccaa.jpg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvMTIzMTYyMDY3L2I4Mzc2YzBjYzM3MGM2NTgxZTFhMGQyNTFlMGNjY2FhLmpwZw%3D%3D%2Fsign%2F715c650c190043c6870de0bff0c0f903.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1657295722&t=5978da94cb601da58e3b4b3cdfa2b3b9) no-repeat center center fixed; background-size: 100%;\">\n");
      out.write("\n");
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
      out.write("                    <p class=\"p1\">修改药品信息</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6\" id=\"biao\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"yaokuchangeServlet\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputUser3\" class=\"col-sm-3 control-label\">药名</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"yaoming\" placeholder=\"请输入药名\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">新药品简称</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"jiancheng\" placeholder=\"请输入新药品简称\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password2\" class=\"col-sm-3 control-label\">新药品余量(g)</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"yuliang\" placeholder=\"请输入新药品余量\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">新成本价(元)</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"chengben\" placeholder=\"请输入新成本价\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputName3\" class=\"col-sm-3 control-label\">新售价(元)</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"shoujia\" placeholder=\"请输入新售价\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPhone3\" class=\"col-sm-3 control-label\">新生产厂家</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"changjia\" placeholder=\"请输入新生产厂家\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPhone3\" class=\"col-sm-3 control-label\">新库存预警(g)</label>\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"yujing\" placeholder=\"请输入新库存预警\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("          \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <center><button class=\"btn btn-primary\" type=\"submit\" name=\"action\" value=\"zxy\"  role=\"button\">修改</button></center>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                    \n");
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
