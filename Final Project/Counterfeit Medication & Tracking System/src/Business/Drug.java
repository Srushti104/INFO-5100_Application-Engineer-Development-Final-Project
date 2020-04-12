/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nived
 */
public class Drug {
    
    
    private String drugName;
    private String manDate;
    private String expdate;
    private int ceilingPrice;
    private int floorPrice;
    private int actualPrice;
    private String manName;
    private String drugMg;
    private String drugFor;
    private String drugContents;
    private int drugID;
    private static int count=0;

    public Drug() {
        
        count++;
        drugID=count;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManDate() {
        return manDate;
    }

    public void setManDate(String manDate) {
        this.manDate = manDate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getDrugMg() {
        return drugMg;
    }

    public void setDrugMg(String drugMg) {
        this.drugMg = drugMg;
    }

    public String getDrugFor() {
        return drugFor;
    }

    public void setDrugFor(String drugFor) {
        this.drugFor = drugFor;
    }

    public String getDrugContents() {
        return drugContents;
    }

    public void setDrugContents(String drugContents) {
        this.drugContents = drugContents;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Drug.count = count;
    }
    
    public String toString()
    {
        return drugName;
    }
            
    
    
    
    
}
