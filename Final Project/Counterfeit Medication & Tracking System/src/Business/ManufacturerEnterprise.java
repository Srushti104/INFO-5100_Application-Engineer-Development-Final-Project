/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.ProductManagerRole;
import Business.Roles.Role;
import Business.Roles.SalesManagerRole;
import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class ManufacturerEnterprise extends Enterprise {

    SalesManagementOrganization salesManagementOrganization;
    ProductManagementOrganization productManagementOrganization;
    DrugCatalog drugCatalog;
    private int licenseNumber;
    private String drugN;
    private String manuN;

    public String getDrugN() {
        return drugN;
    }

    public void setDrugN(String drugN) {
        this.drugN = drugN;
    }

    public String getManuN() {
        return manuN;
    }

    public void setManuN(String manuN) {
        this.manuN = manuN;
    }

    public ManufacturerEnterprise(String enterpriseName) {
        super(enterpriseName);

        salesManagementOrganization = (SalesManagementOrganization) getOrganizationDirectory().newOrganization(Organization.SALES);
        productManagementOrganization = (ProductManagementOrganization) getOrganizationDirectory().newOrganization(Organization.PRODUCT);
        drugCatalog = new DrugCatalog();
    }

    public SalesManagementOrganization getSalesManagementOrganization() {
        return salesManagementOrganization;
    }

    public void setSalesManagementOrganization(SalesManagementOrganization salesManagementOrganization) {
        this.salesManagementOrganization = salesManagementOrganization;
    }

    public ProductManagementOrganization getProductManagementOrganization() {
        return productManagementOrganization;
    }

    public void setProductManagementOrganization(ProductManagementOrganization productManagementOrganization) {
        this.productManagementOrganization = productManagementOrganization;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {

        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new ProductManagerRole());
        roles.add(new SalesManagerRole());
        return roles;
    }

}
