package jsoft.objects;

public class ArticleObject extends CategoryObject{
    private int article_id;
    private String article_author;
    private String article_title;
    private String article_description;
    private String article_image;
    private String article_link;
    private int article_viewer;
    private boolean article_enable;
    private int article_censor;
    private String article_created_at;
    private String article_last_updated_at;
    private int article_evaluation_point;
    private int article_category_id;
    private int article_last_updator_id;
    private boolean article_delete;
    private String article_last_updator_name;
    public ArticleObject() {
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setArticle_author(String article_author) {
        this.article_author = article_author;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public void setArticle_description(String article_description) {
        this.article_description = article_description;
    }

    public void setArticle_image(String article_image) {
        this.article_image = article_image;
    }

    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public void setArticle_viewer(int article_viewer) {
        this.article_viewer = article_viewer;
    }

    public void setArticle_enable(boolean article_enable) {
        this.article_enable = article_enable;
    }

    public void setArticle_censor(int article_censor) {
        this.article_censor = article_censor;
    }

    public void setArticle_created_at(String article_created_at) {
        this.article_created_at = article_created_at;
    }

    public void setArticle_last_updated_at(String article_last_updated_at) {
        this.article_last_updated_at = article_last_updated_at;
    }

    public void setArticle_evaluation_point(int article_evaluation_point) {
        this.article_evaluation_point = article_evaluation_point;
    }

    public void setArticle_category_id(int article_category_id) {

        this.article_category_id = article_category_id;
    }

    public void setArticle_last_updator_id(int article_last_updator_id) {
        this.article_last_updator_id = article_last_updator_id;
    }

    public void setArticle_delete(boolean article_delete) {
        this.article_delete = article_delete;
    }

    public void setArticle_last_updator_name(String article_last_updator_name) {
        this.article_last_updator_name = article_last_updator_name;
    }

    public int getArticle_id() {
        return article_id;
    }

    public String getArticle_author() {
        return article_author;
    }

    public String getArticle_title() {
        return article_title;
    }

    public String getArticle_description() {
        return article_description;
    }

    public String getArticle_image() {
        return article_image;
    }

    public String getArticle_link() {
        return article_link;
    }

    public int getArticle_viewer() {
        return article_viewer;
    }

    public boolean isArticle_enable() {
        return article_enable;
    }

    public int getArticle_censor() {
        return article_censor;
    }

    public String getArticle_created_at() {
        return article_created_at;
    }

    public String getArticle_last_updated_at() {
        return article_last_updated_at;
    }

    public int getArticle_evaluation_point() {
        return article_evaluation_point;
    }

    public int getArticle_category_id() {

        return article_category_id;
    }

    public int getArticle_last_updator_id() {
        return article_last_updator_id;
    }

    public boolean isArticle_delete() {
        return article_delete;
    }

    public String getArticle_last_updator_name() {
        return article_last_updator_name;
    }
}
