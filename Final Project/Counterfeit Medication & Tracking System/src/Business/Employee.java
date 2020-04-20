/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Objects;

/**
 *
 * @author nived
 */
public class Employee extends Person {

    private String firstName;
    private String lastName;
    private int empID;
    public static int count = 0;
    private String enterpriseName;

    public Employee() {

        count++;
        empID = count;
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

    public String toString() {

        return firstName + " " + lastName;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == this) { 
            return true; 
        } 

        if (!(object instanceof Employee)) { 
            return false; 
        }
        
        Employee employee = (Employee) object;
        return employee.empID == this.empID
                && (this.firstName != null)
                && (employee.lastName != null)
                && this.firstName.equals(employee.firstName)
                && this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.firstName);
        hash = 79 * hash + Objects.hashCode(this.lastName);
        hash = 79 * hash + this.empID;
        return hash;
    }

}
