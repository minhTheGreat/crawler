  package jsoft.ads.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import jsoft.objects.*;

public class menu extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        out.print("<!-- Right Panel --> ");
        out.print("<div id=\"right-panel\" class=\"right-panel\">");

        out.print("<!-- Header-->");
        out.print("<header id=\"header\" class=\"header\">  ");
        out.print("<div class=\"top-left\">");
        out.print("<div class=\"navbar-header\"> ");
        out.print(
                "<a class=\"navbar-brand\" href=\"/adv/index.html\">VietNam News</a>");
        out.print("<!-- <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"/adv/images/logo2.png\" alt=\"Logo\"></a>  -->");
        out.print(
                "<a id=\"menuToggle\" class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a> ");
        out.print("</div> ");
        out.print("</div>");
        out.print("<div class=\"top-right\"> ");
        out.print("<div class=\"header-menu\"> ");
        out.print("<div class=\"header-left\">");
        out.print("<div class=\"dropdown for-notification\">");
        out.print("<button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"notification\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">");

        out.print("<i class=\"fa fa-bell\"></i>");

        out.print("<span class=\"count bg-danger\">3</span>");
        out.print("</button>");
        out.print(
                "<div class=\"dropdown-menu\" aria-labelledby=\"notification\">");
        out.print("<p class=\"red\">You have 3 Notification</p>");
        out.print("<a class=\"dropdown-item media\" href=\"#\">");
        out.print("<i class=\"fa fa-check\"></i>");
        out.print("<p>Server #1 overloaded.</p>");
        out.print("</a>");
        out.print("<a class=\"dropdown-item media\" href=\"#\">");
        out.print("<i class=\"fa fa-info\"></i>");
        out.print("<p>Server #2 overloaded.</p>");
        out.print("</a>");
        out.print("<a class=\"dropdown-item media\" href=\"#\">");
        out.print("<i class=\"fa fa-warning\"></i>");
        out.print("<p>Server #3 overloaded.</p>");
        out.print("</a>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");

        out.print("<div class=\"user-area dropdown float-right\">");
        out.print("<a href=\"#\" class=\"dropdown-toggle active\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">");
        out.print("<img class=\"user-avatar rounded-circle\" src=\"/adv/images/admin.jpg\" alt=\"User Avatar\">");
        out.print("</a>");

        out.print("<div class=\"user-menu dropdown-menu\">");
        out.print("<a class=\"nav-link\" href=\"#\"><i class=\"fa fa-user\"></i>Th�ng tin c� nh�n</a>");

        out.print("<a class=\"nav-link\" href=\"#\"><i class=\"fa fa-bell-o\"></i>Th�ng b�o <span class=\"count\">13</span></a>");

        out.print("<a class=\"nav-link\" href=\"/adv/user/login\"><i class=\"fa fa-power-off\"></i>\u0110\u0103ng xu\u1EA5t</a>");
        out.print("</div>");
        out.print("</div> ");
        out.print("</div>  ");
        out.print("</div>");
        out.print("</header><!-- /header -->");
        out.print("<!-- Header-->");

    }

    //Clean up resources
    public void destroy() {
    }
}
