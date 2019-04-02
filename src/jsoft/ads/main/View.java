package jsoft.ads.main;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import jsoft.objects.*;

public class View extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //tim thong tin dang nhap he thong
        UserObject user = (UserObject) request.getSession().getAttribute("userLogined");

        //Kiem tra
        if (user == null) {
            response.sendRedirect("/adv/user/login");
        } else {
            view(request, response);
        }

    }

    private void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        //Tim cau truc cua header ghep lai
        RequestDispatcher h = request.getRequestDispatcher("/header");
        if(h!=null){
            h.include(request, response);
        }

         out.print("<div class=\"content pb-0\"></div> <!-- .content -->");
         out.print("<div class=\"clearfix\"></div>");

        //Tim footer va ghep
        RequestDispatcher f = request.getRequestDispatcher("/footer");
        if(f!=null){
            f.include(request, response);
        }

    }

    //Process the HTTP Post request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    //Clean up resources
    public void destroy() {
    }
}
