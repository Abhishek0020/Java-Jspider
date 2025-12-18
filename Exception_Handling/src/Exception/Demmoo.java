package Exception;

public class Demmoo {
    public static void main(String[] args) {
        System.out.println("main start : ");
        
        try {
            System.out.println(10 / 0);  
            ArithmeticException a = new ArithmeticException();             // This line is fine but depends on AE class
            System.out.println("try block : "); // This won't be printed due to exception
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("handled : ");
        }
        
        System.out.println("main end : ");
    }
}
