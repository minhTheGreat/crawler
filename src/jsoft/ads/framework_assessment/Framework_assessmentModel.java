package jsoft.ads.framework_assessment;

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
public class Framework_assessmentModel {

    private Framework_assessment fa;

    public Framework_assessmentModel(ConnectionPool cp) {
        this.fa = new Framework_assessmentImpl(cp, "Framework_assessment");
    }

    protected void finallize() throws Throwable {
        this.fa = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.fa.getCP();
    }

    public void releaseCon() {
        this.fa.releaseCon();
    }


    //----------------------------------------------------

    public boolean addFramework_assessment(Framework_assessmentObject item) {
        return this.fa.addFramework_assessment(item);
    }

    public boolean editFramework_assessment(Framework_assessmentObject item) {
        return this.fa.editFramework_assessment(item);
    }

    public boolean delFramework_assessment(Framework_assessmentObject item) {
        return this.fa.delFramework_assessment(item);
    }

    //----------------------------------------------------

    public Framework_assessmentObject getFramework_assessmentObject(int id) {
        AssessmentObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.fa.getFramework_assessment(id);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new AssessmentObject();
                    item.setFa_id(rs.getInt("fa_id"));
                    item.setFa_name(rs.getString("fa_name"));
                    item.setFa_article_id(rs.getInt("fa_article_id"));
                    item.setFa_enable(rs.getBoolean("fa_enable"));
                    item.setFa_delete(rs.getBoolean("fa_delete"));
                    item.setFa_created_at(rs.getString("fa_created_at"));
                    item.setFa_creator_id(rs.getInt("fa_creator_id"));
                    item.setFa_creator_name(rs.getString("fa_creator_name"));
                    item.setFa_last_updator_id(rs.getInt("fa_last_updator_id"));
                    item.setFa_last_updated_at(rs.getString("fa_last_updated_at"));
                    item.setFa_last_updator_name(rs.getString("fa_last_updator_name"));

                    item.setAssessment_point(rs.getInt("assessment_point"));

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

    public ArrayList getFramework_assessmentObjects(AssessmentObject similar, int page,
                                        byte total) {

        ArrayList items = new ArrayList();
        AssessmentObject item = null;

        //Lay du lieu vao database,
        int at = (page - 1) * total;

        ResultSet rs = this.fa.getFramework_assessments(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new AssessmentObject();
                    item.setFa_id(rs.getInt("fa_id"));
                    item.setFa_name(rs.getString("fa_name"));
                    item.setFa_article_id(rs.getInt("fa_article_id"));
                    item.setFa_enable(rs.getBoolean("fa_enable"));
                    item.setFa_delete(rs.getBoolean("fa_delete"));
                    item.setFa_created_at(rs.getString("fa_created_at"));
                    item.setFa_creator_id(rs.getInt("fa_creator_id"));
                    item.setFa_creator_name(rs.getString("fa_creator_name"));
                    item.setFa_last_updator_id(rs.getInt("fa_last_updator_id"));
                    item.setFa_last_updated_at(rs.getString("fa_last_updated_at"));
                    item.setFa_last_updator_name(rs.getString("fa_last_updator_name"));

                    item.setAssessment_point(rs.getInt("assessment_point"));

                    item.setAssessment_name(rs.getString("assessment_name"));
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
