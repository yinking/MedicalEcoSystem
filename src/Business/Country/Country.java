/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.City.CityDirectory;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Ke Wang
 *
 */
public class Country {

    private String name;
    private CityDirectory districtDirectory;

    public Country() {
        districtDirectory = new CityDirectory();
    }

    public CityDirectory getDistrictDirectory() {
        return districtDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
