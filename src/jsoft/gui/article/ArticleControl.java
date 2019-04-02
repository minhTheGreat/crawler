package jsoft.gui.article;
import jsoft.*;
import jsoft.objects.*;
import java.util.*;

public class ArticleControl {
    private ArticleModel am;

    public ArticleControl(ConnectionPool cp) {
        this.am = new ArticleModel(cp);
    }

    protected void finalize()throws Throwable{
           this.am = null;
           super.finalize();
    }

    public ConnectionPool getCP(){
        return this.am.getCP();
    }

    public void releaseConnection(){
       this.am.releaseCon();
    }

    //-----------------------------------------

    public String viewIntros(ArticleObject similar, byte total){
        ArrayList items = this.am.getArticleObjects(similar,1,total);

        return ArticleLibrary.viewIntros(items);
    }
    public String viewFocus(ArticleObject similar, byte total){
        ArrayList items= this.am.getArticleObjects(similar, 1, total);

        return ArticleLibrary.viewFocus(items);
    }
    public String viewFocus2(ArticleObject similar, byte total){
        ArrayList items= this.am.getArticleObjects(similar, 1, total);

        return ArticleLibrary.viewFocus2(items);
    }
    public String viewSections(ArticleObject similar, byte total, String menu) {
      //Lay danh sach bai viet
      ArrayList arts = this.am.getArticleObjects(similar, 1,
              (byte) total);

      //Lay danh sach the loai
      ArrayList cates = this.am.getCategories(similar);

      return ArticleLibrary.lView(arts, cates, menu);
    }
    public String viewBrView(ArticleObject similar, byte total, String menu) {
      //Lay danh sach bai viet
      ArrayList arts = this.am.getArticleObjects(similar,  1,
              (byte) total);

      //Lay danh sach the loai
      ArrayList cates = this.am.getCategories(similar);

      return ArticleLibrary.brView(arts, cates, menu);
    }
    public String viewBlView(ArticleObject similar, byte total, String menu) {
     //Lay danh sach bai viet
     ArrayList arts = this.am.getArticleObjects(similar,  1,
             (byte) total);

     //Lay danh sach the loai
     ArrayList cates = this.am.getCategories(similar);

     return ArticleLibrary.blView(arts, cates, menu);
   }
   public String viewRView(ArticleObject similar, byte total, String menu) {
     //Lay danh sach bai viet
     ArrayList arts = this.am.getArticleObjects(similar, 1,
             (byte) total);

     //Lay danh sach the loai
     ArrayList cates = this.am.getCategories(similar);

     return ArticleLibrary.rView(arts, cates, menu);
   }
   public String viewArchive(ArticleObject similar,int page, byte total) {
     //Lay danh sach bai viet


     ArrayList arts = this.am.getArticleObjects(similar,page,(byte) total);
     int count =this.am.countArticles(similar);
     //Lay danh sach the loai
     ArrayList cates = this.am.getCategories(similar);

     return ArticleLibrary.viewArchive(arts,cates,count);
   }
}
