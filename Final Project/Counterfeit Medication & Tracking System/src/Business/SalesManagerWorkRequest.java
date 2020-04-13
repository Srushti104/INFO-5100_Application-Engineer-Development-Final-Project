/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class SalesManagerWorkRequest extends WorkRequest{
    
    
     private String result;
   // private int licenseNumber;
    WareHouseManagerWorkRequest wareHouseManagerWorkRequest;
    private int quant;
    private String manuName;
    private String drName;
    private Drug drug;

    public WareHouseManagerWorkRequest getWareHouseManagerWorkRequest() {
        return wareHouseManagerWorkRequest;
    }

    public void setWareHouseManagerWorkRequest(WareHouseManagerWorkRequest wareHouseManagerWorkRequest) {
        this.wareHouseManagerWorkRequest = wareHouseManagerWorkRequest;
    }
    
    

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
    
    
 
    
}
