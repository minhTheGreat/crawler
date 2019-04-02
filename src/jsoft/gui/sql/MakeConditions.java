package jsoft.gui.sql;

import jsoft.objects.*;


public class MakeConditions {
    public MakeConditions() {
    }

    public static String createConditions(ArticleObject similar){
        String tmp = "";


      if (similar != null) {


          //Lay thong tin the loai neu co
          int cid = similar.getArticle_category_id();
          int aid = similar.getArticle_id();
          if (cid == 0) {
              cid = similar.getCategory_id();
          }
          if (cid > 0) {
              if (tmp.equalsIgnoreCase("")) {
                  tmp = "(article_category_id=" + cid + ")";
              }
          }

      }
        return tmp;
    }

}
