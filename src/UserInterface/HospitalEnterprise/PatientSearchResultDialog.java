package UserInterface.HospitalEnterprise;

import entities.Patients;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import model.patient;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Joseph
 */
public class PatientSearchResultDialog extends JDialog {

    List<Patients> list;

    private UtilDateModel model1, model2;
    private JDatePanelImpl datePanel1, datePanel2;
    private JDatePickerImpl datePicker1, datePicker2;
    private JFormattedTextField textField1, textField2;

    public PatientSearchResultDialog(JFrame parent, List<Patients> list) {
        super(parent, "Patients Search Result", false);

        this.list = list;

        setSize(600, 400);
        setLocationRelativeTo(null);
        layoutControls();
    }

    private void layoutControls() {

        JPanel patientsPanel = new JPanel();
        PatientSearchResultPanel patientSearchResultPanel = new PatientSearchResultPanel(list);
        JPanel buttonsPanel = new JPanel();

        patientsPanel.setBackground(Color.white);
//        messagePanel.setBackground(Color.white);
        buttonsPanel.setBackground(Color.WHITE);

        //add sub-panels to the Dialog
        setLayout(new BorderLayout());
        add(patientsPanel, BorderLayout.NORTH);
        add(patientSearchResultPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
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
