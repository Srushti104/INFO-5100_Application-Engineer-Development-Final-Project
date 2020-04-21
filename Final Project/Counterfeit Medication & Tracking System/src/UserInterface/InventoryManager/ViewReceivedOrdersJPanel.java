/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InventoryManager;

import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.WorkRequests.InventoryManagerWorkRequest;
import Business.LotOfDrug;
import Business.Network;
import Business.Order;
import Business.Organization;
import Business.Package1;
import Business.Doctor;
import Business.Transaction;
import Business.UserAccount;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewReceivedOrdersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ViewReceivedOrdersJPanel
     */
    public ViewReceivedOrdersJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        addInventoryButton.setEnabled(false);
        // sendButton.setEnabled(false);
        Refresh();
        buttonEnable();
    }

    public void Refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        if (e.getClass().equals(HospitalEnterprise.class)) {
            HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e;
            Organization org = ((HospitalEnterprise) e).getInventoryManagementOrganization();
            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {

                InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) workRequest;
                UserAccount sender = inventoryManagerWorkRequest.getSender();
                Object row[] = new Object[7];
                row[0] = workRequest;

                row[1] = workRequest.getSender();

                if (workRequest.getReceiver() != null) {
                    row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                }

                row[3] = workRequest.getStatus();
                row[4] = inventoryManagerWorkRequest.getDrug();
                if (sender.getEmployee() != null) {
                    row[5] = inventoryManagerWorkRequest.getQuantity();
                } else {
                    row[5] = inventoryManagerWorkRequest.getQt();
                }
                row[6] = inventoryManagerWorkRequest.getOrder();

                ((DefaultTableModel) requestsTable.getModel()).addRow(row);
            }
        }

    }

    public void buttonEnable() {

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                {
                    for (UserAccount userAccount : hospitalEnterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (inventoryManagerWorkRequest.getSender() == userAccount) {
                            checkCounterFietButton.setVisible(false);
                            addInventoryButton.setVisible(false);
                            sendButton.setEnabled(true);
                        }
                    }
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
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        addInventoryButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        checkCounterFietButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("VIEW RECIEVED ORDERS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        requestsTable.setBackground(new java.awt.Color(238, 238, 238));
        requestsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        requestsTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        requestsTable.setForeground(new java.awt.Color(34, 40, 49));
        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Drug Name", "Quantity", "Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestsTable.setGridColor(new java.awt.Color(34, 40, 49));
        requestsTable.setMaximumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setMinimumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setPreferredSize(new java.awt.Dimension(1000, 122));
        requestsTable.setRowHeight(20);
        requestsTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        requestsTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(requestsTable);

        addInventoryButton.setBackground(new java.awt.Color(57, 62, 70));
        addInventoryButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addInventoryButton.setForeground(new java.awt.Color(238, 238, 238));
        addInventoryButton.setText("ADD TO INVENTORY");
        addInventoryButton.setMaximumSize(new java.awt.Dimension(200, 33));
        addInventoryButton.setMinimumSize(new java.awt.Dimension(200, 33));
        addInventoryButton.setPreferredSize(new java.awt.Dimension(200, 33));
        addInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryButtonActionPerformed(evt);
            }
        });

        assignButton.setBackground(new java.awt.Color(57, 62, 70));
        assignButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        assignButton.setForeground(new java.awt.Color(238, 238, 238));
        assignButton.setText("ASSIGN TO ME");
        assignButton.setMaximumSize(new java.awt.Dimension(200, 33));
        assignButton.setMinimumSize(new java.awt.Dimension(200, 33));
        assignButton.setPreferredSize(new java.awt.Dimension(200, 33));
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        checkCounterFietButton.setBackground(new java.awt.Color(57, 62, 70));
        checkCounterFietButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        checkCounterFietButton.setForeground(new java.awt.Color(238, 238, 238));
        checkCounterFietButton.setText("CHECK COUNTERFIET");
        checkCounterFietButton.setMaximumSize(new java.awt.Dimension(200, 33));
        checkCounterFietButton.setMinimumSize(new java.awt.Dimension(200, 33));
        checkCounterFietButton.setPreferredSize(new java.awt.Dimension(200, 33));
        checkCounterFietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCounterFietButtonActionPerformed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(57, 62, 70));
        sendButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        sendButton.setForeground(new java.awt.Color(238, 238, 238));
        sendButton.setText("SEND TO DOCTOR");
        sendButton.setMaximumSize(new java.awt.Dimension(200, 33));
        sendButton.setMinimumSize(new java.awt.Dimension(200, 33));
        sendButton.setPreferredSize(new java.awt.Dimension(200, 33));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(checkCounterFietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCounterFietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (inventoryManagerWorkRequest.getReceiver() != null && userAccount == inventoryManagerWorkRequest.getReceiver()) {

            Enterprise e2 = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            if (e2.getClass().equals(HospitalEnterprise.class)) {

                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e2;

                int q = inventoryManagerWorkRequest.getQuantity();

                Order ord = inventoryManagerWorkRequest.getOrder();

                for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {
                    for (Package1 p : lotOfDrug.getPackageList()) {
                        hospitalEnterprise.getInventoryCatalog().newInventoryItem(p);
                        addInventoryButton.setEnabled(false);
                    }
                }
                JOptionPane.showMessageDialog(this, "Drugs added to Inventory");
                inventoryManagerWorkRequest.setStatus("added to hospital inventory");
                Refresh();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please assign it and then proceed/Task might be assigned to other person");
        }
    }//GEN-LAST:event_addInventoryButtonActionPerformed

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

            workRequest.setStatus("Order Recieved");

            addInventoryButton.setEnabled(true);

            Refresh();
            buttonEnable();
            sendButton.setEnabled(false);
            if (workRequest.getSender().getDoctor() != null) {
                sendButton.setEnabled(true);
                addInventoryButton.setEnabled(false);
                checkCounterFietButton.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assogned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void checkCounterFietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCounterFietButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
            Order ord = inventoryManagerWorkRequest.getOrder();

            for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {

                for (Package1 p : lotOfDrug.getPackageList()) {
                    if (transaction.getPackage().getPackageID() == p.getPackageID()) {
                        if (transaction.getManufacturerEnterprise() == null || transaction.getDistributorEnterprise() == null || transaction.getHospitalEnterprise() == null) {
                            if (p.getPackageStatus() == "Suspect Drug") {
                                JOptionPane.showMessageDialog(null, "Drugs are suspected");
                                addInventoryButton.setEnabled(false);
                                p.setPackageStatus("Suspect Drug");

                                int lotid = p.getDisLotID();

                                for (Package1 p1 : lotOfDrug.getPackageList()) {
                                    if (p1.getDisLotID() == lotid) {
                                        p1.setPackageStatus("Suspect Drug");

                                    }
                                }

                            }
                        }

                    }

                }

            }

        }

        JOptionPane.showMessageDialog(null, "Drugs are safe");


    }//GEN-LAST:event_checkCounterFietButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (workRequest.getReceiver() != null) {

            workRequest.setStatus("Sent to doctor");
            Refresh();
        }
        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);
        UserAccount sender = inventoryManagerWorkRequest.getSender();
        Doctor doc = sender.getDoctor();

        Order order = new Order();
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        Enterprise en1 = network.getEnterpriseDirectory().getMyEnterprise(inventoryManagerWorkRequest.getSender());

        if (order.getOrderSize() < inventoryManagerWorkRequest.getQt()) {

            int i1 = inventoryManagerWorkRequest.getQt();

            while (i1 > 0) {
                LotOfDrug lotOfDrug = new LotOfDrug();
                for (int j = 0; j < 5 && i1 > 0; j++) {
                    InventoryItem tempPackage = null;
                    for (InventoryItem itm : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {

                        if (inventoryManagerWorkRequest.getDrug() == itm.getPackage1().getDrug()) {

                            if (itm.getPackage1().getPackageStatus() != "Illegetimate Drug") {

                                lotOfDrug.addPackage(itm.getPackage1());
                                doc.getDrugCatalog().newDrugPackage(itm.getPackage1());
                                for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
                                    if (transaction.getPackage().getPackageID() == itm.getPackage1().getPackageID()) {

                                        transaction.setDoctor(doc);
                                        transaction.setTransactionStatus("Sold to Doctor");

                                    }
                                }
                                itm.getPackage1().setHosID(lotOfDrug.getLotID());
                                tempPackage = itm;
                                break;
                            }

                        }
                    }
                    hospitalEnterprise.getInventoryCatalog().getInventoryList().remove(tempPackage);

                    i1--;
                }
                order.addLot(lotOfDrug);
            }

        }

        HospitalEnterprise en2 = (HospitalEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        JOptionPane.showMessageDialog(null, "Drugs sent To Doctor");


    }//GEN-LAST:event_sendButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInventoryButton;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkCounterFietButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
