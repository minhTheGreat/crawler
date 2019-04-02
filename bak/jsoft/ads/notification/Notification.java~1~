package jsoft.ads.notification;
import java.sql.*;
import jsoft.objects.*;
import jsoft.ShareControl;

public interface Notification extends ShareControl {

    //Cac chuc nang cap nhat nguoi su dung
    public boolean addNotification(NotificationObject item);
    public boolean editNotification(NotificationObject item);
    public boolean delNotification(NotificationObject item);

    //Cac chuc nang lay du lieu
    public ResultSet getNotification(int id);
    public ResultSet getNotifications(NotificationObject similar, int at, byte total);

}
