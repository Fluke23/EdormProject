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
  

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName=" + adminName + ", adminPosition=" + adminPosition + '}';
    }
   
    
}
