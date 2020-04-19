/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.ReturnsProcessor.ReturnsProcessorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class ReturnsProcessView extends View{

    public ReturnsProcessView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        viewPanel=new ReturnsProcessorJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
