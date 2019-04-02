package jsoft.ads.user;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class UserLogout extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();

        //Tham chieu phien lam viec
        HttpSession session = request.getSession();

        //Huy thông tin \u0111\u0103ng nhap
        session.removeAttribute("userLogined");

        //Tro ve giao dien dang nhap
        response.sendRedirect("/adv/user/login");

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
