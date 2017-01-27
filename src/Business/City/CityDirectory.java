/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class CityDirectory {
    private ArrayList<City> districtList;

    public CityDirectory() {
        districtList = new ArrayList<>();
    }

    public ArrayList<City> getDistrictList() {
        return districtList;
    }
    
    public City addDistrict() {
        City district = new City();
        districtList.add(district);
        return district;
    }

    public void deleteDistrict(City district) {
        districtList.remove(district);
    }
}
