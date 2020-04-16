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
public class DrugCatalog {

    ArrayList<Drug> drugList;
    ArrayList<Package1> packPatientList;

    public DrugCatalog() {

        drugList = new ArrayList<Drug>();
        packPatientList = new ArrayList<Package1>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public Drug newDrug() {
        Drug drug = new Drug();
        drugList.add(drug);
        return drug;
    }

    public void newDrugPackage(Package1 package1) {
        packPatientList.add(package1);

    }

    public void deleteDrug(Drug drug) {
        drugList.remove(drug);
    }

    public ArrayList<Package1> getPackPatientList() {
        return packPatientList;
    }

    public int getTotalQuantity(Drug drug) {

        int tquant = 0;

        for (Package1 p : packPatientList) {
            if (p.getDrug().getDrugName() == drug.getDrugName()) {

                tquant++;
            }
        }

        return tquant;
    }

}
