package UserInterface.HospitalEnterprise;

import dao.UserDao;
import entities.User;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SysInfo extends JPanel {

    public SysInfo() {
        super();

        Border innerBorder = BorderFactory.createTitledBorder("User Info - As of Now");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        JLabel userInfo = new JLabel();
        User user = UserDao.getUser();
        if (user != null) {
            userInfo.setText("Hello: " + UserDao.getUser().getRole() + " " + UserDao.getUser().getUsername());
        }
        add(userInfo);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

    }
}
