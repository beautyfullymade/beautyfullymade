// CIS115 - M7CW1 Assignment
// Working with Functions (Passing Variables)
// Bethune

import java.util.Scanner;

public class M7CW1_Assignment_Bethune{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runProgram(sc);
        sc.close();
    }

    // Main program loop
    public static void runProgram(Scanner sc) {
        int choice;

        do {
            choice = displayMenu(sc);

            switch (choice) {
                case 1:
                    handleSumFunction(sc);
                    break;
                case 2:
                    handleGreetingFunction(sc);
                    break;
                case 3:
                    handleCircleArea(sc);
                    break;
                case 4:
                    handleLargerNumber(sc);
                    break;
                case 5:
                    handleTemperatureConverter(sc);
                    break;
                case 6:
                    handleStudentInfo(sc);
                    break;
                case 7:
                    handleDiscountCalculator(sc);
                    break;
                case 8:
                    handleEvenOrOdd(sc);
                    break;
                case 9:
                    handleStringLength(sc);
                    break;
                case 10:
                    handleAverageOfThree(sc);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 0 to 10.");
            }

            System.out.println(); // blank line between operations

        } while (choice != 0);
    }

    // Menu display and choice input
    public static int displayMenu(Scanner sc) {
        System.out.println("========== M7CW1 Menu ==========");
        System.out.println(" 1. Sum Function");
        System.out.println(" 2. Greeting Function");
        System.out.println(" 3. Circle Area");
        System.out.println(" 4. Larger Number");
        System.out.println(" 5. Temperature Converter (F to C)");
        System.out.println(" 6. Student Info");
        System.out.println(" 7. Discount Calculator");
        System.out.println(" 8. Even or Odd");
        System.out.println(" 9. String Length");
        System.out.println("10. Average of Three Numbers");
        System.out.println(" 0. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        return choice;
    }

    // =========================
    // Handlers (I/O + method calls)
    // =========================

    // 1. Sum Function (input + output)
    public static void handleSumFunction(Scanner sc) {
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int result = sumFunction(num1, num2);
        System.out.println("Sum = " + result);
    }

    // 2. Greeting Function
    public static void handleGreetingFunction(Scanner sc) {
        System.out.print("Enter a name: ");
        String name = sc.next();  // single word name
        greetingFunction(name);
    }

    // 3. Circle Area
    public static void handleCircleArea(Scanner sc) {
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = circleArea(radius);
        System.out.println("Area of the circle = " + area);
    }

    // 4. Larger Number
    public static void handleLargerNumber(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        largerNumber(a, b);
    }

    // 5. Temperature Converter
    public static void handleTemperatureConverter(Scanner sc) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = temperatureConverter(f);
        System.out.println(f + "°F is " + c + "°C");
    }

    // 6. Student Info
    public static void handleStudentInfo(Scanner sc) {
        System.out.print("Enter student's name: ");
        String name = sc.next();  // if you want full name with spaces, we’d switch to nextLine
        System.out.print("Enter student's grade: ");
        String grade = sc.next();

        studentInfo(name, grade);
    }

    // 7. Discount Calculator
    public static void handleDiscountCalculator(Scanner sc) {
        System.out.print("Enter original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double finalPrice = discountCalculator(price, discountPercent);
        System.out.println("Discounted price = " + finalPrice);
    }

    // 8. Even or Odd
    public static void handleEvenOrOdd(Scanner sc) {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = evenOrOdd(num);
        System.out.println("The number " + num + " is " + result + ".");
    }

    // 9. String Length
    public static void handleStringLength(Scanner sc) {
        System.out.print("Enter a word: ");
        String text = sc.next();

        int len = stringLength(text);
        System.out.println("Length of \"" + text + "\" = " + len);
    }

    // 10. Average of Three Numbers
    public static void handleAverageOfThree(Scanner sc) {
        System.out.print("Enter first integer: ");
        int x = sc.nextInt();
        System.out.print("Enter second integer: ");
        int y = sc.nextInt();
        System.out.print("Enter third integer: ");
        int z = sc.nextInt();

        double avg = averageOfThree(x, y, z);
        System.out.println("Average = " + avg);
    }

    // =========================
    // Core methods from worksheet
    // =========================

    // 1. Sum Function
    public static int sumFunction(int num1, int num2) {
        return num1 + num2;
    }

    // 2. Greeting Function
    public static void greetingFunction(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Circle Area
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 4. Larger Number
    public static void largerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger.");
        } else if (b > a) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    // 5. Temperature Converter (F to C)
    public static double temperatureConverter(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // 6. Student Info
    public static void studentInfo(String name, String grade) {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }

    // 7. Discount Calculator
    public static double discountCalculator(double price, double discountPercent) {
        double discountAmount = price * (discountPercent / 100.0);
        return price - discountAmount;
    }

    // 8. Even or Odd
    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // 9. String Length
    public static int stringLength(String text) {
        return text.length();
    }

    // 10. Average of Three Numbers
    public static double averageOfThree(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }
}