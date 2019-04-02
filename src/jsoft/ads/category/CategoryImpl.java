package jsoft.ads.category;

import jsoft.objects.CategoryObject;
import java.sql.*;
import jsoft.objects.*;

import jsoft.ads.source.*;
import jsoft.*;


public class CategoryImpl extends SourceImpl implements Category {
    public CategoryImpl(ConnectionPool cp, String objectName) {
        super(cp, objectName);
    }

    /**
     * addCategory
     *
     * @param item CategoryObject
     * @return boolean
     * @todo Implement this jsoft.ads.category.Category method
     */
    public boolean addCategory(CategoryObject item) {

        //Kiem tra su ton tai
        if (this.isExisting(item)) {
            return false;
        }

        String sql = "INSERT INTO tblcategory( ";

        sql += "category_name,category_enable, ";
        sql += "category_source_id, category_link ,";
        sql += "category_assessment_id , category_assessment_creator_id ,";
        sql += "category_assessment_creator_name, category_created_at , ";
        sql += "category_creator_id, category_creator_name ,";
        sql += "category_last_updated_at, category_last_updator_id , ";
        sql += "category_last_updator_name) ";

        sql += "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Truyen gia tri
            pre.setString(1, item.getCategory_name());
            pre.setBoolean(2, item.isCategory_enable());
            pre.setInt(3, item.getCategory_source_id());
            pre.setString(4, item.getCategory_link());
            pre.setInt(5, item.getCategory_assessment_id());
            pre.setInt(6, item.getCategory_assessment_creator_id());
            pre.setString(7, item.getCategory_assessment_creator_name());
            pre.setString(8, item.getCategory_created_at());
            pre.setInt(9, item.getCategory_creator_id());
            pre.setString(10, item.getCategory_creator_name());
            pre.setString(11, item.getCategory_last_updated_at());
            pre.setInt(12, item.getCategory_last_updator_id());
            pre.setString(13, item.getCategory_last_updator_name());

            //Tra ve ket qua
            return this.add(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;

    }

    //Khi them khi trung ten
    private boolean isExisting(CategoryObject item) {
        boolean flag = false;

        String sql = "SELECT category_id FROM tblcategory ";
        sql += "WHERE category_name='" + item.getCategory_name() + "' ";

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
     * delCategory
     *
     * @param item CategoryObject
     * @return boolean
     * @todo Implement this jsoft.ads.category.Category method
     */
    public boolean delCategory(CategoryObject item) {

        String sql = "DELETE FROM tblcategory WHERE category_id=?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, item.getCategory_id());

            return this.del(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * editCategory
     *
     * @param item CategoryObject
     * @return boolean
     * @todo Implement this jsoft.ads.category.Category method
     */
    public boolean editCategory(CategoryObject item) {
        //Cau lenh cap nhat sua
        String sql = "UPDATE tblcategory SET ";

        sql += "category_name=?,category_enable=?, ";
        sql += "category_source_id=? , category_link=?,";
        sql += "category_assessment_id=?, category_assessment_creator_id=?,";
        sql += "category_assessment_creator_name=?, ";
        sql += "category_creator_name=? ,";
        sql += "category_last_updated_at=?, category_last_updator_id=?, ";
        sql += "category_last_updator_name=? ";

        sql += "WHERE category_id=?";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Truyen gia tri
            pre.setString(1, item.getCategory_name());
            pre.setBoolean(2, item.isCategory_enable());
            pre.setInt(3, item.getCategory_source_id());
            pre.setString(4, item.getCategory_link());
            pre.setInt(5, item.getCategory_assessment_id());
            pre.setInt(6, item.getCategory_assessment_creator_id());
            pre.setString(7, item.getCategory_assessment_creator_name());
            pre.setString(8, item.getCategory_creator_name());
            pre.setString(9, item.getCategory_last_updated_at());
            pre.setInt(10, item.getCategory_last_updator_id());
            pre.setString(11, item.getCategory_last_updator_name());

            pre.setInt(12, item.getCategory_id());

            //Tra ve ket qua
            return this.edit(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public boolean enable(CategoryObject item) {
        //Cau lenh cap nhat sua
        String sql = "UPDATE tblsource SET ";
        sql += "source_enable=? ";
        sql += "WHERE source_id=?";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            pre.setBoolean(1, true);
            pre.setInt(2, item.getCategory_source_id());

            //Tra ve ket qua
            if (this.edit(pre)) {
                sql = "UPDATE tblcategory SET ";
                sql += "category_enable=? ";
                sql += "WHERE category_id=?";

                pre = this.con.prepareStatement(sql);

                //Truyen gia tri
                pre.setBoolean(1, item.isCategory_enable());
                pre.setInt(2, item.getCategory_id());

                return this.edit(pre);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
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
     * getCategory
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.ads.category.Category method
     */
    public ResultSet getCategory(int id) {
        String sql = "SELECT * FROM tblcategory ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE category_id=?";

        return this.get(sql, id);
    }

    public ResultSet getCategory(String name) {
        String sql = "SELECT * FROM tblcategory ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE category_name LIKE ?";

        return this.get(sql, name);
    }


    /**
     * getCategorys
     *
     * @param similar CategoryObject
     * @param at int
     * @param total byte
     * @return ResultSet
     * @todo Implement this jsoft.ads.category.Category method
     */
    public ResultSet getCategorys(CategoryObject similar, int at, int total) {
        String sql = "SELECT * FROM tblcategory ";
        sql += "LEFT JOIN tblsource ON category_source_id=source_id ";
//        sql += "WHERE source_enable = 1 AND ";
        sql += "ORDER BY category_name, source_name ASC ";
        sql += "LIMIT " + at + ", " + total;

        return this.gets(sql);

    }

    public ResultSet getCategorys2(CategoryObject similar, int at, int total) {
        String sql = "SELECT * FROM tblsource ";
        sql += "LEFT JOIN tblcategory ON category_source_id=source_id ";
//        sql += "WHERE source_enable = 1 AND ";
        sql += "ORDER BY source_name, category_name ASC ";
        sql += "LIMIT " + at + ", " + total;

        return this.gets(sql);

    }

    public ResultSet getCategorysBySource(int id) {
        String sql = "SELECT * FROM tblsource ";
        sql += "LEFT JOIN tblcategory ON category_source_id=source_id ";
        sql += "WHERE source_id=" + id + " ORDER BY category_name ASC";

        return this.gets(sql);
    }


    /**
     * releaseCon
     *
     * @todo Implement this jsoft.ShareControl method
     */
    public void releaseCon() {
    }

    public static void main(String[] args) {

        //Tao bo quan li ket noi
        ConnectionPool cp = new ConnectionPoolImpl();

        //Tao doi tuong thuc thi chuc nang
        Category c = new CategoryImpl(cp, "Category");

        //Lay danh sach ban ghi nguoi su dung
        ResultSet rs = c.getCategorys(null, 0, (byte) 15);

    }
}
