
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class Business extends Enterprise{
    
    public static Business business;
        private NetworkDirectory networkDirectory;

    public Business() {
        super("Drug Counterfeit System");
        networkDirectory=new NetworkDirectory();
          }
    
     public static Business getInstance()
    {
        if(business == null)
        {
            business=new Business();
        }
        return business;
    }

   

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRoles() {
       ArrayList<Role> roles = new ArrayList<Role>();
        // add roles
        return roles;
    }
    
    
}
