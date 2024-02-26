/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.company;
import java.util.ArrayList;
import ca2.employee.employee;

/**
 *
 * @author under
 */
public class company {
    public String companyName;
    public Arraylist<employee> staff;
    
    public company(){
        this.companyName = "default company";
        
    }
    public company(String companyName){
        this.companyName = companyName;
        this.staff = new Arraylist<>();
    }
    public void addNewStaff(employee employee){
        staff.add(employee);
    }
    //public int getStaffNumber(){
       // return staff;
   // }
}
