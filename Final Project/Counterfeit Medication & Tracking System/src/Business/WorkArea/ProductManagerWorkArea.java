/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.ProductManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class ProductManagerWorkArea extends WorkArea{

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        return new ProductManagerView(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
