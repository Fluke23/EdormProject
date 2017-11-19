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
 
public String describeThingRepair(repairFormId){
      // method สำหรับให้ Student อธิบายสิ่งของที่เสีย ที่ต้องการซ่อมแซม โดยมี parameter คือ repairFormId
      return  describeThingRepair;
      }
public String DetailProcessing (repairFormId){
      // method สำหรับให้ผู้ดูแลการซ่อม(พนังงานหรือช่างซ่อม) อธิบายการดำเนินการซ่อมแซม โดยมีการส่ง parameter เป็น repairFormId
      return DetailProcessing;
      }
    
    //ต้องเพิ่ม repairFormId ด้วยนะ    อย่าลืมม และแก้ใน UML ด้วย 
    
    
    
    
    
   
    
}
