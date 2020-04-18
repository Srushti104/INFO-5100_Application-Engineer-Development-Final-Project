/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.AdminRole;
import Business.Roles.EnterpriseAdminRole;
import Business.Roles.NetworkAdminRole;
import Business.Roles.ProductManagerRole;
import Business.Roles.WarehouseManagerRole;
import java.util.Date;


/**
 *
 * @author nived
 */
public class ConfigureABusiness {
    
    
     private static void addBusinessAdmin(Business business)
    {
        Employee employee=business.getEmployeeDirectory().newEmployee();
        employee.setFirstName("Nived");
        employee.setLastName("Srush");
        
        UserAccount userAccount=business.getUserAccountDirectory().newAccount();
        
        userAccount.setUserName("admin");
        userAccount.setPassword("admin");
        userAccount.setEmployee(employee);
        userAccount.setRole(new AdminRole());
        
    }
     
     public static Business initialize()
     {
         Business business=Business.getInstance();
         
          addBusinessAdmin(business);
       
         return business;
     }
     
     
     
     
    
    
}
