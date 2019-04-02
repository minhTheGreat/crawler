package jsoft.gui.user;

import jsoft.*;
import jsoft.objects.*;

import java.util.*;

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
public class UserControl {

    private UserModel um;


    public UserControl(ConnectionPool cp) {
        this.um = new UserModel(cp);
    }

    protected void finalize()throws Throwable{
            this.um = null;
            super.finalize();
    }

    public ConnectionPool getCP(){
        return this.um.getCP();
    }

    public void releaseCon(){
        this.um.releaseCon();
    }


    //-----------------------------------------

    public boolean addUser(UserObject item){
        return this.um.addUser(item);
    }

    public boolean editUser(UserObject item){
        return this.um.editUser(item);
    }

    public boolean delUser(UserObject item){
        return this.um.delUser(item);
    }

    //-----------------------------------------

    public UserObject getUserObject(int id){
        return this.um.getUserObject(id);
    }

    public UserObject getUserObject(String username, String userpass){
        return this.um.getUserObject(username, userpass);
    }

     //-----------------------------------------


}
