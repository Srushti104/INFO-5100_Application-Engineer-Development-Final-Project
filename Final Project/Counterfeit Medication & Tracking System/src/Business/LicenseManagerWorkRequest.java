/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class LicenseManagerWorkRequest extends WorkRequest{
    
    private String result;
    private String drugManu;
    private String manuName;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDrugManu() {
        return drugManu;
    }

    public void setDrugManu(String drugManu) {
        this.drugManu = drugManu;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }
    
    
    
}
