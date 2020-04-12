/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nived
 */
public class Employee extends Person {
    
    
    private String firstName;
    private String lastName;
    private int empID;
    public static int count=0;
    private String enterpriseName;

    public Employee() {
        
        count++;
        empID=count;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpID() {
        return empID;
    }

    

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    public String toString()
    {
        
        return firstName +" "+ lastName;
    }
    
    
}
