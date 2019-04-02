package jsoft.ads.source;

import java.util.*;
import jsoft.objects.*;
import jsoft.*;
import jsoft.ads.category.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
public class SourceLibrary {
    public SourceLibrary() {
    }

    private static SourceModel sm;

    //Xu li danh sach ng sd theo cau truc HTML
    public static String viewSources(ArrayList<CategoryObject> items) {
        String tmp = "<table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">";
        tmp += "<thead>";
        tmp += "<tr>";
        tmp += "<th>STT</th>";
        tmp += "<th>T�n ngu\u1ED3n</th>";
        tmp += "<th>\u0110\u01B0\u1EDDng d\u1EABn</th>";
        tmp += "<th>Chuy�n m\u1EE5c</th>";
        tmp += "<th>Th\u1EF1c hi\u1EC7n</th>";
        tmp += "</tr>";
        tmp += "</thead>";
        tmp += "<tbody>";
        int NO = 0;
        int preSourceId = 0;
        for (CategoryObject item : items) {
            if (NO == 0) {
                preSourceId = item.getCategory_source_id();
            }
            if (item.getCategory_source_id() == preSourceId) {

            }
            NO++;
            tmp += "<tr>";
            tmp += "<td>" + (++NO) + "</td>";
            tmp += "<td><a href='show?id=" + item.getSource_id() + "'>" +
                    item.getSource_name() + "</a></td>";
            tmp += "<td>" + item.getSource_link() + "</td>";

            tmp += "<td>" + "a" + "</td>";
            tmp += "<td><a href=\"edit?id="+item.getCategory_source_id()+"\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a>";
            tmp += "<a href=\"destroy?id="+item.getCategory_source_id()+"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";

            tmp += "</tr>";
        }
        tmp += "</tbody>";
        tmp += "</table>";

        return tmp;
    }

    public static String viewSourceNew(ArrayList<Assessment_ruleObject> items) {
        String tmp = "<div class=\"content\">";
        tmp += "<div class=\"card\">";
        tmp += "<form action=\"new\" method=\"POST\">";
        tmp +=
                "<div class=\"card-header\"><strong>Th�m ngu\u1ED3n tin</strong></div>";
        tmp += "<div class=\"card-body card-block\">";
        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtName\" class=\" form-control-label required\">T�n ngu\u1ED3n</label>";
        tmp += "<input type=\"text\" id=\"txtName\" name=\"txtName\" placeholder=\"Nh\u1EADp t�n ngu\u1ED3n\" class=\"form-control\" required>";
        tmp += "</div>";
        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtLink\" class=\" form-control-label required\">\u0110\u01B0\u1EDDng d\u1EABn</label>";
        tmp += "<input type=\"text\" id=\"txtLink\" name=\"txtLink\" placeholder=\"Nh\u1EADp \u0111\u01B0\u1EDDng d\u1EABn\" class=\"form-control\" required>";
        tmp += "</div>";
        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtCateSelector\" class=\" form-control-label required\">X�c \u0111\u1ECBnh chuy�n m\u1EE5c</label>";
        tmp += "<input type=\"text\" id=\"txtCateSelector\" name=\"txtCateSelector\" placeholder=\"Nh\u1EADp CSS selector \u0111\u1EC3 x�c \u0111\u1ECBnh chuy�n m\u1EE5c c\u1EE7a ngu\u1ED3n\" class=\"form-control\" required>";
        tmp += "</div>";
        tmp += "<div class=\"form-group choose-categories\">";
        tmp += "<label class=\" form-control-label\">Chuy�n m\u1EE5c</label>";
        tmp += "</div>";
        tmp += "<img id=\"loading-gif\" src=\"/adv/images/loading.gif\" style=\"max-width: 50px; display: none;\">";
        tmp += "<div class=\"form-group\">";
//        tmp += "<label class=\" form-control-label\">X�c \u0111\u1ECBnh th�nh ph\u1EA7n \u0111�nh gi�</label><br>";
//        tmp += "</div>";
//        for(Assessment_ruleObject item : items){
//            String standardAr = sm.removeAccent(item.getAr_name());
//            tmp += "<div class=\"form-group\">";
//            tmp +=
//                    "<label for=\"txt"+ standardAr +"\" class=\" form-control-label\">"+ item.getAr_name() +"</label>";
//            tmp += "<input type=\"text\" id=\"txt"+ standardAr +"\" name=\"txt"+ standardAr +"\" placeholder=\"X�c \u0111\u1ECBnh "+ item.getAr_name() +"\" class=\"form-control\">";
//            tmp += "</div>";
//        }
        tmp += "<center>";
        tmp +=
                "<input type=\"submit\" value=\"C\u1EADp nh\u1EADt\" class=\"btn btn-primary\">";
        tmp += "</center>";
        tmp += "</div>";
        tmp += "</form>";
        tmp += "</div>";
        tmp += "</div>";

        return tmp;
    }

