/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.ProductManager.ProductManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class ProductManagerView extends View{

    public ProductManagerView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        viewPanel=new ProductManagerJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
