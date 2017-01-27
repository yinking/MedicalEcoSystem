package UserInterface.SystemAdminWorkArea;

import UserInterface.HospitalEnterprise.RegisterDoctor;
import dao.CityDao;
import entities.City;
import entities.Patients;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
public class AddUserDialog extends JDialog {

    private UtilDateModel model1, model2;
    private JDatePanelImpl datePanel1, datePanel2;
    private JDatePickerImpl datePicker1, datePicker2;
    private JFormattedTextField textField1, textField2;
    private JButton saveButton;

    public AddUserDialog(JFrame parent) {
        super(parent, "Add Enterprise", false);

        setSize(600, 400);
        setLocationRelativeTo(null);
        layoutControls();
        saveButton = new JButton("Cancel");

    }

    private void layoutControls() {

        JPanel patientsPanel = new JPanel();
        final AddUserPanel addNetworkPanel = new AddUserPanel();
        JPanel buttonsPanel = new JPanel();

        patientsPanel.setBackground(Color.white);
//        messagePanel.setBackground(Color.white);
        buttonsPanel.setBackground(Color.WHITE);

        //add sub-panels to the Dialog
        setLayout(new BorderLayout());
        add(patientsPanel, BorderLayout.NORTH);
        add(addNetworkPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        saveButton = new JButton("Save");

        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

//                CityDao dao = new CityDao();
//                City city = new City(addNetworkPanel.nameJTextField1.getText());
//                dao.save(city);
//                JOptionPane.showMessageDialog(null, "congratulations, you have saved successfully");
//
//                dispose();
//                System.gc();
            }

        });
        addGridItems(buttonsPanel, saveButton, 3, 0, 4, 1, GridBagConstraints.CENTER);

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
