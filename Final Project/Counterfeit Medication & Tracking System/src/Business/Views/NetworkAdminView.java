/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.Network;
import Business.UserAccount;
import UserInterface.NetworkAdmin.NetworkAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class NetworkAdminView extends View{

    public NetworkAdminView(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        
        for(Network network:business.getNetworkDirectory().getNetworkList())
        {
            
        for (UserAccount userAccount1 : network.getUserAccountDirectory().getUserAccountList()) {

                if (userAccount1 == userAccount) {
                    


                        viewPanel = new NetworkAdminJPanel(userProcessContainer, network, userAccount);

                    }
        }
        }
    }
    
    
    
    
}
