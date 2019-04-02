package jsoft.ads.assessment;

import jsoft.*;
import jsoft.objects.*;
import java.sql.*;

public interface Assessment extends ShareControl {

    //Cac chuc nang cap nhat nguoi su dung
   public boolean addAssessment(AssessmentObject item);
   public boolean editAssessment(AssessmentObject item);
   public boolean delAssessment(AssessmentObject item);

   //Cac chuc nang lay du lieu
   public ResultSet getAssessment(int id);
   public ResultSet getAssessments(AssessmentObject similar, int at, byte total);

}
