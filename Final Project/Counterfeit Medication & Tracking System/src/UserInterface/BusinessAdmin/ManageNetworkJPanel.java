/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BusinessAdmin;

import Business.Business;
import Business.Enterprise;
import Business.Network;
import Business.Roles.NetworkAdminRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
        refresh();
    }
    
    
    public void refresh()
    {
        
        int rowCount = networkTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) networkTable.getModel()).removeRow(i);
        }

        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            Object row[] = new Object[3];
            row[0] = network;
            row[1] = network.getNetworkName();
            for (UserAccount ua : network.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getRole().getClass().equals(NetworkAdminRole.class)) {
                   // row[1] = ua.getEmployee().getFirstName() + " " + ua.getEmployee().getLastName();
                    row[2] = ua.getUserName();
                }
            }
            ((DefaultTableModel) networkTable.getModel()).addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 20, -1, -1));

        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Network ID", "Network Name", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 92, 610, 130));
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 55, 50, 26));

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 42, 27));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkTable;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
