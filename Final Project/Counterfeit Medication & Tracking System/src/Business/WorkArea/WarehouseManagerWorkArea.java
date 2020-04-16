/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.View;
import Business.Views.WarehouseManagerView;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class WarehouseManagerWorkArea extends WorkArea {

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
       return new WarehouseManagerView(userProcessContainer,business,userAccount);
    }
    
    
    
}
