/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.WarehouseManager.WarehouseManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bobba
 */
public class WarehouseManagerView extends View{

    public WarehouseManagerView(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        
        
        viewPanel=new WarehouseManagerJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
