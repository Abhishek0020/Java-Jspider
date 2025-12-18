package constructor;

public class F extends E {

    int x = 20; // subclass variable

    void add() {
        int x = 30; // local variable
        System.out.println(this.x);   // refers to F's x => 20
        System.out.println(super.x);  // refers to E's x => 10
        System.out.println(x);        // refers to local x => 30
    }

    public static void main(String[] args) {
        F f = new F(); // fixed: should create F, not B
        f.add();
    }
}
