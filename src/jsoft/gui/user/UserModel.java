package jsoft.gui.user;

import jsoft.ConnectionPool;
import jsoft.objects.UserObject;
import java.sql.ResultSet;
import java.util.ArrayList;
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
public class UserModel {

    private User u;

    public UserModel(ConnectionPool cp) {
        this.u = new UserImpl(cp); //truyen vao de khoi tao user
    }

    //Don dep dt
    protected void finallize() throws Throwable {
        this.u = null;
        super.finalize();
    }

    public ConnectionPool getCP(){
        return this.u.getCP();
    }

    public void releaseCon(){
        this.u.releaseCon();
    }

    //----------------------------------------------------

    public boolean addUser(UserObject item) {
        return this.u.addUser(item);
    }

    public boolean editUser(UserObject item) {
        return this.u.editUser(item);
    }

    public boolean delUser(UserObject item) {
        return this.u.delUser(item);
    }

    //----------------------------------------------------

    public UserObject getUserObject(int id) {
        UserObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.u.getUser(id);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new UserObject();
                    item.setUser_id(rs.getInt("user_id"));
                    item.setUser_name(rs.getString("user_name"));
                    item.setUser_password(rs.getString("user_password"));
                    item.setUser_fullname(rs.getString("user_fullname"));
                    item.setUser_address1(rs.getString("user_address1"));
                    item.setUser_workable(rs.getBoolean("user_workable"));
                    item.setUser_email(rs.getString("user_email"));
                    item.setUser_last_visited(rs.getString("user_last_visited"));
                    item.setUser_phone_number(rs.getInt("user_phone_number"));
                    item.setUser_create_at(rs.getString("user_create_at"));
                    item.setUser_cookie_id(rs.getString("user_cookie_id"));

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return item;
    }

    public UserObject getUserObject(String username, String userpass) {
        UserObject item = null;

        //Lay du lieu vao database,
        ResultSet rs = this.u.getUser(username, userpass);
        if (rs != null) {
            try {
                if (rs.next()) {
                    item = new UserObject();
                    item.setUser_id(rs.getInt("user_id"));
                    item.setUser_name(rs.getString("user_name"));
                    item.setUser_password(rs.getString("user_password"));
                    item.setUser_fullname(rs.getString("user_fullname"));
                    item.setUser_address1(rs.getString("user_address1"));
                    item.setUser_workable(rs.getBoolean("user_workable"));
                    item.setUser_email(rs.getString("user_email"));
                    item.setUser_last_visited(rs.getString("user_last_visited"));
                    item.setUser_phone_number(rs.getInt("user_phone_number"));
                    item.setUser_create_at(rs.getString("user_create_at"));
                    item.setUser_cookie_id(rs.getString("user_cookie_id"));


                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return item;
    }

    public ArrayList getUserObjects(UserObject similar, int page, byte total) {

        ArrayList items = new ArrayList();

        UserObject item = null;

        //Lay du lieu vao database,

        int at = (page - 1) * total;
        ResultSet rs = this.u.getUsers(similar, at, total);
        if (rs != null) {
            try {
                while (rs.next()) {
                    item = new UserObject();
                    item.setUser_id(rs.getInt("user_id"));
                    item.setUser_name(rs.getString("user_name"));
                    item.setUser_password(rs.getString("user_password"));
                    item.setUser_fullname(rs.getString("user_fullname"));
                    item.setUser_address1(rs.getString("user_address1"));
                    item.setUser_workable(rs.getBoolean("user_workable"));
                    item.setUser_email(rs.getString("user_email"));
                    item.setUser_last_visited(rs.getString("user_last_visited"));
                    item.setUser_phone_number(rs.getInt("user_phone_number"));
                    item.setUser_create_at(rs.getString("user_create_at"));
                    item.setUser_cookie_id(rs.getString("user_cookie_id"));


                    items.add(item);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return items;
    }

    public static void main(String[] args) {

    }
}
