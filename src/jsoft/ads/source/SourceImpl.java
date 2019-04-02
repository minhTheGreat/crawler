package jsoft.ads.source;

import java.sql.*;
import jsoft.ConnectionPool;
import jsoft.objects.*;
import jsoft.ads.basic.*;

public class SourceImpl extends BasicImpl implements Source {
    public SourceImpl(ConnectionPool cp, String objectName) {
        super(cp, objectName);
    }

    /**
     * addSource
     *
     * @param item SourceObject
     * @return boolean
     * @todo Implement this jsoft.ads.source.Source method
     */
    public boolean addSource(SourceObject item) {

        //Kiem tra su ton tai
       if(this.isExisting(item)){
           return false;
       }
       String sql = "INSERT INTO tblsource( ";

       sql += "source_name, source_link,  ";
       sql += "source_creator_id, source_last_updated_at,  ";
       sql += "source_enable, source_html_selector, ";
       sql += "source_creator_name, source_last_updator_id,  ";
       sql += "source_last_updator_name, source_created_at)";

       sql += "VALUES(?,?,?,?,?,?,?,?,?,?)";

       try{
       PreparedStatement pre = this.con.prepareStatement(sql);
       //Truyen gia tri
          pre.setString(1, item.getSource_name());
          pre.setString(2, item.getSource_link());
          pre.setInt(3, item.getSource_creator_id());
          pre.setString(4, item.getSource_last_updated_at());
          pre.setBoolean(5, item.isSource_enable());
          pre.setString(6, item.getSource_html_selector());
          pre.setString(7, item.getSource_creator_name());
          pre.setInt(8, item.getSource_last_updator_id());
          pre.setString(9, item.getSource_last_updator_name());
          pre.setString(10, item.getSource_created_at());

          //Tra ve ket qua
          return this.add(pre);

      } catch (SQLException ex) {
          ex.printStackTrace();
      }

        return false;
    }

    //Khi them khi trung ten
    private boolean isExisting(SourceObject item) {
        boolean flag = false;

        String sql = "SELECT source_id FROM tblsource ";
        sql += "WHERE source_name='" + item.getSource_name() + "' ";

        ResultSet rs = this.gets(sql);
        if (rs != null) {
            try {
                if (rs.next()) {
                    flag = true;
                }
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return flag;
    }


    /**
     * delSource
     *
     * @param item SourceObject
     * @return boolean
     * @todo Implement this jsoft.ads.source.Source method
     */
    public boolean delSource(SourceObject item) {

        String sql  = "DELETE FROM tblsource WHERE source_id=?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, item.getSource_id());

            return this.del(pre);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * editSource
     *
     * @param item SourceObject
     * @return boolean
     * @todo Implement this jsoft.ads.source.Source method
     */
    public boolean editSource(SourceObject item) {

        String sql = "UPDATE tblsource SET ";

        sql += "source_name=?, source_link=?,  ";
        sql += "source_last_updated_at=?,  ";
        sql += "source_enable=?, source_html_selector=?, ";
        sql += "source_creator_name=?, source_last_updator_id=?,  ";
        sql += "source_last_updator_name=? ";

        sql += "WHERE source_id=?";

       try{
       PreparedStatement pre = this.con.prepareStatement(sql);
       //Truyen gia tri
           pre.setString(1, item.getSource_name());
           pre.setString(2, item.getSource_link());
           pre.setString(4, item.getSource_last_updated_at());
           pre.setBoolean(5, item.isSource_enable());
           pre.setString(6, item.getSource_html_selector());
           pre.setString(7, item.getSource_creator_name());
           pre.setInt(8, item.getSource_last_updator_id());
           pre.setString(9, item.getSource_last_updator_name());

           pre.setInt(10, item.getSource_id());


          //Tra ve ket qua
          return this.edit(pre);

      } catch (SQLException ex) {
          ex.printStackTrace();
      }

        return false;
    }

    public boolean enable(int id, boolean status){
        String sql = "UPDATE tblsource SET ";
        sql += "source_enable=? ";
        sql += "WHERE source_id=?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setBoolean(1, status);
            pre.setInt(2, id);
            return this.edit(pre);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * getCP
     *
     * @return ConnectionPool
     * @todo Implement this jsoft.ShareControl method
     */
    public ConnectionPool getCP() {
        return null;
    }

    /**
     * getSource
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.ads.source.Source method
     */
    public ResultSet getSource(int id) {
        //String sql = "SELECT * FROM tblsource WHERE source_id=?";
        String sql = "SELECT * FROM tblsource WHERE source_id=? ";
        return this.get(sql, id);
    }

    /**
     * getSource
     *
     * @param id int
     * @return ResultSet
     * @todo Implement this jsoft.ads.source.Source method
     */
    public ResultSet getSource(String name) {
        //String sql = "SELECT * FROM tblsource WHERE source_id=?";
        String sql = "SELECT * FROM tblsource WHERE source_name LIKE ?";
        return this.get(sql, name);
    }


    /**
     * getSources
     *
     * @param similar SourceObject
     * @param at int
     * @param total byte
     * @return ResultSet
     * @todo Implement this jsoft.ads.source.Source method
     */
    public ResultSet getSources(SourceObject similar, int at, int total) {
        String sql = "SELECT * FROM tblsource ";
        sql += "ORDER BY source_id ASC ";
        sql += "LIMIT "+at+", "+total;

        return this.gets(sql);

    }

    /**
     * releaseCon
     *
     * @todo Implement this jsoft.ShareControl method
     */
    public void releaseCon() {
    }

    public static void main(String[] args) {
    }
}
