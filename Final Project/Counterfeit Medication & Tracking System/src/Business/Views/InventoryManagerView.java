/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.InventoryManager.InventoryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class InventoryManagerView extends View{

    public InventoryManagerView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        viewPanel=new InventoryManagerJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
