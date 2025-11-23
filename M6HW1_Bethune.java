// Toni Bethune
// CSC-151 Java Programming
// M6HW1 - Employee Gross Pay Calculator
// November 2025
// This program calculates an employee's gross pay using a method.

import java.util.Scanner;

public class M6HW1_Bethune {

    // Method to calculate gross pay
    public static double calculateGrossPay(double rate, double hours) {
        return rate * hours;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        // Calculation
        double grossPay = calculateGrossPay(rate, hours);

        // Output
        System.out.println("\n=== Employee Gross Pay Summary ===");
        System.out.println("Employee Name: " + name);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Gross Pay: $" + grossPay);

        input.close();
    }
}
