/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.ReturnsProcessView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class ReturnsProcessWorkArea extends WorkArea{

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        return new ReturnsProcessView(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
