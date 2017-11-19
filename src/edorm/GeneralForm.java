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
    private int GeneralFormId;

    

   

    public GeneralForm(String describePurpose, String AdvisorComment, int GeneralFormId, String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
        this.describePurpose = describePurpose;
        this.AdvisorComment = AdvisorComment;
        this.GeneralFormId = GeneralFormId;
    }
    
    
    public GeneralForm(String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
    }
    
    public int getGeneralFormId() {
        return GeneralFormId;
    }

    public void setGeneralFormId(int GeneralFormId) {
        this.GeneralFormId = GeneralFormId;
    }

    public String getDescribePurpose(int generalFormId) {
        // method สำหรับให้ Student กรอกข้อมูลจุดประสลค์ของเรื่องที่จะ ส่งคำร้องทั่วไป โดยมี parameter คือ formGeneralId
        return describePurpose;
    }

    public void setDescribePurpose(String describePurpose) {
        this.describePurpose = describePurpose;
    }

    public String getAdvisorComment(String GeneralFormlId) {
         // method สำหรับให้ advosor กรอกข้อมูลถึงคำแนะนำหรือคอมเม้น  โดยมี parameter คือ formGeneralId
        return AdvisorComment;
    }

    public void setAdvisorComment(String AdvisorComment) {
        this.AdvisorComment = AdvisorComment;
    }
public int getGeneralForm(int studentId){
        //เป็น method ไว้สำหรับ ให้ student ดึงข้อมูลของหน้า generalForm  โดยเมื่อ user เข้ามาแอพพลิเคชั่นและกด แบบฟอร์มออนไลน์ หลังจากนั้นกด แบบฟอร์มคำร้องทั่วไป 
        // ก็จะมีการดึงข้อมูลจากรูปแบบฟอร์มคำร้องทั่วไป ขึ้นมาโชว์ โดยมีการส่ง studentId เป็น parameter 
        return GeneralFormId;
    }
    
   
     
    
    @Override
    public String toString() {
        return "GeneralForm{" + "describePurpose=" + describePurpose + ", AdvisorComment=" + AdvisorComment + ", GeneralFormId=" + GeneralFormId + '}';
    }
    //เพิ่ม generalFormId และแก้ใน UML ด้วยนะ 
    
    
}
