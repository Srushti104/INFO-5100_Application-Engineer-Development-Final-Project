/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import UserInterface.HospitalManager.HospitalManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bobba
 */
public class ManagerView extends View {

    public ManagerView(JPanel userProcessContainer, Business business, UserAccount userAccount) {

        for (Network network : business.getNetworkDirectory().getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                    for (UserAccount userAccount1 : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (userAccount == userAccount1) {
                            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                                viewPanel = new HospitalManagerJPanel(userProcessContainer, business, userAccount);
                            }
                        }
                    }
                }
            }
        }

    }

}
