/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequests;

import Business.Drug;
import Business.Enterprise;
import Business.Package1;

/**
 *
 * @author srush
 */
public class DrugTesterWorkRequest extends WorkRequest {

    private String resultTest;
    private Drug drug;
    private Enterprise enterprise;
    private Package1 package1;
    private int packID;

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

    public String getResultTest() {
        return resultTest;
    }

    public void setResultTest(String resultTest) {
        this.resultTest = resultTest;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

}
