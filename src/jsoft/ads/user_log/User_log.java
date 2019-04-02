package jsoft.ads.user_log;
import java.sql.*;
import jsoft.objects.*;
import jsoft.ShareControl;

public interface User_log extends ShareControl {

    //Cac chuc nang cap nhat nguoi su dung
    public boolean addUser_log(User_logObject item);

    //Cac chuc nang lay du lieu
    public ResultSet getUser_logs(User_logObject similar, int at, byte total);

}
