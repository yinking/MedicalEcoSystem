/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.ADMIN.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CLINIC.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DEVELOPMENT.getValue())){
            organization = new DevelopmentOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.RESEARCH.getValue())){
            organization = new ResearchOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}