/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.LicenseInspectorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class FDAEnterprise extends Enterprise {

    private LicensingOrganization licensingOrganization;
    private ManagementOrganization managementOrganization;
    private DrugTestingOrganization drugTestingOrganization;

    public FDAEnterprise(String enterpriseName) {
        super(enterpriseName);

        licensingOrganization = (LicensingOrganization) getOrganizationDirectory().newOrganization(Organization.LICENSING);
        managementOrganization = (ManagementOrganization) getOrganizationDirectory().newOrganization(Organization.MANAGEMENT);
        drugTestingOrganization = (DrugTestingOrganization) getOrganizationDirectory().newOrganization(DRUGTESTING);
    }

    public LicensingOrganization getLicensingOrganization() {
        return licensingOrganization;
    }

    public void setLicensingOrganization(LicensingOrganization licensingOrganization) {
        this.licensingOrganization = licensingOrganization;
    }

    public ManagementOrganization getManagementOrganization() {
        return managementOrganization;
    }

    public void setManagementOrganization(ManagementOrganization managementOrganization) {
        this.managementOrganization = managementOrganization;
    }

    public DrugTestingOrganization getDrugTestingOrganization() {
        return drugTestingOrganization;
    }

    public void setDrugTestingOrganization(DrugTestingOrganization drugTestingOrganization) {
        this.drugTestingOrganization = drugTestingOrganization;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new LicenseInspectorRole());
        return roles;

    }

}
