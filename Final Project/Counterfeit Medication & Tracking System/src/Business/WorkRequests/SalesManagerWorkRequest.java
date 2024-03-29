/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequests;

import Business.Drug;
import Business.Order;

/**
 *
 * @author nived
 */
public class SalesManagerWorkRequest extends WorkRequest {

    private String result;
    // private int licenseNumber;
    WarehouseManagerWorkRequest wareHouseManagerWorkRequest;
    private int quant;
    private String manuName;
    private String drName;
    private Drug drug;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public WarehouseManagerWorkRequest getWareHouseManagerWorkRequest() {
        return wareHouseManagerWorkRequest;
    }

    public void setWareHouseManagerWorkRequest(WarehouseManagerWorkRequest wareHouseManagerWorkRequest) {
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
