/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class Package1 {
    
    Drug drug;
    private static int count=0;
    private int packageID;
    private String packageStatus;
    private int manuLotID;
    private int disLotID;
    private int hosID;

    public int getHosID() {
        return hosID;
    }

    public void setHosID(int hosID) {
        this.hosID = hosID;
    }
    
    

    public int getManuLotID() {
        return manuLotID;
    }

    public void setManuLotID(int manuLotID) {
        this.manuLotID = manuLotID;
    }

    public int getDisLotID() {
        return disLotID;
    }

    public void setDisLotID(int disLotID) {
        this.disLotID = disLotID;
    }
    

    

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }
    
    

    public Package1() {
        
        count++;
        packageID=count;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }
    
    
    
  public String toString()
  {
      
      return drug.getDrugName();
  }
    
    
    
    
}
