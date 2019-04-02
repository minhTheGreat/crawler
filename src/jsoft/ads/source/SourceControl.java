package jsoft.ads.source;

import jsoft.*;
import jsoft.objects.*;
import jsoft.ads.assessment_rule.Assessment_ruleModel;
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
public class SourceControl {

    private SourceModel sm;
    private Assessment_ruleModel arm;

    public SourceControl(ConnectionPool cp) {
        this.sm = new SourceModel(cp);
    }

    protected void finalize() throws Throwable {
        this.sm = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.sm.getCP();
    }

    public void releaseCon() {
        this.sm.releaseCon();
    }


    //-----------------------------------------

    public boolean addSource(SourceObject item) {
        return this.sm.addSource(item);
    }

    public boolean editSource(SourceObject item) {
        return this.sm.editSource(item);
    }

    public boolean delSource(SourceObject item) {
        return this.sm.delSource(item);
    }

    public String enableSource(int id){
        return this.sm.enable(id);
    }

    //-----------------------------------------

    public SourceObject getSourceObject(int id) {
        return this.sm.getSourceObject(id);
    }

    public SourceObject getSourceObject(String name) {
       return this.sm.getSourceObject(name);
   }

   public ArrayList getSourceObjects(CategoryObject similar, int page, int total) {
        return this.sm.getSourceObjects(similar, page, total);
    }

    public ArrayList getAssessment_ruleObjects(Assessment_ruleObject similar, int page, byte total) {
        return this.arm.getAssessment_ruleObjects(similar, page, total);
    }

    //-----------------------------------------
    public String viewSources(SourceObject similar, int page,int total) {

        //Lay danh sach doi tuong
        ArrayList items = this.sm.getSourceObjects(similar, page, total);

        //TRa ve cau truc HTML
        return SourceLibrary.viewSources(items);
    }

    public String viewSourceNew(ArrayList<Assessment_ruleObject> items){
        return SourceLibrary.viewSourceNew(items);
    }

    public String viewSourceShow(ArrayList<CategoryObject> items){
        return SourceLibrary.viewSourceShow(items);
    }

    public String viewSourceEdit(ArrayList<CategoryObject> items){
        return SourceLibrary.viewSourceEdit(items);
    }
}
