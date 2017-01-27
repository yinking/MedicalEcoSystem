package Business;

import Business.Country.Country;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class Ecosystem extends Organization {

    private static Ecosystem ecosystem;
    private ArrayList<Country> cityList;

    public static Ecosystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();
        }
        return ecosystem;
    }

    private Ecosystem() {
        super(null);
        cityList = new ArrayList<>();
    }

    public ArrayList<Country> getCityList() {
        return cityList;
    }

    public Country createAndAddCity() {
        Country city = new Country();
        cityList.add(city);
        return city;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
//        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String userName) {
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
}