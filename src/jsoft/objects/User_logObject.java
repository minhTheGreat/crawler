package jsoft.objects;

public class User_logObject {
    private int ul_id;
    private int ul_user_id;
    private int ul_arrticle_id;
    private int ul_category_id;
    private int ul_source_id;
    private String ul_viewed_at;
    public User_logObject() {
    }


    public void setUl_id(int ul_id) {
        this.ul_id = ul_id;
    }

    public void setUl_user_id(int ul_user_id) {
        this.ul_user_id = ul_user_id;
    }

    public void setUl_arrticle_id(int ul_arrticle_id) {
        this.ul_arrticle_id = ul_arrticle_id;
    }

    public void setUl_category_id(int ul_category_id) {
        this.ul_category_id = ul_category_id;
    }

    public void setUl_source_id(int ul_source_id) {
        this.ul_source_id = ul_source_id;
    }

    public void setUl_viewed_at(String ul_viewed_at) {
        this.ul_viewed_at = ul_viewed_at;
    }

    public int getUl_id() {
        return ul_id;
    }

    public int getUl_user_id() {
        return ul_user_id;
    }

    public int getUl_arrticle_id() {
        return ul_arrticle_id;
    }

    public int getUl_category_id() {
        return ul_category_id;
    }

    public int getUl_source_id() {
        return ul_source_id;
    }

    public String getUl_viewed_at() {
        return ul_viewed_at;
    }
}
