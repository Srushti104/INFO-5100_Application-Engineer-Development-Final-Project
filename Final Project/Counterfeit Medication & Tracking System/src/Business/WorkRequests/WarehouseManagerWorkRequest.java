/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequests;

import Business.Drug;
import Business.Order;

/**
 *
 * @author bobba
 */
public class WarehouseManagerWorkRequest extends WorkRequest {

    private String result;
    private Drug drug;
    private Order order;
    private String drName;

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }
    private SalesManagerWorkRequest salesManagerWorkRequest;

    public SalesManagerWorkRequest getSalesManagerWorkRequest() {
        return salesManagerWorkRequest;
    }

    public void setSalesManagerWorkRequest(SalesManagerWorkRequest salesManagerWorkRequest) {
        this.salesManagerWorkRequest = salesManagerWorkRequest;
    }

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
