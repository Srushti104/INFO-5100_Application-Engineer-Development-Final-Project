/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class WareHouseManagerWorkRequest extends WorkRequest{
    
    
     private String result;
     private Drug drug;
     private Order order;
   // private int licenseNumber;
   // LicenseManagerWorkRequest licenseManagerWorkRequest;
  //  private int quant;
   // private String manuName;
   // private String drName;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

     
     
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
     
     
     
 
    
}
