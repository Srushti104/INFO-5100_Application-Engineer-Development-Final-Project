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
 * @author srush
 */
public class StateRegulatoryEnterprise extends Enterprise {

    private LicensingOrganization licensingOrganization;

    public StateRegulatoryEnterprise(String enterpriseName) {
        super(enterpriseName);
        licensingOrganization = (LicensingOrganization) getOrganizationDirectory().newOrganization(Organization.LICENSING);

    }

    public LicensingOrganization getLicensingOrganization() {
        return licensingOrganization;
    }

    public void setLicensingOrganization(LicensingOrganization licensingOrganization) {
        this.licensingOrganization = licensingOrganization;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {

        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new LicenseInspectorRole());
        return roles;
    }

}
