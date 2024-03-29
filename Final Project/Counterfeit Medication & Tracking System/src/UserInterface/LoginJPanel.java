/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.Enterprise;
import Business.Network;

/**
 *
 * @author srush
 */
public class LoginJPanel extends javax.swing.JPanel {

    private MainJFrame mainJFrame;

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(MainJFrame frame) {
        initComponents();
        mainJFrame = frame;
        enterpriseJComboBox.removeAllItems();

        Business business = frame.getBusiness();
        enterpriseJComboBox.addItem(business);
        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            enterpriseJComboBox.addItem(network);

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                enterpriseJComboBox.addItem(enterprise);
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

        enterpriseJComboBox = new javax.swing.JComboBox();
        passwordJPasswordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        usernameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 40, 49));
        setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1280, 100));
        setMinimumSize(new java.awt.Dimension(1280, 100));
        setPreferredSize(new java.awt.Dimension(1280, 100));

        enterpriseJComboBox.setBackground(new java.awt.Color(238, 238, 238));
        enterpriseJComboBox.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(34, 40, 49));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.setBorder(null);
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        passwordJPasswordField.setBackground(new java.awt.Color(238, 238, 238));
        passwordJPasswordField.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(57, 62, 70));
        passwordJPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        passwordJPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        loginJButton.setBackground(new java.awt.Color(238, 238, 238));
        loginJButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(34, 40, 49));
        loginJButton.setText("LOGIN");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        usernameJTextField.setBackground(new java.awt.Color(238, 238, 238));
        usernameJTextField.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(57, 62, 70));
        usernameJTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true), null));
        usernameJTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("USERNAME:");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("PASSWORD:");

        jLabel3.setFont(new java.awt.Font("Niagara Engraved", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 173, 181));
        jLabel3.setText("CMTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameJTextField.getText();
        String password = passwordJPasswordField.getText();
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        mainJFrame.loginUser(username, password, enterprise);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
