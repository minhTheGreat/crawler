package jsoft.ads.user;
import java.sql.*;
import jsoft.objects.*;
import jsoft.ShareControl;

public interface User extends ShareControl {

    //Cac chuc nang cap nhat nguoi su dung
    public boolean addUser(UserObject item);
    public boolean editUser(UserObject item);
    public boolean delUser(UserObject item);

    //Cac chuc nang lay du lieu
    public ResultSet getUser(int id);
    public ResultSet getUser(String username, String userpass);
    public ResultSet getUsers(UserObject similar, int at, byte total);

}
