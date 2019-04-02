package jsoft.ads.assessment_rule;

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
public class Assessment_ruleControl {

    private Assessment_ruleModel arm;


    public Assessment_ruleControl(ConnectionPool cp) {
        this.arm = new Assessment_ruleModel(cp);
    }

    protected void finalize() throws Throwable {
        this.arm = null;
        super.finalize();
    }

    public ConnectionPool getCP() {
        return this.arm.getCP();
    }

    public void releaseCon() {
        this.arm.releaseCon();
    }


    //-----------------------------------------

    public boolean addAssessment_rule(Assessment_ruleObject item) {
        return this.arm.addAssessment_rule(item);
    }

    public boolean editAssessment_rule(Assessment_ruleObject item) {
        return this.arm.editAssessment_rule(item);
    }

    public boolean delAssessment_rule(Assessment_ruleObject item) {
        return this.arm.delAssessment_rule(item);
    }

    //-----------------------------------------

    public Assessment_ruleObject getAssessment_ruleObject(int id) {
        return this.arm.getAssessment_ruleObject(id);
    }

    public ArrayList getAssessment_ruleObjects(Assessment_ruleObject similar, short page,byte total) {
        return this.arm.getAssessment_ruleObjects(similar, page, total);
    }


    //-----------------------------------------
    public String viewAssessment_rules(Assessment_ruleObject similar, short page,byte total) {

        //Lay danh sach doi tuong
        ArrayList items = this.arm.getAssessment_ruleObjects(similar, page, total);

        //TRa ve cau truc HTML
        return Assessment_ruleLibrary.viewAssessment_rules(items);

    }

}
