/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.menu;

import ca2.company.company;
import ca2.employee.employee;
import java.util.Scanner;

/**
 *
 * @author under
 */
public class menu {

    private static String managerUsername = "Gnomeo";
    private static String managerPassword = "Smurf";

    public static void menuOptions(company company) {
        Scanner scanner = new Scanner(System.in);

        // Login
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (username.equals(managerUsername) && password.equals(managerPassword)) {
                System.out.println("Login successful");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        while (true) { //chose menu options
            System.out.println("Type 1 to view current staff");
            System.out.println("Type 2 to add new staff member");
            System.out.println("Type 3 to remove staff member");
            System.out.println("Type 4 to Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View current staff
                    System.out.println("Current Staff:");
                    company.listEmployees(0);
                    break;
                case 2:
                    System.out.println("Enter employee name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter employee email:");
                    String email = scanner.nextLine();
                    company.addNewStaff(new employee(name, email));
                    System.out.println("Employee added");
                    break;
                case 3:
                    System.out.println("Enter employee empNum to remove:");
                    int empNumRemove = scanner.nextInt();
                    company.removeStaff(empNumRemove);
                    System.out.println("Employee removed");
                    break;
                case 4:
                    // Exit
                    System.out.println("Exiting");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1-4");
            }
        }

    }
}
