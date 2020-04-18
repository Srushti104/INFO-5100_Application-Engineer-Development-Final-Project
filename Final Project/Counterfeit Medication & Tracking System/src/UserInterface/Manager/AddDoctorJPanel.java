/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manager;

import Business.Address;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.Network;
import Business.Organization;
import Business.Doctor;
import Business.Roles.DoctorRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class AddDoctorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form AddPatientJPanel
     */
    public AddDoctorJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        hospJCombo.removeAllItems();
        //  hospNameField.setEditable(true);
        refresh();
    }

    public void refresh() {

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise hospital = (HospitalEnterprise) enterprise;

                hospJCombo.addItem(enterprise);

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addDoctorButton = new javax.swing.JButton();
        stateField = new javax.swing.JTextField();
        zipcodeField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        line2Field = new javax.swing.JTextField();
        line1Field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hospJCombo = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Doctor details");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Hospital Name:");

        jLabel5.setText("UserName:");

        jLabel6.setText("Password:");

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addDoctorButton.setText("Add Doctor");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Zipcode:");

        jLabel11.setText("State:");

        jLabel10.setText("City:");

        jLabel9.setText("Line2:");

        jLabel8.setText("Line1:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Home Address");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Personal Details");

        hospJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(zipcodeField)
                                            .addComponent(line1Field)
                                            .addComponent(line2Field)
                                            .addComponent(cityField)
                                            .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(lastNameField)
                                            .addComponent(userNameField)
                                            .addComponent(passwordField)
                                            .addComponent(hospJCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addDoctorButton)
                        .addGap(91, 91, 91)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hospJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(line1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(line2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(addDoctorButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

            for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                for (UserAccount userAccount1 : organization.getUserAccountDirectory().getUserAccountList()) {
                    if (userAccount == userAccount1) {
                        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || userNameField.getText().isEmpty() || passwordField.getText().isEmpty()
                                || line1Field.getText().isEmpty() || line2Field.getText().isEmpty() || cityField.getText().isEmpty() || zipcodeField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        } else {

                            HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                            Doctor doc = hospitalEnterprise.getDoctorDirectory().newDoctor();
                            //           HospitalEnterprise hosp = (HospitalEnterprise) hospJCombo.getSelectedItem();

                            //   hospNameField.setText(hospitalEnterprise.getEnterpriseName());
                            doc.setFirstName(firstNameField.getText());
                            doc.setLastName(lastNameField.getText());
                            doc.setHsopName(hospJCombo.getSelectedItem().toString());

                            Address address = doc.getAddress();
                            address.setLine1(line1Field.getText());
                            address.setLine2(line2Field.getText());
                            address.setCity(cityField.getText());
                            address.setState(stateField.getText());
                            address.setZipcode(zipcodeField.getText());

                            UserAccount userAccount2 = hospitalEnterprise.getUserAccountDirectory().newAccount();
                            userAccount2.setUserName(userNameField.getText());
                            userAccount2.setPassword(passwordField.getText());
                            userAccount2.setRole(new DoctorRole());
                            userAccount2.setDoctor(doc);

                            JOptionPane.showMessageDialog(null, "Doctor added");

                            firstNameField.setText("");
                            lastNameField.setText("");
                            userNameField.setText("");
                            passwordField.setText("");

                            line1Field.setText("");
                            line2Field.setText("");
                            cityField.setText("");
                            stateField.setText("");
                            zipcodeField.setText("");
                        }

                    }
                }
            }
        }

    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox hospJCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField line1Field;
    private javax.swing.JTextField line2Field;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField stateField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JTextField zipcodeField;
    // End of variables declaration//GEN-END:variables
}
