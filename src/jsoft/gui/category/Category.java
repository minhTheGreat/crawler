package jsoft.gui.category;
import jsoft.*;
import java.sql.*;
import jsoft.objects.*;
/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public interface Category {
    public ResultSet getArticle(int id);
   //public ResultSet getArticle_focus(int fo);
   public ResultSet getArticles(ArticleObject similar, int at, byte total);

}
