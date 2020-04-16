/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class DoctorView extends View{

    public DoctorView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        
        viewPanel=new DoctorWorkAreaJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
    
}
