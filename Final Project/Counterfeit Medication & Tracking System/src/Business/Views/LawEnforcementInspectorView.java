/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.LawEnforcementOfficer.LawEnforcementInspectorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class LawEnforcementInspectorView extends View{

    public LawEnforcementInspectorView(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        
        
        viewPanel=new LawEnforcementInspectorJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
}
