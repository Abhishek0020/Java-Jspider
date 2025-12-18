package Exception;

public class Testt {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        try {
            System.out.println("outer try : ");
            System.out.println(a[1] / 0);  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (division by zero)
            System.out.println("inner catch : ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException if array index is out of bounds
            System.out.println("inner catch : ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("outer catch : Exception");
        }
    }
}
