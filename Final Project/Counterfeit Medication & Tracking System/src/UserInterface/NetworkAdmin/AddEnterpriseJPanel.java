/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NetworkAdmin;

import Business.DistributorEnterprise;
import Business.Employee;
import Business.Enterprise;
import Business.FDAEnterprise;
import Business.HospitalEnterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Roles.EnterpriseAdminRole;
import Business.StateRegulatoryEnterprise;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class AddEnterpriseJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form AddEnterpriseJPanel
     */
    public AddEnterpriseJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        enterpriseTypeComboBox.removeAllItems();

        enterpriseTypeComboBox.addItem(Enterprise.FDA);
        enterpriseTypeComboBox.addItem(Enterprise.MANUFACTURER);
        enterpriseTypeComboBox.addItem(Enterprise.DISTRIBUTOR);
        enterpriseTypeComboBox.addItem(Enterprise.HOSPITAL);
        enterpriseTypeComboBox.addItem(Enterprise.STATEREGULATORYAFFAIRS);
//        enterpriseTypeComboBox.addItem(Enterprise.LAWENFORCEMENTUNIT);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        enterpriseTypeComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enterpriseNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Enterprise");

        jLabel7.setText("First Name:");

        enterpriseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Last Name:");

        jLabel3.setText("Enterprise Type:");

        jLabel2.setText("Enterprise Name:");

        jLabel4.setText("User Name:");

        jLabel5.setText("Password:");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(addButton)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(enterpriseTypeComboBox, 0, 125, Short.MAX_VALUE)
                                .addComponent(enterpriseNameField)
                                .addComponent(userNameField)
                                .addComponent(passwordField)
                                .addComponent(firstNameField)
                                .addComponent(lastNameField))))
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(273, 273, 273)
                .addComponent(addButton)
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel1)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(enterpriseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(127, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        String enpName = enterpriseNameField.getText();
        String enterprise = (String) enterpriseTypeComboBox.getSelectedItem();
        // System.out.println("ent"+enterprise);

        if (enterprise == Enterprise.FDA) {

            if (!userNameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {

                if (!network.getEnterpriseDirectory().isUserExisting(userNameField.getText())) {
                    FDAEnterprise fdaEnterprise = (FDAEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.FDA, enpName);

                    Employee employee = fdaEnterprise.getEmployeeDirectory().newEmployee();
                    employee.setFirstName(firstNameField.getText());
                    employee.setLastName(lastNameField.getText());

                    fdaEnterprise.setEnterpriseName(enpName);
                    fdaEnterprise.setEnterpriseType(enterprise);

                    UserAccount userAccount = fdaEnterprise.getUserAccountDirectory().newAccount();
                    userAccount.setUserName(userNameField.getText());
                    userAccount.setPassword(passwordField.getText());
                    userAccount.setRole(new EnterpriseAdminRole());
                    userAccount.setEmployee(employee);

                    JOptionPane.showMessageDialog(this, "FDA Enterprise added");

                    enterpriseNameField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    userNameField.setText("");
                    passwordField.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "Username is already existing");

                }

            } else {

                JOptionPane.showMessageDialog(this, "Username/Password is empty");
            }

        }
        if (enterprise == Enterprise.STATEREGULATORYAFFAIRS) {

            if (!userNameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                //getText() != null && passwordField.getText() != null

                if (!network.getEnterpriseDirectory().isUserExisting(userNameField.getText())) {

                    StateRegulatoryEnterprise stateRegulatoryEnterprise = (StateRegulatoryEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.STATEREGULATORYAFFAIRS, enpName);

                    Employee employee = stateRegulatoryEnterprise.getEmployeeDirectory().newEmployee();
                    employee.setFirstName(firstNameField.getText());
                    employee.setLastName(lastNameField.getText());

                    stateRegulatoryEnterprise.setEnterpriseName(enpName);
                    stateRegulatoryEnterprise.setEnterpriseType(enterprise);

                    UserAccount userAccount1 = stateRegulatoryEnterprise.getUserAccountDirectory().newAccount();
                    userAccount1.setUserName(userNameField.getText());
                    userAccount1.setPassword(passwordField.getText());
                    userAccount1.setRole(new EnterpriseAdminRole());
                    userAccount1.setEmployee(employee);

                    JOptionPane.showMessageDialog(this, "State Reulatory Affairs Enterprise added");

                    enterpriseNameField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    userNameField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Username already existing");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Username/Password is empty");
            }

        }

//        if (enterprise == Enterprise.LAWENFORCEMENTUNIT) {
//
//            if (!userNameField.getText().isEmpty() &&!passwordField.getText().isEmpty()) {
//                    //getText() != null && passwordField.getText() != null
//                
//                 if(!network.getEnterpriseDirectory().isUserExisting(userNameField.getText()))
//                {
//                    
//
//                LawEnforcementUnitEnterprise lawEnforcementUnitEnterprise = (LawEnforcementUnitEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.LAWENFORCEMENTUNIT, enpName);
//
//
//                Employee employee = lawEnforcementUnitEnterprise.getEmployeeDirectory().newEmployee();
//                employee.setFirstName(firstNameField.getText());
//                employee.setLastName(lastNameField.getText());
//
//                lawEnforcementUnitEnterprise.setEnterpriseName(enpName);
//                lawEnforcementUnitEnterprise.setEnterpriseType(enterprise);
//
//
//                UserAccount userAccount1 = lawEnforcementUnitEnterprise.getUserAccountDirectory().newAccount();
//                userAccount1.setUserName(userNameField.getText());
//                userAccount1.setPassword(passwordField.getText());
//                userAccount1.setRole(new EnterpriseAdminRole());
//                userAccount1.setEmployee(employee);
//
//
//
//                JOptionPane.showMessageDialog(this, "Law Enforcement Unit Enterprise added");
//
//                enterpriseNameField.setText("");
//                firstNameField.setText("");
//                lastNameField.setText("");
//                userNameField.setText("");
//                passwordField.setText("");
//            } 
//                 
//                 else
//                 {
//                      JOptionPane.showMessageDialog(this, "Username already existing");
//                     
//                 }
//            }
//            else {
//                JOptionPane.showMessageDialog(this, "Username/Password is empty");
//            }
        //     }
        if (enterprise == Enterprise.MANUFACTURER) {

            if (!userNameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                //getText() != null && passwordField.getText() != null

                if (!network.getEnterpriseDirectory().isUserExisting(userNameField.getText())) {

                    ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, enpName);

                    Employee employee = manufacturerEnterprise.getEmployeeDirectory().newEmployee();
                    employee.setFirstName(firstNameField.getText());
                    employee.setLastName(lastNameField.getText());

                    manufacturerEnterprise.setEnterpriseName(enpName);
                    manufacturerEnterprise.setEnterpriseType(enterprise);

                    UserAccount userAccount1 = manufacturerEnterprise.getUserAccountDirectory().newAccount();
                    userAccount1.setUserName(userNameField.getText());
                    userAccount1.setPassword(passwordField.getText());
                    userAccount1.setRole(new EnterpriseAdminRole());
                    userAccount1.setEmployee(employee);

                    JOptionPane.showMessageDialog(this, "Manufacturers Enterprise added");

                    enterpriseNameField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    userNameField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Username already existing");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Username/Password is empty");
            }

        }
        if (enterprise == Enterprise.DISTRIBUTOR) {

            if (!userNameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                //getText() != null && passwordField.getText() != null

                if (!network.getEnterpriseDirectory().isUserExisting(userNameField.getText())) {

                    DistributorEnterprise distributorEnterprise = (DistributorEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.DISTRIBUTOR, enpName);

                    Employee employee = distributorEnterprise.getEmployeeDirectory().newEmployee();
                    employee.setFirstName(firstNameField.getText());
                    employee.setLastName(lastNameField.getText());

                    distributorEnterprise.setEnterpriseName(enpName);
                    distributorEnterprise.setEnterpriseType(enterprise);

                    UserAccount userAccount1 = distributorEnterprise.getUserAccountDirectory().newAccount();
                    userAccount1.setUserName(userNameField.getText());
                    userAccount1.setPassword(passwordField.getText());
                    userAccount1.setRole(new EnterpriseAdminRole());
                    userAccount1.setEmployee(employee);

                    JOptionPane.showMessageDialog(this, "Distributor Enterprise added");

                    enterpriseNameField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    userNameField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Username already existing");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Username/Password is empty");
            }

        }
        if (enterprise == Enterprise.HOSPITAL) {

            if (!userNameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                //getText() != null && passwordField.getText() != null

                if (!network.getEnterpriseDirectory().isUserExisting(userNameField.getText())) {

                    HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) network.getEnterpriseDirectory().newEnterprise(Enterprise.HOSPITAL, enpName);

                    Employee employee = hospitalEnterprise.getEmployeeDirectory().newEmployee();
                    employee.setFirstName(firstNameField.getText());
                    employee.setLastName(lastNameField.getText());

                    hospitalEnterprise.setEnterpriseName(enpName);
                    hospitalEnterprise.setEnterpriseType(enterprise);

                    UserAccount userAccount1 = hospitalEnterprise.getUserAccountDirectory().newAccount();
                    userAccount1.setUserName(userNameField.getText());
                    userAccount1.setPassword(passwordField.getText());
                    userAccount1.setRole(new EnterpriseAdminRole());
                    userAccount1.setEmployee(employee);

                    JOptionPane.showMessageDialog(this, "Hospital Enterprise added");

                    enterpriseNameField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    userNameField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Username already existing");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Username/Password is empty");
            }

        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterpriseTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField enterpriseNameField;
    private javax.swing.JComboBox enterpriseTypeComboBox;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
