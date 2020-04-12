/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.AdminRole;
import Business.Roles.EnterpriseAdminRole;
import Business.Roles.LicenseInspectorRole;
import Business.Roles.NetworkAdminRole;
import Business.Roles.ProductManagerRole;
import Business.Roles.WareHouseManagerRole;
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
        
         /*business.getEnterpriseDirectory().addEnterprise(business);
         business.getOrganizationDirectory().addOrganization(business);*/
         
        
        
        
     /*  Network network = business.getNetworkDirectory().newNetwork();
        network.setNetworkName("i");
        Employee employee1=network.getEmployeeDirectory().newEmployee();
         employee1.setFirstName("i");
         employee1.setLastName("i");
        UserAccount userAccount1 = network.getUserAccountDirectory().newAccount();
        userAccount1.setUserName("i");
        userAccount1.setPassword("i");
        userAccount1.setEmployee(employee1);
        userAccount1.setRole(new NetworkAdminRole());
        
        
        
        FDAEnterprise fDAEnterprise  =(FDAEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.FDA, "f");
            Employee employee2 = fDAEnterprise.getEmployeeDirectory().newEmployee();
            employee2.setFirstName("f");
            employee2.setLastName("f");
            UserAccount userAccount2 = fDAEnterprise.getUserAccountDirectory().newAccount();
            userAccount2.setUserName("f");
            userAccount2.setPassword("f");
            userAccount2.setEmployee(employee2);
            userAccount2.setRole(new EnterpriseAdminRole());
            
            
        LicensingOrganization licensingOrganization = fDAEnterprise.getLicensingOrganization();
        Employee employee3 = licensingOrganization.getEmployeeDirectory().newEmployee();
        employee3.setFirstName("l");
        employee3.setLastName("l");
        UserAccount userAccount3 = licensingOrganization.getUserAccountDirectory().newAccount();
        userAccount3.setEmployee(employee3);
        userAccount3.setUserName("l");
        userAccount3.setPassword("l");
        userAccount3.setRole(new LicenseInspectorRole());
        
        
        DrugTestingOrganization drugTestingOrganization = fDAEnterprise.getDrugTestingOrganization();
        Employee employee32 = drugTestingOrganization.getEmployeeDirectory().newEmployee();
        employee32.setFirstName("dr");
        employee32.setLastName("dr");
        UserAccount userAccount32 = drugTestingOrganization.getUserAccountDirectory().newAccount();
        userAccount32.setEmployee(employee32);
        userAccount32.setUserName("dr");
        userAccount32.setPassword("dr");
        userAccount32.setRole(new DrugTesterRole());
        
        ReturnsProcessOrganization returnsProcessOrganization = fDAEnterprise.getReturnsProcessOrganization();
        Employee employee45 = returnsProcessOrganization.getEmployeeDirectory().newEmployee();
        employee45.setFirstName("ret");
        employee45.setLastName("ret");
        UserAccount userAccount45 = returnsProcessOrganization.getUserAccountDirectory().newAccount();
        userAccount45.setEmployee(employee45);
        userAccount45.setUserName("ret");
        userAccount45.setPassword("ret");
        userAccount45.setRole(new ReturnsProcessRole());
        
        
        
        LawEnforcementUnitEnterprise lawEnforcementUnitEnterprise  =(LawEnforcementUnitEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.LAWENFORCEMENTUNIT, "law");
            Employee employee38 = lawEnforcementUnitEnterprise.getEmployeeDirectory().newEmployee();
            employee38.setFirstName("law");
            employee38.setLastName("law");
            UserAccount userAccount38 = lawEnforcementUnitEnterprise.getUserAccountDirectory().newAccount();
            userAccount38.setUserName("law");
            userAccount38.setPassword("law");
            userAccount38.setEmployee(employee38);
            userAccount38.setRole(new EnterpriseAdminRole());
        InspectingOrganization inspectingOrganization = lawEnforcementUnitEnterprise.getInspectingOrganization();
        Employee employee39 = inspectingOrganization.getEmployeeDirectory().newEmployee();
        employee39.setFirstName("lw");
        employee39.setLastName("lw");
        UserAccount userAccount39 = inspectingOrganization.getUserAccountDirectory().newAccount();
        userAccount39.setEmployee(employee39);
        userAccount39.setUserName("lw");
        userAccount39.setPassword("lw");
        userAccount39.setRole(new LawEnforecementInspectorRole());
        
        
        
        ManufacturerEnterprise manufacturerEnterprise  =(ManufacturerEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, "m");
            Employee employee4 = manufacturerEnterprise.getEmployeeDirectory().newEmployee();
            employee4.setFirstName("m");
            employee4.setLastName("m");
            UserAccount userAccount4 = manufacturerEnterprise.getUserAccountDirectory().newAccount();
            userAccount4.setUserName("m");
            userAccount4.setPassword("m");
            userAccount4.setEmployee(employee4);
            userAccount4.setRole(new EnterpriseAdminRole());
        ProductManagementOrganization productManagementOrganization = manufacturerEnterprise.getProductManagementOrganization();
        Employee employee5 = productManagementOrganization.getEmployeeDirectory().newEmployee();
        employee5.setFirstName("pm");
        employee5.setLastName("pm");
        UserAccount userAccount5 = productManagementOrganization.getUserAccountDirectory().newAccount();
        userAccount5.setEmployee(employee5);
        userAccount5.setUserName("pm");
        userAccount5.setPassword("pm");
        userAccount5.setRole(new ProductManagerRole());
        
        Drug drug=manufacturerEnterprise.getDrugCatalog().newDrug();
        drug.setDrugName("test");
        
        
        SalesManagementOrganization salesManagementOrganization = manufacturerEnterprise.getSalesManagementOrganization();
        Employee employee13 = salesManagementOrganization.getEmployeeDirectory().newEmployee();
        employee13.setFirstName("sm");
        employee13.setLastName("sm");
        UserAccount userAccount13= salesManagementOrganization.getUserAccountDirectory().newAccount();
        userAccount13.setEmployee(employee5);
        userAccount13.setUserName("sm");
        userAccount13.setPassword("sm");
        userAccount13.setRole(new SalesManagerRole());
        
        
        DistributorEnterprise distributorEnterprise  =(DistributorEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.DISTRIBUTOR, "d");
            Employee employee6 = distributorEnterprise.getEmployeeDirectory().newEmployee();
            employee6.setFirstName("d");
            employee6.setLastName("d");
            UserAccount userAccount6 = distributorEnterprise.getUserAccountDirectory().newAccount();
            userAccount6.setUserName("d");
            userAccount6.setPassword("d");
            userAccount6.setEmployee(employee6);
            userAccount6.setRole(new EnterpriseAdminRole());
        ManagementOrganization managementOrganization1 = distributorEnterprise.getManagementOrganization();
        Employee employee7 = managementOrganization1.getEmployeeDirectory().newEmployee();
        employee7.setFirstName("md");
        employee7.setLastName("md");
        UserAccount userAccount7 = managementOrganization1.getUserAccountDirectory().newAccount();
        userAccount7.setEmployee(employee7);
        userAccount7.setUserName("md");
        userAccount7.setPassword("md");
        userAccount7.setRole(new ManagerRole());
        
         WarehouseOrganization warehouseOrganization = distributorEnterprise.getWarehouseOrganization();
        Employee employee12 = warehouseOrganization.getEmployeeDirectory().newEmployee();
        employee12.setFirstName("wd");
        employee12.setLastName("wd");
        UserAccount userAccount12 = warehouseOrganization.getUserAccountDirectory().newAccount();
        userAccount12.setEmployee(employee7);
        userAccount12.setUserName("wd");
        userAccount12.setPassword("wd");
        userAccount12.setRole(new WareHouseManagerRole());
        
        
        SalesManagementOrganization salesManagementOrganization2 = distributorEnterprise.getSalesManagementOrganization();
        Employee employee25 = salesManagementOrganization2.getEmployeeDirectory().newEmployee();
        employee25.setFirstName("sd");
        employee25.setLastName("sd");
        UserAccount userAccount25 = salesManagementOrganization2.getUserAccountDirectory().newAccount();
        userAccount25.setEmployee(employee25);
        userAccount25.setUserName("sd");
        userAccount25.setPassword("sd");
        userAccount25.setRole(new SalesManagerRole());
        
        
        
        HospitalEnterprise hospitalEnterprise  =(HospitalEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.HOSPITAL, "h");
            Employee employee18 = hospitalEnterprise.getEmployeeDirectory().newEmployee();
            employee18.setFirstName("h");
            employee18.setLastName("h");
            UserAccount userAccount18 = hospitalEnterprise.getUserAccountDirectory().newAccount();
            userAccount18.setUserName("h");
            userAccount18.setPassword("h");
            userAccount18.setEmployee(employee18);
            userAccount18.setRole(new EnterpriseAdminRole());
        ManagementOrganization managementOrganization2 = hospitalEnterprise.getManagementOrganization();
        Employee employee19 = managementOrganization2.getEmployeeDirectory().newEmployee();
        employee19.setFirstName("hm");
        employee19.setLastName("hm");
        UserAccount userAccount19 = managementOrganization2.getUserAccountDirectory().newAccount();
        userAccount19.setEmployee(employee19);
        userAccount19.setUserName("hm");
        userAccount19.setPassword("hm");
        userAccount19.setRole(new ManagerRole());
        
        InventoryManagementOrganization inventoryManagementOrganization = hospitalEnterprise.getInventoryManagementOrganization();
        Employee employee23 = inventoryManagementOrganization.getEmployeeDirectory().newEmployee();
        employee23.setFirstName("im");
        employee23.setLastName("im");
        UserAccount userAccount23 = inventoryManagementOrganization.getUserAccountDirectory().newAccount();
        userAccount23.setEmployee(employee19);
        userAccount23.setUserName("im");
        userAccount23.setPassword("im");
        userAccount23.setRole(new InventoryManagerRole());
        
        RetailPharmacyEnterprise retailPharmacyEnterprise  =(RetailPharmacyEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.RETAILPHARMACY, "r");
            Employee employee27 = retailPharmacyEnterprise.getEmployeeDirectory().newEmployee();
            employee27.setFirstName("r");
            employee27.setLastName("r");
            UserAccount userAccount27= retailPharmacyEnterprise.getUserAccountDirectory().newAccount();
            userAccount27.setUserName("r");
            userAccount27.setPassword("r");
            userAccount27.setEmployee(employee27);
            userAccount27.setRole(new EnterpriseAdminRole());
        ManagementOrganization managementOrganization8 = retailPharmacyEnterprise.getManagementOrganization();
        Employee employee28 = managementOrganization8.getEmployeeDirectory().newEmployee();
        employee28.setFirstName("rm");
        employee28.setLastName("rm");
        UserAccount userAccount28 = managementOrganization8.getUserAccountDirectory().newAccount();
        userAccount28.setEmployee(employee28);
        userAccount28.setUserName("rm");
        userAccount28.setPassword("rm");
        userAccount28.setRole(new ManagerRole());
        
        InventoryManagementOrganization inventoryManagementOrganization2 = retailPharmacyEnterprise.getInventoryManagementOrganization();
        Employee employee29 = inventoryManagementOrganization2.getEmployeeDirectory().newEmployee();
        employee29.setFirstName("imr");
        employee29.setLastName("imr");
        UserAccount userAccount29 = inventoryManagementOrganization2.getUserAccountDirectory().newAccount();
        userAccount29.setEmployee(employee29);
        userAccount29.setUserName("irm");
        userAccount29.setPassword("irm");
        userAccount29.setRole(new InventoryManagerRole());
        
        StateRegulatoryEnterprise stateRegulatoryEnterprise  =(StateRegulatoryEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.STATEREGULATORYAFFAIRS, "s");
            Employee employee8 = stateRegulatoryEnterprise.getEmployeeDirectory().newEmployee();
            employee8.setFirstName("s");
            employee8.setLastName("s");
            UserAccount userAccount8 = stateRegulatoryEnterprise.getUserAccountDirectory().newAccount();
            userAccount8.setUserName("s");
            userAccount8.setPassword("s");
            userAccount8.setEmployee(employee8);
            userAccount8.setRole(new EnterpriseAdminRole());
        LicensingOrganization licensingOrganization1 = stateRegulatoryEnterprise.getLicensingOrganization();
        Employee employee9 = licensingOrganization1.getEmployeeDirectory().newEmployee();
        employee9.setFirstName("ls");
        employee9.setLastName("ls");
        UserAccount userAccount9 = licensingOrganization1.getUserAccountDirectory().newAccount();
        userAccount9.setEmployee(employee9);
        userAccount9.setUserName("ls");
        userAccount9.setPassword("ls");
        userAccount9.setRole(new LicenseInspectorRole());
        
        
        
        
        ThirdPartyLogisticsEnterprise thirdPartyLogisticsEnterprise  =(ThirdPartyLogisticsEnterprise)network.getEnterpriseDirectory().newEnterprise(Enterprise.THIRDPARTYLOGISTICS, "th");
            Employee employee21 = thirdPartyLogisticsEnterprise.getEmployeeDirectory().newEmployee();
            employee21.setFirstName("th");
            employee21.setLastName("th");
            UserAccount userAccount21 = thirdPartyLogisticsEnterprise.getUserAccountDirectory().newAccount();
            userAccount21.setUserName("th");
            userAccount21.setPassword("th");
            userAccount21.setEmployee(employee21);
            userAccount21.setRole(new EnterpriseAdminRole());
        ShippingManagementOrganization shippingManagementOrganization = thirdPartyLogisticsEnterprise.getShippingManagementOrganization();
        Employee employee22 = shippingManagementOrganization.getEmployeeDirectory().newEmployee();
        employee22.setFirstName("ths");
        employee22.setLastName("ths");
        UserAccount userAccount22 = shippingManagementOrganization.getUserAccountDirectory().newAccount();
        userAccount22.setEmployee(employee5);
        userAccount22.setUserName("ths");
        userAccount22.setPassword("ths");
        userAccount22.setRole(new ShipmentManagerRole());
        
         Order order=new Order();
         int i=7;
                while(i>0)
                {
                    LotOfDrug lotOfDrug=new LotOfDrug();
                    
                    
                    for(int j=0;j<5 && i>0;j++)
                    {
                    Package1 p=new Package1();
                   
                    Transaction transaction=network.getTransactionHistory().newTransaction();
                    p.setDrug(drug);
                    p.setManuLotID(lotOfDrug.getLotID());
                    p.setPackageStatus("Normal");
                    lotOfDrug.addPackage(p);
                    transaction.setPackage1(p);
                    transaction.setManufacturerEnterprise(null);
                        
                  //  transaction.setTransactionStatus("Sold");
                  //  transaction.setDistributorEnterprise(distributorEnterprise);
                   
                    
                    i--;
                }
                 order.addLot(lotOfDrug);   
                
                }
                
                 WareHouseManagerWorkRequest wareHouseManagerWorkRequest=new WareHouseManagerWorkRequest();
                 wareHouseManagerWorkRequest.setSender(userAccount22);
        wareHouseManagerWorkRequest.setRequestDate(new Date());
        wareHouseManagerWorkRequest.setMessage("Shipped");
        wareHouseManagerWorkRequest.setStatus("Shipped");
                 wareHouseManagerWorkRequest.setOrder(order);
                 
                  
        warehouseOrganization.getWorkQueue().getWorkRequestList().add(wareHouseManagerWorkRequest);*/
         
         /* Order order1 = new Order();
                 
                            
                            int i1=3;
                            
                            while(i1>0)
                {
                    LotOfDrug lotOfDrug1=new LotOfDrug();
                    for(int j1=0;j1<5 && i1>0;j1++)
                    {
                        InventoryItem tempPackage=null;
                    for (InventoryItem itm : distributorEnterprise.getInventoryCatalog().getInventoryList()) 
                        {
                           
                        
                           if (salesManagerWorkRequest.getDrug() == itm.getPackage1().getDrug()) {
                               
                               if(itm.getPackage1().getPackageStatus()!="Illegetimate Drug")
                               
                                   
                                   
                                   
                               lotOfDrug.addPackage(itm.getPackage1());
                               for(Transaction transaction:network.getTransactionHistory().getTransactionList())
                               {
                                   if(transaction.getPackage1().getPackageID()==itm.getPackage1().getPackageID())
                                   {
                                      if(en1.getClass().equals(HospitalEnterprise.class))
                                      {
                                          HospitalEnterprise hospitalEnterprise=(HospitalEnterprise)en1;
                                          transaction.setDispenser(hospitalEnterprise);
                                          transaction.setHospitalEnterprise(hospitalEnterprise);
                                          transaction.setTransactionStatus("Sold to Hospital");
                                      }
                                      
                                     
                                      
                                      
                                      
                                   }
                               }
                               itm.getPackage1().setDisLotID(lotOfDrug.getLotID());
                               tempPackage=itm;
                               break;
                           }
                              
                               
                           }
                        }
                    .getInventoryCatalog().getInventoryList().remove(tempPackage);
                    
                    i1--;
                }
                 order.addLot(lotOfDrug);   
                }
                            
                        }
                    

                
//                   
                


                shipmentManagerWorkRequest.setOrder(order);

                DistributorEnterprise e = (DistributorEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

                ThirdPartyLogisticsEnterprise e1 = null;
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getClass().equals(ThirdPartyLogisticsEnterprise.class)) {
                        e1 = (ThirdPartyLogisticsEnterprise) enterprise;
                    }
                }

                ShippingManagementOrganization shippingManagementOrganization = e1.getShippingManagementOrganization();
                shippingManagementOrganization.getWorkQueue().getWorkRequestList().add(shipmentManagerWorkRequest);

                // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
                e.getSalesManagementOrganization().getSentWorkQueue().getWorkRequestList().add(shipmentManagerWorkRequest);*/
         
          addBusinessAdmin(business);
       
         return business;
     }
     
     
     
     
    
    
}
