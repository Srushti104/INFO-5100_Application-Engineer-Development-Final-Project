/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public abstract class WorkArea {
    View view;
    
   public abstract View createView(JPanel userProcessContainer,Business business,UserAccount userAccount);
    
    
}
