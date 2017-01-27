/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public abstract class Role {
    public enum Type{
        ADMIN("Admin Role"),
        DOCTOR("Doctor Role"),
        DRUGGIST("Druggist"),
        NURSE("Nurse"),
        RESEARCHER("Researcher"),;
        
        private String value;
        
        private Type(String v){
            this.value = v;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    private Type type;
    
    public Role(Type type){
        this.type = type;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
