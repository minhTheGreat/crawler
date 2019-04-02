package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jsoft.*;
import jsoft.objects.*;
import jsoft.gui.article.category.*;
import jsoft.gui.article.*;
import jsoft.ads.user_log.*;
import jsoft.library.Utilities.*;
import java.util.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "data.jsp", out, true);
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n  <head>\r\n    <title>VietNamNEWS</title>\r\n    <meta charset=\"utf-8\">\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n    <link rel=\"icon\" href=\"/home/images/favorite-icon.png\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/bootstrap.min.css\">\r\n    <link href=\"https://fonts.googleapis.com/css?family=Nunito&amp;subset=vietnamese\" rel=\"stylesheet\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/font-awesome.min.css\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/animate.css\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/slick.css\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/theme.css\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/style.css\">\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/home/assets/css/custom.css\">\r\n    <!--\r\n      [if lt IE 9]>\r\n      <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"assets/js/respond.min.js\"></script>\r\n      <![endif]\r\n    -->\r\n  </head>\r\n  <body>\r\n    <div id=\"preloader\">\r\n      <div id=\"status\">&nbsp;</div>\r\n    </div>\r\n    <a class=\"scrollToTop\" href=\"#\">\r\n      <span></span>\r\n    </a>\r\n    <div class=\"container\">\r\n      <header id=\"header\">\r\n        <div class=\"row\">\r\n          <div class=\"col-lg-12 col-md-12\">\r\n            <div class=\"header_top\">\r\n              <div class=\"header_top_left\">\r\n                <ul class=\"top_nav\">\r\n                  <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#modalSignIn\">Đăng nhập</a></li>\r\n\r\n                  <!-- <li><a href=\"index.html\"><img src=\"images/favorite-icon.png\"></a></li> -->\r\n                </ul>\r\n              </div>\r\n            </div>\r\n            <div class=\"header_bottom\">\r\n              <div class=\"header_bottom_left\">\r\n                <a class=\"logo\" href=\"/home/\">\r\n                  <img src=\"/home/images/favorite-icon.png\" style=\"margin:0px; height:125px;width:125px\" />\r\n                </a>\r\n");
      out.write("              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </header>\r\n      <div id=\"navarea\">\r\n        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n          <div class=\"container-fluid\">\r\n            <div class=\"navbar-header\">\r\n\r\n            </div>\r\n            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n              <ul class=\"nav navbar-nav custom_nav\">\r\n                <li class=\"\"><a href=\"/home/\">Trang chủ</a></li>\r\n\r\n                <li class=\"\"><a href=\"/home/thoi-su\">Thời sự</a></li>\r\n                <li class=\"\"><a href=\"/home/the-thao/\">Thể thao</a></li>\r\n                <li class=\"\"><a href=\"/home/kinh-te/\">Kinh tế</a></li>\r\n                <li class=\"\"><a href=\"/home/giai-tri/\">Giải trí</a></li>\r\n                <li class=\"\"><a href=\"/home/suc-khoe/\">Sức khoẻ</a></li>\r\n                <li class=\"\"><a href=\"/home/phap-luat/\">Pháp luật</a></li>\r\n                <li class=\"\"><a href=\"/home/giao-duc/\">Giáo dục</a></li>\r\n                <li class=\"\"><a href=\"/home/khoa-hoc/\">Khoa học</a></li>\r\n");
      out.write("                <li class=\"\"><a href=\"/home/du-lich/\">Du lịch</a></li>\r\n                <li class=\"\"><a href=\"/home/the-gioi/\">Thế giới</a></li>\r\n                <!--\r\n                  <li class=\"dropdown\"> <a href=\"#\" class=\"\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Archives</a>\r\n                  <ul class=\"dropdown-menu\" role=\"menu\">\r\n                  <li><a href=\"pages/archive-main.html\">Thể thao</a></li>\r\n                  <li><a href=\"pages/archive1.html\">Bóng đá</a></li>\r\n                  <li><a href=\"pages/archive2.html\">Bóng bàn</a></li>\r\n                  <li><a href=\"pages/archive3.html\">Thể thao điện tử 3</a></li>\r\n                  </ul>\r\n                  </li>\r\n                -->\r\n                <!--\r\n                  <li><a href=\"pages/single.html\">Single page</a></li>\r\n                  <li><a href=\"pages/contact.html\">Contact</a></li>\r\n                  <li><a href=\"pages/404.html\">404 page</a></li>\r\n                -->\r\n              </ul>\r\n            </div>\r\n          </div>\r\n");
      out.write("        </nav>\r\n      </div>\r\n\r\n\r\n\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
