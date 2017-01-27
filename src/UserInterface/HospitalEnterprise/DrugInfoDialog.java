package UserInterface.HospitalEnterprise;

import entities.GenderCategory;
import entities.MaritalStatus;
import entities.Patients;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

//import model.patient;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Joseph
 */
public class DrugInfoDialog extends JDialog {

    JPanel userProcessContainer;

    private UtilDateModel model1, model2;
    private JDatePanelImpl datePanel1, datePanel2;
    private JDatePickerImpl datePicker1, datePicker2;
    private JFormattedTextField textField1, textField2;

    public DrugInfoDialog(JFrame parent) {
        super(parent, "Register New Patient", false);

        setSize(900, 500);
        setLocationRelativeTo(null);
        layoutControls();
    }

    private void layoutControls() {

        JPanel patientsPanel = new JPanel();
        DrugInfoPanel drugInfoPanel = new DrugInfoPanel(userProcessContainer);
        JPanel buttonsPanel = new JPanel();

        patientsPanel.setBackground(Color.white);
//        messagePanel.setBackground(Color.white);
        buttonsPanel.setBackground(Color.WHITE);

        //add sub-panels to the Dialog
        setLayout(new BorderLayout());
        add(patientsPanel, BorderLayout.NORTH);
        add(drugInfoPanel, BorderLayout.CENTER);
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
