/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edorm;

/**
 *
 * @author fluke
 */
public class GeneralForm extends Form{
    
    private String describePurpose; 
    private String AdvisorComment;

    public GeneralForm(String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
    }

    public GeneralForm(String describePurpose, String AdvisorComment, String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
        this.describePurpose = describePurpose;
        this.AdvisorComment = AdvisorComment;
    }

    public String getDescribePurpose() {
        return describePurpose;
    }

    public void setDescribePurpose(String describePurpose) {
        this.describePurpose = describePurpose;
    }

    public String getAdvisorComment() {
        return AdvisorComment;
    }

    public void setAdvisorComment(String AdvisorComment) {
        this.AdvisorComment = AdvisorComment;
    }

    @Override
    public String toString() {
        return "GeneralForm{" + "describePurpose=" + describePurpose + ", AdvisorComment=" + AdvisorComment + '}';
    }
    public String describePurpose(){
      // method รวมข้อมูลของ point  ของdata base
      return  describePurpose;
      }
public String AdvisorComment (){
      // method รวมข้อมูลของ point  ของdata base
      return AdvisorComment;
      }
    
    
}
