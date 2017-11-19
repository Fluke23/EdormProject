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
  

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName=" + adminName + ", adminPosition=" + adminPosition + '}';
    }
   
    
}
