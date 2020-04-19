/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BusinessAdmin;

import Business.Business;
import Business.Employee;
import Business.Network;
import Business.NetworkDirectory;
import Business.Roles.NetworkAdminRole;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class AddNetworkJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business business;

    /**
     * Creates new form AddNetworkJPanel
     */
    public AddNetworkJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
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
        networkNameField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userAccountField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        reenterPass = new javax.swing.JLabel();
        reenterPassField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NETWORK");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("NETWORK NAME");

        networkNameField.setBackground(new java.awt.Color(238, 238, 238));
        networkNameField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        networkNameField.setForeground(new java.awt.Color(34, 40, 49));
        networkNameField.setMaximumSize(new java.awt.Dimension(200, 24));
        networkNameField.setMinimumSize(new java.awt.Dimension(200, 24));
        networkNameField.setPreferredSize(new java.awt.Dimension(200, 24));

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

        addButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(238, 238, 238));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 40, 49));
        jLabel3.setText("CREATE USER ACCOUNT");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 40, 49));
        jLabel4.setText("CREATE PASSWORD");

        userAccountField.setBackground(new java.awt.Color(238, 238, 238));
        userAccountField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        userAccountField.setForeground(new java.awt.Color(34, 40, 49));
        userAccountField.setMaximumSize(new java.awt.Dimension(200, 24));
        userAccountField.setMinimumSize(new java.awt.Dimension(200, 24));
        userAccountField.setPreferredSize(new java.awt.Dimension(200, 24));

        passwordField.setBackground(new java.awt.Color(238, 238, 238));
        passwordField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(34, 40, 49));
        passwordField.setMaximumSize(new java.awt.Dimension(200, 24));
        passwordField.setMinimumSize(new java.awt.Dimension(200, 24));
        passwordField.setPreferredSize(new java.awt.Dimension(200, 24));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 40, 49));
        jLabel5.setText("USER FIRST NAME");

        firstNameField.setBackground(new java.awt.Color(238, 238, 238));
        firstNameField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(34, 40, 49));
        firstNameField.setMaximumSize(new java.awt.Dimension(200, 24));
        firstNameField.setMinimumSize(new java.awt.Dimension(200, 24));
        firstNameField.setPreferredSize(new java.awt.Dimension(200, 24));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 40, 49));
        jLabel6.setText("USER LAST NAME");

        lastNameField.setBackground(new java.awt.Color(238, 238, 238));
        lastNameField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(34, 40, 49));
        lastNameField.setMaximumSize(new java.awt.Dimension(200, 24));
        lastNameField.setMinimumSize(new java.awt.Dimension(200, 24));
        lastNameField.setPreferredSize(new java.awt.Dimension(200, 24));

        reenterPass.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        reenterPass.setForeground(new java.awt.Color(34, 40, 49));
        reenterPass.setText("RE-ENTER PASSWORD");

        reenterPassField.setBackground(new java.awt.Color(238, 238, 238));
        reenterPassField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        reenterPassField.setForeground(new java.awt.Color(34, 40, 49));
        reenterPassField.setMaximumSize(new java.awt.Dimension(200, 24));
        reenterPassField.setMinimumSize(new java.awt.Dimension(200, 24));
        reenterPassField.setPreferredSize(new java.awt.Dimension(200, 24));

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
                        .addGap(439, 439, 439)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reenterPass, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userAccountField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(networkNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reenterPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(579, 579, 579)
                        .addComponent(jLabel1)))
                .addContainerGap(439, Short.MAX_VALUE))
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
                    .addComponent(jLabel2)
                    .addComponent(networkNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userAccountField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reenterPass)
                    .addComponent(reenterPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here

        if (!userAccountField.getText().isEmpty() && !passwordField.getText().isEmpty() && !networkNameField.getText().isEmpty()) {
            if (passwordPattern() == false) {
                jLabel2.setForeground(Color.red);
                passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, "
                        + "one lower case letter, one digit and one special character $, *, # or &.");
                return;
                
            }            
            
            if (rePasswordPattern() == false) {
                jLabel3.setForeground(Color.red);
                reenterPassField.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
                return;
                
            } 
            for(Network n: business.getNetworkDirectory().getNetworkList())
            {
                
                if(n.getNetworkName().equalsIgnoreCase(networkNameField.getText())){
                JOptionPane.showMessageDialog(null, "Network already exists.");
                return;
                }
            }
            
            Network network = business.getNetworkDirectory().newNetwork();
            network.setNetworkName(networkNameField.getText());
            
            Employee employee = network.getEmployeeDirectory().newEmployee();
            employee.setFirstName(firstNameField.getText());
            employee.setLastName(lastNameField.getText());
            
            UserAccount userAccount1 = network.getUserAccountDirectory().newAccount();
            userAccount1.setUserName(userAccountField.getText());
            userAccount1.setPassword(passwordField.getText());
            userAccount1.setRole(new NetworkAdminRole());
            userAccount1.setEmployee(employee);
            
            JOptionPane.showMessageDialog(this, "Network added");
            
            networkNameField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            userAccountField.setText("");
            passwordField.setText("");
            reenterPassField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all the fields");
            
        }
        

    }//GEN-LAST:event_addButtonActionPerformed
    
    private boolean passwordPattern() {
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(passwordField.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean rePasswordPattern() {
        String password = passwordField.getText();
        String rePassword = reenterPassField.getText();
        if (password.equals(rePassword)) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField networkNameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel reenterPass;
    private javax.swing.JTextField reenterPassField;
    private javax.swing.JTextField userAccountField;
    // End of variables declaration//GEN-END:variables
}
