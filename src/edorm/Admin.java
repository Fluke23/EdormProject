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
     public int createActivity (activityId,activityName,activityPoint,activityDes,activityStatus){
      // เป็น method สำหรับ admin ไว้สร้าง Activity หลังจากนั้นก็เก็บข้อมูลลง Database
      // โดยใช้ parameter เป็น activityId
      return activityId;
      }
        public int deleteActivity (activityId){
      // เป็น method ลบ activity สำหรับ admin โดย สามารถลบ ข้อมูลท้ั้งหมดของ activity นั้น โดย ใช้ paramether เป็น activityId  
      return activityId;
      }
    
      public int updateActivity (activityId){
      // เป็น method update (แก้ไข) Activity สำหรับ admin โดย admin สามารถ แก้ไข ชื่อ Activity , Detail Activity and point Activity โดยดึงข้อมูลจาก Object ของ Acivity ขึ้นมา 
    //จากนั้น ก็แก้ไข แล้วบันทึก หลังจากนั้นข้อมูลทั้งหมดก็ถูกเก็บลง Database 
     // โดยใช้ parameter เป็น activityId
      return activityId;
      }
       
      public int deletePoint (activityId){
      //   เป็น method สำหรับ admin ไว้ ลบ point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId  
      return pointId;
      }
      public int updatePoint (activityId){
      //  เป็น method สำหรับ admin ไว้ update(แก้ไข) point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId หลังจากแก้ไขเสร็จ ข้อมูลใหม่ 
      //จะถูกเก็บลง database และ ถูกดึงึ้นมาโชว์ใหม่ ผ่าน object ของ activity นั้นๆ 
      return pointId;
      }
    
     public int createPacel(){
        // เป็น method สำหรับ admin ไว้สำหรับสร้าง paccel ของที่ถูกส่งมา โดยมีการส่ง studentName และ studentId เป็น parameter
        return pacelId;
      }
    
    public int deletePacel(){
        //หลังจาก กด deleteเสร็จแล้ว ก็ลบข้อมูลใน DB
        return pacelId;
     }
    
    public int  updatePacel(){
        return pacelId;
        //method แทนที่ข้อมูลใหม่ในข้อมูลเดิม 
        
     }

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName=" + adminName + ", adminPosition=" + adminPosition + '}';
    }
   
    
}
