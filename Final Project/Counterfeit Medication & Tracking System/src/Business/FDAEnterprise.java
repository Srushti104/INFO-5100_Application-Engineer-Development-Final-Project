/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.DrugTesterRole;
import Business.Roles.FDAInspectorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class FDAEnterprise extends Enterprise {

    private DrugTestingOrganization drugTestingOrganization;
    private InspectingOrganization inspectingOrganization;

    public FDAEnterprise(String enterpriseName) {
        super(enterpriseName);

        drugTestingOrganization = (DrugTestingOrganization) getOrganizationDirectory().newOrganization(DRUGTESTING);
        inspectingOrganization = (InspectingOrganization) getOrganizationDirectory().newOrganization(Organization.INSPECTING);
    }

    public InspectingOrganization getInspectingOrganization() {
        return inspectingOrganization;
    }

    public void setInspectingOrganization(InspectingOrganization inspectingOrganization) {
        this.inspectingOrganization = inspectingOrganization;
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
        roles.add(new DrugTesterRole());
        roles.add(new FDAInspectorRole());
        return roles;

    }

}
