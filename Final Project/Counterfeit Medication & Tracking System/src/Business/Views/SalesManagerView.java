/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.UserAccount;
import UserInterface.SalesManager.SalesManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class SalesManagerView extends View {

    public SalesManagerView(JPanel userProcessContainer, Business business, UserAccount userAccount) {

        viewPanel = new SalesManagerJPanel(userProcessContainer, business, userAccount);
    }

}
