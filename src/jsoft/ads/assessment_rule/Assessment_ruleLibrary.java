package jsoft.ads.assessment_rule;

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
public class Assessment_ruleLibrary {
    public Assessment_ruleLibrary() {
    }

    //Xu li danh sach ng sd theo cau truc HTML
    public static String viewAssessment_rules(ArrayList<Assessment_ruleObject> items) {


        String tmp = "<table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">";
        tmp += "<tr>";
        tmp += "<th>STT</th>";
        tmp += "<th>Tên tiêu chí</th>";
        tmp += "<th>\u0110i\u1EC3m \u0111ánh giá</th>";
        tmp += "<th>Ng\u01B0\u1EDDi t\u1EA1o</th>";
        tmp += "<th colspan=2>Th\u1EF1c hi\u1EC7n</th>";

        tmp += "</tr>";

        int NO = 0;
        for (Assessment_ruleObject item : items) {

            tmp += (++NO % 2 == 0);
            tmp += "<tr>";
            tmp += "<td >"+ (NO) + "</td>";

            tmp += "<td>" + item.getAr_name() + "</td>";
            tmp += "<td>" + item.getAr_point() + "</td>";
            tmp += "<td>" + item.getAr_creator_name() + "</td>";
            tmp += "<td><a href=\"edit.html\"><i class=\"fa fa-edit\" style=\"color: blue\"></i></a></td>";
            tmp += "<td><a href=\"#\"><i class=\"fa fa-times-circle pull-right\" style=\"color: red\"></i></a></td>";

            tmp += "</tr>";
        }

        tmp += "</table>";


        return tmp;
    }


    public static void main(String[] args) {

    }
}
