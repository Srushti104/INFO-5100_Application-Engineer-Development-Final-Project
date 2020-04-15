/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Drug;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.ManagementOrganization;
import Business.WorkRequests.ManagerWorkRequest;
import Business.Network;
import Business.Package1;
import Business.Doctor;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class ReportAnIncidentJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ReportAnIncidentJPane
     */
    public ReportAnIncidentJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        dispenserNameComboBox.removeAllItems();
        packComboBox.removeAllItems();
        //drugNameComboBox.removeAllItems();
        refresh();
    }

    public void refresh() {

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                dispenserNameComboBox.addItem(hospitalEnterprise);
            }

        }
        Doctor doc = userAccount.getDoctor();
        Package1 tempPackage = null;
        for (Package1 package1 : doc.getDrugCatalog().getPackPatientList()) {

            packComboBox.addItem(package1.getPackageID());

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
        dispenserNameComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        drugNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        packComboBox = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Report Problem");

        jLabel2.setText("Drug Brought From:");

        dispenserNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dispenserNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispenserNameComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Drug Name:");

        jLabel4.setText("Details:");

        detailsTextArea.setColumns(20);
        detailsTextArea.setRows(5);
        jScrollPane1.setViewportView(detailsTextArea);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/backButton.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        reportButton.setText("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Package ID:");

        packComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drugNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(packComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dispenserNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reportButton)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(dispenserNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drugNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(packComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(reportButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dispenserNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispenserNameComboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_dispenserNameComboBoxActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:

        // InventoryItem inventoryItem=(InventoryItem)drugNameComboBox.getSelectedItem();
        // int pid=(Integer)drugNameComboBox.getSelectedItem();
        Enterprise enterprise = (Enterprise) dispenserNameComboBox.getSelectedItem();

        if (enterprise.getClass().equals(HospitalEnterprise.class)) {
            Doctor patient = userAccount.getDoctor();

            ManagerWorkRequest managerWokrRequest = new ManagerWorkRequest();
            managerWokrRequest.setSender(userAccount);
            managerWokrRequest.setRequestDate(new Date());
            managerWokrRequest.setStatus("Problem Reported");
            managerWokrRequest.setResult("Problem reported");
            // managerWokrRequest.setLicenseNumber(Integer.parseInt(licenseNumberField.getText()));
            managerWokrRequest.setMessage("Problem Reported");

            //  managerWokrRequest.setDrug(inventoryItem.getDrug());
            // managerWokrRequest.setPackage1();
            managerWokrRequest.setProblemReported(detailsTextArea.getText());
            managerWokrRequest.setDgName(drugNameField.getText());
            // managerWokrRequest.setPackID(Integer.parseInt(packageIDField.getText()));
            int pid = (Integer) packComboBox.getSelectedItem();

            for (Package1 package1 : patient.getDrugCatalog().getPackPatientList()) {
                if (package1.getPackageID() == pid) {
                    managerWokrRequest.setPackage1(package1);
                }
            }

            HospitalEnterprise e = (HospitalEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            //userAccount.getWorkQueue().getWorkRequestList().add(shipWorkRequest);
            JOptionPane.showMessageDialog(null, "Incident report sent");
            JOptionPane.showMessageDialog(null, "Processed succesfully");

            HospitalEnterprise d1 = null;
            for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise1.getClass().equals(HospitalEnterprise.class)) {
                    d1 = (HospitalEnterprise) enterprise1;
                }
            }

            ManagementOrganization managementOrganization = d1.getManagementOrganization();
            managementOrganization.getWorkQueue().getWorkRequestList().add(managerWokrRequest);
            //SalesManagementOrganization salesOrganization=e1.getSalesManagementOrganization();
            //  salesOrganization.getWorkQueue().getWorkRequestList().add(salesRequest);

            // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
            //e.getLicensingOrganization().getSentWorkQueue().getWorkRequestList().add(managerWokrRequest);
        }


    }//GEN-LAST:event_reportButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JComboBox dispenserNameComboBox;
    private javax.swing.JTextField drugNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox packComboBox;
    private javax.swing.JButton reportButton;
    // End of variables declaration//GEN-END:variables
}