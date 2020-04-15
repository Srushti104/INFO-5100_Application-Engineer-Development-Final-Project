/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.InventoryManagerRole;
import Business.Roles.ManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class HospitalEnterprise extends Enterprise {

    private InventoryManagementOrganization inventoryManagementOrganization;
    private ManagementOrganization managementOrganization;
    private DoctorDirectory doctorDirectory;
    private InventoryCatalog inventoryCatalog;
    private DrugCatalog drugCatalog;
    private int threshold = 10;

    public HospitalEnterprise(String enterpriseName) {
        super(enterpriseName);
        inventoryManagementOrganization = (InventoryManagementOrganization) getOrganizationDirectory().newOrganization(Organization.INVENTORY);
        managementOrganization = (ManagementOrganization) getOrganizationDirectory().newOrganization(Organization.MANAGEMENT);
        doctorDirectory = new DoctorDirectory();
        inventoryCatalog = new InventoryCatalog();
        drugCatalog = new DrugCatalog();
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public InventoryManagementOrganization getInventoryManagementOrganization() {
        return inventoryManagementOrganization;
    }

    public void setInventoryManagementOrganization(InventoryManagementOrganization inventoryManagementOrganization) {
        this.inventoryManagementOrganization = inventoryManagementOrganization;
    }

    public ManagementOrganization getManagementOrganization() {
        return managementOrganization;
    }

    public void setManagementOrganization(ManagementOrganization managementOrganization) {
        this.managementOrganization = managementOrganization;
    }

  
    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new InventoryManagerRole());
        roles.add(new ManagerRole());

        return roles;
    }

}
