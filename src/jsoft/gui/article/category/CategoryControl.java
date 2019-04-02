package jsoft.gui.article.category;

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




    public CategoryObject getCategoryObject(int id) {
        return this.cm.getCategoryObject(id);
    }
    //
    public ArrayList getCateObjects(CategoryObject similar,int at,byte total){
        return this.cm.getCateObjects(similar,1,(byte)6);
    }

    //-----------------------------------------


}