    public static String viewSourceShow(ArrayList<CategoryObject> items) {
        String tmp = "<div class=\"content\">";
        tmp += "<div class=\"card\">";
        tmp +=
                "<div class=\"card-header\"><strong>Th�ng tin chi ti\u1EBFt ngu\u1ED3n tin</strong>";
        tmp +=
                "<a href=\"edit?id="+items.get(0).getCategory_source_id()+"\" class=\"btn btn-primary pull-right\">C\u1EADp nh\u1EADt</a>";
        tmp += "</div>";
        tmp += "<fieldset disabled>";
        tmp += "<div class=\"card-body card-block\">";
        int NO = 0;
        for (CategoryObject item : items) {
            if (NO == 0) {
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtName\" class=\" form-control-label required\">T�n ngu\u1ED3n</label>";
                tmp += "<input type=\"text\" id=\"txtName\" name=\"txtName\" placeholder=\"Nh\u1EADp t�n ngu\u1ED3n\" class=\"form-control\" value=" +
                        item.getSource_name() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtLink\" class=\" form-control-label required\">\u0110\u01B0\u1EDDng d\u1EABn</label>";
                tmp += "<input type=\"text\" id=\"txtLink\" name=\"txtLink\" placeholder=\"Nh\u1EADp \u0111\u01B0\u1EDDng d\u1EABn\" class=\"form-control\" value=" +
                        item.getSource_link() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtCateSelector\" class=\" form-control-label required\">X�c \u0111\u1ECBnh chuy�n m\u1EE5c</label>";
                tmp += "<input type=\"text\" id=\"txtCateSelector\" name=\"txtCateSelector\" placeholder=\"Nh\u1EADp CSS selector \u0111\u1EC3 x�c \u0111\u1ECBnh chuy�n m\u1EE5c c\u1EE7a ngu\u1ED3n\" class=\"form-control\" value=" +
                        item.getSource_html_selector() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group choose-categories\">";
                tmp +=
                        "<label class=\" form-control-label\">Chuy�n m\u1EE5c</label>";
                tmp += "</div>";
                NO++;
            }

            tmp += "<div class=\"form-group\">";

            tmp += "<div class=\"form-check\" style=\"margin-left: 30px;\">";
            tmp += "<div class=\"checkbox\">";
            tmp += "<label class=\"form-check-label \">";
            tmp += "<input type=\"checkbox\" ";
            if (item.isCategory_enable()) {
                tmp += "checked";
            }
            tmp += " class=\"form-check-input\">" + item.getCategory_name();
            tmp += "</label>";
            tmp += "</div>";
            tmp += "</div>";

            tmp += "</div>";
        }
        tmp += "<div><p style=\"border-bottom: 1px solid black\"></p></div>";
        tmp += "<div class=\"form-group\">";
        tmp +=
                "<label for=\"txtCreator\" class=\" form-control-label\">Ng\u01B0\u1EDDi t\u1EA1o</label>";
        tmp +=
                "<input type=\"text\" id=\"txtCreator\" class=\"form-control\" value=\"" +
                items.get(0).getSource_creator_name() + "\">";
        tmp += "</div>";
        tmp += "<div class=\"form-group\">";
        tmp +=
                "<label for=\"txtCreatedDate\" class=\" form-control-label\">Ng�y t\u1EA1o</label>";
        tmp +=
                "<input type=\"text\" id=\"txtCreatedDate\" class=\"form-control\" value=\"" +
                items.get(0).getSource_created_at() + "\">";
        tmp += "</div>";
        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtLastUpdater\" class=\" form-control-label\">Ng\u01B0\u1EDDi s\u1EEDa cu\u1ED1i</label>";
        tmp +=
                "<input type=\"text\" id=\"txtLastUpdater\" class=\"form-control\" value=\"" +
                items.get(0).getSource_last_updator_name() + "\">";
        tmp += "</div>";
        tmp += "<div class=\"form-group\">";
        tmp += "<label for=\"txtLastUpdatedDate\" class=\" form-control-label\">Ng�y s\u1EEDa cu\u1ED1i</label>";
        tmp +=
                "<input type=\"text\" id=\"txtLastUpdatedDate\" class=\"form-control\" value=\"" +
                items.get(0).getSource_last_updated_at() + "\">";
        tmp += "</div>";
        tmp += "</fieldset>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "<div class=\"clearfix\"></div>";

        return tmp;
    }

