/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author srush
 */
public abstract class Organization {

    public static final String PRODUCT = "Product Management Organization";
    public static final String INVENTORY = "Inventory Management Organization";
    public static final String INSPECTING = "Inspecting Organization";
    public static final String SALES = "Sales Management Organization";
    public static final String SHIPPING = "Shipping management Organization";
    public static final String ADMIN = "Admin";
    public static final String LICENSING = "Licensing Organization";
    public static final String WAREHOUSE = "Warehouse Organization";
    public static final String RETURNS = "Returns Processor Organization";
    public static final String DRUGTESTING = "Drug Testing Organization";
    public static final String MANAGEMENT = "Management Organization";
    public static final String EMERGENCY = "Emergency Handling Organization";
    public static final String ACCOUNTING = "Accounting Organization";
    private String organizationName;

    UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private WorkQueue workQueue;
    private WorkQueue sentWorkQueue;

    public Organization(String organizationName) {
        this.organizationName = organizationName;

        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        workQueue = new WorkQueue();
        sentWorkQueue = new WorkQueue();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getSentWorkQueue() {
        return sentWorkQueue;
    }

    public void setSentWorkQueue(WorkQueue sentWorkQueue) {
        this.sentWorkQueue = sentWorkQueue;
    }

    public String toString() {

        return organizationName;
    }
}
