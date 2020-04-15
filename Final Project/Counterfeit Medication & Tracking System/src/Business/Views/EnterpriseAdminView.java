/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.EnterpriseAdmin.EnterpriseAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class EnterpriseAdminView extends View {

    public EnterpriseAdminView(JPanel userProcessContainer, Business business, UserAccount userAccount) {

        viewPanel = new EnterpriseAdminJPanel(userProcessContainer, business, userAccount);
    }

}
