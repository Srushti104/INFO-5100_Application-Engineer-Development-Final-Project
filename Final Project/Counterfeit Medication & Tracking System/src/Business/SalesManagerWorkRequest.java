/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class SalesManagerWorkRequest extends WorkRequest {

    private String result;
    // private int licenseNumber;
    WarehouseManagerWorkRequest warehouseManagerWorkRequest;
    private int quant;
    private String manuName;
    private String drName;
    private String drug;

    public WarehouseManagerWorkRequest getWarehouseManagerWorkRequest() {
        return warehouseManagerWorkRequest;
    }

    public void setWarehouseManagerWorkRequest(WarehouseManagerWorkRequest warehouseManagerWorkRequest) {
        this.warehouseManagerWorkRequest = warehouseManagerWorkRequest;
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

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

}
