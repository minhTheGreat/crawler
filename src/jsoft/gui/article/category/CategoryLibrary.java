package jsoft.gui.article.category;

import jsoft.*;
import jsoft.objects.*;
import java.util.*;
import com.*;

public class CategoryLibrary {
    public CategoryLibrary() {
    }

    public static String viewMenu (ArrayList<CategoryObject> items){
        String tmp ="";
        tmp +="<div id=\"navbar\" class=\"navbar-collapse collapse\">";
        tmp +="<ul class=\"nav navbar-nav custom_nav\">";
        for(CategoryObject item: items){
            tmp+="<li class=\"\"><a href=\"/home/"+item.getCategory_name()+"\">Trang ch\u1EE7</a></li>";
        }
        return tmp;
    }
}
