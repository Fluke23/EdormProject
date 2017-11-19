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
public class Pacel {
    private int pacelId;
    private String pacelType;
    private String studentName;

    public Pacel(int pacelId, String pacelType, String studentName) {
        this.pacelId = pacelId;
        this.pacelType = pacelType;
        this.studentName = studentName;
    }
    
    

    public int getPacelId() {
        return pacelId;
    }

    public void setPacelId(int pacelId) {
        this.pacelId = pacelId;
    }

    public String getPacelType() {
        return pacelType;
    }

    public void setPacelType(String pacelType) {
        this.pacelType = pacelType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
     public int getPacel(String studentName){
        //เป็น method ไว้สำหรับให้ User เข้ามาดู pacel ของตัวเอง โดยเมื่อ .user ทำการเข้าแอพพลิเคชั่น กด เช็คพัสดุ จะทำการ ดึงข้อมูลจาห object pacel ใน
         //database ขึ้นมาโชว์ . โดยมีการใช้ . studentName เป็น parameter
        return pacelId;
    }
  
   

    @Override
    public String toString() {
        return "Pacel{" + "pacelId=" + pacelId + ", pacelType=" + pacelType + ", studentName=" + studentName + '}';
    }
    
    
}
