// CSC 151
// M5HW1_Bethune.java
// Toni Bethune
// Date: 11/02/2025
// Description:
// Updated Grade Calculator using loops and decision structures.
// - Prompts for number of grades
// - Uses a Do...While loop to collect grades
// - Uses a While loop to validate each grade (0..100)
// - Calculates average and determines letter grade (keep if/else mapping)
// - Asks user if they want to run again

import java.util.Scanner;

public class M5HW1_Bethune {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char again = 'y';

        // Outer repetition loop (While) to run program multiple times
        while (again == 'y' || again == 'Y') {

            // Ask for number of grades and validate (> 0)
            System.out.print("How many grades would you like to enter? ");
            int numGrades = in.hasNextInt() ? in.nextInt() : -1;
            // Clear bad token if not int
            if (numGrades == -1) {
                in.next(); // discard non-integer token
            }
            while (numGrades <= 0) {
                System.out.print("Please enter a positive whole number: ");
                if (in.hasNextInt()) {
                    numGrades = in.nextInt();
                } else {
                    in.next(); // discard non-integer token
                }
            }

            double sum = 0.0;
            int i = 1;

            // Do...While loop to collect exactly numGrades entries
            do {
                System.out.print("Enter grade #" + i + ": ");
                double grade;
                if (in.hasNextDouble()) {
                    grade = in.nextDouble();
                } else {
                    in.next(); // discard bad token
                    grade = -1; // force validation
                }

                // While loop: validate grade in [0, 100]
                while (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                    System.out.print("Enter grade #" + i + ": ");
                    if (in.hasNextDouble()) {
                        grade = in.nextDouble();
                    } else {
                        in.next(); // discard bad token
                        grade = -1; // keep invalid to re-prompt
                    }
                }

                sum += grade;
                i++;
            } while (i <= numGrades);

            // Calculate average
            double average = sum / numGrades;

            // Letter grade mapping (do not change core logic)
            String letter;
            if (average >= 90) {
                letter = "A";
            } else if (average >= 80) {
                letter = "B";
            } else if (average >= 70) {
                letter = "C";
            } else if (average >= 60) {
                letter = "D";
            } else {
                letter = "F";
            }

            // Results
            System.out.printf("Average: %.1f%n", average);
            System.out.println("Letter Grade: " + letter);
            System.out.println();

            // Ask to run again
            System.out.print("Would you like to run the program again? (y/n): ");
            String response = in.next();
            again = response.isEmpty() ? 'n' : response.charAt(0);
            System.out.println();
        }

        System.out.println("Program exited. Goodbye!");
        in.close();
    }
}
