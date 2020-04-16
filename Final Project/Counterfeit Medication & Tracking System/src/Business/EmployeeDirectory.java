/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {

        employeeList = new ArrayList<Employee>();
    }

    public Employee newEmployee() {

        Employee employee = new Employee();
        employeeList.add(employee);
        return employee;
    }

    public void deleteEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

}
