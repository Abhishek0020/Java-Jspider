package StackImpUsingArrayList;

public class Driver {
	
	// Main method for testing
	 public static void main(String[] args) {
	        Stack stack = new Stack(5); // Stack of size 5

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.display(); // Output: 10 20 30

	  System.out.println("Top element: " + stack.peek()); // Output: 30//but not removed element 
	  stack.display();
	  System.out.println("===============================");
	        System.out.println("Popped element: " + stack.pop()); // Output: 30 and removed 30
	        stack.display(); // Output: 10 20
	    }

}
