package jsoft.gui.article;

import jsoft.*;
import jsoft.objects.*;
import java.util.*;
import com.*;
public class ArticleLibrary {
    public ArticleLibrary() {
    }

    public static String viewIntros(ArrayList<ArticleObject> items) {
        String tmp = "<div class=\"slick_slider2\">";
        for (ArticleObject item : items) {
            tmp += "<div class=\"single_featured_slide\">";
            tmp += "<a href=\""+item.getArticle_link()+"\"><img src=\"" + item.getArticle_image() +
                    "\" /></a>";

            tmp += "<h2><a href=\""+item.getArticle_link()+"\">" + item.getArticle_title() + "</a></h2>";
            tmp += "<p>" + item.getArticle_description() + "</p>";
            tmp += "</div>";
        }

        tmp += "</div>";

        return tmp;
    }

    public static String viewFocus(ArrayList<ArticleObject> items) {
        int NO = 0;
        String tmp = "";
        tmp += "<div class=\"col-lg-3 col-md-3 col-sm-3\">";
        tmp += "<div class=\"content_middle_leftbar\">";
        tmp += "<div class=\"single_category wow fadeInDown\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span> <a href=\"#\" class=\"title_text\">Tin Hot</a> </h2>";
        tmp += "<ul class=\"catg1_nav\">";
        for (ArticleObject item : items) {
            if (++NO > 3) {
                break;
            }
            tmp += "<li>";
            tmp += "<div class=\"catgimg_container\">";
            tmp += "<a href=\""+item.getArticle_link()+"\" class=\"catg1_img\">";
            tmp += "<img src=\"" + item.getArticle_image() + "\"></a></div>";
            tmp += "<h3 class=\"post_titile\">";
            tmp += "<a href=\""+item.getArticle_link()+"\">";
            tmp += item.getArticle_title();
            tmp += "</a></h3>";
            tmp += "</li>";
        }
        tmp += "</ul>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        return tmp;
    }

    public static String viewFocus2(ArrayList<ArticleObject> items) {
        int NO = 0;
        String tmp = "";
        tmp += "<div class=\"col-lg-3 col-md-3 col-sm-3\">";
        tmp += "<div class=\"content_middle_rightbar\">";
        tmp += "<div class=\"single_category wow fadeInDown\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span> <a href=\"#\" class=\"title_text\">Tin Hot</a> </h2>";
        tmp += "<ul class=\"catg1_nav\">";
        for (ArticleObject item : items) {
            if (++NO >= 3) {
                break;
            }
            tmp += "<li>";
            tmp += "<div class=\"catgimg_container\">";
            tmp += "<a href=\""+item.getArticle_link()+"\" class=\"catg1_img\">";
            tmp += "<img src=\"" + item.getArticle_image() + "\"></a></div>";
            tmp += "<h3 class=\"post_titile\">";
            tmp += "<a href=\""+item.getArticle_link()+"\">";
            tmp += item.getArticle_title();
            tmp += "</a></h3>";
            tmp += "</li>";
        }
        tmp += "</ul>";
        tmp += "</div>";
        tmp += "</div>";
        tmp += "</div>";
        return tmp;
    }

