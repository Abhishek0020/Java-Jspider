package StackImpUsingLL;

public class User {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println("================");
        
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        
        // Now pop will return null when the stack is empty, no need to throw an exception
        System.out.println(s.pop());  // This will now return null instead of throwing an exception

        System.out.println("====================");
        System.out.println(s.isEmpty());
    }
}
