/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.EnterpriseAdminWorkArea;

/**
 *
 * @author srush
 */
public class EnterpriseAdminRole extends Role {

    public EnterpriseAdminRole() {
        super("Enterprise Admin Role");
        workArea=new EnterpriseAdminWorkArea();
    }
    
    
    
    
}
