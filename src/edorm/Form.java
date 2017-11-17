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
public class Form {
  
    private String stdFac;
    private String stdDepart;
    private int RoomNumber;
    private String stdEmail;

    public String getStdFac() {
        return stdFac;
    }

    public void setStdFac(String stdFac) {
        this.stdFac = stdFac;
    }

    public String getStdDepart() {
        return stdDepart;
    }

    public void setStdDepart(String stdDepart) {
        this.stdDepart = stdDepart;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }
   

    

public  String stdFac (){
      // method รวมข้อมูลของ point  ของdata base
      return  stdFac;
      }
public  String stdDepart (){
      // method รวมข้อมูลของ point  ของdata base
      return  stdDepart;
      }
public  int RoomNumber (){
      // method รวมข้อมูลของ point  ของdata base
      return  RoomNumber;
      }
public String stdEmail(){
      // method รวมข้อมูลของ point  ของdata base
      return stdEmail;
      }

    public Form(String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        this.stdFac = stdFac;
        this.stdDepart = stdDepart;
        this.RoomNumber = RoomNumber;
        this.stdEmail = stdEmail;
   
    }

    @Override
    public String toString() {
        return "Form{" + "stdFac=" + stdFac + ", stdDepart=" + stdDepart + ", RoomNumber=" + RoomNumber + ", stdEmail=" + stdEmail + '}';
    }
    
}

   