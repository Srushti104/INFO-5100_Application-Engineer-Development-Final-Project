/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BusinessAdmin;

import Business.Business;
import Business.Enterprise;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class AdminJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;
    /**
     * Creates new form AdminJPanel
     */
    public AdminJPanel(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
      //  adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/admin.jpg")));
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
        addNetworkButton = new javax.swing.JButton();
        manageNetworkButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("ADMIN WORK-AREA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        addNetworkButton.setBackground(new java.awt.Color(57, 62, 70));
        addNetworkButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addNetworkButton.setForeground(new java.awt.Color(238, 238, 238));
        addNetworkButton.setText("ADD NEW NETWORK");
        addNetworkButton.setPreferredSize(new java.awt.Dimension(150, 33));
        addNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkButtonActionPerformed(evt);
            }
        });

        manageNetworkButton.setBackground(new java.awt.Color(57, 62, 70));
        manageNetworkButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        manageNetworkButton.setForeground(new java.awt.Color(238, 238, 238));
        manageNetworkButton.setText("MANAGE NETWORK");
        manageNetworkButton.setPreferredSize(new java.awt.Dimension(150, 33));
        manageNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(558, 558, 558)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(addNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(manageNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(121, 121, 121)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(100, 100, 100)
                .add(addNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50)
                .add(manageNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkButtonActionPerformed
        // TODO add your handling code here:
        
        AddNetworkJPanel addNetworkJPanel=new AddNetworkJPanel(userProcessContainer,business);
        userProcessContainer.add("AddNetworks",addNetworkJPanel);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_addNetworkButtonActionPerformed

    private void manageNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkButtonActionPerformed
        // TODO add your handling code here:
        
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, business, userAccount);
        userProcessContainer.add("ManageNetwork",manageNetworkJPanel);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetworkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageNetworkButton;
    // End of variables declaration//GEN-END:variables
}
