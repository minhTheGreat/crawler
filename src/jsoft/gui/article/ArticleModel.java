package jsoft.gui.article;

import jsoft.*;
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
public class ArticleModel {

    private Article a;

    public ArticleModel(ConnectionPool cp) {
        this.a = new ArticleImpl(cp);
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

    public ArticleObject getArticleObject(int id) {
        ArticleObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.a.getArticle(id);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new ArticleObject();
                    item.setArticle_id(rs.getInt("article_id"));
                    item.setArticle_author(rs.getString("article_author"));
                    item.setArticle_title(rs.getString("article_title"));
                    item.setArticle_description(rs.getString("article_description"));
                    item.setArticle_image(rs.getString("article_image"));
                    item.setArticle_link(rs.getString("article_link"));
                    item.setArticle_category_id(rs.getInt("article_category_id"));
                    item.setArticle_viewer(rs.getInt("article_viewer"));
                    item.setArticle_enable(rs.getBoolean("article_enable"));
                    item.setArticle_evaluation_point(rs.getInt("article_evaluation_point"));
                    item.setArticle_delete(rs.getBoolean("article_delete"));
                    item.setArticle_created_at(rs.getString("article_created_at"));
                    item.setArticle_last_updated_at(rs.getString("article_last_updated_at"));
                    item.setArticle_last_updator_id(rs.getInt("article_last_updator_id"));
                    item.setArticle_last_updator_name(rs.getString("article_last_updator_name"));

                     item.setCategory_name(rs.getString("category_name"));
                    item.setSource_name(rs.getString("source_name"));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return item;
    }



    public ArrayList getArticleObjects(ArticleObject similar, int page,
                                        byte total) {

        ArrayList items = new ArrayList();
        ArticleObject item = null;

        //Lay du lieu vao database,
        int at = (page - 1) * total;

        ResultSet rs = this.a.getArticles(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new ArticleObject();
                    item.setArticle_id(rs.getInt("article_id"));
                    item.setArticle_author(rs.getString("article_author"));
                    item.setArticle_title(rs.getString("article_title"));
                    item.setArticle_description(rs.getString("article_description"));
                    item.setArticle_image(rs.getString("article_image"));
                    item.setArticle_link(rs.getString("article_link"));
                    item.setArticle_category_id(rs.getInt("article_category_id"));
                    item.setArticle_viewer(rs.getInt("article_viewer"));
                    item.setArticle_enable(rs.getBoolean("article_enable"));
                    item.setArticle_evaluation_point(rs.getInt("article_evaluation_point"));
                    item.setArticle_delete(rs.getBoolean("article_delete"));
                    item.setArticle_created_at(rs.getString("article_created_at"));
                    item.setArticle_last_updated_at(rs.getString("article_last_updated_at"));
                    item.setArticle_last_updator_id(rs.getInt("article_last_updator_id"));
                    item.setArticle_last_updator_name(rs.getString("article_last_updator_name"));


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
    public ArrayList getCategories(ArticleObject similar) {
     ArrayList cates = new ArrayList();

     CategoryObject cate;
     ResultSet rs = this.a.getCategories(similar);
     if(rs!=null){
         try {
             while (rs.next()) {
               cate = new CategoryObject();
               cate.setCategory_id(rs.getShort("category_id"));
               cate.setCategory_name(rs.getString("category_name"));
               cate.setSource_name(rs.getString("source_name"));
               cates.add(cate);


             }
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
     }

     //sap xep lai danh sach the loai
     for(int i=0;i<cates.size();i++){
         cate = (CategoryObject)cates.get(i);

         if(cate.getCategory_id() == similar.getArticle_category_id()){
             cates.remove(i); //Loai bo tai vi tri hien tai
             cates.add(0, cate);//Di chuyen len dau
         }
     }

     return cates;
 }
 public int countArticles(ArticleObject similar){
     int count = 0;
     ResultSet rs = this.a.countArticles(similar);
     if(rs!=null){
        try {
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     }
     return count;
 }



}
