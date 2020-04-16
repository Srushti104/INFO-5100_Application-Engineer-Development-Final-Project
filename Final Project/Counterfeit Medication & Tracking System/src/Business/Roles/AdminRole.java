/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.AdminWorkArea;
import Business.WorkArea.WorkArea;

/**
 *
 * @author srush
 */
public class AdminRole extends Role{
    
   
    
     public AdminRole() {
        
        super("AdminRole");
        
       workArea=new AdminWorkArea();
    }
    
    
}
