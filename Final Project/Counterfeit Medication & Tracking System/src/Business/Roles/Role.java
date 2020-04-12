/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.WorkArea;

/**
 *
 * @author bobba
 */
public abstract class Role {
    
     WorkArea workArea;
    private String roleName;
    
    

    public Role(String roleName) {
        this.roleName=roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    
    

    public WorkArea getWorkArea() {
        return workArea;
    }

    public void setWorkArea(WorkArea workArea) {
        this.workArea = workArea;
    }
    
    
    public String toString()
    {
        return roleName;
    }
    
}
