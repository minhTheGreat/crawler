package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bbview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n<div class=\"single_bottom_rightbar\">\r\n            <ul role=\"tablist\" class=\"nav nav-tabs custom-tabs\">\r\n              <li class=\"active\" role=\"presentation\"><a data-toggle=\"tab\" role=\"tab\" aria-controls=\"home\" href=\"#mostPopular\">Bài báo hot nhất</a></li>\r\n              <li role=\"presentation\"><a data-toggle=\"tab\" role=\"tab\" aria-controls=\"messages\" href=\"#recentComent\">Bài viết vừa đọc</a></li>\r\n            </ul>\r\n            <div class=\"tab-content\">\r\n              <div id=\"mostPopular\" class=\"tab-pane fade in active\" role=\"tabpanel\">\r\n                <ul class=\"small_catg popular_catg wow fadeInDown\">\r\n                  <li>\r\n                    <div class=\"media wow fadeInDown\"> <a class=\"media-left\" href=\"#\"><img src=\"images/rick-kid.jpg\" alt=\"\"></a>\r\n                      <div class=\"media-body\">\r\n                        <h4 class=\"media-heading\"><a href=\"#\">Người giàu Việt ngày càng nhiều, chi tiêu càng cao</a></h4>\r\n                        <p>Những món hàng giá \"đắt vô lý\" với không ít người, dần được đón nhận nhiều hơn ở Việt Nam nhờ giới nhà giàu và siêu giàu.</p>\r\n");
      out.write("                      </div>\r\n                    </div>\r\n                  </li>\r\n\r\n\r\n                </ul>\r\n              </div>\r\n              <div id=\"recentComent\" class=\"tab-pane fade\" role=\"tabpanel\">\r\n                <ul class=\"small_catg popular_catg\">\r\n                  <li>\r\n                    <div class=\"media wow fadeInDown\"> <a class=\"media-left\" href=\"#\"><img src=\"images/112x112.jpg\" alt=\"\"></a>\r\n                      <div class=\"media-body\">\r\n                        <h4 class=\"media-heading\"><a href=\"#\">Duis condimentum nunc pretium lobortis </a></h4>\r\n                        <p>Nunc tincidunt, elit non cursus euismod, lacus augue ornare metus, egestas imperdiet nulla nisl quis mauris. Suspendisse a pharetra </p>\r\n                      </div>\r\n                    </div>\r\n                  </li>\r\n\r\n\r\n                </ul>\r\n              </div>\r\n            </div>\r\n          </div>\r\n");
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
