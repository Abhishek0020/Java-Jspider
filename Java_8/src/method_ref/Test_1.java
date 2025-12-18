package method_ref;

import java.util.function.Function;

interface I2 {
    int square(int i);
}

public class Test_1 {
    public int m1(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // Lambda implementation of I2
        I2 i2 = i -> i * i;
        System.out.println(i2.square(5)); // Output: 25

        // Using method reference for the same functionality
        Test_1 t1 = new Test_1();
        I2 i22 = t1::m1;
        System.out.println(i22.square(25)); // Output: 625

        // Using method reference with Function functional interface
        Function<Integer, Integer> fn = t1::m1;
        System.out.println(fn.apply(10)); // Output: 100
    }
}
