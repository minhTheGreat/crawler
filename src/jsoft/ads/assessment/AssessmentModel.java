package jsoft.ads.assessment;

import jsoft.ConnectionPool;
import jsoft.objects.*;
import java.util.*;
import java.sql.*;


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
public class AssessmentModel {

    private Assessment a;

    public AssessmentModel(ConnectionPool cp) {
        this.a = new AssessmentImpl(cp, "Assessment");
    }

    protected void finallize() throws Throwable {
        this.a = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.a.getCP();
    }

    public void releaseCon() {
        this.a.releaseCon();
    }


    //----------------------------------------------------

    public boolean addAssessment(AssessmentObject item) {
        return this.a.addAssessment(item);
    }

    public boolean editAssessment(AssessmentObject item) {
        return this.a.editAssessment(item);
    }

    public boolean delAssessment(AssessmentObject item) {
        return this.a.delAssessment(item);
    }

    //----------------------------------------------------

    public AssessmentObject getAssessmentObject(int id) {
        AssessmentObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.a.getAssessment(id);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new AssessmentObject();
                    item.setAsssessment_id(rs.getInt("assessment_id"));
                    item.setAssessment_name(rs.getString("assessment_name"));
                    item.setAssessment_type(rs.getByte("assessment_type"));
                    item.setAssessment_fa_id(rs.getInt("assessment_fa_id"));
                    item.setAssessment_fa_name(rs.getString("assessment_fa_name"));
                    item.setAssessment_selector(rs.getString("assessment_selector"));
                    item.setAssessment_get_first(rs.getBoolean("assessment_get_first"));
                    item.setAssessment_count(rs.getString("assessment_count"));
                    item.setAssessment_value(rs.getBoolean("assessment_value"));
                    item.setAssessment_innerHTML(rs.getBoolean("assessment_innerHTML"));
                    item.setAssessment_attribute(rs.getString("assessment_attribute"));
                    item.setAssessment_point(rs.getInt("assessment_point"));
                    item.setAssessment_created_at(rs.getString("assessment_created_at"));
                    item.setAssessment_creator_id(rs.getInt("assessment_creator_id"));
                    item.setAssessment_creator_name(rs.getString("assessment_creator_name"));
                    item.setAssessment_last_updated_at(rs.getString("assessment_last_updated_at"));
                    item.setAssessment_last_updator_id(rs.getInt("assessment_last_updator_id"));
                    item.setAssessment_last_updator_name(rs.getString("assessment_last_updator_name"));

                    item.setFa_name(rs.getString("fa_name"));
                    item.setArticle_title(rs.getString("article_title"));
                    item.setCategory_name(rs.getString("category_name"));
                    item.setSource_name(rs.getString("source_name"));


                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return item;
    }

    public ArrayList getAssessmentObjects(AssessmentObject similar, int page,
                                        byte total) {

        ArrayList items = new ArrayList();
        AssessmentObject item = null;

        //Lay du lieu vao database,
        int at = (page - 1) * total;

        ResultSet rs = this.a.getAssessments(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new AssessmentObject();
                    item.setAsssessment_id(rs.getInt("assessment_id"));
                    item.setAssessment_name(rs.getString("assessment_name"));
                    item.setAssessment_type(rs.getByte("assessment_type"));
                    item.setAssessment_fa_id(rs.getInt("assessment_fa_id"));
                    item.setAssessment_fa_name(rs.getString("assessment_fa_name"));
                    item.setAssessment_selector(rs.getString("assessment_selector"));
                    item.setAssessment_get_first(rs.getBoolean("assessment_get_first"));
                    item.setAssessment_count(rs.getString("assessment_count"));
                    item.setAssessment_value(rs.getBoolean("assessment_value"));
                    item.setAssessment_innerHTML(rs.getBoolean("assessment_innerHTML"));
                    item.setAssessment_attribute(rs.getString("assessment_attribute"));
                    item.setAssessment_point(rs.getInt("assessment_point"));
                    item.setAssessment_created_at(rs.getString("assessment_created_at"));
                    item.setAssessment_creator_id(rs.getInt("assessment_creator_id"));
                    item.setAssessment_creator_name(rs.getString("assessment_creator_name"));
                    item.setAssessment_last_updated_at(rs.getString("assessment_last_updated_at"));
                    item.setAssessment_last_updator_id(rs.getInt("assessment_last_updator_id"));
                    item.setAssessment_last_updator_name(rs.getString("assessment_last_updator_name"));

                    item.setFa_name(rs.getString("fa_name"));
                    item.setArticle_title(rs.getString("article_title"));
                    item.setCategory_name(rs.getString("category_name"));
                    item.setSource_name(rs.getString("source_name"));


                    items.add(item);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return items;
    }


}
