package jsoft.ads.user;

import java.util.*;
import jsoft.objects.*;

/**
 * <p>Title: JP1707 Project</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author TrungHieu
 * @version 1.0
 */
public class UserLibrary {
    public UserLibrary() {
    }

    //Xu li danh sach ng sd theo cau truc HTML
    public static String viewUsers(ArrayList<UserObject> items, UserObject user) {

        String tmp = "<table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">";
        tmp += "<thead>";
        tmp += "<tr>";
        tmp += "<th>STT</th>";
        tmp += "<th>T�n ng\u01B0\u1EDDi d�ng</th>";
        tmp += "<th>Email</th>";
        tmp += "<th>S\u0110T</th>";
        tmp += "<th>Vai tr�</th>";
        tmp += "<th>Tr\u1EA1ng th�i</th>";
        tmp += "<th>Th\u1EF1c hi\u1EC7n</th></tr>";
        tmp += "</thead>";
        tmp += "<tbody>";
        int NO=0;
        for (UserObject item : items) {

            tmp += "<tr>";
            tmp += "<td >"+ (++NO) + "</td>";

            tmp += "<td><a href=\"show.html\" style=\"padding-right: 10px\">"+item.getUser_name() + "</a></td>";
            tmp += "<td>" + item.getUser_email() + "</td>";
            tmp += "<td>" + item.getUser_phone_number() + "</td>";
            tmp += "<td>" + item.getUser_roles() + "</td>";
            tmp += "<td>" + item.isUser_workable() + "</td>";
            tmp += "<td><a href=\"/adv/user/ae?id="+item.getUser_name()+"\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a></td>";
            tmp += "<td><a href=\"#\"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";

            tmp += "</tr>";

        }
        tmp += "</tbody>";
        tmp += "</table>";

        return tmp;
    }

}
