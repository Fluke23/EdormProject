/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edorm;

import java.util.Date;

/**
 *
 * @author fluke
 */
public class Payment {
    private int paymentId;
    private String paymentName;
    private int  paymentAmountWater;
    private int paymentAmountPower;
    private boolean paymentStatus;
    private Date paymentDate;
    private int studentRoom;

    public Payment(int paymentId, String paymentName, int paymentAmountWater, int paymentAmountPower, boolean paymentStatus, Date paymentDate, int studentRoom) {
        this.paymentId = paymentId;
        this.paymentName = paymentName;
        this.paymentAmountWater = paymentAmountWater;
        this.paymentAmountPower = paymentAmountPower;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.studentRoom = studentRoom;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public int getPaymentAmountWater() {
        return paymentAmountWater;
    }

    public void setPaymentAmountWater(int paymentAmountWater) {
        this.paymentAmountWater = paymentAmountWater;
    }

    public int getPaymentAmountPower() {
        return paymentAmountPower;
    }

    public void setPaymentAmountPower(int paymentAmountPower) {
        this.paymentAmountPower = paymentAmountPower;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getStudentRoom() {
        return studentRoom;
    }

    public void setStudentRoom(int studentRoom) {
        this.studentRoom = studentRoom;
    }
    
   /* ------------------------------*/
    private int getPayment(){
        return paymentId;
 
    private int paymentUtility(){
        // method ไรวะ ลืมม แล้วอันนี้ 
        return paymentId;
    }
    

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", paymentName=" + paymentName + ", paymentAmountWater=" + paymentAmountWater + ", paymentAmountPower=" + paymentAmountPower + ", paymentStatus=" + paymentStatus + ", paymentDate=" + paymentDate + ", studentRoom=" + studentRoom + '}';
    }
    
    
    
            
}
