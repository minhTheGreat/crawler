package jsoft;

import java.sql.*;
import java.util.*;

public class ConnectionPoolImpl implements ConnectionPool {

    //Trinh dieu khien lam viec voi CSDL
    private String driver;

    //Duong dan thuc thi
    private String url;

    //Tao tai khoan lam viec voi MySQL
    private String username;
    private String userpass;

    //Doi tuong luu tru ket noi
    private Stack pool;

    public ConnectionPoolImpl() {
        //X�c \u0111inh trinh dieu khien
        this.driver = "com.mysql.jdbc.Driver";

        //Xac dinh duong dan URL
        this.url = "jdbc:mysql://localhost:3306/clawler_news_data";

        //tai khoan mysql
        this.username = "root";
        this.userpass = "123";

        //Lap trinh dieu khien
        try {
            Class.forName(this.driver).newInstance();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        }

        //Khoi tao doi tuong luu tru
        this.pool = new Stack();
    }

    /**
     * getConnection
     *
     * @param objectName String
     * @return ConnectionPool
     * @throws SQLException
     * @todo Implement this jsoft.ConnectionPool method
     */
    public Connection getConnection(String objectName) throws SQLException {

        if (this.pool.isEmpty()) {
            //Tao ket noi
            System.out.println(objectName +
                               " have been created a new Connection.");

            return DriverManager.getConnection(this.url,
                                               this.username, this.userpass);
        } else {
            //Lay ra ket noi da ton tai
            System.out.println(objectName + " have been poped the Connection");

            return (Connection)this.pool.pop();
        }
    }

    /**
     * releaseConnection
     *
     * @param con Connection
     * @param objectName String
     * @throws SQLException
     * @todo Implement this jsoft.ConnectionPool method
     */
    public void releaseConnection(Connection con, String objectName) throws SQLException {
        //Yeu cau tra lai ket noi
        System.out.println(objectName + " have been pushed the Connection");
        this.pool.push(con);
    }

    protected void finalize() throws Throwable {
        this.driver = null;
        this.url = null;
        this.username = null;
        this.userpass = null;
        this.pool.clear();
        this.pool = null;

        super.finalize();

        System.out.println("ConnectionPool is Closed,");
    }

}
