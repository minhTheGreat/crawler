package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n<footer id=\"footer\">\r\n  <div class=\"footer_top\">\r\n    <div class=\"container\">\r\n      <div class=\"row\">\r\n        <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n          <div class=\"single_footer_top wow fadeInRight\">\r\n            <h2>Giới thiệu</h2>\r\n            <p><strong>Thành lập ngày 10/09/2018.</strong><br>\r\n            <strong>Sinh viên trường đại học Công nghiệp Hà Nội</strong>.<br>\r\n            <!-- <strong>Giấy phép:</strong> XXX.<br> -->\r\n            <strong>Điện thoại:</strong> 033-4492-484<br>\r\n            <strong>Người thực hiện: </strong><br>\r\n            <span style=\"margin-left: 20px;\"> Nguyễn Như Thuỳ</span><br>\r\n            <span style=\"margin-left: 20px;\"> Nguyễn Trung Hiếu</span><br>\r\n            <span style=\"margin-left: 20px;\"> Trần Quang Minh</span><br>\r\n            </p>\r\n            <p>\r\n            <!-- <strong>Tòa soạn:</strong> XXX. -->\r\n            <!-- <strong>Đường dây nóng:</strong> 0123 123 0123<br> -->\r\n            <!-- <strong>Fax:</strong> 024 3795 XXXX -->\r\n            </p>\r\n          </div>\r\n");
      out.write("        </div>\r\n        <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n            <div class=\"single_footer_top wow fadeInRight\">\r\n              <a href=\"/home/\"><img src=\"images/favorite-icon.png\" height=\"150px\"></a>\r\n            </div>\r\n          </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n  <div class=\"footer_bottom\">\r\n    <div class=\"container\">\r\n      <div class=\"row\">\r\n        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n          <div class=\"footer_bottom_left\">\r\n            <p>Copyright &copy; 2018 <a href=\"/home/\">Nhóm 01 KTPM4 K10 </a></p>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n          <div class=\"footer_bottom_right\">\r\n            <p>Developed BY NHOM1</p>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</footer>\r\n\r\n<!-- Modal Sign in-->\r\n<div class=\"modal fade\" id=\"modalSignIn\" role=\"dialog\">\r\n  <div class=\"modal-dialog modal-md\">\r\n    <div class=\"modal-content\">\r\n    ");

		String err = request.getParameter("err");
		if ("1".equals(err)) {
			out.print("<h4 style=\"color: red;\">Đăng nhập thất bại</h4>");
		}
	
      out.write("\r\n      <form action=\"");
      out.print(request.getContextPath());
      out.write("\" class=\"search_form\" method=\"POST\">\r\n        <div class=\"modal-body\">\r\n          <div class=\"form-group\">\r\n            <label for=\"usr\">Tên đăng nhập:</label>\r\n            <input type=\"email\" class=\"form-control\" name=\"txtUserName\" id=\"usr\" placeholder=\"Email\">\r\n          </div>\r\n          <div class=\"form-group\">\r\n            <label for=\"pwd\">Mật khẩu:</label>\r\n            <input type=\"password\" class=\"form-control\" name=\"txtUserPass\" id=\"pwd\" placeholder=\"Mật khẩu\">\r\n          </div>\r\n        </div>\r\n        <div class=\"modal-footer\">\r\n          <a href=\"#\">Quên mật khẩu?</a>\r\n          <input type=\"submit\" class=\"btn btn-default modal-submit\" data-dismiss=\"modal\" value=\"Đăng nhập\">\r\n          <br>\r\n        </div>\r\n      </form>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n<!-- Modal Sign up-->\r\n<div class=\"modal fade\" id=\"modalSignUp\" role=\"dialog\">\r\n    <div class=\"modal-dialog modal-md\">\r\n      <div class=\"modal-content\">\r\n        <form action=\"#\" class=\"search_form\">\r\n          <div class=\"modal-body\">\r\n            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"usr\">Tên đăng nhập:</label>\r\n              <input type=\"email\" class=\"form-control\" id=\"usr\" placeholder=\"Email\">\r\n            </div>\r\n            <div class=\"form-group\">\r\n              <label for=\"pwd\">Mật khẩu:</label>\r\n              <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Mật khẩu\">\r\n            </div>\r\n          </div>\r\n          <div class=\"modal-footer\">\r\n            <button type=\"submit\" class=\"btn btn-default modal-submit\" data-dismiss=\"modal\">Đăng ký</button>\r\n            <br>\r\n          </div>\r\n        </form>\r\n      </div>\r\n    </div>\r\n  </div>\r\n<script src=\"/home/assets/js/jquery.min.js\"></script>\r\n<script src=\"/home/assets/js/bootstrap.min.js\"></script>\r\n<script src=\"/home/assets/js/wow.min.js\"></script>\r\n<script src=\"/home/assets/js/slick.min.js\"></script>\r\n<script src=\"/home/assets/js/custom.js\"></script>\r\n");
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
