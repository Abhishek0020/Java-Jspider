package Arr;

public class Prime{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println("Prime numbers in the array:");
        for (int num : a) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

