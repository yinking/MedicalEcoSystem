/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugEnterprise.DruggistRole;

import dao.DrugCatalogDao;
import dao.DrugDao;
import dao.JoinSeletedCompoundDao;
import entities.Drug;
import entities.DrugCatalog;
import entities.JoinSelectedCompound;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ke Wang
 * 
 */
public class UpdateDrugPanel extends javax.swing.JPanel {

    JPanel container;

    /**
     * Creates new form DrugPanel
     */
    public UpdateDrugPanel(JPanel container) {
        initComponents();
        this.container = container;
        popupTable();
        initCombox();
    }

    private void initCombox() {
        cbCatalog.removeAllItems();
        DrugCatalogDao dao = new DrugCatalogDao();
        for (DrugCatalog c : dao.findAll()) {
            cbCatalog.addItem(c);
        }
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

        jScrollPane4 = new javax.swing.JScrollPane();
        tlbDrug = new javax.swing.JTable();
        compoundTbl = new javax.swing.JTabbedPane();
        existedPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tlbCompound = new javax.swing.JTable();
        btnAddCompound = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfDrugNumber = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfUsage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taManu = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbCatalog = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taIndication = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        tfFormula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRoute = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(985, 697));
        setPreferredSize(new java.awt.Dimension(985, 697));
        setLayout(null);

        tlbDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Status", "Route of Administration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane4.setViewportView(tlbDrug);

        add(jScrollPane4);
        jScrollPane4.setBounds(10, 140, 300, 530);

        compoundTbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        existedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tlbCompound.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Formula", "Quantity", "Add-in Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tlbCompound);

        existedPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 200));

        btnAddCompound.setText("Add Compound");
        btnAddCompound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompoundActionPerformed(evt);
            }
        });
        existedPanel.add(btnAddCompound, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        updateBtn1.setText("Update Drug");
        existedPanel.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        compoundTbl.addTab("Existed Compound", existedPanel);

        add(compoundTbl);
        compoundTbl.setBounds(320, 390, 630, 279);
        compoundTbl.getAccessibleContext().setAccessibleName("");

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Search-Search-icon.png"))); // NOI18N

        searchJButton.setText("Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "name", "formula" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchJButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        add(jPanel2);
        jPanel2.setBounds(10, 50, 310, 90);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Drug Name:");

        jLabel7.setText("Drug Number:");

        jLabel5.setText("Usage:");

        jLabel9.setText("Manufacture:");

        taManu.setColumns(15);
        taManu.setLineWrap(true);
        taManu.setRows(5);
        jScrollPane2.setViewportView(taManu);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(60, 60, 60)
                            .addComponent(tfUsage))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1))
                            .addGap(13, 13, 13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfDrugNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfDrugNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel13.setText("Route :");

        jLabel6.setText("Catalog:");

        cbCatalog.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Indication:");

        taIndication.setColumns(15);
        taIndication.setLineWrap(true);
        taIndication.setRows(5);
        jScrollPane3.setViewportView(taIndication);

        jLabel3.setText("Formula:");

        taRoute.setColumns(15);
        taRoute.setLineWrap(true);
        taRoute.setRows(5);
        jScrollPane1.setViewportView(taRoute);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFormula)
                            .addComponent(cbCatalog, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        add(jPanel3);
        jPanel3.setBounds(320, 20, 630, 350);

        jLabel10.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel10.setText("Update Drug");
        add(jLabel10);
        jLabel10.setBounds(40, 10, 190, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
//        CompoundDao dao = new CompoundDao();
//        String searchCondition = cbSearch.getSelectedItem().toString();
//        if (searchCondition == "ID") {
//            String ageStr = tfSearch.getText();
//            boolean isNum = ageStr.matches("[0-9]+");
//            if (!isNum) {
//                JOptionPane.showMessageDialog(null, "ID should be number!");
//                return;
//            }
//            int search = Integer.valueOf(tfSearch.getText());
//            List<Compound> list = new ArrayList<Compound>();
//            list.add(dao.find(search));
//            popupTable(list);
//        } else if (searchCondition == "name") {
//
//            popupTable(dao.searchCompoundByName(tfSearch.getText()));
//
//        } else {
//            popupTable(dao.searchCompoundByFomula(tfSearch.getText()));
//
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void tlbDrugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbDrugMouseClicked

        int index = tlbDrug.getSelectedRow();
        Drug c = (Drug) tlbDrug.getValueAt(index, 0);
        tfName.setText(c.getName());
        tfDrugNumber.setText(c.getDrugNumber());
        tfFormula.setText(c.getFormula());
        taRoute.setText(c.getRoute());
        tfUsage.setText(c.getUses());
        taManu.setText(c.getManufature());
        taIndication.setText(c.getIndication());
        DrugCatalogDao dao = new DrugCatalogDao();
        cbCatalog.getModel().setSelectedItem(dao.find(c.getIdDrugCatalog()));
        //show compound detail through drug number
        JoinSeletedCompoundDao jsccd = new JoinSeletedCompoundDao();
//        dscDao.findCompoundByDrugNumber(c.getDrugNumber());
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Formula");
        dtm.addColumn("Weight");
        dtm.addColumn("AssignDate");

        for (JoinSelectedCompound jsc : jsccd.findCompoundByDrugNumber(c.getDrugNumber())) {
            dtm.addRow(new Object[]{jsc, jsc.getName(), jsc.getFormula(), jsc.getWeight(), jsc.getAssignDate()});
        }
        tlbCompound.setModel(dtm);

        // TODO add your handling code here:
    }//GEN-LAST:event_tlbDrugMouseClicked

    private void showCompound() {

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Number");
        dtm.addColumn("Name");
        dtm.addColumn("Route");
        for (Drug c : new DrugDao().findAll()) {
            dtm.addRow(new Object[]{c, c.getName(), c.getRoute()});
        }
        tlbDrug.setModel(dtm);
    }
    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSearchActionPerformed

    private void btnAddCompoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompoundActionPerformed
        // TODO add your handling code here:
        try {
            CompoundOfDrugPanel panel = new CompoundOfDrugPanel();
            panel.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDrugPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddCompoundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCompound;
    private javax.swing.JComboBox cbCatalog;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JTabbedPane compoundTbl;
    private javax.swing.JPanel existedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextArea taIndication;
    private javax.swing.JTextArea taManu;
    private javax.swing.JTextArea taRoute;
    private javax.swing.JTextField tfDrugNumber;
    private javax.swing.JTextField tfFormula;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfUsage;
    private javax.swing.JTable tlbCompound;
    private javax.swing.JTable tlbDrug;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
