/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2015-08-29 16:49:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class articleForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/Users/gracelilac/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1426668402000L));
    _jspx_dependants.put("jar:file:/Users/gracelilac/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/articleForm.css\">\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"  src=\"js/test.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id = \"article_form_container\">\n");
      out.write("\t\t<form name=\"articleForm\" action=\"/write\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t<div id =\"article_form\">\n");
      out.write("\t\t\t\t<div id = \"article_title\">제목 : <input type=\"text\" name=\"title\" placeholder=\"제목을 입력하세요.\"/></div>\n");
      out.write("\t\t\t\t<div id = \"address\">주소 : <input type=\"text\" name=\"address\" placeholder=\"주소를 입력하세요.\"/></div>\n");
      out.write("\t\t\t\t<div id = \"recruit_count\">\n");
      out.write("\t\t\t\t\t<div id=\"recruit_count_text\">모집 인원 : </div>\n");
      out.write("\t\t\t\t\t<table id=\"select_recruit_count\">\n");
      out.write("\t\t\t\t\t    <tr>\n");
      out.write("\t\t\t\t\t    \t<td style=\"padding-left:0px; border: 1px solid #bcbcbc;\"><button id =\"down_button\" name=\"title\" style=\"height:24px;width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF\">-</button></td>\n");
      out.write("\t\t\t\t\t\t\t<td style=\"padding-left:0px; border: 1px solid #bcbcbc;\"><div id=\"recruitCount\"name=\"recruitCount\" type=\"text\" value=\"1\" style=\"width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px\"/>1</td>\n");
      out.write("\t\t\t\t\t\t\t<td style=\"padding-left:0px; border: 1px solid #bcbcbc;\"><button id = \"up_button\" style=\"width:23px;text-align:center;border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;background-color:white;color:#CFCFCF;\">+</button></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id =\"visible_btn\" onclick=\"visible()\"></div>\n");
      out.write("\t\t\t\t<div id =\"img_container\" style=\"display:none;\">\n");
      out.write("\t\t\t\t<!-- img 시작  -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id = \"before-img\">\n");
      out.write("\t\t\t\t\t\t사진 등록<br /><input type=\"file\" name=\"file\" style=\"text-align:center; width:150px;\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"localLocation\" value=\"/userImg/beforeImg\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"area\"></div>\n");
      out.write("\t\t\t\t\t<div id ='square-list'>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"0\" src=\"img/dragndrop/0.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"1\" src=\"img/dragndrop/1.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"2\" src=\"img/dragndrop/2.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"3\" src=\"img/dragndrop/3.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"4\" src=\"img/dragndrop/4.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"5\" src=\"img/dragndrop/5.png\" height=\"80\" width=\"80\" style=\"margin-top:-12px;margin-left:-7px;\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"6\" src=\"img/dragndrop/6.png\" height=\"60\" width=\"60\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper2'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"7\" src=\"img/dragndrop/7.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"8\" src=\"img/dragndrop/8.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"9\" src=\"img/dragndrop/9.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"10\" src=\"img/dragndrop/10.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"11\" src=\"img/dragndrop/11.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"12\" src=\"img/dragndrop/12.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"13\" src=\"img/dragndrop/13.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"14\" src=\"img/dragndrop/14.png\" height=\"120\" width=\"80\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- <div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"1\" src=\"img/dragndrop/1.png\" height=\"70\" width=\"90\" style=\"margin-top:30px;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"2\" src=\"img/dragndrop/2.png\" height=\"120\" width=\"130\" style=\"margin-left:3px;margin-top:-8px;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class = 'square-wrapper'>\n");
      out.write("\t\t\t\t\t\t<div class=\"square\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"3\" src=\"img/dragndrop/3.png\" height=\"140\" width=\"180\" style=\"margin-top:-10px;padding-left:30px;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t<!-- 이미지 끝  -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- <input type=\"file\" name=\"beforeImg\" />\n");
      out.write("\t\t\t\t<input type=\"file\" name=\"afterImg\" /> -->\n");
      out.write("\t\t\t\t<div id = \"article_content\"><textarea name=\"content\" placeholder=\"내용을 입력하세요.\" /></textarea></div>\n");
      out.write("\t\t\t\t<!-- <div id = \"recruit_count\">\n");
      out.write("\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t  \t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"10\">10</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"11\">11</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"12\">12</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"13\">13</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"14\">14</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"15\">15</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"16\">16</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"17\">17</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"18\">18</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"19\">19</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"20\">20</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"21\">21</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"22\">22</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"23\">23</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"24\">24</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"25\">25</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"26\">26</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"27\">27</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"28\">28</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"29\">29</option>\n");
      out.write("\t\t\t\t\t  \t<option value=\"30\">30</option>\n");
      out.write("\t\t\t\t\t</select> -->\n");
      out.write("\t\t\t\t<!-- <input type=\"hidden\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> -->\n");
      out.write("\t\t\t\t<!-- <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> -->\n");
      out.write("\t\t\t\t<div id = \"submit_button\" class=\"row\"><input type=\"submit\" name=\"submit\" value=\"확인\" /></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("</body>\n");
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
