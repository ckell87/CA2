/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.employee;

/**
 *
 * @author under
 */
public class employee {     //new employee class
    public String name;
    public String email;
    public int empNum;
    public static int nextEmpNum = 1; //Starts emplyee number at 1
    
    public employee(){
        this.name = "default name";
        this.email = "deafault@default.com";
        this.empNum = nextEmpNum++;
    }
    public employee(String name, String email){
        this.name ="name";
        this.email = "email";
        this.empNum = nextEmpNum++;
    }
    
}
