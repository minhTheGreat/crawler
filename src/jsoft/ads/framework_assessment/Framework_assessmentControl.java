package jsoft.ads.framework_assessment;

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
public class Framework_assessmentControl {

    private Framework_assessmentModel fm;


    public Framework_assessmentControl(ConnectionPool cp) {
        this.fm = new Framework_assessmentModel(cp);
    }

    protected void finalize() throws Throwable {
        this.fm = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.fm.getCP();
    }

    public void releaseCon() {
        this.fm.releaseCon();
    }


    //-----------------------------------------

    public boolean addFramework_assessment(Framework_assessmentObject item) {
        return this.fm.addFramework_assessment(item);
    }

    public boolean editFramework_assessment(Framework_assessmentObject item) {
        return this.fm.editFramework_assessment(item);
    }

    public boolean delFramework_assessment(Framework_assessmentObject item) {
        return this.fm.delFramework_assessment(item);
    }

    //-----------------------------------------

    public Framework_assessmentObject getFramework_assessmentObject(int id) {
        return this.fm.getFramework_assessmentObject(id);
    }

    //-----------------------------------------
    public String viewFramework_assessments(AssessmentObject similar, short page,byte total) {

        //Lay danh sach doi tuong
        ArrayList items = this.fm.getFramework_assessmentObjects(similar, page, total);

        //TRa ve cau truc HTML
        return Framework_assessmentLibrary.viewFramework_assessments(items);

    }

}
