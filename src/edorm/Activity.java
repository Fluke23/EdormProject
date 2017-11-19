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
public class Activity {
    private int activityId;
    private int acctivityPoint;
    private int pointId;
    private String activityName;
    private String activityDesc;
    private boolean activityStatus; 

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getAcctivityPoint() {
        return acctivityPoint;
    }

    public void setAcctivityPoint(int acctivityPoint) {
        this.acctivityPoint = acctivityPoint;
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public boolean isActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(boolean activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Activity(int activityId, int acctivityPoint, int pointId, String activityName, String activityDesc, boolean activityStatus) {
        this.activityId = activityId;
        this.acctivityPoint = acctivityPoint;
        this.pointId = pointId;
        this.activityName = activityName;
        this.activityDesc = activityDesc;
        this.activityStatus = activityStatus;
    }
      public int getActivity (){
      // เป็น method ไว้ดูคะแนนโดยเมื่อ user กดเข้าไป จะทำการดึงค่าคะแนนรวมของ Object Student และลิสขัอมูลกิจกรรมต่างๆ มาจาก Object ของ Activity"
      //
      return activityId;
      }
       public int updateActivity (){
      // เป็น method update (แก้ไข) Activity สำหรับ admin โดย admin สามารถ แก้ไข ชื่อ Activity , Detail Activity and point Activity โดยดึงข้อมูลจาก Object ของ Acivity ขึ้นมา 
//    //จากนั้น ก็แก้ไข แล้วบันทึก หลังจากนั้นข้อมูลทั้งหมดก็ถูกเก็บลง Database 
      return activityId;
      }
        public int createActivity (){
      // เป็น method สำหรับ admin ไว้สร้าง Activity หลังจากนั้นก็เก็บข้อมูลลง Database
      return activityId;
      }
        public int deleteActivity (){
      // เป็น method ลบ activity สำหรับ admin โดย สามารถลบ ข้อมูลท้ั้งหมดของ activity นั้น โดย ใช้ paramether เป็น activityId  
      return activityId;
      }
      public int getPoint (){
      // เป็น method ไว้ดึงคะแนนขึ้นมาโชว์บน activity  โดยเมื่อ user กดเข้าไปดูใน หน้า Activity ก็จะทำการดึงข้อมูลของ point นั้นๆ ของแต่ละ activity มาจาก 
          // object ของ activity 
      return pointId;
      }
      public int addPoint (){
      // เป็น method สำหรับ admin ไว้ เพิ่ม point สำหรับactivity นั้นๆ โดยใช้ parameter เป็น activityId 
      return pointId;
      }
      public int deletePoint (){
      //   เป็น method สำหรับ admin ไว้ ลบ point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId  
      return pointId;
      }
      public int updatePoint (){
      //  เป็น method สำหรับ admin ไว้ update(แก้ไข) point สำหรับ activity นั้นๆ โดยใช้ parameter เป็น activityId หลังจากแก้ไขเสร็จ ข้อมูลใหม่ 
      //จะถูกเก็บลง database และ ถูกดึงึ้นมาโชว์ใหม่ ผ่าน object ของ activity นั้นๆ 
      return pointId;
      }
      public int pointAmount (){
      // เป็น method ไว้คำนวน point ทั้งหมด ของทุก activity ใน user นั้นๆ โดยส่ง parameter เป็น studentId  
      return pointId;
      }
    @Override
    public String toString() {
        return "Activity{" + "activityId=" + activityId + ", acctivityPoint=" + acctivityPoint + ", pointId=" + pointId + ", activityName=" + activityName + ", activityDesc=" + activityDesc + ", activityStatus=" + activityStatus + '}';
    }
    
}
