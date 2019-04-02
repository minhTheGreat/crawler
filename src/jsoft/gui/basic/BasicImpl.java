package jsoft.gui.basic;

import java.sql.*;

import jsoft.*;

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
public class BasicImpl implements Basic {
    //Bo quan li ket noi cua rieng Basic
    private ConnectionPool cp;

    //Ket noi de Basic su dung truy cap CSDL
    protected Connection con; //dung protected de ket noi vs addUser-thuoc tinh phu thuoc

    //doi tuong lam viec voi Basic
    private String objectName;

    public BasicImpl(ConnectionPool cp,
                     String objectName) {
        //Xac dinh doi tuong lam viec voi Basic
        this.objectName = objectName;

        //Kiem tra su ton tai cua bo quan li ket noi
        if(cp==null){
            this.cp = new ConnectionPoolImpl();
        }else{
            this.cp = cp;
        }

        //Hoi xin le noi tu bo quan li ket noi
        try {
            this.con = this.cp.getConnection(this.objectName);

            //Kiem tra trang thai thuc thi tu dong
            if(this.con.getAutoCommit()){
                this.con.setAutoCommit(false);//huy k cho thuc hien tu dong
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

    private boolean exe(PreparedStatement pre){

        if(pre!=null){
            try {
                int result = pre.executeUpdate();

                //kiem tra so luong bi tac dong
                if(result==0){
                    this.con.rollback();
                    return false;
                }

                //Xac nhan thuc thi sau cung
                this.con.commit();
                return true;


            } catch (SQLException ex) {
                ex.printStackTrace();

                //TRo lai trang thai an toan cua ket noi
                try {
                    this.con.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                }
            }finally{
                pre = null;
            }
        }

        return false;
    }




    /**
     * add
     *
     * @param pre PreparedStatement
     * @return boolean
     * @todo Implement this jsoft.ads.basic.Basic method
     */

    /**
     * get
     *
     * @param sql String
     * @param value int
     * @return ResultSet
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public ResultSet get(String sql, int value) {

        //bien dich Cau lenh SQL
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            if(value>0){
                pre.setInt(1, value);
            }

            //tra ve ket qua
            return pre.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                this.con.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }




        return null;
    }

    /**
     * get
     *
     * @param sql String
     * @param name String
     * @param pass String
     * @return ResultSet
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public ResultSet get(String sql, String name, String pass) {

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);

            //truyen gia tri
            pre.setString(1, name);
            pre.setString(2, pass);

            return pre.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                this.con.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }

        return null;
    }

    /**
     * getCP
     *
     * @return ConnectionPool
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public ConnectionPool getCP() {
        return this.cp;
    }

    /**
     * gets
     *
     * @param sqls String[]
     * @return ResultSet[]
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public ResultSet[] gets(String[] sqls) {

        ResultSet[] tmp = new ResultSet[sqls.length];

        for(int i=0; i<sqls.length; i++){
            tmp[i] = this.get(sqls[i], 0);
        }


        return tmp;
    }

    /**
     * gets
     *
     * @param sql String
     * @return ResultSet
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public ResultSet gets(String sql) {
        return this.get(sql, 0);
    }

    /**
     * releaseCon
     *
     * @todo Implement this jsoft.ads.basic.Basic method
     */
    public void releaseCon() {
        try {
            this.cp.releaseConnection(this.con, this.objectName);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
    }
}
