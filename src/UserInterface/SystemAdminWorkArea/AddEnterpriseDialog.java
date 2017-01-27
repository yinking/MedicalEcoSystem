package UserInterface.SystemAdminWorkArea;

import dao.EnterpriseDao;
import entities.City;
import entities.Enterprise;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import model.patient;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Joseph
 */
public class AddEnterpriseDialog extends JDialog {

    private UtilDateModel model1, model2;
    private JDatePanelImpl datePanel1, datePanel2;
    private JDatePickerImpl datePicker1, datePicker2;
    private JFormattedTextField textField1, textField2;
    private JButton saveButton;

    public AddEnterpriseDialog(JFrame parent) {
        super(parent, "Add Network", false);
        JPanel patientsPanel = new JPanel();
        final AddEnterprisePanel addEnterprisePanel = new AddEnterprisePanel();
        JPanel buttonsPanel = new JPanel();
        setSize(600, 400);
        setLocationRelativeTo(null);
        saveButton = new JButton("Save");
        buttonsPanel = new JPanel();

        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int selectedRow = addEnterprisePanel.tlbCity.getSelectedRow();
                if (selectedRow < 0) {
                    JOptionPane.showMessageDialog(null, "Please Select a Row");
                    return;
                }
                City city = (City) addEnterprisePanel.tlbCity.getValueAt(selectedRow, 0);

                Enterprise enterprise = new Enterprise(city, addEnterprisePanel.tfName.getText(), (String) addEnterprisePanel.cbEnterpriseType.getSelectedItem());

                EnterpriseDao dao = new EnterpriseDao();
                dao.save(enterprise);
                JOptionPane.showMessageDialog(null, "congratulations, you have saved successfully");

                dispose();
                System.gc();
            }

        });
        addGridItems(buttonsPanel, saveButton, 3, 0, 4, 1, GridBagConstraints.CENTER);
        patientsPanel.setBackground(Color.white);
//        messagePanel.setBackground(Color.white);
        buttonsPanel.setBackground(Color.WHITE);

        //add sub-panels to the Dialog
        setLayout(new BorderLayout());
        add(patientsPanel, BorderLayout.NORTH);
        add(addEnterprisePanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void layoutControls() {

    }

    private void addGridItems(JPanel panel, JComponent cmp, int x, int y, int width, int height, int align) {
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = x;
        gc.gridy = y;

        gc.gridwidth = width;
        gc.gridheight = height;

        gc.weightx = 0.5;
        gc.weighty = 0.5;

        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = GridBagConstraints.NONE;

        panel.add(cmp, gc);
    }

}
