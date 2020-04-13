/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.NetworkAdminWorkArea;
import Business.WorkArea.WorkArea;

/**
 *
 * @author nived
 */
public class NetworkAdminRole extends Role{
    
    
    

    public NetworkAdminRole() {
        super("Network Admin Role");
        
        workArea=new NetworkAdminWorkArea();
    }
    
    
    
}
