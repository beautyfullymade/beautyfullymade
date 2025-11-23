// Toni Bethune
// CSC-151 Java Programming
// M6HW4 - Combined Methods Project
// November 2025
// This program combines the Module 6 homework assignments (M6HW1–M6HW3)
// into a single menu-driven program that calls separate methods for each task.

import java.util.Scanner;

public class M6Project_Bethune {

    // One Scanner for the entire program
    public static Scanner in = new Scanner(System.in);

    // main method calls runProgram()
    public static void main(String[] args) {
        runProgram();
    }

    /**
     * runProgram
     * Starts the program and displays the main menu.
     */
    public static void runProgram() {
        System.out.println("Welcome to the Module 6 Project Program!");
        displayMenu();
    }

    /**
     * displayMenu
     * Shows the menu, gets the user's selection, and calls the appropriate method.
     * The menu is redisplayed after each selection until the user chooses Exit.
     */
    public static void displayMenu() {
        System.out.println();
        System.out.println("===== Module 6 Project Menu =====");
        System.out.println("1) M6HW1: Employee Gross Pay Calculator");
        System.out.println("2) M6HW2: Homeowner Water Bill Calculator");
        System.out.println("3) M6HW3: Sales Commission Calculator");
        System.out.println("4) Exit");
        System.out.print("Selection: ");

        // Get user choice (simple int input)
        int choice;
        if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            // Handle non-integer input
            in.nextLine(); // clear invalid input
            System.out.println("Invalid input. Please enter a number 1–4.");
            displayMenu();
            return;
        }

        // Clear the newline after nextInt so later nextLine() works correctly
        in.nextLine();

        switch (choice) {
            case 1:
                getM6HW1();
                displayMenu(); // redisplay menu
                break;
            case 2:
                getM6HW2();
                displayMenu(); // redisplay menu
                break;
            case 3:
                getM6HW3();
                displayMenu(); // redisplay menu
                break;
            case 4:
                System.out.println("Exiting the program... Goodbye!");
                break;
            default:
                System.out.println("Invalid selection. Try again.");
                displayMenu(); // redisplay menu
        }
    }

    /**
     * getM6HW1
     * M6HW1 - Employee Gross Pay Calculator
     * Prompts the user for employee name, pay rate, and hours worked,
     * then calculates and displays the gross pay (rate * hours).
     */
    public static void getM6HW1() {
        System.out.println();
        System.out.println("=== M6HW1: Employee Gross Pay Calculator ===");

        System.out.print("Enter employee name: ");
        String name = in.nextLine();

        System.out.print("Enter hourly pay rate: ");
        double rate = in.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = in.nextDouble();

        // Consume leftover newline
        in.nextLine();

        double grossPay = rate * hours;

        System.out.println("\n--- Employee Gross Pay Summary ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Gross Pay: $" + grossPay);
    }

    /**
     * getM6HW2
     * M6HW2 - Homeowner Water Bill Calculator
     * Prompts the user for homeowner name, previous and current meter readings,
     * calculates usage and monthly charge, and displays a summary.
     */
    public static void getM6HW2() {
        System.out.println();
        System.out.println("=== M6HW2: Homeowner Water Bill Calculator ===");

        System.out.print("Enter homeowner name: ");
        String name = in.nextLine();

        System.out.print("Enter previous meter reading: ");
        int previousReading = in.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = in.nextInt();

        // Consume leftover newline
        in.nextLine();

        int usage = currentReading - previousReading;
        double totalCharge = (usage * 0.20) + 50.00;

        System.out.println("\n--- Water Bill Summary ---");
        System.out.println("Homeowner Name: " + name);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Water Usage: " + usage + " units");
        System.out.println("Total Charge: $" + totalCharge);
    }

    /**
     * getM6HW3
     * M6HW3 - Sales Commission Calculator
     * Prompts the user for salesperson name, widgets sold, and widgets returned,
     * calculates net widgets and total commission, and displays a summary.
     */
    public static void getM6HW3() {
        System.out.println();
        System.out.println("=== M6HW3: Sales Commission Calculator ===");

        System.out.print("Enter salesperson name: ");
        String name = in.nextLine();

        System.out.print("Enter number of widgets sold: ");
        int sold = in.nextInt();

        System.out.print("Enter number of widgets returned: ");
        int returned = in.nextInt();

        // Consume leftover newline
        in.nextLine();

        int netWidgets = sold - returned;
        double totalCommission = 500.00 + (netWidgets * 0.10);

        System.out.println("\n--- Sales Commission Summary ---");
        System.out.println("Salesperson Name: " + name);
        System.out.println("Widgets Sold: " + sold);
        System.out.println("Widgets Returned: " + returned);
        System.out.println("Net Widgets: " + netWidgets);
        System.out.println("Total Commission: $" + totalCommission);
    }
}
