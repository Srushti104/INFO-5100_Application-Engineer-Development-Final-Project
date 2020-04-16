/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.LicenseInspectorRole.LicenseInspectorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class LicenseInspectorView extends View{

    public LicenseInspectorView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        viewPanel=new LicenseInspectorJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