    public static String lView(ArrayList<ArticleObject> arts,
            ArrayList<CategoryObject> cates, String menu) {
        int NO = 0;
        String tmp = "";
        tmp += "<div class=\"single_category wow fadeInDown\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span>";
        tmp += "<span class=\"solid_line\"></span>";
        for (CategoryObject cate : cates) {
            if (++NO >= 2) {
                break;
            }

            tmp += " <a class=\"title_text\" href=\"" +
                    cate.getCategory_id() +
                    "\">";
            tmp += cate.getCategory_name();
            tmp += "</a> </h2>";
        }
        ArticleObject item = null;
        if (arts.size() > 0) {
            item = arts.get(0);
            tmp += "<div class=\"business_category_left wow fadeInDown\">";
            tmp += "<ul class=\"fashion_catgnav\">";
            tmp += "<li><div class=\"catgimg2_container\">";
            tmp += "<a href=\""+item.getArticle_link()+"\">";
            tmp += "<img alt=\"\" src=\"" + item.getArticle_image() + "\">";
            tmp += "</a></div>";
            tmp += "<h2 class=\"catg_titile\">";
            tmp += "<a href=\""+item.getArticle_link()+"\">";
            tmp += item.getArticle_title();
            tmp += "</a></h2>";
            tmp += " <div class=\"comments_box\"><span class=\"meta_comment\">";
            tmp += "<a href=\"" + item.getArticle_link() +
                    "\">";
            for(CategoryObject cate: cates){
                  tmp += cate.getSource_name();
              }

            tmp += " </a></span>";
            tmp += " <span class=\"meta_more\">";
            tmp += "<a href=\"" + item.getArticle_link() +
                    "\">Chi ti\u1EBFt...</a></span> </div>";
            tmp += "<p>" + item.getArticle_description() + "</p>";
            tmp += "</li></ul></div>";
            tmp += "<div class=\"business_category_right wow fadeInDown\">";
            tmp += "<ul class=\"small_catg\">";
            for (int i = 1; i < arts.size(); i++) {
                item = arts.get(i);
                tmp += "<li>";
                tmp += "<div class=\"media wow fadeInDown\">";
                tmp += "<a class=\"media-left\" href=\"/home/" + menu +
                        "/?aid=" + item.getArticle_link() +
                        "\">";
                tmp += "<img src=\"" + item.getArticle_image() +
                        "\" alt=\"\"></a>";
                tmp += "<div class=\"media-body\">";
                tmp += "<h4 class=\"media-heading\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">";
                tmp += item.getArticle_title();
                tmp += "</a></h4>";
                tmp +=
                        "<div class=\"comments_box\"> <span class=\"meta_date\">";
                tmp += item.getArticle_last_updated_at();
                tmp += "</span><span class=\"meta_comment\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">";
                for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }
                tmp += " </a></span> <span class=\"meta_more\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">Chi ti\u1EBFt ... </a></span></div > ";
                tmp += "</div></div></li>";

            }
            tmp += "</ul></div></div>";
        }
        return tmp;
    }

    public static String brView(ArrayList<ArticleObject> arts,
            ArrayList<CategoryObject> cates, String menu) {
        int NO = 0;
        String tmp = "";
        tmp += "<div class=\"fashion_category\">";
        tmp += " <div class=\"single_category\">";
        tmp += " <div class=\"single_category wow fadeInDown\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span>";
        for (CategoryObject cate : cates) {
            if (++NO >= 2) {
                break;
            }

            tmp += "<a class=\"title_text\" href=\"/home/" + menu + "/?cid=" +
                    cate.getCategory_id() +
                    "\">";
            tmp += cate.getCategory_name();
            tmp += "</a> </h2>";
        }

        tmp += "<ul class=\"fashion_catgnav wow fadeInDown\">";
        ArticleObject item = null;
        if (arts.size() > 0) {
            item = arts.get(0);

            tmp += "<li><div class=\"catgimg2_container\">";
            tmp += "<a href=\"" +
                    item.getArticle_link() +
                    "\">";
            tmp += " <img alt=\"\" src=\"" + item.getArticle_image() + "\">";
            tmp += "  </a> </div>";
            tmp += "<h2 class=\"catg_titile\"><a href=\"" +
                    item.getArticle_link() +
                    "\">";
            tmp += item.getArticle_title();
            tmp += "</a></h2>";
            tmp += "<div class=\"comments_box\"> <span class=\"meta_date\">";
            tmp += item.getArticle_created_at();
            tmp += "</span> <span class=\"meta_comment\">";
            tmp += "<a href=\"#\">";
            for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }

            tmp += " </a></span> <span class=\"meta_more\">";
            tmp += "<a href=\"" +
                    item.getArticle_link() +
                    "\">Chi ti\u1EBFt...</a></span> </div>";

            tmp += "</li></ul>";
            tmp += "<ul class=\"small_catg wow fadeInDown\">";
            for (int i = 1; i < arts.size(); i++) {
                item = arts.get(i);
                tmp += "<li><div class=\"media wow fadeInDown\">";
                tmp += " <a class=\"media-left\" href=\"" +
                        item.getArticle_link() +
                        "\">";
                tmp += "<img src=\"" + item.getArticle_image() +
                        "\" alt=\"\"></a>";
                tmp += "<div class=\"media-body\"><h4 class=\"media-heading\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">";
                tmp += item.getArticle_title();
                tmp += "</a></h4>";
                tmp +=
                        " <div class=\"comments_box\"> <span class=\"meta_date\">";
                tmp += item.getArticle_created_at();
                tmp += "</span> <span class=\"meta_comment\">";
                tmp += "<a href=\"#\">";
                for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }

                tmp += " </a></span> <span class=\"meta_more\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">Chi ti\u1EBFt...</a></span> </div>";
                tmp += "</div></div></li>";
            }

        }
        tmp += "</ul></div></div></div>";
        return tmp;
    }

    public static String blView(ArrayList<ArticleObject> arts,
            ArrayList<CategoryObject> cates, String menu) {
        int NO = 0;
        String tmp = "";
        tmp += "<div class=\"games_category\">";
        tmp += " <div class=\"single_category\">";
        tmp += " <div class=\"single_category wow fadeInDown\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span>";
        for (CategoryObject cate : cates) {
            if (++NO >= 2) {
                break;
            }

            tmp += "<a class=\"title_text\" href=\"/home/" + menu + "/?cid=" +
                    cate.getCategory_id() +
                    "\">";
            tmp += cate.getCategory_name();
            tmp += "</a> </h2>";
        }

        tmp += "<ul class=\"fashion_catgnav wow fadeInDown\">";
        ArticleObject item = null;
        if (arts.size() > 0) {
            item = arts.get(0);

            tmp += "<li><div class=\"catgimg2_container\">";
            tmp += "<a href=\"" +
                    item.getArticle_link() +
                    "\">";
            tmp += " <img alt=\"\" src=\"" + item.getArticle_image() + "\">";
            tmp += "  </a> </div>";
            tmp += "<h2 class=\"catg_titile\"><a href=\"/home/" + menu +
                    "/?aid=" +
                    item.getArticle_link() +
                    "\">";
            tmp += item.getArticle_title();
            tmp += "</a></h2>";
            tmp += "<div class=\"comments_box\"> <span class=\"meta_date\">";
            tmp += item.getArticle_created_at();
            tmp += "</span> <span class=\"meta_comment\">";
            tmp += "<a href=\"#\">";
            for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }

            tmp += " </a></span> <span class=\"meta_more\">";
            tmp += "<a href=\"" +
                    item.getArticle_link() +
                    "\">Chi ti\u1EBFt...</a></span> </div>";

            tmp += "</li></ul>";
            tmp += "<ul class=\"small_catg wow fadeInDown\">";
            for (int i = 1; i < arts.size(); i++) {
                item = arts.get(i);
                tmp += "<li><div class=\"media wow fadeInDown\">";
                tmp += " <a class=\"media-left\" href=\"" +
                        item.getArticle_link() +
                        "\">";
                tmp += "<img src=\"" + item.getArticle_image() +
                        "\" alt=\"\"></a>";
                tmp += "<div class=\"media-body\"><h4 class=\"media-heading\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">";
                tmp += item.getArticle_title();
                tmp += "</a></h4>";
                tmp +=
                        " <div class=\"comments_box\"> <span class=\"meta_date\">";
                tmp += item.getArticle_created_at();
                tmp += "</span> <span class=\"meta_comment\">";
                tmp += "<a href=\"#\">";
                for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }

                tmp += " </a></span> <span class=\"meta_more\">";
                tmp += "<a href=\"" +
                        item.getArticle_link() +
                        "\">Chi ti\u1EBFt...</a></span> </div>";
                tmp += "</div></div></li>";
            }

        }
        tmp += "</ul></div></div></div>";
        return tmp;
    }

    public static String rView(ArrayList<ArticleObject> arts,
            ArrayList<CategoryObject> cates, String menu) {
        int NO = 0;
        String tmp = "";

        tmp += "<div class=\"single_bottom_rightbar\">";
        for (CategoryObject cate : cates) {
            tmp += "<h2>";
            tmp += cate.getCategory_name();
            tmp += "</h2>";
        }
        tmp += "<ul class=\"small_catg popular_catg wow fadeInDown\">";
        for (ArticleObject art : arts) {

            tmp += "<li>";
            tmp += "<div class=\"media wow fadeInDown\">";
            tmp += "<a href=\"" + art.getArticle_link() +
                    "\" class=\"media-left\">";
            tmp += " <img alt=\"\" src=\"" + art.getArticle_image() + "\"></a>";
            tmp += "<div class=\"media-body\">";
            tmp += "<h4 class=\"media-heading\">";
            tmp += "<a href=\"" +
                    art.getArticle_link() +
                    "\">";
            tmp += art.getArticle_title();
            tmp += "</a></h4>";
            tmp += "<p>" + art.getArticle_description() + "</p>";
            tmp += "</div></div></li>";

        }
        tmp += "</ul></div>";

        return tmp;
    }

    public static String viewArchive(ArrayList<ArticleObject> arts,
            ArrayList<CategoryObject> cates,int count) {
        int total = count;
        String tmp = "";
        tmp += "<div class=\"single_category wow fadeInDown\">";
        tmp += "<div class=\"archive_style_1\">";
        tmp += "<h2> <span class=\"bold_line\"><span></span></span> <span class=\"solid_line\"></span>";
        for (CategoryObject cate : cates) {

            tmp += "<a class=\"title_text\" href=\"" +
                    cate.getCategory_id() +
                    "\">";
            tmp += cate.getCategory_name();
            tmp += "</a> </h2>";
        }
        for (ArticleObject art : arts) {
            tmp += "<div class=\"business_category_left wow fadeInDown\">";
            tmp += "<ul class=\"fashion_catgnav\">";
            tmp += "<li>";
            tmp += "<div class=\"catgimg2_container\">";
            tmp += "<a href=\"" +
                    art.getArticle_link() +
                    "\" class='article' id='"+ art.getArticle_id() +"'>";
            tmp+="<img alt=\"\"  src=\""+art.getArticle_image()+"\" style=\"width:390px; height:240px;\" \"></a></div>";
            tmp+="<h2 class=\"catg_titile\">";
            tmp += "<a href=\"" +
                    art.getArticle_link() +
                    "\">";
            tmp+= art.getArticle_title();
            tmp+="</a></h2>";
            tmp+="<div class=\"comments_box\">";
            tmp+="<span class=\"meta_date\">"+art.getArticle_created_at()+"</span>";
            tmp+="<span class=\"meta_comment\">";
            tmp += "<a href=\"" +
                    art.getArticle_link() +
                    "\">";
            for(CategoryObject cate: cates){
                    tmp += cate.getSource_name();
                }

            tmp+="</a></span>";
            tmp+="<span class=\"meta_more\">";
            tmp += "<a href=\"" +
                        art.getArticle_link() +
                        "\">Chi ti\u1EBFt...</a></span> </div>";
                tmp+="<p style=\"word-warp:break-word;\">";
                tmp+=art.getArticle_description();
                tmp+="</p></li></ul></div>";
        }
        tmp+="</div></div>";
        tmp+="<div class=\"pagination_area\">";
          tmp+="<nav>";
            tmp+="<ul class=\"pagination\">";
              tmp+="<li><a href=\"#\"><span aria-hidden=\"true\">&laquo;</span><span class=\"sr-only\">Previous</span></a></li>";
              for(int i=1;i<=((total/6)+1);i++){
              tmp+="<li><a class=\"pagination-custome\" id=\""+i+"\">"+i+"</a></li>";
              }
              tmp+="<li><a href=\"#\"><span aria-hidden=\"true\">&raquo;</span><span class=\"sr-only\">Next</span></a></li>";
            tmp+="</ul>";
          tmp+="</nav>";
        tmp+="</div></div>";


        return tmp;
    }

}
