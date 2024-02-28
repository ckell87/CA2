/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.company;

import ca2.employee.employee;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author under
 */
public class company {

    public String companyName;
    public ArrayList<employee> staff;

    public company() {
        this.companyName = "default company";
        this.staff = new ArrayList<>();
    }

    public company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

    public void addNewStaff(employee employee) { //method to add new employee to array
        staff.add(employee);
    }

    public int getStaffNumber() { //method to get staff size
        return staff.size();
    }

    public void listEmployees(int empNumInt) {
        Iterator<employee> Iterator = staff.iterator();
        while (Iterator.hasNext()) {
               employee employee = Iterator.next();
        if (employee.getEmpNum() > empNumInt) {
               System.out.println("employee names are = " + employee.getName());

            }
        }
    }
}
