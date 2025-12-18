package Crud;

import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empservice service = new Empservice();

        while (true) {
            System.out.println("\n---- Employee Management System ----");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    service.add(new Emp());
                    break;

                case 2:
                    System.out.print("Enter ID to fetch: ");
                    id = sc.nextInt();
                    Emp emp = service.getEmp(id);
                    if (emp != null) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();
                    service.update(new Emp());
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();
                    service.delete(id);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
