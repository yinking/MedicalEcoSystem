/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalEnterprise;

import dao.DrugDao;
import dao.MessageDao;
import dao.UserDao;
import entities.Drug;
import entities.Message;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GladysWang
 */
public class DrugInfoPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;

    /**
     * Creates new form MessagePanel
     */
    public DrugInfoPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        popupTable();
    }
    
    private void popupTable() {

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Number");
        dtm.addColumn("Name");
        dtm.addColumn("Route");
        for (Drug c : new DrugDao().findAll()) {
            dtm.addRow(new Object[]{c, c.getName(), c.getRoute()});
        }
        tlbDrug.setModel(dtm);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbDrug = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(890, 502));
        setPreferredSize(new java.awt.Dimension(890, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel4.setText("Drug Info");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 220, 36));

        tlbDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message ID", "Message Title", "Receiver ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tlbDrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbDrugMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlbDrug);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 760, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void tlbDrugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbDrugMouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_tlbDrugMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlbDrug;
    // End of variables declaration//GEN-END:variables
}
