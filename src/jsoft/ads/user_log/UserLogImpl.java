package jsoft.ads.user_log;

import java.sql.ResultSet;

import jsoft.ConnectionPool;
import jsoft.objects.*;
import jsoft.*;
import java.sql.*;
import jsoft.ads.basic.BasicImpl;


public class UserLogImpl extends BasicImpl implements User_log {
    public UserLogImpl(ConnectionPool cp, String objectName) {
        super(cp, objectName);
    }

    /**
     * addArticle
     *
     * @param item ArticleObject
     * @return boolean
     * @todo Implement this jsoft.ads.article.Article method
     */
    public boolean addUser_log(User_logObject item) {

        String sql = "INSERT INTO tbluser_log( ";

        sql += "ul_article_id, ul_category_id,";
        sql += "ul_source_id, ul_viewed_at, ul_user_id";
        sql += ")";

        sql += "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            //Truyen gia tri
            pre.setInt(1, item.getUl_arrticle_id());
            pre.setInt(2, item.getUl_category_id());
            pre.setInt(3, item.getUl_source_id());
            pre.setString(4, item.getUl_viewed_at());
            pre.setInt(5, item.getUl_arrticle_id());

            //Tra ve ket qua
            return this.add(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
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
    public ResultSet getUser_logs(User_logObject similar, int at, byte total) {

        String sql = "SELECT * FROM tbluser_log, COUNT(ul_id) AS total ";
        sql += "GROUP BY ul_category_id ";
        sql += "ORDER BY total DESC;";

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
