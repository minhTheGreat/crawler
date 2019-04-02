package jsoft.ads.assessment;

import java.sql.*;
import jsoft.objects.*;
import jsoft.ads.framework_assessment.*;
import jsoft.*;


public class AssessmentImpl extends Framework_assessmentImpl  implements Assessment {
    public AssessmentImpl(ConnectionPool cp, String objectName) {
        super(cp, objectName);
    }

    /**
     * addAssessment
     *
     * @param item AssessmentObject
     * @return boolean
     * @todo Implement this jsoft.ads.assessment.Assessment method
     */
    public boolean addAssessment(AssessmentObject item) {

        //Kiem tra su ton tai
        if(this.isExisting(item)){
            return false;
        }
        String sql = "INSERT INTO tblassessment( ";

        sql += "assessment_name, assessment_enable,  ";
        sql += "assessment_type, assessment_fa_id, ";
        sql += "assessment_fa_name, assessment_selector, ";
        sql += "assessment_get_first, assessment_count, ";
        sql += "assessment_value, ";
        sql += "assessment_innerHTML, assessment_attribute,";
        sql += "assessment_point, assessment_created_at, ";
        sql += "assessment_creator_id, assessment_creator_name,";
        sql += "assessment_last_updated_at, assessment_last_updator_id,";
        sql += "assessment_last_updator_name)";
        sql += "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            //Truyen gia tri
            pre.setString(1, item.getAssessment_name());
            pre.setBoolean(2, item.isAssessment_enable());
            pre.setByte(3, item.getAssessment_type());
            pre.setInt(4, item.getAssessment_fa_id());
            pre.setString(5, item.getAssessment_fa_name());
            pre.setString(6, item.getAssessment_selector());
            pre.setBoolean(7, item.isAssessment_get_first());
            pre.setString(8, item.getAssessment_count());
            pre.setBoolean(9, item.isAssessment_value());
            pre.setBoolean(10, item.isAssessment_innerHTML());
            pre.setString(11, item.getAssessment_attribute());
            pre.setInt(12, item.getAssessment_point());
            pre.setString(13, item.getAssessment_created_at());
            pre.setInt(14, item.getAssessment_creator_id());
            pre.setString(15, item.getAssessment_creator_name());
            pre.setString(16, item.getAssessment_last_updated_at());
            pre.setInt(17, item.getAssessment_last_updator_id());
            pre.setString(18, item.getAssessment_last_updator_name());

            //Tra ve ket qua
            return this.add(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }



        return false;
    }

    //Khi them khi trung ten
    private boolean isExisting(AssessmentObject item) {
        boolean flag = false;

        String sql = "SELECT assessment_id FROM tblassessment ";
        sql += "WHERE assessment_name='" + item.getAssessment_name() + "' ";

        ResultSet rs = this.gets(sql);
        if (rs != null) {
            try {
                if (rs.next()) {
                    flag = true;
                }
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return flag;
    }


    /**
     * delAssessment
     *
     * @param item AssessmentObject
     * @return boolean
     * @todo Implement this jsoft.ads.assessment.Assessment method
     */
    public boolean delAssessment(AssessmentObject item) {

        String sql  = "DELETE FROM tblassessment WHERE assessment_id=?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, item.getAsssessment_id());

            return this.del(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return false;
    }

    /**
     * editAssessment
     *
     * @param item AssessmentObject
     * @return boolean
     * @todo Implement this jsoft.ads.assessment.Assessment method
     */
    public boolean editAssessment(AssessmentObject item) {

        String sql = "UPDATE tblassessment SET ";

        sql += "assessment_name=?, assessment_enable=?,  ";
        sql += "assessment_type=?, assessment_fa_id=?, ";
        sql += "assessment_fa_name=?, assessment_selector=?, ";
        sql += "assessment_get_first=?, assessment_count=?, ";
        sql += "assessment_value=?, ";
        sql += "assessment_innerHTML=?, assessment_attribute=?,";
        sql += "assessment_point=?, ";
        sql += "assessment_creator_name=?,";
        sql += "assessment_last_updated_at=?, assessment_last_updator_id=?,";
        sql += "assessment_last_updator_name=?";

        sql += "WHERE assessment_id=?";

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            //Truyen gia tri
            pre.setString(1, item.getAssessment_name());
            pre.setBoolean(2, item.isAssessment_enable());
            pre.setByte(3, item.getAssessment_type());
            pre.setInt(4, item.getAssessment_fa_id());
            pre.setString(5, item.getAssessment_fa_name());
            pre.setString(6, item.getAssessment_selector());
            pre.setBoolean(7, item.isAssessment_get_first());
            pre.setString(8, item.getAssessment_count());
            pre.setBoolean(9, item.isAssessment_value());
            pre.setBoolean(10, item.isAssessment_innerHTML());
            pre.setString(11, item.getAssessment_attribute());
            pre.setInt(12, item.getAssessment_point());

            pre.setString(13, item.getAssessment_creator_name());
            pre.setString(14, item.getAssessment_last_updated_at());
            pre.setInt(15, item.getAssessment_last_updator_id());
            pre.setString(16, item.getAssessment_last_updator_name());

            pre.setInt(17, item.getAsssessment_id());

            //Tra ve ket qua
            return this.edit(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * getAssessment
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.ads.assessment.Assessment method
     */
    public ResultSet getAssessment(int id) {
        String sql = "SELECT * FROM tblassessment ";
        sql += "LEFT JOIN tblframework_assessment ON assessment_fa_id=fa_id ";

        sql += "WHERE assessment_id=?";
        return this.get(sql, id);
    }

    /**
     * getAssessments
     *
     * @param similar AssessmentObject
     * @param at int
     * @param total byte
     * @return ResultSet
     * @todo Implement this jsoft.ads.assessment.Assessment method
     */
    public ResultSet getAssessments(AssessmentObject similar, int at, byte total) {
        String sql = "SELECT * FROM tblassessment ";
        sql += "LEFT JOIN tblframework_assessment ON assessment_fa_id=fa_id ";
        sql += "LEFT JOIN tblarticle ON fa_article_id=article_id ";
        sql += "LEFT JOIN tblcategory ON article_category_id=category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id=source_id ";
        sql += "";
        sql += "ORDER BY assessment_id ASC ";
        sql += "LIMIT "+at+", "+total;


        return this.gets(sql);

    }

    /**
     * getCP
     *
     * @return ConnectionPool
     * @todo Implement this jsoft.ShareControl method
     */
    public ConnectionPool getCP() {
        return null;
    }

    /**
     * releaseCon
     *
     * @todo Implement this jsoft.ShareControl method
     */
    public void releaseCon() {
    }
}
