/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-14 01:19:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.resume;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addresume_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>创建简历</title>\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"../../../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../../../js/jquery-1.9.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../../../js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("        body{\r\n");
      out.write("            background-color: #F4F6F9;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        #bg{\r\n");
      out.write("            background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\" id=\"bg\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\"  >\r\n");
      out.write("        <div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("            <img src=\"../../../img/logo2.jpg\" width=\"160px\" height=\"80px\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div align=\"right\" class=\"col-lg-6 col-md-6 col-sm-6\" style=\"padding-top: 25px;\">\r\n");
      out.write("            <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employ.account}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",你好！</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--导航栏-->\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 10px;\">\r\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"/index.jsp\">首页</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"/position/getPosition\"/>职位浏览<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/employ/getEmployInfo\"/>投递反馈</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" size=\"35\" placeholder=\"Search\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">搜索</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<form action=\"/resume/addResume\" method=\"post\">\r\n");
      out.write("    <fieldset style=\"text-align: center\">\r\n");
      out.write("        <legend class=\"text-primary\" style=\"font-size: 25px;width: 1140px\" >添加个人简历</legend>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\"  align=\"center\">\r\n");
      out.write("            <div class=\"row\" style=\"background-image: url(");
      out.print(basePath);
      out.write("img/); width: 1100px\"  >\r\n");
      out.write("                <div class=\" col-md-6 \">\r\n");
      out.write("                    <div align=\"left\"><p class=\"bg-info\" style=\"width: 60%;font-size: 20px;margin-top: 10px\" align=\"center\">基本信息</p></div>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >用户编号:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\"  name=\"userid\" readonly=\"readonly\" value=\"");
      out.print(request.getParameter("userid"));
      out.write("\"/></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >姓名:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"realname\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >生日:</div> <div align=\"left\"><input type=\"date\" class=\"form-control\" style=\"width: 60%;\" name=\"birthdays\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >性别:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"sex\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >所在城市:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"city\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >手机号:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"phonenum\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >邮箱:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"email\"  value=\"\" /></div><br>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >个人描述:</div><div align=\"left\"><textarea name=\"perdscp\" class=\"form-control\" style=\"width: 60%;\" > </textarea></div><br>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\" col-md-6 \">\r\n");
      out.write("                    <div align=\"left\"><p class=\"bg-info\" style=\"width: 60%;font-size: 20px;margin-top: 10px\" align=\"center\">个人意向</p></div>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >学校名称:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"school\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >学历:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"education\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >专业:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"major\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >工作经验:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"workexp\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >期望职位:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"positions\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >期望薪资:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"exsalary\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div style=\"color: #46B8DA; font-size: 15px;\" align=\"left\" >期望工作地点:</div> <div align=\"left\"><input type=\"text\" class=\"form-control\" style=\"width: 60%;\" name=\"exaddress\"  value=\"\" /></div><br>\r\n");
      out.write("                    <div align=\"left\" style=\"margin-top: 20px\"><input type=\"submit\" value=\"确认添加\"  class=\"btn btn-info btn-lg \"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
