/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class HospitalEnterprise extends Enterprise{
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HOSPITAL);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
