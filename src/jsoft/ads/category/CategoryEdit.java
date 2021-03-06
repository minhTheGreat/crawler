package jsoft.ads.category;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import jsoft.objects.*;
import jsoft.*;
import jsoft.ads.category.CategoryControl;
import jsoft.library.Utilities;


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
public class CategoryEdit extends HttpServlet {
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
        CategoryControl cc = new CategoryControl(cp);

        if (cp == null) {
            getServletContext().setAttribute("CPool", cc.getCP());
        }
        int id = Integer.parseInt(request.getParameter("id"));

        //Lay cau truc HTML trinh bay
        String view = cc.viewCategoryObjectById(id);

        //Tra ve ket noi
        cc.releaseCon();

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
        ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute(
                "CPool");
        UserObject user = (UserObject) request.getSession().getAttribute(
                "userLogined");

        //Kiem tra
        if (user == null) {
            response.sendRedirect("/adv/user/login");
        } else {
            CategoryControl cc = new CategoryControl(cp);

            if (cp == null) {
                getServletContext().setAttribute("CPool", cc.getCP());
            }

            CategoryObject eCate = cc.getCategoryObject(Integer.parseInt(request.getParameter("id")));

            eCate.setCategory_link(request.getParameter("txtLink"));
            cc.editCategory(eCate);

            response.sendRedirect("/adv/category/view");
        }
    }

    //Clean up resources
    public void destroy() {

    }
}
