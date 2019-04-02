package jsoft.ads.user;

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

        //Xac dinh kieu noi dung cho trinh khach
        response.setContentType(CONTENT_TYPE);

        //Tim tham so bao loi neu co
        String error = request.getParameter("err"); //err la tham so duong dan
        String message = "";
        if (error != null) {
            if (error.equalsIgnoreCase("param")) {
                message = "L\u1ED7i tham s\u1ED1";
            } else if (error.equalsIgnoreCase("value")) {
                message = "L\u1ED7i giá tr\u1ECB";
            } else if (error.equalsIgnoreCase("notok")) {
                message = "Không thành công";
            } else {
                message = "Không h\u1EE3p l\u1EC7";
            }
        }

        //Tao doi tuong xuat noi dung ve trinh khach
        PrintWriter out = response.getWriter();

        //Thuc hien xuat noi dung
        out.print("<html>");
        out.print("<head>");
        out.print("<title>\u0110\u0103ng nh\u1EADp</title>");
        out.print("<link href=\"/adv/views/login/login.css\" rel=\"stylesheet\" type=\"text/css\"/>");
        out.print("<script language=\"javascript\" src=\"/adv/views/login/login.js\"></script>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div id = \"form_wrapper\"  class = \"form_wrapper\" >");
        out.print("<form class=\"login active\">");

        if(!message.equalsIgnoreCase("")){
           out.print("<h2 style=\"color: red; text-align:center \" >");
           out.print(message);
           out.print("</h2>");
       }

        out.print("<h3>Tinday</h3>");
        out.print("<div>");

        out.print("<label>Username</label>");
        out.print("<input type=\"text\" name=\"txtUserName\"/>");
        out.print("</div>");
        out.print("<div>");
        out.print("<label>Password");
        out.print("<a href=\"#\" rel=\"forgot_password\" class=\"forgot linkform\">");
        out.print("Forgot your password?");
        out.print("</a>");
        out.print("</label>");
        out.print("<input type=\"password\" name=\"txtUserPass\"/>");
        out.print("</div>");
        out.print("<div class=\"bottom\">");
        out.print("<div class=\"remember\"><input type=\"checkbox\" name=\"chkSave\" id=\"chkSave\" />");
        out.print("<span for=\"chkSave\">Keep me logged in</span>");
        out.print("</div>");
        out.print("<input type=\"submit\" value=\"Login\" onClick=\"login(this.form)\"></input>");
        out.print("<a href=\"register.html\" rel=\"register\" class=\"linkform\">");
        out.print("</a>");
        out.print("<div class=\"clear\"></div>");
        out.print("</div>");
        out.print("</form>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");


        //Dong luong xuat
        out.close();
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
                    response.sendRedirect("/adv/view");

                } else {
                    response.sendRedirect("/adv/user/login?err=notok");
                }

            } else {
                response.sendRedirect("/adv/user/login?err=value");
            }

        } else {
            response.sendRedirect("/adv/user/login?err=param");
        }

    }

    //Clean up resources
    public void destroy() {
    }
}
