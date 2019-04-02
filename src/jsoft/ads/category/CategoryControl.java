package jsoft.ads.category;

import jsoft.*;
import jsoft.objects.*;

import java.util.*;

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
public class CategoryControl {

    private CategoryModel cm;


    public CategoryControl(ConnectionPool cp) {
        this.cm = new CategoryModel(cp);
    }

    protected void finalize() throws Throwable {
        this.cm = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.cm.getCP();
    }

    public void releaseCon() {
        this.cm.releaseCon();
    }


    //-----------------------------------------

    public boolean addCategory(CategoryObject item) {
        return this.cm.addCategory(item);
    }

    public boolean editCategory(CategoryObject item) {
        return this.cm.editCategory(item);
    }

    public boolean delCategory(CategoryObject item) {
        return this.cm.delCategory(item);
    }

    //-----------------------------------------

    public CategoryObject getCategoryObject(int id) {
        return this.cm.getCategoryObject(id);
    }

    public CategoryObject getCategoryObject(String name) {
        return this.cm.getCategoryObject(name);
    }

    public ArrayList<CategoryObject> getCategoryObjects(CategoryObject similar, int page, int total) {
        return this.cm.getCategoryObjects(similar, page, total);
    }

    public ArrayList<CategoryObject> getCategoryObjects2(CategoryObject similar, int page, int total) {
        return this.cm.getCategoryObjects2(similar, page, total);
    }

    public ArrayList<CategoryObject> getCategoryObjectsBySource(int id){
        return this.cm.getCategoryObjectsBySource(id);
    }

    public String enableCategory(int id) {
       return this.cm.enableCategory(id);
   }



    //-----------------------------------------
    public String viewCategorys(CategoryObject similar, int page,int total) {

        //Lay danh sach doi tuong
        ArrayList items = this.cm.getCategoryObjects(similar, page, total);

        //TRa ve cau truc HTML
        return CategoryLibrary.viewCategorys(items);

    }

    public String viewSources(CategoryObject similar, int page,int total) {

       //Lay danh sach doi tuong
       ArrayList items = this.cm.getCategoryObjects2(similar, page, total);

       //TRa ve cau truc HTML
       return CategoryLibrary.viewSources(items);

   }

   public String viewCategoryObjectById(int id){
       CategoryObject category = cm.getCategoryObject(id);
       return CategoryLibrary.viewCategoryEdit(category);
   }
}
