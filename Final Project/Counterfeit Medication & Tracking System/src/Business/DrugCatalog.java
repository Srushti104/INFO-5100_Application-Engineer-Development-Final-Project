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
    ArrayList<Package1> packDoctorList;

    public DrugCatalog() {

        drugList = new ArrayList<Drug>();
        packDoctorList = new ArrayList<Package1>();
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
        packDoctorList.add(package1);

    }

    public void deleteDrug(Drug drug) {
        drugList.remove(drug);
    }

    public ArrayList<Package1> getPackDoctorList() {
        return packDoctorList;
    }

    public int getTotalQuantity(Drug drug) {

        int tquant = 0;

        for (Package1 p : packDoctorList) {
            if (p.getDrug().getDrugName() == drug.getDrugName()) {

                tquant++;
            }
        }

        return tquant;
    }

}
