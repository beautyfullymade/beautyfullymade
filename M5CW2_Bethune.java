// CSC 151
// M5CW2 - Do...While & While Validation
// Bethune
// 10/26/2025

import java.util.Scanner;

public class M5CW2_Bethune {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_ITEMS = 5;   // total items to collect
        double total = 0.0;        // sum of all prices
        int count = 1;             // item counter

        // Do...While loop to collect exactly 5 prices
        do {
            System.out.print("Enter price for item #" + count + ": ");
            double price = input.nextDouble();

            // While loop for validation
            while (price <= 0 || price > 10000) {
                System.out.println("Invalid price. Please enter a value between 0 and 10,000.");
                System.out.print("Enter price for item #" + count + ": ");
                price = input.nextDouble();
            }

            total += price;  // add valid price to total
            count++;         // move to next item
        } while (count <= NUM_ITEMS);

        // After all valid prices are entered
        double average = total / NUM_ITEMS;

        System.out.println();
        System.out.println("All prices entered successfully!");
        System.out.println("The total cost is: $" + total);
        System.out.println("The average price is: $" + average);

        input.close();
    }
}