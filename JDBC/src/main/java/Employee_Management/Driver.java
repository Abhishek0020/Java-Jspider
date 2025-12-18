package Employee_Management;

import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpService emp = new EmpService();

        boolean flag = false;
        while (!flag) {
            System.out.println("\nWELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. UPDATE EMPLOYEE");
            System.out.println("3. FETCH EMPLOYEE");
            System.out.println("4. DELETE EMPLOYEE");
            System.out.println("5. GET ALL EMPLOYEE DETAILS");
            System.out.println("6. EXIT");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int res = emp.save();
                    System.out.println(res != 0 ? "Data added successfully." : "Failed to add data.");
                    break;

                case 2:
                    int res1 = emp.update();
                    System.out.println(res1 != 0 ? "Data updated successfully." : "Failed to update data.");
                    break;

                case 3:
                    emp.fetch(); // Already prints inside the method
                    break;

                case 4:
                    int res3 = emp.delete();
                    System.out.println(res3 != 0 ? "Data deleted successfully." : "Failed to delete data.");
                    break;

                case 5:
                    List<Entity> list = emp.getall();
                    if (list != null && !list.isEmpty()) {
                        System.out.println("ID\tName\tAge\tSalary");
                        for (Entity e : list) {
                            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getAge() + "\t" + e.getSal());
                        }
                    } else {
                        System.out.println("No records found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using our application!");
                    flag = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
