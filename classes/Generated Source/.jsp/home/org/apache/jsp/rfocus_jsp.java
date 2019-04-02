package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rfocus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n<!-- <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n        <div class=\"content_middle_rightbar\">\r\n          <div class=\"single_category wow fadeInDown\">\r\n            <h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span> <a href=\"#\" class=\"title_text\">Giải trí</a> </h2>\r\n            <ul class=\"catg1_nav\">\r\n              <li>\r\n                <div class=\"catgimg_container\"> <a href=\"pages/single.html\" class=\"catg1_img\"><img alt=\"\" src=\"images/sui-he-14.jpg\"></a></div>\r\n                <h3 class=\"post_titile\"><a href=\"pages/single.html\">Hà Tuệ - nàng thơ phương Đông của show nội y Victoria’s Secret</a></h3>\r\n              </li>\r\n              <li>\r\n                <div class=\"catgimg_container\"> <a href=\"pages/single.html\" class=\"catg1_img\"><img alt=\"\" src=\"images/phung-ngoc-huy.jpg\"></a></div>\r\n                <h3 class=\"post_titile\"><a href=\"pages/single.html\">Bạn trai cũ hát quyên góp giúp Mai Phương trị ung thư</a></h3>\r\n              </li>\r\n            </ul>\r\n          </div>\r\n        </div>\r\n");
      out.write("      </div>\r\n-->\r\n");

String rfocus =(String) session.getAttribute("rfocus");
if(rfocus!=null){
  out.print(rfocus);
}

      out.write("\r\n\r\n");
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
