/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesManager;

import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.LotOfDrug;
import Business.Network;
import Business.Order;
import Business.Package1;
import Business.WorkRequests.SalesManagerWorkRequest;
import Business.UserAccount;
import Business.WorkRequests.WarehouseManagerWorkRequest;
import Business.WarehouseOrganization;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class OrderDrugJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    SalesManagerWorkRequest salesManagerWorkRequest;
    UserAccount userAccount;

    /**
     * Creates new form OrderDrugJPanel
     */
    public OrderDrugJPanel(JPanel userProcessContainer, Network network, SalesManagerWorkRequest salesManagerWorkRequest, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.salesManagerWorkRequest = salesManagerWorkRequest;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        drugNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        sendRequestButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("DRUG NAME");

        drugNameField.setBackground(new java.awt.Color(238, 238, 238));
        drugNameField.setForeground(new java.awt.Color(34, 40, 49));
        drugNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugNameField.setMaximumSize(new java.awt.Dimension(200, 24));
        drugNameField.setMinimumSize(new java.awt.Dimension(200, 24));
        drugNameField.setPreferredSize(new java.awt.Dimension(200, 24));
        drugNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 40, 49));
        jLabel3.setText("QUANTITY");

        quantityField.setBackground(new java.awt.Color(238, 238, 238));
        quantityField.setForeground(new java.awt.Color(34, 40, 49));
        quantityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        quantityField.setMaximumSize(new java.awt.Dimension(200, 24));
        quantityField.setMinimumSize(new java.awt.Dimension(200, 24));
        quantityField.setPreferredSize(new java.awt.Dimension(200, 24));

        sendRequestButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        sendRequestButton.setForeground(new java.awt.Color(238, 238, 238));
        sendRequestButton.setText("SEND REQUEST");
        sendRequestButton.setMaximumSize(new java.awt.Dimension(150, 33));
        sendRequestButton.setMinimumSize(new java.awt.Dimension(150, 33));
        sendRequestButton.setPreferredSize(new java.awt.Dimension(150, 33));
        sendRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setForeground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backButton.setMaximumSize(new java.awt.Dimension(60, 60));
        backButton.setMinimumSize(new java.awt.Dimension(60, 60));
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 40, 49));
        jLabel4.setText("SEND DRUG ORGER REQUEST TO INVENTORY MANAGER");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

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
                        .addGap(391, 391, 391)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendRequestButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(sendRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestButtonActionPerformed
        // TODO add your handling code here:

        if (drugNameField.getText().isEmpty() && quantityField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the value for all fields");
        } else {

            if (quantityField.getText().isEmpty() == false) {
                try {
                    String stringPrice = quantityField.getText();
                    if (stringPrice.isEmpty() == false) {
                        int price = Integer.parseInt(stringPrice);

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter proper value for quantity");
                    return;
                }

            }
            WarehouseManagerWorkRequest wareHouseManagerWorkRequest = new WarehouseManagerWorkRequest();
            wareHouseManagerWorkRequest.setSender(userAccount);
            wareHouseManagerWorkRequest.setRequestDate(new Date());
            wareHouseManagerWorkRequest.setMessage("Order for more drugs");
            wareHouseManagerWorkRequest.setStatus("warehouse low on drugs");
            //   wareHouseManagerWorkRequest.setManuName(manuNameField.getText());
            wareHouseManagerWorkRequest.setDrug(salesManagerWorkRequest.getDrug());
            wareHouseManagerWorkRequest.setResult("Sent for ordering");
            wareHouseManagerWorkRequest.setQuantity(Integer.parseInt(quantityField.getText()));

//            int i = salesManagerWorkRequest.getQuant();
//            Order order = new Order();
//            while (i > 0) {
//                LotOfDrug lotOfDrug = new LotOfDrug();
//
//                for (int j = 0; j < 5 && i > 0; j++) {
//                    Package1 p = new Package1();
//                    p.setDrug(salesManagerWorkRequest.getDrug());
//                    p.setManuLotID(lotOfDrug.getLotID());
//                    p.setPackageStatus("Normal");
//                    lotOfDrug.addPackage(p);
//
//                    i--;
//                }
//                order.addLot(lotOfDrug);
//            }
//
//            wareHouseManagerWorkRequest.setOrder(order);

            DistributorEnterprise e = (DistributorEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            DistributorEnterprise e1 = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getClass().equals(DistributorEnterprise.class)) {
                    e1 = (DistributorEnterprise) enterprise;
                }
            }

            WarehouseOrganization warehouseOrganization = e1.getWarehouseOrganization();
            warehouseOrganization.getWorkQueue().getWorkRequestList().add(wareHouseManagerWorkRequest);

            // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
            e.getSalesManagementOrganization().getSentWorkQueue().getWorkRequestList().add(wareHouseManagerWorkRequest);

            JOptionPane.showMessageDialog(null, "Work Request Sent");
        }
    }//GEN-LAST:event_sendRequestButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void drugNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField drugNameField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton sendRequestButton;
    // End of variables declaration//GEN-END:variables
}
