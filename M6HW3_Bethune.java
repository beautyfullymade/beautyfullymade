// Toni Bethune
// CSC-151 Java Programming
// M6HW3 - Sales Commission Calculator
// November 2025
// This program calculates an employee's monthly commission using a method.

import java.util.Scanner;

public class M6HW3_Bethune {

    // Method to calculate commission
    public static double calculateCommission(int netWidgets) {
        double baseSalary = 500.00;
        double commission = netWidgets * 0.10;
        return baseSalary + commission;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter salesperson name: ");
        String name = input.nextLine();

        System.out.print("Enter number of widgets sold: ");
        int sold = input.nextInt();

        System.out.print("Enter number of widgets returned: ");
        int returned = input.nextInt();

        // Calculations
        int netWidgets = sold - returned;
        double totalCommission = calculateCommission(netWidgets);

        // Output
        System.out.println("\n=== Sales Commission Summary ===");
        System.out.println("Salesperson Name: " + name);
        System.out.println("Widgets Sold: " + sold);
        System.out.println("Widgets Returned: " + returned);
        System.out.println("Net Widgets: " + netWidgets);
        System.out.println("Total Commission: $" + totalCommission);

        input.close();
    }
}