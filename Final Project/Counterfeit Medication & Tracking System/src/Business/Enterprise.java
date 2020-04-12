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
public abstract class Enterprise extends Organization{
    
    
     private String enterpriseName;
    private String enterpriseType;
    
    
    
    
    public static final String MANUFACTURER="Manufacturer Enterprise";
    public static final String DISTRIBUTOR="Distributor Enterprise";
    public static final String FDA="FDA Enterprise";
    public static final String LAWENFORCEMENTUNIT="Law Enforcement Enterprise";
    public static final String STATEREGULATORYAFFAIRS="State Regulatory affairs Enterprise";
    public static final String HOSPITAL="Hospital Enterprise";
    public static final String RETAILPHARMACY="Retail Pharmacy Enterprise";
    public static final String THIRDPARTYLOGISTICS="Third Party Logistics Enterprise";
    
    
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String enterpriseName) {
        super(enterpriseName);
        this.enterpriseName = enterpriseName;
        organizationDirectory=new OrganizationDirectory();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
     public UserAccount authenticateUser(String username, String password) {
        // first check in UAD inherited from Organization
        UserAccount ua = getUserAccountDirectory().authenticateUser(username, password);
        if (ua != null) {
            return ua;
        }

        // check in all Organizations
        for (Organization org : getOrganizationDirectory().getOrgList()) {
            ua = org.getUserAccountDirectory().authenticateUser(username, password);
            if (ua != null) {
                return ua;
            }
        }
        
        return null;
    }
     
     
    public String toString()
    {
        return enterpriseName;
    }
    public abstract ArrayList<Role> getSupportedRoles();
    
}
