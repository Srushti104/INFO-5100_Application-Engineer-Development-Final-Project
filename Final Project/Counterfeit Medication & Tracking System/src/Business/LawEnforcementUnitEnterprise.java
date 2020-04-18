/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.LawEnforecementInspectorRole;
import Business.Roles.LicenseInspectorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class LawEnforcementUnitEnterprise extends Enterprise {

    private InspectingOrganization inspectingOrganization;

    public LawEnforcementUnitEnterprise(String enterpriseName) {
        super(enterpriseName);
        inspectingOrganization = (InspectingOrganization) getOrganizationDirectory().newOrganization(Organization.INSPECTING);
    }

    public InspectingOrganization getInspectingOrganization() {
        return inspectingOrganization;
    }

    public void setInspectingOrganization(InspectingOrganization inspectingOrganization) {
        this.inspectingOrganization = inspectingOrganization;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new LawEnforecementInspectorRole());

        return roles;
    }

}
