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
      public int getActivity (int studentId){
      // เป็น method ไว้ดูคะแนนโดยเมื่อ user กดเข้าไป จะทำการดึงค่าคะแนนรวมของ Object Student และลิสขัอมูลกิจกรรมต่างๆ มาจาก Object ของ Activity" 
      // โดยใช้ parameter เป็น studentId
      return activityId;
      }
      
      public int getPoint (int studentId){
      // เป็น method ไว้ดึงคะแนนขึ้นมาโชว์บน activity  โดยเมื่อ user กดเข้าไปดูใน หน้า Activity ก็จะทำการดึงข้อมูลของ point นั้นๆ ของแต่ละ activity มาจาก 
          // object ของ activity   ใช้ parameter เป็น studentId
      return pointId;
      }
      
      
      
     
    @Override
    public String toString() {
        return "Activity{" + "activityId=" + activityId + ", acctivityPoint=" + acctivityPoint + ", pointId=" + pointId + ", activityName=" + activityName + ", activityDesc=" + activityDesc + ", activityStatus=" + activityStatus + '}';
    }
    
}
