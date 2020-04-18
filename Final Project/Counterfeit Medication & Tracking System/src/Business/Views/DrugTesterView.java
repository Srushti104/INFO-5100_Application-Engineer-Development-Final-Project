/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.DrugTester.DrugTesterJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class DrugTesterView extends View {
    
    public DrugTesterView(JPanel userProcessContainer, Business business, UserAccount userAccount){
        viewPanel=new DrugTesterJPanel(userProcessContainer,business,userAccount);
    }
    
    
    
}
