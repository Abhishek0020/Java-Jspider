package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class User {
	public static void main(String[] args) {
		
		  ArrayListExample list = new ArrayListExample();

	        // Add elements to the list
	        list.add("Hello");
	        list.add("World");
	        list.add(123); // Adding an integer
	        list.add(45.67); // Adding a double
	        
	        
//	        list.remove(0);
//	        System.out.println(list.get(i));
//	        System.out.println(list.size());
	        
//	        list.add(20);
//	        System.out.println(list.size());
	        
	        list.addPos(20, 1);
	        System.out.println("\nList after adding 20 at index 1:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Element at index " + i + ": " + list.get(i));
	        }
	        
	        
	        // Print size and check if the list is empty
	        
	       // System.out.println("Size after adding elements: " + list.size());//4
	       // System.out.println("Is the list empty? " + list.isEmpty());//false

	        // Get elements by index
	      //  System.out.println("Element at index 0: " + list.get(0)); // Output: Hello
	      //  System.out.println("Element at index 1: " + list.get(1)); // Output: World

	        // Add an element at a specific position
	      //  list.addPos("Inserted at index 1", 1);
	      //  System.out.println("Element at index 1 after insertion: " + list.get(1)); // Output: Inserted at index 1

	        // Print size after insertion
	       // System.out.println("Size after adding element at position 1: " + list.size());

	        // Remove an element at index 2
	        //list.remove(2);
	        //System.out.println("Element at index 2 after removal: " + list.get(2)); // Output: 123 (or IndexOutOfBoundsException if out of bounds)
	        
	        // Print final size
	        //System.out.println("Size after removal: " + list.size());
	        
	        // Check if the list is empty
	       // System.out.println("Is the list empty? " + list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList arrayList=new ArrayList();
//		arrayList.add(10);
//		arrayList.add(20);
//		arrayList.add(30);
//		arrayList.add(40);
//		arrayList.add(50);
//		arrayList.add(60);
//		arrayList.add(70);
//		arrayList.add(80);
//		arrayList.add(90);
//		arrayList.add(100);
//		arrayList.add(110);
//		arrayList.add(120);
//		
//		arrayList.add(25,2);
////		arrayList.remove(4);
		
//	    System.out.println("===================================");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			
//		}
		
		
		
		
		
		
		
		
	}

}
