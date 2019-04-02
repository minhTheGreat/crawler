package jsoft.ads.user;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import jsoft.objects.*;
import jsoft.*;

public class UserView extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        //tim thong tin dang nhap he thong
        UserObject user = (UserObject) request.getSession().getAttribute(
                "userLogined");

        //Kiem tra
        if (user == null) {
            response.sendRedirect("/adv/user/login");
        } else {
            view(request, response, user);
        }
    }

    private void view(HttpServletRequest request, HttpServletResponse response,
                      UserObject user) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        //Tim tu khoa trong phien lam viec neu co
        String keyword = (String) request.getSession().getAttribute("key");
        String saveKey = (keyword != null) ? keyword.trim() : "";

        //huy tu khoa cho phien
        request.getSession().removeAttribute("key");

        //Tim bo quan li ket noi
        ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute(
                "CPool");
        //Tao doi tuong thuc thi chuc nang
        UserControl uc = new UserControl(cp);

        if (cp == null) {
            getServletContext().setAttribute("CPool", uc.getCP());
        }

        //Tao doi tuong bo loc similar
        UserObject similar = new UserObject();
        //similar.setUser_permission(user.getUser_permission());//quyen cua dang nhap vao bo loc

        similar.setUser_name(saveKey);

        //Lay cau truc HTML trinh bay
        String view = uc.viewUsers(similar, (short) 1, (byte) 15, user);

        //Tra ve ket noi
        uc.releaseCon();

        //Tim cau truc cua header ghep lai
        RequestDispatcher h = request.getRequestDispatcher("/header");
        if (h != null) {
            h.include(request, response);
        }

        out.print("<div class=\"content\">");

        out.print("<div class=\"animated fadeIn\">");
        out.print("<div class=\"row\">");
        out.print("<div class=\"col-md-12\">");
        out.print("<div class=\"card\">");
        out.print("<div class=\"card-header\">");
        out.print("<strong class=\"card-title\">Ng\u01B0\u1EDDi d�ng</strong>");

        //out.print("<div class=\"search\">");
        //out.print("<form name=\"frmSearch\" method=\"post\" action=\"/adv/user/view\" > ");
        // out.print(" <input type=\"text\" size=30 name=\"txtKeyword\" value=\""+saveKey+"\" />");
        //out.print(" <input type=\"submit\" value=\"t�m ki\u1EBFm...\"  />");
        //out.print("</form>");
        //out.print("</div>");

        out.print("<a href=\"/adv/user/ae\" class=\"btn btn-success pull-right\">");
        //out.print("<i class=\"fa fa-plus\" style=\"size: 30px;color: white\"></i>");
        //out.print("Th�m ng\u01B0\u1EDDi d�ng");
        out.print("<img src=\"/adv/images/adduser.png\"/>");
        out.print("</a>");

        out.print("</div>");
        out.print("<div class=\"card-body\">");

        out.print(view);

        out.print("</div></div></div></div></div>");

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
        //Lay tu khoa tim kiem
        String keyword = request.getParameter("txtKeyword");

        //Cach 1 tim kiem
        //response.sendRedirect("/adv/user/view?key="+keyword);

        request.getSession().setAttribute("key", keyword);
        response.sendRedirect("/adv/user/view");

    }

    //Clean up resources
    public void destroy() {
    }
}
