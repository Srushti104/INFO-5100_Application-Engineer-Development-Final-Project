/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class Order {

    private ArrayList<LotOfDrug> lotOfDrugsList;
    private int orderID;
    private static int count = 0;

    public Order() {

        lotOfDrugsList = new ArrayList<LotOfDrug>();
        count++;
        orderID = count;
    }

    public ArrayList<LotOfDrug> getLotOfDrugsList() {
        return lotOfDrugsList;
    }

    public void setLotOfDrugsList(ArrayList<LotOfDrug> lotOfDrugsList) {
        this.lotOfDrugsList = lotOfDrugsList;
    }

    public void addLot(LotOfDrug l) {

        lotOfDrugsList.add(l);

    }

    public int getOrderSize() {
        int count1 = 0;
        for (LotOfDrug lotOfDrug : lotOfDrugsList) {
            for (Package1 package1 : lotOfDrug.getPackageList()) {
                count1++;
            }
        }

        return count1;

    }

    public String toString() {
        return Integer.toString(orderID);
    }

}
