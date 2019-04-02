package jsoft.gui.article;
import jsoft.*;
import java.sql.*;
import jsoft.objects.*;

public interface Article extends ShareControl {

    public ResultSet getArticle(int id);
    //public ResultSet getArticle_focus(int fo);
    public ResultSet getArticles(ArticleObject similar, int at, byte total);
    public ResultSet getCategories(ArticleObject similar);
    ResultSet countArticles(ArticleObject similar);

}
