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
    
    
    
    public void createPacel(){
        //หลังจากสร้าง pacel เสร็จแล้ว ก็เก็บข้อมูลลง DB
    }
    
    public void deletePacel(){
        //หลังจาก กด deleteเสร็จแล้ว ก็ลบข้อมูลใน DB
    }
    
    public int  updatePacel(){
        return pacelId;
        //method แทนที่ข้อมูลใหม่ในข้อมูลเดิม 
    }
    
   

    @Override
    public String toString() {
        return "Pacel{" + "pacelId=" + pacelId + ", pacelType=" + pacelType + ", studentName=" + studentName + '}';
    }
    
    
}
