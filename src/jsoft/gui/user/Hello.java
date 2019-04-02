package jsoft.gui.user;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import jsoft.*;
import jsoft.objects.*;

public class Hello extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("/home/thoi-su/index.jsp");
		rd.forward(request, response);
    }

    //Process the HTTP Post request
    //Xu li cac yeu cau nghiep vu cac du lieu do doGet truyen cho
    //Chi duoc hoi voi method ="post" cua form
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
