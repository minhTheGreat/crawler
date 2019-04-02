package jsoft.ads.article;

import java.sql.ResultSet;

import jsoft.ConnectionPool;
import jsoft.objects.*;
import jsoft.*;
import jsoft.ads.category.*;
import java.sql.*;


public class ArticleImpl extends CategoryImpl implements Article {
    public ArticleImpl(ConnectionPool cp, String objectName) {
        super(cp, objectName);
    }

    /**
     * addArticle
     *
     * @param item ArticleObject
     * @return boolean
     * @todo Implement this jsoft.ads.article.Article method
     */
    public boolean addArticle(ArticleObject item) {

        //Kiem tra su ton tai
        if (this.isExisting(item)) {
            return false;
        }
        String sql = "INSERT INTO tblarticle( ";

        sql += "article_author, article_title,";
        sql += "article_description, article_image,";
        sql += "article_link, article_category_id,";
        sql += "article_viewer, article_enable,";
        sql += "article_evaluation_point, article_delete,";
        sql += "article_created_at, article_last_updated_at,";
        sql += "article_last_updator_id, article_last_updator_name)";

        sql += "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            //Truyen gia tri
            pre.setString(1, item.getArticle_author());
            pre.setString(2, item.getArticle_title());
            pre.setString(3, item.getArticle_description());
            pre.setString(4, item.getArticle_image());
            pre.setString(5, item.getArticle_link());
            pre.setInt(6, item.getArticle_category_id());
            pre.setInt(7, item.getArticle_viewer());
            pre.setBoolean(8, item.isArticle_enable());
            pre.setInt(9, item.getArticle_evaluation_point());
            pre.setBoolean(10, item.isArticle_delete());
            pre.setString(11, item.getArticle_created_at());
            pre.setString(12, item.getArticle_last_updated_at());
            pre.setInt(13, item.getArticle_last_updator_id());
            pre.setString(14, item.getArticle_last_updator_name());

            //Tra ve ket qua
            return this.add(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    //Khi them khi trung ten
    private boolean isExisting(ArticleObject item) {
        boolean flag = false;

        String sql = "SELECT article_id FROM tblarticle ";
        sql += "WHERE article_title = ? ";

        ResultSet rs = this.get(sql, item.getArticle_title());
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
     * delArticle
     *
     * @param item ArticleObject
     * @return boolean
     * @todo Implement this jsoft.ads.article.Article method
     */
    public boolean delArticle(ArticleObject item) {

        String sql = "DELETE FROM tblarticle WHERE article_id=?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, item.getArticle_id());

            return this.del(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * editArticle
     *
     * @param item ArticleObject
     * @return boolean
     * @todo Implement this jsoft.ads.article.Article method
     */
    public boolean editArticle(ArticleObject item) {

        //Cau lenh cap nhat sua
        String sql = "UPDATE tblarticle SET ";

        sql += "article_author=?, article_title=?,";
        sql += "article_description=?, article_image=?,";
        sql += "article_link=?, article_category_id=?,";
        sql += "article_viewer=?, article_enable=?,";
        sql += "article_evaluation_point=?, article_delete=?,";
        sql += "article_last_updated_at=?,";
        sql += "article_last_updator_id=?, article_last_updator_name=? ";

        sql += "WHERE article_id=?";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Truyen gia tri
            pre.setString(1, item.getArticle_author());
            pre.setString(2, item.getArticle_title());
            pre.setString(3, item.getArticle_description());
            pre.setString(4, item.getArticle_image());
            pre.setString(5, item.getArticle_link());
            pre.setInt(6, item.getArticle_category_id());
            pre.setInt(7, item.getArticle_viewer());
            pre.setBoolean(8, item.isArticle_enable());
            pre.setInt(9, item.getArticle_evaluation_point());
            pre.setBoolean(10, item.isArticle_delete());
            pre.setString(11, item.getArticle_last_updated_at());
            pre.setInt(12, item.getArticle_last_updator_id());
            pre.setString(13, item.getArticle_last_updator_name());

            pre.setInt(14, item.getArticle_id());

            //Tra ve ket qua
            return this.edit(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public boolean updateAll() {

        //Cau lenh cap nhat sua
        String sql = "UPDATE tblarticle SET ";

        sql += "article_enable=? ";

        sql += "WHERE article_id IS NOT NULL AND article_delete=0";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Truyen gia tri
            pre.setBoolean(1, true);

            //Tra ve ket qua
            return this.edit(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public int getSize() {
        String sql = "SELECT COUNT(article_id) as num FROM tblarticle ";
        sql += "WHERE article_id IS NOT NULL AND article_delete=0";
        ResultSet rs = this.get(sql, 0);
        int i = 0;
        if (rs != null) {
            try {
                while (rs.next()) {
                    i = rs.getInt("num");
                }
                return i;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return -1;
    }


    public boolean enable(ArticleObject item) {

        //Cau lenh cap nhat sua
        String sql = "UPDATE tblsource SET ";

        sql += "source_enable=? ";

        sql += "WHERE source_id=?";

        //Bien dich
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Truyen gia tri
            pre.setBoolean(1, item.isSource_enable());
            pre.setInt(2, item.getSource_id());

            //Tra ve ket qua
            if (this.edit(pre)) {
                sql = "UPDATE tblcategory SET ";

                sql += "category_enable=? ";

                sql += "WHERE category_id=?";
                pre = this.con.prepareStatement(sql);
                pre.setBoolean(1, item.isCategory_enable());
                pre.setInt(2, item.getArticle_category_id());

                if (this.edit(pre)) {
                    sql = "UPDATE tblarticle SET ";

                    sql += "article_enable=? ";

                    sql += "WHERE article_id=?";
                    pre = this.con.prepareStatement(sql);
                    pre.setBoolean(1, item.isArticle_enable());
                    pre.setInt(2, item.getArticle_id());
                    return this.edit(pre);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }


    /**
     * getArticle
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.ads.article.Article method
     */
    public ResultSet getArticle(int id) {
        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id = category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE article_id=? AND article_delete=0";

        return this.get(sql, id);
    }

    public ResultSet getArticle(String title) {
        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id = category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE article_title=? AND article_delete=0";

        return this.get(sql, title);
    }

    public ResultSet getArticleByLink(String link) {
        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id = category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE article_link=? AND article_delete=0";

        return this.get(sql, link);
    }



    /**
     * getArticles
     *
     * @param similar ArticleObject
     * @param at int
     * @param total byte
     * @return ResultSet
     * @todo Implement this jsoft.ads.article.Article method
     */
    public ResultSet getArticles(ArticleObject similar, int at, int total) {

        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id = category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id = source_id ";
        sql += "WHERE article_category_id > 0 AND article_delete=0 ";
        sql += "ORDER BY article_title ASC ";
        sql += "LIMIT " + at + ", " + total;

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

    public static void main(String[] args) {
    }
}
