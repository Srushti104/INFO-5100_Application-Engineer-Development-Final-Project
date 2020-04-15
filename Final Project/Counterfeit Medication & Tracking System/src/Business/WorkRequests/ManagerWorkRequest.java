/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequests;

import Business.Drug;
import Business.Package1;

/**
 *
 * @author srush
 */
public class ManagerWorkRequest extends WorkRequest {

    private String result;
    private int licenseNumber;
    LicenseManagerWorkRequest licenseManagerWorkRequest;
    private String problemReported;
    private Drug drug;
    Package1 package1;
    private int packID;
    private String dgName;

    public String getDgName() {
        return dgName;
    }

    public void setDgName(String dgName) {
        this.dgName = dgName;
    }

    public int getPackID() {
        return packID;
    }

    public void setPackID(int packID) {
        this.packID = packID;
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

    public LicenseManagerWorkRequest getLicenseManagerWorkRequest() {
        return licenseManagerWorkRequest;
    }

    public void setLicenseManagerWorkRequest(LicenseManagerWorkRequest licenseManagerWorkRequest) {
        this.licenseManagerWorkRequest = licenseManagerWorkRequest;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProblemReported() {
        return problemReported;
    }

    public void setProblemReported(String problemReported) {
        this.problemReported = problemReported;
    }

}
