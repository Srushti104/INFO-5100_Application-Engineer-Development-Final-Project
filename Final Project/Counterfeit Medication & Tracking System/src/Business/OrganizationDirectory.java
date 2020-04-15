/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class OrganizationDirectory {

    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {

        orgList = new ArrayList<Organization>();
    }

    Organization newOrganization(String orgName) {
        Organization org = null;

        if (orgName.equals(Organization.PRODUCT)) {
            org = new ProductManagementOrganization();

        } else if (orgName.equals(Organization.INVENTORY)) {
            org = new InventoryManagementOrganization();
        } else if (orgName.equals(Organization.SALES)) {
            org = new SalesManagementOrganization();
        }  else if (orgName.equals(Organization.LICENSING)) {
            org = new LicensingOrganization();
        } else if (orgName.equals(Organization.MANAGEMENT)) {
            org = new ManagementOrganization();
        } else if (orgName.equals(Organization.WAREHOUSE)) {
            org = new WarehouseOrganization();
        } else if (orgName.equals(Organization.INSPECTING)) {

            org = new InspectingOrganization();
        }
        if (org != null) {
            orgList.add(org);
        }
        return org;
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

}
