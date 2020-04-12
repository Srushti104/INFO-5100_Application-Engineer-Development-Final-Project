/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author srush
 */
public class InventoryItem {
    
    
    private String drugName;
    private int drugID;
    private int quantity=0;
    private Date dateOfPurchase;
    private Drug drug;
    private Package1 package1;

    public InventoryItem() {
        
        dateOfPurchase=new Date();
    }

    public Package1 getPackage1() {
        return package1;
    }

    public void setPackage1(Package1 package1) {
        this.package1 = package1;
    }
    
    

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
    
    
    

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        dateOfPurchase=new Date();
    }
    
    @Override
    public String toString()
    {
        return drug.getDrugName();
    }
    
    
}
