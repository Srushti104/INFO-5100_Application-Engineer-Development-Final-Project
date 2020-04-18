/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesManager;

import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.InventoryManagementOrganization;
import Business.LotOfDrug;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Order;
import Business.Organization;
import Business.Package1;
import Business.WorkRequests.SalesManagerWorkRequest;
import Business.Transaction;
import Business.TransactionHistory;
import Business.UserAccount;
import Business.WarehouseOrganization;
import Business.WorkRequests.InventoryManagerWorkRequest;
import Business.WorkRequests.WarehouseManagerWorkRequest;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewOrdersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ViewOrdersJPanel
     */
    public ViewOrdersJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        orderDrugButton.setVisible(false);

        Enterprise e5 = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        if (e5.getClass().equals(ManufacturerEnterprise.class)) {
            changeTable();
        }

        Refresh();
    }

    public void changeTable() {
        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null}
                },
                new String[]{
                    "Message", "Sender", "Receiver", "Status", "Drug Name", "Quantity"
                }) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    public void Refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        if (e.getClass().equals(ManufacturerEnterprise.class)) {
            Organization org = ((ManufacturerEnterprise) e).getSalesManagementOrganization();
            //ManufacturerEnterprise manufacturerEnterprise=(ManufacturerEnterprise)e;
            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {
                SalesManagerWorkRequest salesManagerWorkRequest = (SalesManagerWorkRequest) workRequest;
                Object row[] = new Object[7];
                row[0] = workRequest;
                row[1] = workRequest.getSender().getEmployee().getFirstName();

                if (workRequest.getReceiver() != null) {
                    row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                }

                row[3] = workRequest.getStatus();
                row[4] = salesManagerWorkRequest.getDrug();
                row[5] = salesManagerWorkRequest.getQuant();

                ((DefaultTableModel) requestsTable.getModel()).addRow(row);
            }
        } else if (e.getClass().equals(DistributorEnterprise.class)) {
            orderDrugButton.setVisible(true);
            orderDrugButton.setEnabled(false);
            Organization org = ((DistributorEnterprise) e).getSalesManagementOrganization();
            DistributorEnterprise distributorEnterprise = (DistributorEnterprise) e;
            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {

                SalesManagerWorkRequest salesManagerWorkRequest = (SalesManagerWorkRequest) workRequest;
                Object row[] = new Object[7];
                row[0] = workRequest;
                row[1] = workRequest.getSender().getEmployee().getFirstName();

                if (workRequest.getReceiver() != null) {
                    row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                }

                row[3] = workRequest.getStatus();
                row[4] = salesManagerWorkRequest.getDrug();
                row[5] = salesManagerWorkRequest.getQuant();
               // row[6] = distributorEnterprise.getInventoryCatalog().getTotalQuantity(salesManagerWorkRequest.getDrug());
               // row[6] = salesManagerWorkRequest.getOrder();
                //  row[4]=workRequest.getDrugName();
                //  row[5]=workRequest.getQuantity();

                /*if(productManagerWorkRequest.getLicenseNumber()!=0)
                 {
                 addDrugButton.setVisible(true);
                 }*/
                ((DefaultTableModel) requestsTable.getModel()).addRow(row);

                if (salesManagerWorkRequest.getQuant() > distributorEnterprise.getInventoryCatalog().getTotalQuantity(salesManagerWorkRequest.getDrug())) {
                    orderDrugButton.setEnabled(true);
                    proceedButton.setEnabled(false);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        orderDrugButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("View Order Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 11, -1, -1));

        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 63, 24, 23));

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 43, 25));

        proceedButton.setText("Proceed");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });
        add(proceedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Drug ", "Quantity", "Warehouse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 97, 660, 92));

        orderDrugButton.setText("Order Drug");
        orderDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDrugButtonActionPerformed(evt);
            }
        });
        add(orderDrugButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        SalesManagerWorkRequest salesManagerWorkRequest = (SalesManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);
        Enterprise e3 = network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        // DistributorEnterprise distributorEnterprise=(DistributorEnterprise)e3;
        if (salesManagerWorkRequest.getReceiver() != null && userAccount == salesManagerWorkRequest.getReceiver()) {

            if (e3.getClass().equals(ManufacturerEnterprise.class)) {
                WarehouseManagerWorkRequest warehouseManagerWorkRequest = new WarehouseManagerWorkRequest();
                warehouseManagerWorkRequest.setSender(userAccount);
                warehouseManagerWorkRequest.setRequestDate(new Date());
                warehouseManagerWorkRequest.setMessage("Sent to Warehouse");
                warehouseManagerWorkRequest.setStatus("Sent");
                // shipmentManagerWorkRequest.setManuName(manuNameField.getText());
                warehouseManagerWorkRequest.setDrugName(salesManagerWorkRequest.getDrName());
                warehouseManagerWorkRequest.setDrug(salesManagerWorkRequest.getDrug());
                warehouseManagerWorkRequest.setQuantity(salesManagerWorkRequest.getQuant());
               // warehouseManagerWorkRequest.setOrder(salesManagerWorkRequest.getOrder());

                salesManagerWorkRequest.setStatus("Sent to warehouse");

                Enterprise en = network.getEnterpriseDirectory().getMyEnterprise(salesManagerWorkRequest.getSender());
                DistributorEnterprise distributorEnterprise = (DistributorEnterprise) en;
                ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) e3;
                int i = salesManagerWorkRequest.getQuant();
                Order order = new Order();
                while (i > 0) {
                    LotOfDrug lotOfDrug = new LotOfDrug();

                    for (int j = 0; j < 5 && i > 0; j++) {
                        Package1 p = new Package1();
                       // Transaction transaction = network.getTransactionHistory().newTransaction();
                        p.setDrug(salesManagerWorkRequest.getDrug());
                        p.setManuLotID(lotOfDrug.getLotID());
                        p.setPackageStatus("Normal");
                        lotOfDrug.addPackage(p);
//                        transaction.setPackage(p);
//                        transaction.setManufacturerEnterprise(manufacturerEnterprise);
//                        transaction.setTransactionStatus("Sold");
//                        transaction.setDistributorEnterprise(distributorEnterprise);

                        i--;
                    }
                    order.addLot(lotOfDrug);
                }

                warehouseManagerWorkRequest.setOrder(order);

                ManufacturerEnterprise e = (ManufacturerEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

                DistributorEnterprise e1 = null;
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getClass().equals(DistributorEnterprise.class)) {
                        e1 = (DistributorEnterprise) enterprise;
                    }
                }

                WarehouseOrganization warehouseManagerOrganization = e1.getWarehouseOrganization();
                warehouseManagerOrganization.getWorkQueue().getWorkRequestList().add(warehouseManagerWorkRequest);

 
                // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
                e.getSalesManagementOrganization().getSentWorkQueue().getWorkRequestList().add(warehouseManagerWorkRequest);

                JOptionPane.showMessageDialog(null, "Work Request Sent");
            }

            if (e3.getClass().equals(DistributorEnterprise.class)) {
                DistributorEnterprise distributorEnterprise = (DistributorEnterprise) e3;

                InventoryManagerWorkRequest inventoryManagerWorkRequest = new InventoryManagerWorkRequest();
                inventoryManagerWorkRequest.setSender(userAccount);
                inventoryManagerWorkRequest.setRequestDate(new Date());
                inventoryManagerWorkRequest.setMessage("Order ready");
                inventoryManagerWorkRequest.setStatus("Sent");
                // shipmentManagerWorkRequest.setManuName(manuNameField.getText());
                inventoryManagerWorkRequest.setDrugName(salesManagerWorkRequest.getDrName());
                inventoryManagerWorkRequest.setDrug(salesManagerWorkRequest.getDrug());
                inventoryManagerWorkRequest.setQuantity(salesManagerWorkRequest.getQuant());
      //          inventoryManagerWorkRequest.setShippedTo(salesManagerWorkRequest.getSender());

                Order order = new Order();
                Enterprise en1 = network.getEnterpriseDirectory().getMyEnterprise(salesManagerWorkRequest.getSender());

                if (order.getOrderSize() < salesManagerWorkRequest.getQuant()) {

                    int i1 = salesManagerWorkRequest.getQuant();

                    while (i1 > 0) {
                        LotOfDrug lotOfDrug = new LotOfDrug();
                        for (int j = 0; j < 5 && i1 > 0; j++) {
                            InventoryItem tempPackage = null;
                            for (InventoryItem itm : distributorEnterprise.getInventoryCatalog().getInventoryList()) {

                                if (salesManagerWorkRequest.getDrug() == itm.getPackage1().getDrug()) {

                                    if (itm.getPackage1().getPackageStatus() != "Illegetimate Drug") {
                                        /*for(Transaction transaction1:network.getTransactionHistory().getTransactionList())
                               {
                                   if(transaction1.getPackage1().getPackageID()==itm.getPackage1().getPackageID())
                                   {
                                       if(transaction1.getDispenser()!= null)
                                       {
                                           
                                       }
                                  
                                   
                                       
                                   }
                               }*/

                                        lotOfDrug.addPackage(itm.getPackage1());
                                        for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
                                            if (transaction.getPackage().getPackageID() == itm.getPackage1().getPackageID()) {
                                                if (en1.getClass().equals(HospitalEnterprise.class)) {
                                                    HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) en1;
                                                    transaction.setEnterprise(hospitalEnterprise);
                                                    transaction.setHospitalEnterprise(hospitalEnterprise);
                                                    transaction.setTransactionStatus("Sold to Hospital");
                                                }

                                            }
                                        }
                                        itm.getPackage1().setDisLotID(lotOfDrug.getLotID());
                                        tempPackage = itm;
                                        break;
                                    }

                                }
                            }
                            distributorEnterprise.getInventoryCatalog().getInventoryList().remove(tempPackage);

                            i1--;
                        }
                        order.addLot(lotOfDrug);
                    }

                }
               
                 inventoryManagerWorkRequest.setOrder(order);

                DistributorEnterprise e = (DistributorEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

                HospitalEnterprise e1 = null;
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                        e1 = (HospitalEnterprise) enterprise;
                    }
                }

                InventoryManagementOrganization inventoryManagementOrganization = e1.getInventoryManagementOrganization();
                inventoryManagementOrganization.getWorkQueue().getWorkRequestList().add(inventoryManagerWorkRequest);

                // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
                e.getSalesManagementOrganization().getSentWorkQueue().getWorkRequestList().add(inventoryManagerWorkRequest);
                salesManagerWorkRequest.setStatus("Sent");
                JOptionPane.showMessageDialog(null, "Work Request Done");

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please assign it and then proceed/Task might be assigned to other person");
        }
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        int row = requestsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(row, 0);

        if (workRequest.getReceiver() == null) {

            workRequest.setReceiver(userAccount);

            workRequest.setStatus("Pending");

            Refresh();
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assogned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    public void deleteItemFromInventory(DistributorEnterprise dist, InventoryItem int1) {
        dist.getInventoryCatalog().deleteInventoryItem(int1);
    }

    private void orderDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDrugButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        SalesManagerWorkRequest salesManagerWorkRequest = (SalesManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (salesManagerWorkRequest.getReceiver() != null && userAccount == salesManagerWorkRequest.getReceiver()) {
            OrderDrugJPanel orderDrugJPanel = new OrderDrugJPanel(userProcessContainer, network, salesManagerWorkRequest, userAccount);
            userProcessContainer.add("OrderDrugQnt", orderDrugJPanel);

            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);

        }


    }//GEN-LAST:event_orderDrugButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderDrugButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable requestsTable;
    // End of variables declaration//GEN-END:variables
}
