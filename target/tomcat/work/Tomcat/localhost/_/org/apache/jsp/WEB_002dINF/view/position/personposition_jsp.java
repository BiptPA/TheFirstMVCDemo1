/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-15 09:31:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.position;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class personposition_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <title>浏览职位详情</title>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"../../../css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"../../../js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"../../../js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("        <div class=\"row\"  >\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("                        <img src=\"../../../img/logo.jpg\" width=\"80px\" height=\"80px\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div align=\"right\" class=\"col-lg-6 col-md-6 col-sm-6\" style=\"padding-top: 25px;\">\r\n");
      out.write("                        <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employ.account}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",你好！</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--导航栏-->\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 10px;\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <a class=\"navbar-brand\" href=\"/index.jsp\">首页</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                        <li class=\"active\">\r\n");
      out.write("                                                <a href=\"/position/getPosition\"/>职位浏览<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                                <a href=\"#\">XX</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                                <a href=\"#\">XX</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"dropdown\">\r\n");
      out.write("                                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">热门职位 <span class=\"caret\"></span></a>\r\n");
      out.write("                                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                                <a href=\"#\">安卓开发工程师</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                                <a href=\"#\">ios开发工程师</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                                <a href=\"#\">大数据工程师</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                                <a href=\"#\">java高级工程师</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                                <a href=\"#\">算法工程师</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" size=\"35\" placeholder=\"Search\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-default\">搜索</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" >\r\n");
      out.write("        <h2 class=\"text-success\">职位名称：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.positions}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\r\n");
      out.write("        <h3 class=\"text-success\">发布时间：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">职位类型：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.postype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">职位数量：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">职位描述：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posdes}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">职位要求：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posreq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">薪   资：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.possal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">联系电话：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posphone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <h3 class=\"text-success\">工作地点：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.posloc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("        <a href=\"/resume/getOneResume?positionid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.positionid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&positions=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perposition.positions}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn bg-success\">投简历</a>\r\n");
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
