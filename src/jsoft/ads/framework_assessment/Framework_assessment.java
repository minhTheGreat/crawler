package jsoft.ads.framework_assessment;
import java.sql.*;
import jsoft.objects.*;
import jsoft.ShareControl;

public interface Framework_assessment extends ShareControl {

    //Cac chuc nang cap nhat nguoi su dung
    public boolean addFramework_assessment(Framework_assessmentObject item);
    public boolean editFramework_assessment(Framework_assessmentObject item);
    public boolean delFramework_assessment(Framework_assessmentObject item);

    //Cac chuc nang lay du lieu
    public ResultSet getFramework_assessment(int id);
    public ResultSet getFramework_assessments(Framework_assessmentObject similar, int at, byte total);

}
