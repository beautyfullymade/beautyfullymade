import java.util.Scanner;

public class BethuneFinal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // First thing called in main()
        displayInfo();

        // Continue with program...
        int itemCount = getItemCount(input);
        double subTotal = getItemPrices(input, itemCount);
        double taxDue = getSalesTax(subTotal);
        double totalOwed = getTotalOwed(subTotal, taxDue);

        displayValues(itemCount, subTotal, taxDue, totalOwed);

        input.close();
    }

  public static void displayInfo() {
    System.out.println("Toni Bethune");
    System.out.println("2025 Fall CIS 115 Final Exam");
    System.out.println("I used only concepts covered in class");
    System.out.println("I did not use AI to help me with this final");
    System.out.println();
}

public static int getItemCount(Scanner input) {
    System.out.print("Enter number of items purchased: ");
    int count = input.nextInt();
    return count;
}

    public static double getItemPrices(Scanner input, int count) {
        double totalCost = 0.0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter price for item " + i + ": ");
            double price = input.nextDouble();

            while (price < 0) {
                System.out.println("Price cannot be negative. Re-enter:");
                price = input.nextDouble();
            }

            totalCost += price;
        }

        return totalCost;
    }

    public static double getSalesTax(double subtotal) {
        final double TAX_RATE = 0.07;
        return subtotal * TAX_RATE;
    }

    public static double getTotalOwed(double subtotal, double tax) {
        return subtotal + tax;
    }

    public static void displayValues(int itemCount, double subtotal, double tax, double total) {
        System.out.println("\n----- Receipt Summary -----");
        System.out.println("Number of Items: " + itemCount);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax Due: $%.2f%n", tax);
        System.out.printf("Total Owed: $%.2f%n", total);
    }
}