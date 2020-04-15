/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author bobba
 */
public class TransactionHistory {

    private ArrayList<Transaction> transactionList;

    public TransactionHistory() {

        transactionList = new ArrayList<Transaction>();
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public Transaction newTransaction() {
        Transaction transaction = new Transaction();
        transactionList.add(transaction);
        return transaction;

    }

    public void deleteTransaction(Transaction transaction) {
        transactionList.remove(transaction);

    }

    public Package1 getIllegetimateDrugPerHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        for (Transaction transaction : transactionList) {
            if (transaction.getPackage().getPackageStatus() == "Illegetimate Drug" && transaction.getHospitalEnterprise() == hospitalEnterprise) {
                return transaction.getPackage();
            }
        }
        return null;
    }

}
