/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class Transaction {

    private Package1 package1;
    private ManufacturerEnterprise manufacturerEnterprise;
    private DistributorEnterprise distributorEnterprise;
    private HospitalEnterprise hospitalEnterprise;
    private Enterprise enterprise;
    private Doctor doctor;
    private int transactionID;
    private static int count = 0;
    private String transactionStatus;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction() {

        count++;
        transactionID = count;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Package1 getPackage() {
        return package1;
    }

    public void setPackage(Package1 package1) {
        this.package1 = package1;
    }

    public ManufacturerEnterprise getManufacturerEnterprise() {
        return manufacturerEnterprise;
    }

    public void setManufacturerEnterprise(ManufacturerEnterprise manufacturerEnterprise) {
        this.manufacturerEnterprise = manufacturerEnterprise;
    }

    public DistributorEnterprise getDistributorEnterprise() {
        return distributorEnterprise;
    }

    public void setDistributorEnterprise(DistributorEnterprise distributorEnterprise) {
        this.distributorEnterprise = distributorEnterprise;
    }

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String toString() {
        return Integer.toString(transactionID);
    }

}
