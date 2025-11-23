// M7CW2_LastName.java
// Module 7 Chapter Work 2: Debugging Java Code
// Corrected version of M7NeedtoDebug
// This program asks for the two legs of a right triangle (A and B)
// then calculates the area and hypotenuse using methods.
// It will ask the user if they want to run the program again.

import java.util.Scanner;

public class M7CW2_Bethune {   

    public static void main(String[] args) {
        runMenu();
    }

    // Main loop that controls the program
    public static void runMenu() {
        Scanner in = new Scanner(System.in);   // Correct Scanner
        String keepGoing;

        do {
            displayInfo();  // Show header / name

            // Get sides from user
            double sideA = getSideA(in);
            double sideB = getSideB(in);

            // Calculate area and hypotenuse
            double area = calcArea(sideA, sideB);
            double hypotenuse = calcHypotenuse(sideA, sideB);

            // Display all values
            displayValues(sideA, sideB, area, hypotenuse);

            System.out.println();
            System.out.print("Would you like to run the program again? (yes/no): ");
            keepGoing = in.next();  // Reads one word response (yes/no)
            System.out.println();

        } while (keepGoing.equalsIgnoreCase("yes"));

        System.out.println("Program has terminated!");
        in.close();
    }

    // Just prints some basic info
    public static void displayInfo() {
        System.out.println("------------------------------------");
        System.out.println(" Right Triangle Calculator");
        System.out.println(" Toni Bethune");  // 
        System.out.println("------------------------------------");
    }

    // Get side A from the user
    public static double getSideA(Scanner in) {
        System.out.print("Enter side A of the right triangle: ");
        double sideA = in.nextDouble();   // nextDouble, not nextLine
        return sideA;
    }

    // Get side B from the user
    public static double getSideB(Scanner in) {
        System.out.print("Enter side B of the right triangle: ");
        double sideB = in.nextDouble();   // nextDouble, spelled correctly
        return sideB;
    }

    // Calculate area of a right triangle: (a * b) / 2
    public static double calcArea(double a, double b) {
        return (a * b) / 2.0;
    }

    // Calculate hypotenuse using Math.hypot (no change needed)
    public static double calcHypotenuse(double a, double b) {
        return Math.hypot(a, b);
    }

    // Display all the values to the user
    public static void displayValues(double sideA, double sideB, double area, double hypotenuse) {
        System.out.println();
        System.out.println("Results:");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Area: " + area);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println();
    }
}
