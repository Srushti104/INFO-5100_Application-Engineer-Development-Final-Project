/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.SalesManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class SalesManagerWorkArea extends WorkArea {

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {

        return new SalesManagerView(userProcessContainer, business, userAccount);
    }
}
