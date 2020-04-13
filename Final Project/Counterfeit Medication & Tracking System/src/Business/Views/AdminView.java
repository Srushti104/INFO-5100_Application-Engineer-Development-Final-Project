/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.Enterprise;
import Business.UserAccount;
import UserInterface.BusinessAdmin.AdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class AdminView extends View {
    
    
     public AdminView(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        
        viewPanel=new AdminJPanel(userProcessContainer,business,userAccount);
    }
    
}
