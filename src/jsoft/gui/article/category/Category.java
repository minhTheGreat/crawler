package jsoft.gui.article.category;
import java.sql.*;
import jsoft.objects.*;
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
public interface Category extends ShareControl{

   //Cac chuc nang lay du lieu
   public ResultSet getCategory(int id);
   public ResultSet getCategorys(CategoryObject similar, int at, byte total);
   public ResultSet getCategories(CategoryObject similar,int at, byte total);

}
