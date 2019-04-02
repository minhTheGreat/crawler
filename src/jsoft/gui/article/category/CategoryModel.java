package jsoft.gui.article.category;
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
public class CategoryModel {

    private Category c;

    public CategoryModel(ConnectionPool cp) {
        this.c = new CategoryImpl(cp, "Category");
    }

    protected void finallize() throws Throwable {
        this.c = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.c.getCP();
    }

    public void releaseCon() {
        this.c.releaseCon();
    }




    public CategoryObject getCategoryObject(int id) {
        Framework_assessmentObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.c.getCategory(id);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new Framework_assessmentObject();
                    item.setCategory_id(rs.getInt("category_id"));
                    item.setCategory_name(rs.getString("category_name"));
                    item.setCategory_enable(rs.getBoolean("category_enable"));
                    item.setCategory_source_id(rs.getInt("category_source_id"));
                    item.setCategory_link(rs.getString("category_link"));
                    item.setCategory_assessment_id(rs.getInt( "category_assessment_id"));
                    item.setCategory_assessment_creator_id(rs.getInt("category_assessment_creator_id"));
                    item.setCategory_assessment_creator_name(rs.getString( "category_assessment_creator_name"));
                    item.setCategory_created_at(rs.getString( "category_created_at"));
                    item.setCategory_creator_id(rs.getInt( "category_creator_id"));
                    item.setCategory_creator_name(rs.getString( "category_creator_name"));
                    item.setCategory_last_updated_at(rs.getString( "category_last_updated_at"));
                    item.setCategory_last_updator_name(rs.getString( "category_last_updator_name"));
                    item.setCategory_last_updator_id(rs.getInt( "category_last_updator_id"));

                    item.setSource_name(rs.getString("source_name"));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return item;
    }

    public ArrayList getCategoryObjects(Framework_assessmentObject similar, int page,
                                        byte total) {

        ArrayList items = new ArrayList();
        Framework_assessmentObject item = null;

        //Lay du lieu vao database,
        int at = (page - 1) * total;

        ResultSet rs = this.c.getCategorys(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new Framework_assessmentObject();
                    item.setCategory_id(rs.getInt("category_id"));
                    item.setCategory_name(rs.getString("category_name"));
                    item.setCategory_enable(rs.getBoolean("category_enable"));
                    item.setCategory_source_id(rs.getInt("category_source_id"));
                    item.setCategory_link(rs.getString("category_link"));
                    item.setCategory_assessment_id(rs.getInt( "category_assessment_id"));
                    item.setCategory_assessment_creator_id(rs.getInt("category_assessment_creator_id"));
                    item.setCategory_assessment_creator_name(rs.getString( "category_assessment_creator_name"));
                    item.setCategory_created_at(rs.getString( "category_created_at"));
                    item.setCategory_creator_id(rs.getInt( "category_creator_id"));
                    item.setCategory_creator_name(rs.getString( "category_creator_name"));
                    item.setCategory_last_updated_at(rs.getString( "category_last_updated_at"));
                    item.setCategory_last_updator_name(rs.getString( "category_last_updator_name"));
                    item.setCategory_last_updator_id(rs.getInt( "category_last_updator_id"));

                    item.setFa_name(rs.getString("fa_name"));
                    item.setSource_name(rs.getString("source_name"));


                    items.add(item);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return items;
    }
    public ArrayList getCateObjects(CategoryObject similar, int page,
                                       byte total) {

       ArrayList items = new ArrayList();
       CategoryObject item = null;

       //Lay du lieu vao database,
       int at = (page - 1) * total;

       ResultSet rs = this.c.getCategories(similar, at, total);
       if (rs != null) {
           try {
               while (rs.next()) {
                   item = new CategoryObject();
                   item.setCategory_id(rs.getInt("category_id"));
                   item.setCategory_name(rs.getString("category_name"));
                   item.setCategory_enable(rs.getBoolean("category_enable"));
                   item.setCategory_source_id(rs.getInt("category_source_id"));
                   item.setCategory_link(rs.getString("category_link"));
                   item.setCategory_assessment_id(rs.getInt( "category_assessment_id"));
                   item.setCategory_assessment_creator_id(rs.getInt("category_assessment_creator_id"));
                   item.setCategory_assessment_creator_name(rs.getString( "category_assessment_creator_name"));
                   item.setCategory_created_at(rs.getString( "category_created_at"));
                   item.setCategory_creator_id(rs.getInt( "category_creator_id"));
                   item.setCategory_creator_name(rs.getString( "category_creator_name"));
                   item.setCategory_last_updated_at(rs.getString( "category_last_updated_at"));
                   item.setCategory_last_updator_name(rs.getString( "category_last_updator_name"));
                   item.setCategory_last_updator_id(rs.getInt( "category_last_updator_id"));


                   items.add(item);

               }
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }

       return items;
   }



    }



