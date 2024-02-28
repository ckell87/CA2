/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import ca2.employee.employee;

class EmployeeTest {

    public static void main(String[] args) {

        employee[] projectGroup = new employee[3];// array of three employee objects
        employee emp1 = new employee("Joe Bloggs", "jb@gmail.com");
        employee emp2 = new employee("Ann Banana", "ab@gmail.com");
        employee emp3 = new employee("Tom Thumb", "tt@gmail.com");

        projectGroup[0] = emp1;
        projectGroup[1] = emp2;
        projectGroup[2] = emp3;
        System.out.println("current employee number is " + employee.nextEmpNum);

        int m = 1;
        for (employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println("employee's after m: " + employee.getName());
            }
        }

    }
}


public class CA2 {

    public static void main(String[] args) {
        EmployeeTest.main(args);//call employeeTest main method
       

    }
}


