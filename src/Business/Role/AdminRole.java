/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author Ke Wang
 * 
 */
public abstract class AdminRole extends Role{
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem
//            business) {
//        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//    }

    public AdminRole(Type type) {
        super(type);
    }
}
