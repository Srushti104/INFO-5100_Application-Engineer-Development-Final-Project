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
public class InventoryCatalog {

    ArrayList<InventoryItem> inventoryList;
    ArrayList<InventoryItem> package1List;

    public InventoryCatalog() {

        inventoryList = new ArrayList<InventoryItem>();
        package1List = new ArrayList<InventoryItem>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public ArrayList<InventoryItem> getPackage1List() {
        return package1List;
    }

    public InventoryItem newSuspectedDrug(Package1 package1) {
        InventoryItem inventoryItem1 = new InventoryItem();
        inventoryList.add(inventoryItem1);
        inventoryItem1.setPackage1(package1);

        return inventoryItem1;
    }

    public InventoryItem newInventoryItem(Package1 package1) {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryList.add(inventoryItem);
        inventoryItem.setPackage1(package1);

        return inventoryItem;
    }

    public void deleteInventoryItem(InventoryItem inventoryItem) {
        inventoryList.remove(inventoryItem);
    }

    public int getTotalInventory(Drug drug) {
        int totQuantity = 0;

        for (InventoryItem inventoryItem : inventoryList) {

            if (inventoryItem.getPackage1().getDrug() == drug) {
                totQuantity = totQuantity + inventoryItem.getQuantity();
            }
        }

        return totQuantity;
    }

    public int getTotalQuantity(Drug drug) {

        int tquant = 0;

        for (InventoryItem inventoryItem : inventoryList) {
            if (inventoryItem.getPackage1().getDrug() == drug && inventoryItem.getPackage1().getPackageStatus() != "Illegetimate Drug") {

                tquant++;
            }
        }

        return tquant;
    }

}
