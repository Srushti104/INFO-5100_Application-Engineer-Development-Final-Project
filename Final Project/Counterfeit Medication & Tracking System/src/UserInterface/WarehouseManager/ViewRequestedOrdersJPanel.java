/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManager;

import Business.WorkQueue;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewRequestedOrdersJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    WorkQueue workQueue;

    /**
     * Creates new form ViewRequestedOrdersJPanel
     */
    public ViewRequestedOrdersJPanel(JPanel userProcessContainer,WorkQueue workQueue) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.workQueue=workQueue;
        refresh();
    }

    
    
    public void refresh()
    {
        
        
        
        
         int rowCount=sentWorkRequestJTable.getRowCount();
        
        for(int i=rowCount-1;i>=0;i--)
        {
            ((DefaultTableModel)sentWorkRequestJTable.getModel()).removeRow(i);
        }
        
        
        for(WorkRequest wr:workQueue.getWorkRequestList())
        {
            Object row[]=new Object[5];
            row[0]=wr;
            row[1]=wr.getSender().getEmployee().getFirstName();
            if(wr.getReceiver()!=null)
            {
                row[2]=wr.getReceiver().getEmployee().getFirstName();
            }
            row[3]=wr.getStatus();
           // row[4]=((SalesWorkRequest)wr).getResult();
            
            ((DefaultTableModel)sentWorkRequestJTable.getModel()).addRow(row);
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

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sentWorkRequestJTable = new javax.swing.JTable();

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/backButton.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Work Request Sent");

        sentWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sentWorkRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
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
    private javax.swing.JTable sentWorkRequestJTable;
    // End of variables declaration//GEN-END:variables
}