    public static String viewSourceEdit(ArrayList<CategoryObject> items) {
        String tmp = "<div class=\"content\">";
        tmp += "<div class=\"card\">";
        tmp += "<form action=\"edit?id="+items.get(0).getCategory_source_id()+"\" method=\"POST\">";
        tmp +=
                "<div class=\"card-header\"><strong>Th�ng tin chi ti\u1EBFt ngu\u1ED3n tin</strong>";
        tmp += "</div>";
        tmp += "<div class=\"card-body card-block\">";
        int i = 0;
        int NO = 0;
        for (CategoryObject item : items) {
            if (NO == 0) {
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtName\" class=\" form-control-label required\">T�n ngu\u1ED3n</label>";
                tmp += "<input type=\"text\" id=\"txtName\" name=\"txtName\" placeholder=\"Nh\u1EADp t�n ngu\u1ED3n\" class=\"form-control\" value=" +
                        item.getSource_name() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtLink\" class=\" form-control-label required\">\u0110\u01B0\u1EDDng d\u1EABn</label>";
                tmp += "<input type=\"text\" id=\"txtLink\" name=\"txtLink\" placeholder=\"Nh\u1EADp \u0111\u01B0\u1EDDng d\u1EABn\" class=\"form-control\" value=" +
                        item.getSource_link() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group\">";
                tmp += "<label for=\"txtCateSelector\" class=\" form-control-label required\">X�c \u0111\u1ECBnh chuy�n m\u1EE5c</label>";
                tmp += "<input type=\"text\" id=\"txtCateSelector\" name=\"txtCateSelector\" placeholder=\"Nh\u1EADp CSS selector \u0111\u1EC3 x�c \u0111\u1ECBnh chuy�n m\u1EE5c c\u1EE7a ngu\u1ED3n\" class=\"form-control\" value=" +
                        item.getSource_html_selector() + " required>";
                tmp += "</div>";
                tmp += "<div class=\"form-group choose-categories\">";
                tmp +=
                        "<label class=\" form-control-label\">Chuy�n m\u1EE5c</label>";
                tmp += "</div>";
                NO++;
            }

            tmp += "<div class=\"form-group\">";

            tmp += "<div class=\"form-check\" style=\"margin-left: 30px;\">";
            tmp += "<div class=\"checkbox\">";
            tmp += "<label for=\"chkcategory"+ i +
                    "\" class=\"form-check-label \">";
            tmp += "<input type=\"checkbox\" id=\"chkcategory" + i +
                    "\" name=\"chkcategory" + i++ + "\" value=\"" +
                    item.getCategory_id() + "\" class=\"form-check-input\" ";
            if (item.isCategory_enable()) {
                tmp += "checked";
            }
            tmp += ">";
            tmp += item.getCategory_name();
            tmp += "</label>";
            tmp += "</div>";
            tmp += "</div>";

            tmp += "</div>";

        }
        tmp += "<center>";
        tmp += "<input type=\"submit\" value=\"C\u1EADp nh\u1EADt\" class=\"btn btn-primary\">";
        tmp += "</center>";

        tmp += "</form>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "<div class=\"clearfix\"></div>";

        return tmp;

    }
}
