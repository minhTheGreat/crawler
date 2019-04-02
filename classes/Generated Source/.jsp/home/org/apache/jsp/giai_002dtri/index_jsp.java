package org.apache.jsp.giai_002dtri;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jsoft.library.*;
import java.util.*;
import jsoft.*;
import jsoft.objects.*;
import jsoft.ads.category.*;
import jsoft.gui.article.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, true);
      out.write("\r\n  <section id=\"mainContent\">\r\n    <div class=\"content_middle\">\r\n\r\n    </div>\r\n    <div class=\"clr\"></div>\r\n    <div class=\"content_bottom\">\r\n      <div class=\"col-lg-8 col-md-8\">\r\n        <div class=\"content_bottom_left\">\r\n    ");

     String archive_entertain = (String) session.getAttribute("archive_entertain");
  if (archive_entertain != null) {
    out.print(archive_entertain);
  }
    
      out.write("\r\n        </div>\r\n\r\n\r\n      <div class=\"col-lg-4 col-md-4\">\r\n        <div class=\"content_bottom_right\">\r\n          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../rview.jsp", out, true);
      out.write("\r\n          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../bbview.jsp", out, true);
      out.write("\r\n\r\n\r\n        </div>\r\n      </div>\r\n\r\n  </section>\r\n</div>\r\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, true);
      out.write("\r\n</body>\r\n</html>\r\n\r\n");
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
