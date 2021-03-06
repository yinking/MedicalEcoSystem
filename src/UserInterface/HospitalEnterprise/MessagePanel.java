/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalEnterprise;

import dao.MessageDao;
import dao.UserDao;
import entities.Message;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GladysWang
 */
public class MessagePanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;

    /**
     * Creates new form MessagePanel
     */
    public MessagePanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        popupTable();
    }
    
    private void popupTable() {
        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Sender");
        dtm.addColumn("title");
        for (Message message : new MessageDao().getMessageByUserID(UserDao.getUser().getIdUser() + "")) {
            dtm.addRow(new Object[]{message, message.getSender(), message.getTitle()});
        }
        tlbMessage.setModel(dtm);
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
        tlbMessage = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        contentTa = new javax.swing.JScrollPane();
        taContent = new javax.swing.JTextArea();
        replyBtn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(890, 502));
        setPreferredSize(new java.awt.Dimension(890, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel4.setText("Message Channel");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 220, 36));

        tlbMessage.setModel(new javax.swing.table.DefaultTableModel(
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
        tlbMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbMessageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlbMessage);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 730, 150));

        jLabel8.setText("Content:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        taContent.setColumns(20);
        taContent.setLineWrap(true);
        taContent.setRows(5);
        contentTa.setViewportView(taContent);

        add(contentTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 480, 100));

        replyBtn.setText("Reply");
        replyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyBtnActionPerformed(evt);
            }
        });
        add(replyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tlbMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbMessageMouseClicked
        // TODO add your handling code here:
        int index = tlbMessage.getSelectedRow();
        Message message = (Message) tlbMessage.getValueAt(index, 0);
        taContent.setText(message.getContent());
    }//GEN-LAST:event_tlbMessageMouseClicked

    private void replyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_replyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane contentTa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton replyBtn;
    private javax.swing.JTextArea taContent;
    private javax.swing.JTable tlbMessage;
    // End of variables declaration//GEN-END:variables
}
