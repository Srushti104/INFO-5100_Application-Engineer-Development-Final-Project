/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.ManagerWorkArea;

/**
 *
 * @author bobba
 */
public class ManagerRole extends Role {

    public ManagerRole() {
        super("Manager");
        workArea=new ManagerWorkArea();
    }
    
    
    
    
}
