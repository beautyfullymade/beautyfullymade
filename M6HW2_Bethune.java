// Toni Bethune
// CSC-151 Java Programming
// M6HW2 - Homeowner Water Bill Calculator
// November 2025
// This program calculates a homeowner's monthly water bill using a method.

import java.util.Scanner;

public class M6HW2_Bethune {

    // Method to calculate total water bill
    public static double calculateWaterBill(int usage) {
        double baseFee = 50.00;
        double cost = usage * 0.20;
        return baseFee + cost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter homeowner name: ");
        String name = input.nextLine();

        System.out.print("Enter previous meter reading: ");
        int previousReading = input.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = input.nextInt();

        // Calculations
        int usage = currentReading - previousReading;
        double totalCharge = calculateWaterBill(usage);

        // Output
        System.out.println("\n=== Water Bill Summary ===");
        System.out.println("Homeowner Name: " + name);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Water Usage: " + usage + " gallons");
        System.out.println("Total Charge: $" + totalCharge);

        input.close();
    }
}