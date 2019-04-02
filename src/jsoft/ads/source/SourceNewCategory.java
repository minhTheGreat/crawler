package jsoft.ads.source;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import jsoft.objects.*;
import jsoft.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import jsoft.ads.assessment_rule.Assessment_ruleControl;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class SourceNewCategory extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";
    private SourceModel sm;

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        //tim thong tin dang nhap he thong
         UserObject user = ( UserObject) request.getSession().getAttribute(
                 "userLogined");
         request.setCharacterEncoding("utf-8");

         //Kiem tra
         if (user == null) {
             response.sendRedirect("/adv/user/login");
         } else {
             String categorySelector = request.getParameter("txtCateSelector").trim();
             String url = request.getParameter("txtLink").trim();

             Document document = Jsoup.connect(url).validateTLSCertificates(false).followRedirects(false).timeout(60000).get();

             Elements categories = document.select(categorySelector);
             // "#main_menu a"
             String tmp = "";
             for (Element category : categories) {
                 String standard_cate = sm.removeAccent(category.html());
                 tmp += "<div class=\"form-check\" style=\"margin-left: 30px;\">";
                 tmp += "<div class=\"checkbox\">";
                 tmp += "<label for=\"chk"+ standard_cate +"\" class=\"form-check-label \">";
                 tmp += "<input type=\"checkbox\" id=\"chk" + standard_cate +"\" name=\"chk"+ standard_cate +"\" value=\""+ standard_cate +"\" class=\"form-check-input\">" + category.html();;
                 tmp += "</label>";
                 tmp += "</div>";
                 tmp += "</div>";
              }

              response.setContentType("text/html;charset=UTF-8");
              response.getWriter().write(tmp);
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
       SourceControl cc = new SourceControl(cp);
       Assessment_ruleControl arc = new Assessment_ruleControl(cp);

       if (cp == null) {
           getServletContext().setAttribute("CPool", cc.getCP());
       }
       //Lay cau truc HTML trinh bay
       String view = cc.viewSourceNew(arc.getAssessment_ruleObjects(null, (short) 1, (byte) 100));

       //Tra ve ket noi
       cc.releaseCon();
       arc.releaseCon();

       //Tim cau truc cua header ghep lai
       RequestDispatcher h = request.getRequestDispatcher("/header");
       if (h != null) {
           h.include(request, response);
       }

       out.print(view);

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
