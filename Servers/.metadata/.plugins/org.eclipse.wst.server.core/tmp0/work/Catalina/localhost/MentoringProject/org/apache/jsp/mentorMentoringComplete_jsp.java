/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-26 04:00:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mentorMentoringComplete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/mentorHeader.jsp", Long.valueOf(1621996062542L));
    _jspx_dependants.put("/everyFooter.jsp", Long.valueOf(1621996062523L));
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>TakeYourTime</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/subpage.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" sizes=\"76x76\" type=\"image/x-icon\"\r\n");
      out.write("        href=\"https://a0.muscache.com/airbnb/static/logotype_favicon-21cc8e6c6a2cca43f061d2dcabdf6e58.ico\">\r\n");
      out.write("    <script src=\"js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("    <div class=\"topmenu\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <a href=\"#none\"><i class=\"fab fa-facebook-square\"></i></a>\r\n");
      out.write("            <a href=\"#none\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("            <a href=\"#none\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("            <a href=\"#none\"><i class=\"fas fa-comment-dots\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"menubar row\">\r\n");
      out.write("        <div class=\"logo cf\">\r\n");
      out.write("            <!-- <svg viewBox=\"0 0 1000 1000\" role=\"presentation\" aria-hidden=\"true\" focusable=\"false\"\r\n");
      out.write("                    style=\"height: 1em; width: 1em; display: inline-block; fill: currentcolor;\">\r\n");
      out.write("                    <path\r\n");
      out.write("                        d=\"m499.3 736.7c-51-64-81-120.1-91-168.1-10-39-6-70 11-93 18-27 45-40 80-40s62 13 80 40c17 23 21 54 11 93-11 49-41 105-91 168.1zm362.2 43c-7 47-39 86-83 105-85 37-169.1-22-241.1-102 119.1-149.1 141.1-265.1 90-340.2-30-43-73-64-128.1-64-111 0-172.1 94-148.1 203.1 14 59 51 126.1 110 201.1-37 41-72 70-103 88-24 13-47 21-69 23-101 15-180.1-83-144.1-184.1 5-13 15-37 32-74l1-2c55-120.1 122.1-256.1 199.1-407.2l2-5 22-42c17-31 24-45 51-62 13-8 29-12 47-12 36 0 64 21 76 38 6 9 13 21 22 36l21 41 3 6c77 151.1 144.1 287.1 199.1 407.2l1 1 20 46 12 29c9.2 23.1 11.2 46.1 8.2 70.1zm46-90.1c-7-22-19-48-34-79v-1c-71-151.1-137.1-287.1-200.1-409.2l-4-6c-45-92-77-147.1-170.1-147.1-92 0-131.1 64-171.1 147.1l-3 6c-63 122.1-129.1 258.1-200.1 409.2v2l-21 46c-8 19-12 29-13 32-51 140.1 54 263.1 181.1 263.1 1 0 5 0 10-1h14c66-8 134.1-50 203.1-125.1 69 75 137.1 117.1 203.1 125.1h14c5 1 9 1 10 1 127.1.1 232.1-123 181.1-263.1z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                    <h2>Take Your Time</h2>\r\n");
      out.write("                </svg> -->\r\n");
      out.write("            <h1><a href=\"/MentoringProject/mentorHomePage.do\">LOGO</a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"mentorBeAnotherMentor2.jsp\">포스정보 추가등록</a></li> \r\n");
      out.write("                <li><a href=\"/MentoringProject/help.do\">도움말</a></li>\r\n");
      out.write("                <li><a href=\"/MentoringProject/showMentorMyPage.do\">마이페이지</a></li>\r\n");
      out.write("                <li><a href=\"/MentoringProject/logout.do\">로그아웃</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<h1>축하드립니다</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<h3>포터링을 성공적으로 마치셨습니다.</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<h4>당신의 멘티에게서 받은 토큰 번호를 입력하면 돈이 바로 송금 됩니다!</h4>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"/MentoringProject/mentorMentoringCompleteTokenCheck.do\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"text\" name=\"schedulepk\" value=\"");
out.print(request.getParameter("scheduledpk"));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"token\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"submit\" value=\"토큰 번호 입력\">\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <p>\r\n");
      out.write("                <a href=\"#none\">회사소개</a>\r\n");
      out.write("                <a href=\"#none\">사업분야</a>\r\n");
      out.write("                <a href=\"#none\">갤러리</a>\r\n");
      out.write("                <a href=\"#none\">온라인문의</a>\r\n");
      out.write("                <a href=\"#none\">고객센터</a>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p><span>주소 : 부산광역시 해운대구 좌동 273-10</span> <span class=\"hide\"> / </span> <span>상호 : 디자인선사인</span> <span\r\n");
      out.write("                    class=\"hide\"> / </span>사업자등록번호 : 123-456-7890<br>\r\n");
      out.write("                <a href=\"tel:070-7155-19749\">Tel : 070-7155-19749</a> <span class=\"hide\"> / </span><span>Fax :\r\n");
      out.write("                    02-2139-1142</span> <span class=\"hide\"> / </span><a href=\"mailto:gijung23@nate.com\">E-mail :\r\n");
      out.write("                    gijung23@nate.com</a></p>\r\n");
      out.write("            <p>Copyright &copy; Sunsine.com All Rights Reserved.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
