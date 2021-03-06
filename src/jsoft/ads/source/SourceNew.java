package jsoft.ads.source;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import jsoft.objects.*;
import jsoft.*;
import jsoft.ads.category.CategoryControl;
import jsoft.ads.article.ArticleControl;
import jsoft.ads.assessment_rule.Assessment_ruleControl;
import jsoft.library.Utilities;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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
public class SourceNew extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";
    private static SourceModel sm;

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
        SourceControl cc = new SourceControl(cp);
        Assessment_ruleControl arc = new Assessment_ruleControl(cp);

        if (cp == null) {
            getServletContext().setAttribute("CPool", cc.getCP());
        }
        //Lay cau truc HTML trinh bay
        String view = cc.viewSourceNew(arc.getAssessment_ruleObjects(null,
                (short) 1, (byte) 100));

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
        request.setCharacterEncoding("utf-8");

        UserObject user = (UserObject) request.getSession().getAttribute(
                "userLogined");

        //Kiem tra
        if (user == null) {
            response.sendRedirect("/adv/user/login");
        } else {
            String categorySelector = request.getParameter("txtCateSelector").
                                      trim();
            String url = request.getParameter("txtLink").trim();
            String name = request.getParameter("txtName").trim();

            if (name != null && categorySelector != null && url != null) {
                if (!name.equalsIgnoreCase("") &&
                    !categorySelector.equalsIgnoreCase("") &&
                    !url.equalsIgnoreCase("")) {

                    //Tim bo quan li ket noi
                    ConnectionPool cp = (ConnectionPool) getServletContext().
                                        getAttribute("CPool");

                    //Tao doi tuong thuc thi chuc n\u0103ng
                    SourceControl sc = new SourceControl(cp);
                    if (cp == null) {
                        getServletContext().setAttribute("CPool", sc.getCP());
                    }

                    //Tao doi tuong luu tru ttin
                    SourceObject nSource = new SourceObject();
                    nSource.setSource_name(Utilities.encode(name));
                    nSource.setSource_link(url);
                    nSource.setSource_html_selector(categorySelector);
                    nSource.setSource_enable(true);
                    nSource.setSource_created_at((new Date()).toString());
                    nSource.setSource_creator_id(user.getUser_id());
                    nSource.setSource_creator_name(Utilities.encode(user.
                            getUser_name()));

                    //Thuc hien cap nhat
                    boolean result;

                    //Them moi
                    result = sc.addSource(nSource);

                    //TRa ve ket noi
                    sc.releaseCon();

                    //Kiem tra ket qua
                    if (result) {
                        SourceObject source = sc.getSourceObject(name);

                        CategoryControl cc = new CategoryControl(cp);

                        ArticleControl ac = new ArticleControl(cp);

                        ArticleObject sArticle = new ArticleObject();

                        sArticle.setArticle_link(url);
                        sArticle.setArticle_created_at((new Date()).toString());
                        ac.addArticle(sArticle);

                        if (cp == null) {
                            getServletContext().setAttribute("CPool", cc.getCP());
                        }

                        Document document = Jsoup.connect(url).
                                            validateTLSCertificates(false).
                                            followRedirects(false).timeout(
                                60000).get();

                        Elements categories = document.select(categorySelector);
                        // "#main_menu a"
                        CategoryObject cate = null;
                        boolean i;
                        CategoryObject nCate = new CategoryObject();
                        for (Element category : categories) {
                            if (category.attr("href").equalsIgnoreCase("/")) {
                                continue;
                            }
                            if (request.getParameter("chk" +
                                    sm.removeAccent(category.html())) != null) {
                                nCate.setCategory_name(Utilities.encode(
                                        category.html()));
                                nCate.setCategory_enable(true);
                                nCate.setCategory_source_id(source.getSource_id());
                                String link = category.attr("href");
                                if (link.indexOf("//") == 0) {
                                    nCate.setCategory_link("https:" + link);
                                } else if (link.indexOf("http") != -1) {
                                    nCate.setCategory_link(link);
                                } else {
                                    nCate.setCategory_link(url + link);
                                }

                                nCate.setCategory_created_at((new Date()).
                                        toString());
                                nCate.setCategory_creator_id(user.getUser_id());
                                nCate.setCategory_creator_name(Utilities.encode(
                                        user.getUser_name()));
                                i = true;
                                result = cc.addCategory(nCate);
                            } else {
                                nCate.setCategory_name(Utilities.encode(
                                        category.html()));
                                nCate.setCategory_enable(false);
                                nCate.setCategory_source_id(source.getSource_id());
                                String link = category.attr("href");
                                if (link.indexOf("//") == 0) {
                                    nCate.setCategory_link("https:" + link);
                                } else if (link.indexOf("http") != -1) {
                                    nCate.setCategory_link(link);
                                } else {
                                    nCate.setCategory_link(url + link);
                                }
                                nCate.setCategory_created_at((new Date()).
                                        toString());
                                nCate.setCategory_creator_id(user.getUser_id());
                                nCate.setCategory_creator_name(Utilities.encode(
                                        user.getUser_name()));
                                i = false;
                                result = cc.addCategory(nCate);
                            }
                            if (result) {
                                if (!result) {
                                    cc.releaseCon();
                                    ac.releaseCon();
                                    response.sendRedirect(
                                            "/adv/source/new?err=article");
                                }
                            } else {
                                cc.releaseCon();
                                ac.releaseCon();
                                response.sendRedirect(
                                        "/adv/source/new?err=cate");
                            }
                        }
                        //TRa ve ket noi
                        cc.releaseCon();
                        ac.releaseCon();

                    } else {
                        response.sendRedirect("/adv/source/new?err=source");
                    }

                } else {
                    response.sendRedirect("/adv/source/new?err=value");
                }
            } else {
                response.sendRedirect("/adv/user/new?err=param");
            }
        }
        response.sendRedirect("/adv/source/view");
    }

    //Clean up resources
    public void destroy() {
    }
}
