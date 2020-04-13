/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nived
 */
public class ProductManagerWorkRequest extends WorkRequest{
    
    
    private String result;
    private int licenseNumber;
    LicenseManagerWorkRequest licenseManagerWorkRequest;
    private int quant;
    private String manuName;
    private String drName;
    
    
    
    

    public LicenseManagerWorkRequest getLicenseManagerWorkRequest() {
        return licenseManagerWorkRequest;
    }

    public void setLicenseManagerWorkRequest(LicenseManagerWorkRequest licenseManagerWorkRequest) {
        this.licenseManagerWorkRequest = licenseManagerWorkRequest;
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

    
    
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    
    
    
}
