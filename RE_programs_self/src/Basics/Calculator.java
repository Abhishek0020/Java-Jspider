package Basics;

import java.util.Scanner;

public class Calculator {
    public static void add(int a, int b) {
        int res = a + b;
        System.out.println("Result: " + res);
    }
    public static void sub(int a, int b) {
        int res = a - b;
        System.out.println("Result: " + res);
    }

    public static void mul(int a, int b) {
        int res = a * b;
        System.out.println("Result: " + res);
    }
    public static void div(int a, int b) {
        if (b != 0) {
            int res = a / b;
            System.out.println("Result: " + res);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void mod(int a, int b) {
        if (b != 0) {
            int res = a % b;
            System.out.println("Result: " + res);
        } else {
            System.out.println("Cannot calculate modulus with zero.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nEnter the choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");

        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                div(a, b);
                break;
            case 5:
                mod(a, b);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
