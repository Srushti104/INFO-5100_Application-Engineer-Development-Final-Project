/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugTester;

import Business.Business;
import Business.WorkRequests.DrugTesterWorkRequest;
import Business.Enterprise;
import Business.FDAEnterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srush
 */
public class DrugTesterJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form ViewReportedIncidentsJPanel
     */
    public DrugTesterJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            if (e.getClass().equals(FDAEnterprise.class)) {
                Organization org = ((FDAEnterprise) e).getDrugTestingOrganization();

                for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {
                    DrugTesterWorkRequest drugTesterWorkRequest = (DrugTesterWorkRequest) workRequest;
                    Object row[] = new Object[7];
                    row[0] = workRequest;
                    row[1] = workRequest.getSender().getEmployee().getFirstName();

                    if (workRequest.getReceiver() != null) {
                        row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                    }

                    row[3] = workRequest.getStatus();
                    row[4] = drugTesterWorkRequest.getEnterprise();
                    row[5] = drugTesterWorkRequest.getPackage1();

                    ((DefaultTableModel) requestsTable.getModel()).addRow(row);
                }
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
        refreshButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();
        reportDrugButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("DRUG TESTER WORK-AREA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        refreshButton2.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/refresh.png"))); // NOI18N
        refreshButton2.setBorder(null);
        refreshButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        refreshButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton2ActionPerformed(evt);
            }
        });

        requestsTable.setBackground(new java.awt.Color(238, 238, 238));
        requestsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        requestsTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        requestsTable.setForeground(new java.awt.Color(34, 40, 49));
        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Enterprise", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestsTable.setGridColor(new java.awt.Color(34, 40, 49));
        requestsTable.setMaximumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setMinimumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setPreferredSize(new java.awt.Dimension(1000, 122));
        requestsTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        requestsTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(requestsTable);

        assignButton.setBackground(new java.awt.Color(57, 62, 70));
        assignButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        assignButton.setForeground(new java.awt.Color(238, 238, 238));
        assignButton.setText("ASSIGN TO ME");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        reportDrugButton.setBackground(new java.awt.Color(57, 62, 70));
        reportDrugButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        reportDrugButton.setForeground(new java.awt.Color(238, 238, 238));
        reportDrugButton.setText("REPORT DRUG");
        reportDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportDrugButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(reportDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton2ActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshButton2ActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        int row = requestsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(row, 0);

        if (workRequest.getReceiver() == null) {

            workRequest.setReceiver(userAccount);

            workRequest.setStatus("drug under test");

            refresh();
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assigned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void reportDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportDrugButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }
        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (workRequest.getReceiver() != null) {

            workRequest.setReceiver(userAccount);

            workRequest.setStatus("Report Sent");

            refresh();
        }

        DrugTesterWorkRequest drugTesterWorkRequest = (DrugTesterWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (drugTesterWorkRequest.getReceiver() != null && userAccount == drugTesterWorkRequest.getReceiver()) {

            ReportDrugJPanel reportDrugJPanel = new ReportDrugJPanel(userProcessContainer, drugTesterWorkRequest, userAccount, business);
            userProcessContainer.add("repd", reportDrugJPanel);

            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "Please assign it and then proceed/Task might be assigned to other person");
        }
    }//GEN-LAST:event_reportDrugButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton2;
    private javax.swing.JButton reportDrugButton;
    private javax.swing.JTable requestsTable;
    // End of variables declaration//GEN-END:variables
}
