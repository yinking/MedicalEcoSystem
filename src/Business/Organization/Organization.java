/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Channel.MessageList;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public abstract class Organization {

    private String name;
    private MessageList msgList;

    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {
        ADMIN("Administrative Organization"),
        CLINIC("Clinic Organization"),
        DEVELOPMENT("Development Organization"),
        RESEARCH("Research Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        msgList = new MessageList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageList getMsgList() {
        return msgList;
    }

    public void setMsgList(MessageList msgList) {
        this.msgList = msgList;
    }

    @Override
    public String toString() {
        return name;
    }

}
