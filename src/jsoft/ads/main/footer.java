package jsoft.ads.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import jsoft.objects.*;

public class footer extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.print("<div class=\"clear-fix\"></div>");
        out.print("<footer class=\"site-footer\">");
        out.print("<div class=\"footer-inner bg-white\">");
        out.print("<div class=\"row\">");
        out.print("<div class=\"col-sm-6\">");
        out.print("Copyright &copy; 2018 Ela Admin");
        out.print("</div>");
        out.print("<div class=\"col-sm-6 text-right\">");
        out.print(
                "\u0110\u01B0\u1EE3c xây d\u1EF1ng b\u1EDFi <a href=\"#\">Nhóm SV 1 - \u0110H Công nghi\u1EC7p Hà N\u1ED9i</a>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</footer>");
        out.print("</div><!-- /#right-panel -->");

        out.print(
                "<script src=\"/adv/assets/js/vendor/jquery-2.1.4.min.js\"></script>");
        out.print("<script src=\"/adv/assets/js/popper.min.js\"></script>");
        out.print("<script src=\"/adv/assets/js/plugins.js\"></script>");
        out.print("<script src=\"/adv/assets/js/main.js\"></script>");
        out.print("<script src=\"/adv/assets/js/checkUser.js\"></script>");
        out.print("<script src=\"/adv/assets/js/getCategoryAjax.js\"></script>");

        out.print(
                "<script src=\"/adv/assets/js/lib/chart-js/Chart.bundle.js\"></script>");

        out.print("<!--Chartist Chart-->");
        out.print(
                "<script src=\"/adv/assets/js/lib/chartist/chartist.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/chartist/chartist-plugin-legend.js\"></script> ");

        out.print(
                "<script src=\"/adv/assets/js/lib/flot-chart/jquery.flot.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/flot-chart/jquery.flot.pie.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/flot-chart/jquery.flot.spline.js\"></script>");

        out.print(
                "<script src=\"/adv/assets/weather/js/jquery.simpleWeather.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/weather/js/weather-init.js\"></script>");

        out.print(
                "<script src=\"/adv/assets/js/lib/moment/moment.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/calendar/fullcalendar.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/calendar/fullcalendar-init.js\"></script>");

        /////////
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/datatables.min.js\"></script>");
        out.print("<script src=\"/adv/assets/js/lib/data-table/dataTables.bootstrap.min.js\"></script>");
        out.print("<script src=\"/adv/assets/js/lib/data-table/dataTables.buttons.min.js\"></script>");
        out.print("<script src=\"/adv/assets/js/lib/data-table/buttons.bootstrap.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/jszip.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/pdfmake.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/vfs_fonts.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/buttons.html5.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/buttons.print.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/buttons.colVis.min.js\"></script>");
        out.print(
                "<script src=\"/adv/assets/js/lib/data-table/datatables-init.js\"></script>");

        out.print("<script type=\"text/javascript\">");
        out.print("$(document).ready(function() {");
        out.print("$('#bootstrap-data-table-export').DataTable();");
        out.print("} );");
        out.print("</script>");


        //out.print("<div id=\"container\"></div>");
        out.print("</body>");
        out.print("</html>");

        out.close();
    }

    //Clean up resources
    public void destroy() {
    }
}
