package jsoft.gui.article;

import java.sql.*;
import jsoft.objects.*;
import jsoft.*;
import jsoft.gui.basic.*;
import jsoft.gui.sql.*;

public class ArticleImpl extends BasicImpl implements Article {
    public ArticleImpl(ConnectionPool cp) {
        super(cp, "Article");
    }

    /**
     * getArticle
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.gui.article.Article method
     */
    public ResultSet getArticle(int id) {

        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id=category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id=source_id ";
        sql += "";
        sql += "WHERE article_id=?";

        return this.get(sql, id);
    }

//    public ResultSet getArticle_focus(int fo) {
//
//       String sql = "SELECT * FROM tblarticle ";
//       sql += "LEFT JOIN tblcategory ON article_category_id=category_id ";
//       sql += "LEFT JOIN tblsource ON category_source_id=source_id ";
//       sql += "";
//       sql += "ORDER BY article_id DESC ";
//       sql += "LIMIT ? ";
//
//       return this.get(sql, fo);
//   }
//

    /**
     * getArticles
     *
     * @param similar ArticleObject
     * @param at int
     * @param total byte
     * @return ResultSet
     * @todo Implement this jsoft.gui.article.Article method
     */
    public ResultSet getArticles(ArticleObject similar, int at, byte total) {

        String conds = MakeConditions.createConditions(similar);
        String sql = "SELECT * FROM tblarticle ";
        sql += "LEFT JOIN tblcategory ON article_category_id=category_id ";
        sql += "LEFT JOIN tblsource ON category_source_id=source_id ";
        if (!conds.equalsIgnoreCase("")) {
            sql += "WHERE " + conds + " ";
        }
        sql +=
                "AND article_image LIKE 'https%' AND article_description NOT LIKE '%<%' ";
        sql +=
                "AND article_title NOT LIKE '%<%' AND article_description NOT LIKE '' ";
        sql += "ORDER BY article_id DESC ";
        sql += " LIMIT " + at + ", " + total;

        return this.gets(sql);
    }

    public ResultSet countArticles(ArticleObject similar) {
        String conds = MakeConditions.createConditions(similar);
        String sql = "SELECT count(article_id) FROM tblarticle ";
        sql += "JOIN tblcategory ON article_category_id=category_id ";
        sql += "JOIN tblsource ON category_source_id=source_id ";
        if (!conds.equalsIgnoreCase("")) {
            sql += "WHERE " + conds + " ";
            sql +=
                    "AND article_image LIKE 'https%' AND article_description NOT LIKE '%<%' ";
            sql +=
                    "AND article_title NOT LIKE '%<%' AND article_description NOT LIKE '' ";
        }

        return this.gets(sql);
    }

    public ResultSet getCategories(ArticleObject similar) {
        String sql = "SELECT tblcategory.category_id, tblcategory.category_name, tblsource.source_name ";
        sql += "FROM tblcategory ";
        sql +=
                "JOIN tblsource ON tblsource.source_id = tblcategory.category_source_id ";
        sql += "WHERE category_id=? ";
        sql += "ORDER BY category_name ASC ";

        return this.get(sql, similar.getArticle_category_id());

    }


    /**
     * getCP
     *
     * @return ConnectionPool
     * @todo Implement this jsoft.ShareControl method
     */


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
