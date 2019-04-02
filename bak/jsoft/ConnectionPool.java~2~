package jsoft;

import java.sql.*;

public interface ConnectionPool {
    //Cung cap mot ket noi cho mot doi tuong
    public Connection getConnection(String objectName) throws SQLException;

    //Yeu cau doi tuong tra lai ket noi
    public void releaseConnection(Connection con, String objectName) throws SQLException;

}
