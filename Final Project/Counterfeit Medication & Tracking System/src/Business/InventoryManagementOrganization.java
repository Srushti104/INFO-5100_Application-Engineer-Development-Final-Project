/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class InventoryManagementOrganization extends Organization{
    
    private DrugCatalog drugCatalog;
    private InventoryCatalog inventoryCatalog;

    public InventoryManagementOrganization() {
        super(Organization.INVENTORY);
        drugCatalog=new DrugCatalog();
        inventoryCatalog=new InventoryCatalog();
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }
    
    
    
    
}
