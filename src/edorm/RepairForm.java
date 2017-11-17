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
public class RepairForm extends Form{
    private String describeThingRepair;
    private String DetailProcessing ; //for admin or repair man  
    public RepairForm(String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
    }

    public String getDescribeThingRepair() {
        return describeThingRepair;
    }

    public void setDescribeThingRepair(String describeThingRepair) {
        this.describeThingRepair = describeThingRepair;
    }

    public String getDetailProcessing() {
        return DetailProcessing;
    }

    public void setDetailProcessing(String DetailProcessing) {
        this.DetailProcessing = DetailProcessing;
    }

    public RepairForm(String describeThingRepair, String DetailProcessing, String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
        this.describeThingRepair = describeThingRepair;
        this.DetailProcessing = DetailProcessing;
    }

    @Override
    public String toString() {
        return "RepairForm{" + "describeThingRepair=" + describeThingRepair + ", DetailProcessing=" + DetailProcessing + '}';
    }
 
public String describeThingRepair(){
      // method รวมข้อมูลของ point  ของdata base
      return  describeThingRepair;
      }
public String DetailProcessing (){
      // method รวมข้อมูลของ point  ของdata base
      return DetailProcessing;
      }
    
    
    
    
    
    
   
    
}
