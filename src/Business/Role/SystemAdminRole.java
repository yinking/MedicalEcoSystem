/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ke Wang
 *
 */
public abstract class SystemAdminRole extends Role {

    public SystemAdminRole(Type type) {
        super(type);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
//        return new SystemAdminWorkAreaPanel(userProcessContainer, business);
//        return new SystemAdminJFrame();
//    }
}
