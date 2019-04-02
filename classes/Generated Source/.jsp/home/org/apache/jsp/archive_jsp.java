package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import jsoft.*;
import jsoft.objects.*;
import jsoft.ads.category.*;
import jsoft.gui.article.*;

public final class archive_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n");

  String archive = (String) session.getAttribute("archive");
  if (archive != null) {
    out.print(archive);
  }
  String archive_news = (String) session.getAttribute("archive_news");
  if (archive != null) {
    out.print(archive_news);
  }
  String archive_finance = (String) session.getAttribute("archive_finance");
  if (archive_finance != null) {
    out.print(archive_finance);
  }
  String archive_entertain = (String) session.getAttribute("archive_entertain");
  if (archive_entertain != null) {
    out.print(archive_entertain);
  }
  String archive_health = (String) session.getAttribute("archive_health");
  if (archive_health != null) {
    out.print(archive_health);
  }
  String archive_law = (String) session.getAttribute("archive_law");
  if (archive_law != null) {
    out.print(archive_law);
  }
  String archive_edu = (String) session.getAttribute("archive_edu");
  if (archive_edu != null) {
    out.print(archive_edu);
  }
  String archive_science = (String) session.getAttribute("archive_science");
  if (archive_science != null) {
    out.print(archive_science);
  }
  String archive_travel = (String) session.getAttribute("archive_travel");
  if (archive_travel != null) {
    out.print(archive_travel);
  }
  String archive_world = (String) session.getAttribute("archive_world");
  if (archive_world != null) {
    out.print(archive_world);
  }

      out.write('\r');
      out.write('\n');
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
