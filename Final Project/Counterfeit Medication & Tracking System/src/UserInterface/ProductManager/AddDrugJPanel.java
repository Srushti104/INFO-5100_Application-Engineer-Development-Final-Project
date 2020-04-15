/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManager;

import Business.Drug;
import Business.Enterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Organization;
import Business.WorkRequests.ProductManagerWorkRequest;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class AddDrugJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    ProductManagerWorkRequest productManagerWorkRequest;
    UserAccount userAccount;
    Network network;

    /**
     * Creates new form AddDrugJPanel
     */
    public AddDrugJPanel(JPanel userProcessContainer,ProductManagerWorkRequest productManagerWorkRequest,UserAccount userAccount,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.productManagerWorkRequest=productManagerWorkRequest;
        this.userAccount=userAccount;
        this.network=network;
        
        
       // System.out.println(""+productManagerWorkRequest.getDrugName());
        drugNameField.setText(productManagerWorkRequest.getDrName());
        
         
        idField.setVisible(false);
        idLabel.setVisible(false);
        infoLabel.setVisible(false);
        drugNameField.setEditable(false);
      //  manuNameField.setText(productManagerWorkRequest..getManufacturerName());
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
        drugNameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        actPriceField = new javax.swing.JTextField();
        drugMgField = new javax.swing.JTextField();
        drugForField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        drugContentsField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Drug");

        jLabel2.setText("Drug Name:");

        drugNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameFieldActionPerformed(evt);
            }
        });

        actPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actPriceFieldActionPerformed(evt);
            }
        });

        drugMgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugMgFieldActionPerformed(evt);
            }
        });

        idLabel.setText("Drug ID:");

        jLabel4.setText("Actual Price:");

        jLabel10.setText("Drug mg:");

        jLabel11.setText("Drug for:");

        jLabel12.setText("Drug contents:");

        infoLabel.setForeground(new java.awt.Color(255, 0, 0));
        infoLabel.setText("Please enter a valid price value!!!");

        drugContentsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugContentsFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/backButton.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(saveButton)
                .add(104, 104, 104))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(backButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(188, 188, 188)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(infoLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(idField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createSequentialGroup()
                            .add(jLabel2)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(23, 23, 23)
                                    .add(jLabel1))
                                .add(layout.createSequentialGroup()
                                    .add(59, 59, 59)
                                    .add(drugNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(idLabel)
                            .add(jLabel10)
                            .add(jLabel11)
                            .add(jLabel12))
                        .add(44, 44, 44)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(drugContentsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(actPriceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(drugMgField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(drugForField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(backButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(drugNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idLabel)
                    .add(idField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(actPriceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(drugMgField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(drugForField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel12)
                    .add(drugContentsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(85, 85, 85)
                .add(saveButton)
                .add(38, 38, 38)
                .add(infoLabel)
                .add(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameFieldActionPerformed

    private void actPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actPriceFieldActionPerformed

    private void drugMgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugMgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugMgFieldActionPerformed

    private void drugContentsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugContentsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugContentsFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
        {
            
        for(Organization organization:enterprise.getOrganizationDirectory().getOrgList())
        {
            for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList())
            {
        if(userAccount==userAccount1)
        {
            if(drugContentsField.getText().isEmpty() || drugMgField.getText().isEmpty() || drugForField.getText().isEmpty() || actPriceField.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(null, "Please enter all fields");
            }
            
            else
            {
        ManufacturerEnterprise manufacturerEnterprise=(ManufacturerEnterprise)enterprise;
        Drug drug=manufacturerEnterprise.getDrugCatalog().newDrug();
        
        
        drug.setDrugName(drugNameField.getText());
        drug.setDrugContents(drugContentsField.getText());
        drug.setDrugMg(drugMgField.getText());
        
        drug.setDrugFor(drugForField.getText());
        //drug.setManName(manufacturer.getManufacturerName());
        try{
        String stringPrice=actPriceField.getText();
        if(stringPrice.isEmpty()== false)
        {
            int price=Integer.parseInt(stringPrice);
            drug.setActualPrice(price);
            
        }
        else{
            actPriceField.setText("N/A");
        }
        }
        catch(NumberFormatException e)
        {
            infoLabel.setVisible(true);
        }
       
        
        JOptionPane.showMessageDialog(null, "Drug added");
       
        }
            }
        }
        }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actPriceField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField drugContentsField;
    private javax.swing.JTextField drugForField;
    private javax.swing.JTextField drugMgField;
    private javax.swing.JTextField drugNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
