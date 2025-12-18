package constructor;

public class B extends A {
    B() {
        super(10); // Call A's constructor with an int
        System.out.println(3);
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
