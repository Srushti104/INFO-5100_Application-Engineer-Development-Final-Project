/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManager;

import Business.DistributorEnterprise;
import Business.Drug;
import Business.Enterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.SalesManagementOrganization;
import Business.WorkRequests.SalesManagerWorkRequest;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class OrderDrugsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form OrderDrugsJPanel
     */
    public OrderDrugsJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        manufacturerComboBox.removeAllItems();
        drugComboBox.removeAllItems();
        refresh();
    }

    public void refresh() {

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

            if (enterprise.getClass().equals(ManufacturerEnterprise.class)) {
                ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) enterprise;

                manufacturerComboBox.addItem(enterprise);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        orderDrugButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        resultField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        manufacturerComboBox = new javax.swing.JComboBox();
        drugComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("ORDER DRUGS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("MANUFACTURE NAME");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 40, 49));
        jLabel3.setText("DRUG NAME");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 40, 49));
        jLabel4.setText("QUANTITY");

        orderDrugButton.setBackground(new java.awt.Color(57, 62, 70));
        orderDrugButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        orderDrugButton.setForeground(new java.awt.Color(238, 238, 238));
        orderDrugButton.setText("ORDER DRUG");
        orderDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDrugButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
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

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 40, 49));
        jLabel5.setText("ADDITIONAL INFORMATION");

        resultField.setBackground(new java.awt.Color(238, 238, 238));
        resultField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        resultField.setForeground(new java.awt.Color(34, 40, 49));
        resultField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));

        quantityField.setBackground(new java.awt.Color(238, 238, 238));
        quantityField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        quantityField.setForeground(new java.awt.Color(34, 40, 49));
        quantityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        manufacturerComboBox.setBackground(new java.awt.Color(238, 238, 238));
        manufacturerComboBox.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        manufacturerComboBox.setForeground(new java.awt.Color(34, 40, 49));
        manufacturerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        manufacturerComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        manufacturerComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                manufacturerComboBoxItemStateChanged(evt);
            }
        });
        manufacturerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerComboBoxActionPerformed(evt);
            }
        });

        drugComboBox.setBackground(new java.awt.Color(238, 238, 238));
        drugComboBox.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugComboBox.setForeground(new java.awt.Color(34, 40, 49));
        drugComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drugComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(resultField)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(manufacturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(orderDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDrugButtonActionPerformed
        // TODO add your handling code here:

    
        Drug drug = (Drug) drugComboBox.getSelectedItem();
        if (quantityField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the value for the quantity required");

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
            SalesManagerWorkRequest salesManagerWorkRequest = new SalesManagerWorkRequest();
            salesManagerWorkRequest.setSender(userAccount);
            salesManagerWorkRequest.setRequestDate(new Date());
            salesManagerWorkRequest.setMessage("Request for Drugs");
            salesManagerWorkRequest.setStatus("Request for Drug Sent");
            salesManagerWorkRequest.setQuant(Integer.parseInt(quantityField.getText()));
            salesManagerWorkRequest.setResult(resultField.getText());
            salesManagerWorkRequest.setDrName(drug.getDrugName());
            salesManagerWorkRequest.setDrug(drug);

            DistributorEnterprise e = (DistributorEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            ManufacturerEnterprise e1 = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getClass().equals(ManufacturerEnterprise.class)) {
                    e1 = (ManufacturerEnterprise) enterprise;
                }
            }

            SalesManagementOrganization salesManagementOrganization = e1.getSalesManagementOrganization();
            salesManagementOrganization.getWorkQueue().getWorkRequestList().add(salesManagerWorkRequest);

            e.getWarehouseOrganization().getSentWorkQueue().getWorkRequestList().add(salesManagerWorkRequest);

            JOptionPane.showMessageDialog(null, "Order for Drugs Sent");
            quantityField.setText("");
            resultField.setText("");
        }
    }//GEN-LAST:event_orderDrugButtonActionPerformed


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void manufacturerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerComboBoxActionPerformed
        // TODO add your handling code here:
        ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) manufacturerComboBox.getSelectedItem();

        if (manufacturerEnterprise != null) {
            drugComboBox.removeAllItems();
            for (Drug drug : manufacturerEnterprise.getDrugCatalog().getDrugList()) {
                drugComboBox.addItem(drug);
            }
        }
    }//GEN-LAST:event_manufacturerComboBoxActionPerformed

    private void manufacturerComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manufacturerComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox drugComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox manufacturerComboBox;
    private javax.swing.JButton orderDrugButton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
