/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.View;
import Business.Views.WareHouseManagerView;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class WareHouseManagerWorkArea extends WorkArea {

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
       return new WareHouseManagerView(userProcessContainer,business,userAccount);
    }
    
    
    
}
