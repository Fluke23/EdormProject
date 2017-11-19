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
    private int RepairFormId;
    private String DetailProcessing ;

    public RepairForm(String describeThingRepair, int RepairFormId, String DetailProcessing, String stdFac, String stdDepart, int RoomNumber, String stdEmail, String Describe) {
        super(stdFac, stdDepart, RoomNumber, stdEmail, Describe);
        this.describeThingRepair = describeThingRepair;
        this.RepairFormId = RepairFormId;
        this.DetailProcessing = DetailProcessing;
    }

    public String getDescribeThingRepair() {
        return describeThingRepair;
    }

    public void setDescribeThingRepair(String describeThingRepair) {
        this.describeThingRepair = describeThingRepair;
    }

    public int getRepairFormId() {
        return RepairFormId;
    }

    public void setRepairFormId(int RepairFormId) {
        this.RepairFormId = RepairFormId;
    }

    public String getDetailProcessing() {
        return DetailProcessing;
    }

    public void setDetailProcessing(String DetailProcessing) {
        this.DetailProcessing = DetailProcessing;
    }
   
    
    
    public String getRepairForm(studentId){
        //เป็น method ไว้สำหรับ ให้ student ดึงข้อมูลของหน้า repairForm  โดยเมื่อ user เข้ามาแอพพลิเคชั่นและกด แบบฟอร์มออนไลน์ หลังจากนั้นกด ฟอร์มการซ่อม 
        // ก็จะมีการดึงข้อมูลจากรูปแบบฟอร์มการซ่อม ขึ้นมาโชว์ โดยมีการส่ง studentId เป็น parameter 
        return repairFormId;
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

    @Override
    public String toString() {
        return "RepairForm{" + "describeThingRepair=" + describeThingRepair + ", RepairFormId=" + RepairFormId + ", DetailProcessing=" + DetailProcessing + '}';
    }
    
    
    
    
    
   
    
}
