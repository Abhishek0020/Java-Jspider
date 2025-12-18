package number;

public class strong {

    // Method to calculate the factorial of a number
    public static int fact(int y) {
        int fact = 1;
        for (int i = 1; i <= y; i++) {
            fact *= i; // Multiply to get the factorial
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145; // Example number
        int temp = n; // Store original number for comparison
        int sum = 0;

        // Loop through each digit of the number
        while (n > 0) {
            int rem = n % 10; // Get last digit
            sum += fact(rem); // Add factorial of the digit to sum
            n = n / 10; // Remove last digit from the number
        }

        // Check if the sum of factorials equals the original number
        if (sum == temp) {
            System.out.println(temp + " is a strong number.");
        } else {
            System.out.println(temp + " is not a strong number.");
        }
    }
}
