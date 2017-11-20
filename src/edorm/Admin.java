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
public class Admin extends User{
    private int adminId; 
    private String adminName;
    private String adminPosition;

    public Admin(int adminId, String adminName, String adminPosition) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPosition = adminPosition;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPosition() {
        return adminPosition;
    }

    public void setAdminPosition(String adminPosition) {
        this.adminPosition = adminPosition;
    }
    
    private void login(String userName,String pass){
        //method เกี่ยวกับการตรวจเช็คว่า Username และpassword ถูกต้องหรือไม่ และมีใน Database หรือเปล่า 
       
    }
     public int createActivity (int activityId,String activityName,int activityPoint,String activityDes,String activityStatus){
      // เป็น method สำหรับ admin ไว้สร้าง Activity หลังจากนั้นก็เก็บข้อมูลลง Database
      // โดยใช้ parameter เป็น activityId
      return activityId;
      }
        public int deleteActivity (int activityId){
      // เป็น method ลบ activity สำหรับ admin โดย สามารถลบ ข้อมูลท้ั้งหมดของ activity นั้น โดย ใช้ paramether เป็น activityId  
      return activityId;
      }
    
      public int updateActivity (int activityId){
      // เป็น method update (แก้ไข) Activity สำหรับ admin โดย admin สามารถ แก้ไข ชื่อ Activity , Detail Activity and point Activity โดยดึงข้อมูลจาก Object ของ Acivity ขึ้นมา 
    //จากนั้น ก็แก้ไข แล้วบันทึก หลังจากนั้นข้อมูลทั้งหมดก็ถูกเก็บลง Database 
     // โดยใช้ parameter เป็น activityId
      return activityId;
      }
       
      public int deletePoint (int activityId){
      //   เป็น method สำหรับ admin ไว้ ลบ point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId  
      return pointId;
      }
      public int updatePoint  (int activityId){
      //  เป็น method สำหรับ admin ไว้ update(แก้ไข) point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId หลังจากแก้ไขเสร็จ ข้อมูลใหม่ 
      //จะถูกเก็บลง database และ ถูกดึงึ้นมาโชว์ใหม่ ผ่าน object ของ activity นั้นๆ 
      return pointId;
      }
    
     public int createPacel(String studentName){
        // เป็น method สำหรับ admin ไว้สำหรับสร้าง pacel ของที่ถูกส่งมา โดยมีการส่ง studentName เป็น parameter
        return pacelId;
      }
    
    public int deletePacel(int pacelId){
        // เป็น method สำหรับ admin ไว้สำหรับลบ pacel  โดยมีการส่ง pacelId เป็น parameter
        return pacelId;
     }
    
    public int  updatePacel(int pacelId){
        //เป็น method สำหรับ admin ไว้สำหรับแก้ไข pacel สำหรับอันที่ต้องการแก้ไขข้อมูล โดยมีการส่ง pacelId เป็น parameter
        return pacelId; 
     }
    
      
    private int createWaterPayment(int paymentId ,String paymentName, int paymentAmountWater,boolean paymentStatus,Date paymentDate ,int studentRoom){
        //method สำหรับ admin ที่ใช้ในการสร้าง payment (ค่าน้ำ ) โดยมีการส่ง paymentId ,paymentName, paymentAmountWater, paymentStatus,  paymentDate ,studentRoom เป็น parameter 
        return paymentId;
    }
    
    private int createPowerPayment(int paymentId ,String paymentName, int paymentAmountPower,String paymentStatus, Date paymentDate ,int studentRoom){
        //method สำหรับ admin ที่ใช้ในการสร้าง payment (ค่าไฟ) โดยมีการส่ง paymentId ,paymentName, paymentAmountPower, paymentStatus,  paymentDate ,studentRoom เป็น parameter 
        return paymentId;
    }
    //----!!---------//
    //เราแยก method ค่าไฟ กับ ค่าน้ำออกจากกัน ทำได้ใช่ไหม. ตอบหน่อยเถอะน้าาาาา. 
     //----!!---------//
  
    
    private int updatePayment(int paymentId){
        //method สำหรับ admin ที่ใช้ในการแก้ไข payment โดยมีการส่ง paymentId เป็น parameter
        return paymentId;
    }
    private int deletePayment(int paymentId){
        //method สำหรับ admin ที่ใช้ในการลบ payment โดยมีการส่ง paymentId เป็น parameter
        return paymentId;
   }

    private int createGeneralForm(int adminId, int generalFormId,String describePurpose,String AdvisorComment){
        //เป็น method สำหรบ admin ใช้ในการสร้าง GeneralForm ขึ้นมา โดยมีกาส่ง adminId, generalFormId,describePurpose,AdvisorComment เป็น parameter;
        return  GeneralFormId;
    }
    
     private int updateGeneralForm(int adminId,int generalFormId){
        //เป็น method สำหรบ admin ใช้ในการอัพเดท GeneralForm ขึ้นมา โดยมีกาส่ง adminId, generalFormId เป็น parameter;
        return  GeneralFormId;
    }
    
     private int deleteGeneralForm(int adminId,int generalFormId){
        //เป็น method สำหรบ admin ใช้ในการลบ GeneralForm ขึ้นมา โดยมีกาส่ง adminId, generalFormId เป็น parameter;
        return  GeneralFormId;
    }
    
     private int createRepairForm(int adminId,int repairFormId,String describeThingRepair,String detailProcessing){
        //เป็น method สำหรับ admin ใช้ในการสร้าง GeneralForm ขึ้นมา โดยมีกาส่ง adminId, repairFormId, describeThingRepair,detailProcessing เป็น parameter;
        return  repairFormId;
    }
    
      private int updateRepairForm(int adminId,int repairFormId){
        //เป็น method สำหรับ admin ใช้ในการแก้ไข repairForm  โดยมีกาส่ง adminId, repairFormId เป็น parameter;
        return  repairFormId;
    }
    
    private int deleteRepairForm(int adminId,int repairFormId){
        //เป็น method สำรับ admin ใช้ในการลบ repairForm  โดยมีกาส่ง adminId, repairFormId เป็น parameter;
        return  repairFormId;
    }
    
   
    
    
    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName=" + adminName + ", adminPosition=" + adminPosition + '}';
    }
   
    
}
///test
