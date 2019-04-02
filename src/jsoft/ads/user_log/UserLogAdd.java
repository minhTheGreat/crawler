package jsoft.ads.user_log;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import jsoft.*;
import jsoft.objects.User_logObject;
import jsoft.objects.ArticleObject;
import jsoft.ads.article.ArticleControl;

public class UserLogAdd extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        String link = request.getParameter("link").toString();
        ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute(
                "CPool");

        //Tao doi tuong thuc thi chuc nang
        UserLogController cc = new UserLogController(cp);
        ArticleControl ac = new ArticleControl(cp);

        if (cp == null) {
            getServletContext().setAttribute("CPool", cc.getCP());
        }

        ArticleObject article = ac.getArticleObjectByLink(link);
        User_logObject nUl = new User_logObject();

        nUl.setUl_arrticle_id(article.getArticle_id());
        nUl.setUl_category_id(article.getArticle_category_id());
        nUl.setUl_source_id(article.getSource_id());
        nUl.setUl_viewed_at((new Date()).toString());
        cc.addUser_log(nUl);

        ac.releaseCon();
        cc.releaseCon();
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
