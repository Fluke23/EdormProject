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
public class Student {
    private int stdId;
    private String stdName;
    private int stdYear;
    private String stdAddress;
    private int stdPhone;
     private int point_amount;

   public Student(int stdId, String stdName, int stdYear, String stdAddress, int stdPhone, int point_amount) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdYear = stdYear;
        this.stdAddress = stdAddress;
        this.stdPhone = stdPhone;
        this.point_amount = point_amount;
    }


    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public int getStdPhone() {
        return stdPhone;
    }

    public void setStdPhone(int stdPhone) {
        this.stdPhone = stdPhone;
    }

   

   
   
    private void login(String userName,String pass){
        //method เกี่ยวกับการตรวจเช็คว่า Username และpassword ถูกต้องหรือไม่ และมีใน Database หรือเปล่า 

    }
    public int getPoint_amount() {
        //method แสดงคะแนนกิจกรรมที่นักศึกษาเคยทำมทั้งหมด โดยจะแสดงรายการกิจกรรมที่เคยเข้าจาก Object ของ class activity
    }

   

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName + ", stdYear=" + stdYear + ", stdAddress=" + stdAddress + ", stdPhone=" + stdPhone + ", stdActivityPoint=" + stdActivityPoint + ", stdActivityAmount=" + stdActivityAmount + '}';
    }
    
    
}
