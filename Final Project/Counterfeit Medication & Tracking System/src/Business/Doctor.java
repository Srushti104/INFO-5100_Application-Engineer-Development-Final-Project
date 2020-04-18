/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class Doctor extends Person {

    private String hsopName;
    private String dateVisit;
    DrugCatalog drugCatalog;

    public Doctor() {
        drugCatalog = new DrugCatalog();
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public String getHsopName() {
        return hsopName;
    }

    public void setHsopName(String hsopName) {
        this.hsopName = hsopName;
    }

    public String getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(String dateVisit) {
        this.dateVisit = dateVisit;
    }

}
