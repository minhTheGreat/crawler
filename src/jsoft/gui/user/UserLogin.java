package jsoft.gui.user;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import jsoft.*;
import jsoft.objects.*;

public class UserLogin extends HttpServlet {

    //Khai bao kieu noi dung xuat ve trinh khach (client)
    private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    //Cung cap mot cau truc HTML ve phia trinh khach
    //Goi thong qua URL va su kien method="get" cua form

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        //Tham so request - luu tru cac yeu cau xu li,...
        //tu trinh khach gui len
        //Tham so response - luu tru cac ket qua da dk xu li
        //gui ve phia trinh khach


        RequestDispatcher rd = request.getRequestDispatcher("/home/footer.jsp");
        //Xac dinh kieu noi dung cho trinh khach
        response.setContentType(CONTENT_TYPE);

        //Tim tham so bao loi neu co
        String error = request.getParameter("err"); //err la tham so duong dan
        String message = "";
        if (error != null) {
            if (error.equalsIgnoreCase("param")) {
                message = "L\u1ED7i tham s\u1ED1";
            } else if (error.equalsIgnoreCase("value")) {
                message = "L\u1ED7i gi� tr\u1ECB";
            } else if (error.equalsIgnoreCase("notok")) {
                message = "Kh�ng th�nh c�ng";
            } else {
                message = "Kh�ng h\u1EE3p l\u1EC7";
            }
        }
        rd.forward(request,response);

    }

    //Process the HTTP Post request
    //Xu li cac yeu cau nghiep vu cac du lieu do doGet truyen cho
    //Chi duoc hoi voi method ="post" cua form
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        //Lay du lieu cho doGet truyen cho
        String username = request.getParameter("txtUserName");
        String userpass = request.getParameter("txtUserPass");

        //Kiem tra su ton tai cua tham so
        if (username != null && userpass != null) {

            //Loai bo dau cach
            username = username.trim();
            userpass = userpass.trim();
            //Kiem tra su ton tai cua gia tri
            if (!username.equalsIgnoreCase("") &&
                !userpass.equalsIgnoreCase("")) {

                //Tham chieu ngu canh ung dung
                ServletContext application = getServletConfig().
                                             getServletContext();

                //Tim bo quan li ket noi trong ngu canh
                ConnectionPool cp = (ConnectionPool) application.getAttribute(
                        "CPool");

                //Tao doi tuong thuc thi chuc nang
                UserControl uc = new UserControl(cp);

                if (cp == null) {
                    application.setAttribute("CPool", uc.getCP());
                }

                //Thuc hien dang nhap
                UserObject user = uc.getUserObject(username, userpass);

                //Tra lai ket noi cho cac doi tuong khac
                uc.releaseCon();

                //Kiem tra ket qua dang nhap
                if (user != null) {

                    //Tham chieu phien lam viec
                    HttpSession session = request.getSession(true);

                    //Dua thong tin dang nhap vao phien
                    session.setAttribute("userLogined", user);

                    //Tro ve giao dien chinh
                    response.sendRedirect("/home/thoi-su/index.jsp");

                } else {
                    response.sendRedirect("/home/?err=notok");
                }

            } else {
                response.sendRedirect("/home/?err=value");
            }

        } else {
            response.sendRedirect("/home/?err=param");
        }

    }

    //Clean up resources
    public void destroy() {
    }
}
