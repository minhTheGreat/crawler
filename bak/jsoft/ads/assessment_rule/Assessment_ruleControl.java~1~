package jsoft.ads.assessment;

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
public class AssessmentControl {

    private AssessmentModel am;


    public AssessmentControl(ConnectionPool cp) {
        this.am = new AssessmentModel(cp);
    }

    protected void finalize() throws Throwable {
        this.am = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.am.getCP();
    }

    public void releaseCon() {
        this.am.releaseCon();
    }


    //-----------------------------------------

    public boolean addAssessment(AssessmentObject item) {
        return this.am.addAssessment(item);
    }

    public boolean editAssessment(AssessmentObject item) {
        return this.am.editAssessment(item);
    }

    public boolean delAssessment(AssessmentObject item) {
        return this.am.delAssessment(item);
    }

    //-----------------------------------------

    public AssessmentObject getAssessmentObject(int id) {
        return this.am.getAssessmentObject(id);
    }

    //-----------------------------------------
    public String viewAssessments(AssessmentObject similar, short page,byte total) {

        //Lay danh sach doi tuong
        ArrayList items = this.am.getAssessmentObjects(similar, page, total);

        //TRa ve cau truc HTML
        return AssessmentLibrary.viewAssessments(items);

    }

}
