package jsoft.ads.article;

import jsoft.*;
import jsoft.objects.*;
import jsoft.ShareControl;
import java.sql.*;

public interface Article extends ShareControl{

    //Cac chuc nang cap nhat nguoi su dung
    public boolean addArticle(ArticleObject item);
    public boolean editArticle(ArticleObject item);
    public boolean delArticle(ArticleObject item);
    public boolean updateAll();
    public boolean enable(ArticleObject item);
    public int getSize();

    //Cac chuc nang lay du lieu
    public ResultSet getArticle(int id);
    public ResultSet getArticle(String title);
    public ResultSet getArticleByLink(String link);
    public ResultSet getArticles(ArticleObject similar, int at, int total);

}
