package jsoft.ads.user_log;

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
public class UserLogModel {

    private User_log c;

    public UserLogModel(ConnectionPool cp) {
        this.c = new UserLogImpl(cp, "Article");
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


    //----------------------------------------------------

    public boolean addUser_log(User_logObject item) {
        return this.c.addUser_log(item);
    }

    //----------------------------------------------------

    public ArrayList getUser_logs(User_logObject similar, int page,
                                       byte total) {

        ArrayList items = new ArrayList();
        User_logObject item = null;

        //Lay du lieu vao database,
        int at = (page - 1) * total;

        ResultSet rs = this.c.getUser_logs(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new User_logObject();
                    item.setUl_id(rs.getInt("ul_id"));
                    item.setUl_user_id(rs.getInt("ul_user_id"));
                    item.setUl_arrticle_id(rs.getInt("ul_article_id"));
                    item.setUl_category_id(rs.getInt("ul_category_id"));
                    item.setUl_source_id(rs.getInt("ul_source_id"));
                    item.setUl_viewed_at(rs.getString("ul_viewed_at"));

                    items.add(item);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return items;
    }
}
