package UserInterface.HospitalEnterprise;

import UserInterface.DrugEnterprise.DrugEnterprise;
import UserInterface.SystemAdminWorkArea.SystemAdminJFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;

public class HospitalJFrame extends JFrame {

    private Toolbar toolbar;
    private StatusBar statusBar;
    private FormPanel leftFormPanel;
    private RightFrame framesPanel;
    private JSplitPane splitPane;
    private JFileChooser fileChooser;
    private JDialog registerStaff;
    private JDialog registerDoctor;
    private JDialog registerSupplier;
    private JDialog helpCon;
    private JDialog userMan;
    private JDialog weighIn;
    private JDialog addDb;
    private JDialog importDb;
    private JDialog optimizeDb;
    private JDialog networkSearch;
    private JDialog backUpDB;
    private JDialog pharmacyInv;
    private JDialog pharmacyRqst;
    private JDialog newConsultation;
    private JDialog labCategory;
    private JDialog wardRequest;
    private JDialog labMan;
    private JDialog wardMan;
    private JDialog crossCheck;
    private HospitalJFrame self;

    //constructor function for the MDI
    public HospitalJFrame() throws Exception {
        super("Hospital Information Management System");
        self = this;
        Image img = ImageIO.read(this.getClass().getResource("/images/hospital.png"));

        setLayout(new BorderLayout());

        setJMenuBar(createMenuBar());//menu
        toolbar = new Toolbar();
        statusBar = new StatusBar();

        leftFormPanel = new FormPanel();
        framesPanel = new RightFrame();
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftFormPanel, framesPanel);
        splitPane.setOneTouchExpandable(true);

        fileChooser = new JFileChooser();
//        registerStaff = new Registerstaff(this);
        registerDoctor = new RegisterDoctor(this);
//        
//        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent a) {
                System.out.println("Application is Closing");
                dispose();
                System.exit(0);
                System.gc();  //Garbage Collector
            }
        });

        add(toolbar, BorderLayout.PAGE_START);
        add(splitPane, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setIconImage(img);
        setMinimumSize(new Dimension(1000, 650));
        setVisible(true);
    }

    //create the menubar for the MDI
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu ecosystemMenu = new JMenu("EcoSystem");
        ecosystemMenu.setMargin(new Insets(5, 5, 5, 5));
        initEcoSystem(ecosystemMenu);
        menuBar.add(ecosystemMenu);

        return menuBar;
    }

    private void initEcoSystem(JMenu ecosystemMenu) {

        JMenuItem drugCenterItem = new JMenuItem("Drug Center");
        drugCenterItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
        drugCenterItem.setIcon(new ImageIcon(this.getClass().getResource("/images/doctor.png")));
        drugCenterItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (self.getClass().isAssignableFrom(DrugEnterprise.class)) {
                    return;
                }
                new DrugEnterprise().setVisible(true);
                dispose();
                System.gc();
            }

        });
        ecosystemMenu.add(drugCenterItem);

        JMenuItem hospitalCenterItem = new JMenuItem("System Admin");
        hospitalCenterItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
        hospitalCenterItem.setIcon(new ImageIcon(this.getClass().getResource("/images/doctor.png")));
        hospitalCenterItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new SystemAdminJFrame().setVisible(true);

                dispose();
                System.gc();
            }

        });
        ecosystemMenu.add(hospitalCenterItem);
    }

}
