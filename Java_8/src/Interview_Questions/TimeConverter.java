package Interview_Questions;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter time in minutes: ");
        int totalMinutes = scanner.nextInt();

        // Convert to hours and minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Output the result
        System.out.println("Converted Time: " + hours + " hour(s) and " + minutes + " minute(s)");

        scanner.close();
    }
}
