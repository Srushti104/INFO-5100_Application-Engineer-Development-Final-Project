/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequests;

import Business.Drug;

/**
 *
 * @author srush
 */
public class ReturnProcessorWorkRequest extends WorkRequest {

    private String result;

    private int quant;
    private String manuName;
    private String drName;
    private Drug drug;
    private Package package1;

    public Package getPackage() {
        return package1;
    }

    public void setPackage(Package package1) {
        this.package1 = package1;
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
