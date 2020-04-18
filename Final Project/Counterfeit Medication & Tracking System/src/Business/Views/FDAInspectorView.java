/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.FDAInspector.FDAInspectorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class FDAInspectorView extends View{

    public FDAInspectorView(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        
        
        viewPanel=new FDAInspectorJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
}
