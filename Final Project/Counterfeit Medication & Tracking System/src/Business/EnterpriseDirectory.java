/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class EnterpriseDirectory {
    
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    
    public Enterprise newEnterprise(String type,String enterpriseName)
    {
        Enterprise enterprise=null;
        
        if(type.equals(Enterprise.FDA))
        {
            enterprise=new FDAEnterprise(enterpriseName);
            enterprise.setEnterpriseType(type);
        }
        
        else if(type.equals(Enterprise.STATEREGULATORYAFFAIRS))
        {
            
            enterprise=new StateRegulatoryEnterprise(enterpriseName);
            enterprise.setEnterpriseType(type);
            
            
        }
         else if(type.equals(Enterprise.MANUFACTURER))
        {
            
            enterprise=new ManufacturerEnterprise(enterpriseName);
            enterprise.setEnterpriseType(type);
            
            
        }
         else if(type.equals(Enterprise.DISTRIBUTOR))
        {
            
            enterprise=new DistributorEnterprise(enterpriseName);
            enterprise.setEnterpriseType(type);
            
            
        }
       
         
        
        if(enterprise!=null)
        {
            
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
        
    }
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    
    public Enterprise getMyEnterprise(UserAccount userAccount)
    {
        for(Enterprise enterprise:enterpriseList)
        {
            
         for(UserAccount userAccount1:enterprise.getUserAccountDirectory().getUserAccountList())
         {
             
             if(userAccount==userAccount1)
                 
             {
                 return enterprise;
             }
         }
         for(Organization organization:enterprise.getOrganizationDirectory().getOrgList())
         {
             
           for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList())
         {
             
             if(userAccount==userAccount1)
                 
             {
                 return enterprise;
             }
         }  
         }
        }
        return null;
    }
    
    
    public boolean isUserExisting(String userName)
    {
        boolean flag=false;
        
        
        for(Enterprise enterprise:enterpriseList)
        {
            
            
            for(UserAccount userAccount1:enterprise.getUserAccountDirectory().getUserAccountList())
                if(userName.equals(userAccount1.getUserName()))
                {
                    flag = true;
                }
            
            for(Organization organization:enterprise.getOrganizationDirectory().getOrgList())
            {
               for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList())
                if(userName.equals(userAccount1.getUserName()))
                {
                    flag = true;
                } 
            }
        }
        
        return flag;
    }
    
}
