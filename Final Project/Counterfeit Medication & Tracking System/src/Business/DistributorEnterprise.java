/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.ManagerRole;
import Business.Roles.Role;
import Business.Roles.SalesManagerRole;
import Business.Roles.WarehouseManagerRole;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class DistributorEnterprise extends Enterprise {

    private WarehouseOrganization warehouseOrganization;
    private SalesManagementOrganization salesManagementOrganization;
    private InventoryCatalog inventoryCatalog;
    private DrugCatalog drugCatalog;
    private int threshold = 5;
    private int licenseNumber;

    public DistributorEnterprise(String enterpriseName) {
        super(enterpriseName);
        warehouseOrganization = (WarehouseOrganization) getOrganizationDirectory().newOrganization(Organization.WAREHOUSE);
        salesManagementOrganization = (SalesManagementOrganization) getOrganizationDirectory().newOrganization(Organization.SALES);
        drugCatalog = new DrugCatalog();
        inventoryCatalog = new InventoryCatalog();

    }

    public WarehouseOrganization getWarehouseOrganization() {
        return warehouseOrganization;
    }

    public void setWarehouseOrganization(WarehouseOrganization warehouseOrganization) {
        this.warehouseOrganization = warehouseOrganization;
    }

    public SalesManagementOrganization getSalesManagementOrganization() {
        return salesManagementOrganization;
    }

    public void setSalesManagementOrganization(SalesManagementOrganization salesManagementOrganization) {
        this.salesManagementOrganization = salesManagementOrganization;
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public void setInventoryCatalog(InventoryCatalog inventoryCatalog) {
        this.inventoryCatalog = inventoryCatalog;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {

        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new WarehouseManagerRole());
        roles.add(new SalesManagerRole());
        return roles;
    }

}
