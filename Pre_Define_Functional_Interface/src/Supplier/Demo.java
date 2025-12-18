package Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<Emp> empSupplier = () -> {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            return new Emp(name, age, salary);
        };

        System.out.println("Enter details for Employee 1:");
        Emp e1 = empSupplier.get();

        System.out.println("Enter details for Employee 2:");
        Emp e2 = empSupplier.get();

        System.out.println("Employee Details:");
        System.out.println(e1);
        System.out.println(e2);

        scanner.close(); // Always close Scanner when done
    }
}
