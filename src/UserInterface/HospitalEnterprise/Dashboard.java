package UserInterface.HospitalEnterprise;

import dao.PatientGraphDataDao;
import entities.PatientGraphData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class Dashboard extends JPanel {

    private JButton refreshButton;
    private JButton closeShiftBtn;
    private ChartPanel barPanel;

    public Dashboard() throws SQLException {
        super();

        refreshButton = new JButton("Refresh DashBoard", new ImageIcon(this.getClass().getResource("/images/refresh_1.png")));
        refreshButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                barPanel.repaint();
                JOptionPane.showMessageDialog(Dashboard.this, "Done Refreshing Charts", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Dimension btnSize = refreshButton.getPreferredSize();
        closeShiftBtn = new JButton("Close Shift", new ImageIcon(this.getClass().getResource("/images/close_shift.png")));
        closeShiftBtn.setPreferredSize(btnSize);
        closeShiftBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
//                SystemUsersController.setUserId(" ");
                System.exit(0);
//                try {
////                    new Login().setVisible(true);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
            }
        });

        this.setBackground(Color.gray);

        JFreeChart barChart = ChartFactory.createBarChart("Patient's Report", "Year", "Patients", patientsRegBarCategoryDataset(),
                PlotOrientation.VERTICAL, true, true, false);
//        add(BorderLayout.WEST, instructionPanel());
        barPanel = new ChartPanel(barChart);
        barPanel.setPreferredSize(new Dimension(550, 300));

        setLayout(new BorderLayout());

        add(BorderLayout.SOUTH, creditationPanel());
        add(BorderLayout.NORTH, toolbar());
        add(BorderLayout.EAST, barPanel);
        add(BorderLayout.CENTER, instructionPanel());

    }

    private JFreeChart createPatientsRegChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;
    }

    private CategoryDataset patientsRegBarCategoryDataset() throws SQLException {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        PatientGraphDataDao pgdd = new PatientGraphDataDao();
        for (PatientGraphData pgd : pgdd.getPatientAdmissionYearMonth()) {
            String months = pgd.getMonth() + "";
            String year = pgd.getYear() + "";
            Integer patients = pgd.getPatientNum().intValue();
            result.addValue(patients, months, year);
        }
        return result;
    }

    private JPanel toolbar() {
        JPanel result = new JPanel();

        result.setLayout(new FlowLayout(FlowLayout.LEFT));
        result.add(refreshButton);
        result.add(closeShiftBtn);
        return result;
    }

    private JPanel quickAccessPanel() {
        JPanel result = new JPanel();
        int space = 10;
        Border spaceBorder = BorderFactory.createEmptyBorder(space, space, space, space);
        Border titleBorder = BorderFactory.createTitledBorder("Quick Access Menu");
        result.setPreferredSize(new Dimension(150, 100));
        result.setBorder(BorderFactory.createCompoundBorder(spaceBorder, titleBorder));
        return result;
    }

    private JPanel instructionPanel() {
        JPanel result = new JPanel();
        int space = 10;
        Border spaceBorder = BorderFactory.createEmptyBorder(space, space, space, space);
        Border titleBorder = BorderFactory.createTitledBorder("Instruction");
        result.setPreferredSize(new Dimension(150, 100));
        result.setBorder(BorderFactory.createCompoundBorder(spaceBorder, titleBorder));
        String s = "<html>The report on the right show show many patients have<br>have been addmitted to our hospital<br>Different color represents different month</html>";

        JLabel label = new JLabel(s);
        label.setHorizontalAlignment(JLabel.CENTER);

        result.setBackground(Color.WHITE);

        result.add(label);

        return result;
    }

    private JPanel creditationPanel() {
        JPanel result = new JPanel();
        String s = "Tip of the day: Health is something which is of interest to us all, and we should believe that good "
                + "health is the right thing for us all. Health and intellect are two blessings of life.";
        MarqueePanel mp = new MarqueePanel(s, 100);
        result.setBackground(Color.WHITE);
        result.add(mp);
        mp.start();
        return result;
    }
}

class MarqueePanel extends JPanel implements ActionListener {

    private static final int RATE = 12;
    private final Timer timer = new Timer(1000 / RATE, this);
    private final JLabel label = new JLabel();
    private final String s;
    private final int n;
    private int index;

    public MarqueePanel(String s, int n) {
        if (s == null || n < 1) {
            throw new IllegalArgumentException("Null string or n < 1");
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        this.s = sb + s + sb;
        this.n = n;
        label.setFont(new Font("Serif", Font.ITALIC, 18));
        label.setText(sb.toString());
        this.add(label);
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        index++;
        if (index > s.length() - n) {
            index = 0;
        }
        label.setText(s.substring(index, index + n));
    }
}
