package jsoft.ads.category;

import java.util.*;
import jsoft.objects.*;
import jsoft.library.Utilities;

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
public class CategoryLibrary {
    public CategoryLibrary() {
    }

    public static String viewSources(ArrayList<CategoryObject> items) {
            String tmp = "<table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">";
            tmp += "<thead>";
            tmp += "<tr>";
            tmp += "<th>STT</th>";
            tmp += "<th>T�n ngu\u1ED3n</th>";
            tmp += "<th>\u0110\u01B0\u1EDDng d\u1EABn</th>";
            tmp += "<th>Tr\u1EA1ng th�i</th>";
            tmp += "<th>Chuy�n m\u1EE5c</th>";
            tmp += "<th>Th\u1EF1c hi\u1EC7n</th>";
            tmp += "</tr>";
            tmp += "</thead>";
            tmp += "<tbody>";
            int NO = 0;
            int preSourceId = 0;
            for (CategoryObject item : items) {
                if (NO == 0){
                    preSourceId = item.getCategory_source_id();

                    tmp += "<tr>";
                    tmp += "<td>" + (++NO) + "</td>";
                    tmp += "<td> <a href='show?id="+item.getCategory_source_id()+"'>" + item.getSource_name() + "</a></td>";
                    tmp += "<td>" + item.getSource_link() + "</td>";
                    if(item.isSource_enable()){
                        tmp += "<td><div class=\"alert alert-success\"><a href='enable?id="+item.getCategory_source_id()+"' class=\"cate-enable alert-link\">S\u1EED d\u1EE5ng</a></div></td>";
                    } else {
                        tmp += "<td><div class=\"alert alert-danger\"><a href='enable?id="+item.getCategory_source_id()+"' class=\"cate-enable alert-link\">Kh�ng s\u1EED d\u1EE5ng</a></div></td>";
                    }
                    tmp += "<td>";
                }
                if (item.getCategory_source_id() != preSourceId){
                    tmp += "</td>";
                    tmp += "<td><a href=\"edit.html\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a>";
                    tmp += "<a href=\"#\"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";
                    tmp += "</tr>";

                    tmp += "<tr>";
                    tmp += "<td>" + (++NO) + "</td>";
                    tmp += "<td>" + item.getSource_name() + "</td>";
                    tmp += "<td>" + item.getSource_link() + "</td>";
                    tmp += "<td>";
                    preSourceId = item.getCategory_source_id();
                }

                tmp += "<li>" + item.getCategory_name() + "</li>";

                if (items.indexOf(item) == items.size()-1) {
                    tmp += "</td>";
                    tmp += "<td><a href=\"edit?id="+item.getCategory_source_id()+"\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a>";
                    tmp += "<a href=\"destroy?"+item.getCategory_source_id()+"\"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";
                    tmp += "</tr>";
                }
            }
            tmp += "</tbody>";
            tmp += "</table>";

            return tmp;
    }

    //Xu li danh sach ng sd theo cau truc HTML
    public static String viewCategorys(ArrayList<CategoryObject> items) {

        String tmp = "<table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">";
        tmp += "<thead>";
        tmp += "<tr>";
        tmp += "<th>STT</th>";
        tmp += "<th>T�n chuy�n m\u1EE5c</th>";
        tmp += "<th>\u0110\u01B0\u1EDDng d\u1EABn</th>";
        tmp += "<th>Ngu\u1ED3n tin</th>";
        tmp += "<th>Tr\u1EA1ng th�i</th>";
        tmp += "<th>Th\u1EF1c hi\u1EC7n</th>";
        tmp += "</tr>";
        tmp += "</thead>";
        tmp += "<tbody>";
        int NO = 0;
        for (CategoryObject item : items) {
            tmp += "<tr>";
            tmp += "<td >" + (++NO) + "</td>";
            tmp += "<td>" + item.getCategory_name() + "</td>";
            tmp += "<td><a href=" + item.getCategory_link() + ">"+ item.getCategory_link() +"</a></td>";
            tmp += "<td>" + item.getSource_name() + "</td>";
            if(item.isCategory_enable() && item.isSource_enable()){
                tmp += "<td><div class=\"alert alert-success\"><a href='enable?id="+item.getCategory_id()+"' class=\"cate-enable alert-link\">S\u1EED d\u1EE5ng</a></div></td>";
            } else if(item.isCategory_enable() && !item.isSource_enable()){
                tmp += "<td><div class=\"alert alert-warning\"><a href='enable?id="+item.getCategory_id()+"' class=\"cate-enable alert-link\">Ngu\u1ED3n kh�ng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng</a></div></td>";
            } else {
                tmp += "<td><div class=\"alert alert-danger\"><a href='enable?id="+item.getCategory_id()+"' class=\"cate-enable alert-link\">Kh�ng s\u1EED d\u1EE5ng</a></div></td>";
            }
            tmp += "<td><a href=\"edit?id="+item.getCategory_id()+"\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a>";
            tmp += "<a href=\"destroy?id="+item.getCategory_id()+"\" class=\"destroy-cate\"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";
            tmp += "</tr>";
        }
        tmp += "</tbody>";
        tmp += "</table>";

        return tmp;
    }

    public static String viewCategoryEdit(CategoryObject category){
        String tmp = "";

        tmp += "<div class=\"content\">";
        tmp += "<div class=\"animated fadeIn\">";
        tmp += "<div class=\"row\">";
        tmp += "<div class=\"col-md-12\">";
        tmp += "<div class=\"card\">";
        tmp += "<div class=\"card-header\"><strong>C\u1EADp nh\u1EADt chuy�n m\u1EE5c</strong></div>";
        tmp += "<div class=\"card-body card-block\">";

        tmp += "<form action='edit?id="+category.getCategory_id()+"' method='POST'>";

        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtName\" class=\" form-control-label\">T�n chuy�n m\u1EE5c</label>";
        tmp += "<input type=\"text\" name=\"txtName\" id=\"txtName\" placeholder=\"T�n chuy�n m\u1EE5c\" class=\"form-control\" value=\""+category.getCategory_name()+"\" disabled=\"disabled\">";
        tmp += "</div>";

        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtLink\" class=\" form-control-label\">\u0110\u01B0\u1EDDng d\u1EABn chuy�n m\u1EE5c</label>";
        tmp += "<input type=\"text\" name=\"txtLink\" id=\"txtLink\" placeholder=\"\u0110\u01B0\u1EDDng d\u1EABn chuy�n m\u1EE5c\" class=\"form-control\" value=\""+category.getCategory_link()+"\">";
        tmp += "</div>";

        tmp += "<center>";
        tmp +=
                "<input type=\"submit\" value=\"C\u1EADp nh\u1EADt\" class=\"btn btn-primary\">";
        tmp += "</center>";

        tmp += "</form>";

        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";

        return tmp;
    }
}
