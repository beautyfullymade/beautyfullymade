// CSC 151
// M5HW2 - Widgets with Loops & Decision Structure (reuse M4HW1 tiers)
// Toni Bethune
// 10/26/2025

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class M5HW2_Bethune {

    // Match your M4HW1 constants
    private static final BigDecimal WIDGET_PRICE = new BigDecimal("4.79");
    private static final BigDecimal BASE_SALARY  = new BigDecimal("2000.00");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char again = 'Y';

        while (again == 'Y' || again == 'y') {

            // Name + month input
            System.out.print("Enter Sales Person Name: ");
            String salesPerson = in.nextLine().trim();

            System.out.print("Enter Month Number (1-12): ");
            int monthNumber = readPositiveInt(in);

            // ----- For Loop #1: collect weekly SOLD (4 weeks) -----
            int totalSold = 0;
            System.out.println("\nEnter WIDGETS SOLD for 4 weeks:");
            for (int week = 1; week <= 4; week++) {
                System.out.print("  Week " + week + " sold: ");
                totalSold += readNonNegativeInt(in);
            }

            // ----- For Loop #2: collect weekly RETURNED (4 weeks) -----
            int totalReturned = 0;
            System.out.println("\nEnter WIDGETS RETURNED for 4 weeks:");
            for (int week = 1; week <= 4; week++) {
                System.out.print("  Week " + week + " returned: ");
                totalReturned += readNonNegativeInt(in);
            }

            // Per spec, assume returns never exceed sold
            int netWidgets = totalSold - totalReturned;

            // Sales amount, commission, salary
            BigDecimal salesAmount = WIDGET_PRICE.multiply(new BigDecimal(netWidgets));
            BigDecimal commissionRate = determineRateFromNetWidgets(netWidgets); // <-- reuse M4HW1 rule
            BigDecimal commission = salesAmount.multiply(commissionRate);
            BigDecimal monthlySalary = BASE_SALARY.add(commission);

            // ----- Output (no $ symbols required; 2-decimal formatting) -----
            System.out.println("\n----------------------------------------");
            System.out.println("Sales Person: " + salesPerson + " (Bethune)");
            System.out.println("Month #" + monthNumber);
            System.out.println("Widgets Sold: " + totalSold);
            System.out.println("Widgets Returned: " + totalReturned);
            System.out.println("Net Widgets Sold: " + netWidgets);
            System.out.println("Widgets Sales Amount: " + fmt2(salesAmount));
            System.out.println("Commission Rate: " + (commissionRate.multiply(new BigDecimal("100")).setScale(0, RoundingMode.HALF_UP)) + "%");
            System.out.println("Commission Amount: " + fmt2(commission));
            System.out.println("Monthly Salary: " + fmt2(monthlySalary));
            System.out.println("----------------------------------------\n");

            // While loop to run again
            System.out.print("Run again? (Y to continue, any other key to exit): ");
            String line = in.nextLine();
            again = line.isEmpty() ? 'N' : line.charAt(0);
            System.out.println();
        }

        System.out.println("Program exited. Goodbye!");
        in.close();
    }

    // --- Reused commission decision structure based on NET WIDGETS ---
    // ≤100 -> 10%, 101–199 -> 15%, 200–299 -> 20%, ≥300 -> 25%
    private static BigDecimal determineRateFromNetWidgets(int netWidgets) {
        if (netWidgets <= 100) {
            return new BigDecimal("0.10");
        } else if (netWidgets <= 199) {
            return new BigDecimal("0.15");
        } else if (netWidgets <= 299) {
            return new BigDecimal("0.20");
        } else {
            return new BigDecimal("0.25");
        }
    }

    // ------ Input helpers ------
    private static int readNonNegativeInt(Scanner in) {
        while (true) {
            String s = in.nextLine().trim();
            try {
                int v = Integer.parseInt(s);
                if (v >= 0) return v;
            } catch (NumberFormatException ignored) {}
            System.out.print("  Please enter a non-negative whole number: ");
        }
    }

    private static int readPositiveInt(Scanner in) {
        while (true) {
            String s = in.nextLine().trim();
            try {
                int v = Integer.parseInt(s);
                if (v > 0) return v;
            } catch (NumberFormatException ignored) {}
            System.out.print("  Please enter a positive whole number: ");
        }
    }

    // Two-decimal formatting (no currency symbol)
    private static String fmt2(BigDecimal x) {
        return x.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}