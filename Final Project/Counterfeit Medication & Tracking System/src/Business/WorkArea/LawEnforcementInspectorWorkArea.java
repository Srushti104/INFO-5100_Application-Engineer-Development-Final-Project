/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkArea;

import Business.Business;
import Business.UserAccount;
import Business.Views.LawEnforcementInspectorView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author bobba
 */
public class LawEnforcementInspectorWorkArea extends WorkArea {

    @Override
    public View createView(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        return new LawEnforcementInspectorView(userProcessContainer, business, userAccount);
    }

}
