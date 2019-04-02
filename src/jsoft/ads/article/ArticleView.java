package jsoft.ads.article;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import jsoft.objects.UserObject;
import jsoft.*;
import jsoft.ads.source.*;

public class ArticleView extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        //tim thong tin dang nhap he thong
        UserObject user = (UserObject) request.getSession().getAttribute(
                "userLogined");

        //Kiem tra
        if (user == null) {
            response.sendRedirect("/adv/user/login");
        } else {
            view(request, response);
        }

    }

    private void view(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        //Tim bo quan li ket noi

        ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute(
                "CPool");
        //Tao doi tuong thuc thi chuc nang
        ArticleControl cc = new ArticleControl(cp);

        if (cp == null) {
            getServletContext().setAttribute("CPool", cc.getCP());
        }

        short totalPage = (short)(cc.getSize()/100);
        totalPage++;
        short page = 0;
        if (request.getParameter("page") != null) {
            page = (short) Integer.parseInt(request.getParameter("page"));
        } else {
            page = 1;
        }


        //Lay cau truc HTML trinh bay
        String view;
        if (page == 0) {
            page = 1;
            view = cc.viewArticles(null, page, 999);
        } else {
            view = cc.viewArticles(null, page, 100);
        }

        //Tra ve ket noi
        cc.releaseCon();

        //Tim cau truc cua header ghep lai
        RequestDispatcher h = request.getRequestDispatcher("/header");
        if (h != null) {
            h.include(request, response);
        }

        out.print("<div class=\"content \">");

        out.print("<div class=\"animated fadeIn\">");
        out.print("<div class=\"row\">");
        out.print("<div class=\"col-md-12\">");
        out.print("<div class=\"card\">");
        out.print("<div class=\"card-header\">");
        out.print("<strong class=\"card-title\">B�i vi\u1EBFt</strong>");
        out.print("<select class=\"paginate\">");
        for(int i=0; i<totalPage; i++){
            out.print("<option value=\"view?page="+(i+1)+"\">Trang "+(i+1)+"</option>");
        }
        out.print("<option value=\"view?page=0\">T\u1EA5t c\u1EA3</option>");
        out.print("</select>");

        out.print(
                "<a href=\"modified-all\" class=\"btn btn-primary pull-right\">");
        out.print("Duy\u1EC7t t\u1EA5t c\u1EA3");
        out.print("</a>");

        out.println(
                "<form method='POST' action='get-news' class=\"pull-right\">");
        out.println("<input type='submit' class='btn btn-success' value='C\u1EADp nh\u1EADt b�i vi\u1EBFt m\u1EDBi'>");
        out.println("</form>");

        out.print("</div>");

        out.print("<div class=\"card-body\">");
        out.print(view);
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div><!-- .animated -->");

        out.print("</div> <!-- .content -->");
        out.print("<div class=\"clearfix\"></div>");

        //Tim footer va ghep
        RequestDispatcher f = request.getRequestDispatcher("/footer");
        if (f != null) {
            f.include(request, response);
        }

    }

    //Process the HTTP Post request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doGet(request, response);
    }

    //Clean up resources
    public void destroy() {
    }
}
