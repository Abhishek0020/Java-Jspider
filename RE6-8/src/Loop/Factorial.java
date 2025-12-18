package Loop;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3)); // Directly calling the static method
    }

    public static int factorial(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n;  // Multiply prod with n
            n--;  // Decrement n, not prod
        }
        return prod;
    }
}
