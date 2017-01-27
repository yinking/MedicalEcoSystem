/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalEnterprise;

import dao.PatientsDao;
import entities.Drug;
import entities.Patients;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GladysWang
 */
public class PatientInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientInfoPanel
     */
    public PatientInfoPanel() {
        initComponents();
        popupTable();
    }

    private void popupTable() {

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("FirstName");
        dtm.addColumn("LastName");
        dtm.addColumn("Gender");

        dtm.addColumn("Phone");

        dtm.addColumn("Registration Date");

        for (Patients c : new PatientsDao().findAll()) {
            dtm.addRow(new Object[]{c, c.getPatientsLastName(), c.getGender(), c.getPhone(), c.getRegistrationDate().toString()});
        }
        tlbPatient.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tlbPatient = new javax.swing.JTable();

        tlbPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tlbPatient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlbPatient;
    // End of variables declaration//GEN-END:variables
}
