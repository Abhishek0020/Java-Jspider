package Queue;

//queue using Java Collection Framework
import java.util.*;


public class QueueB {
 public static void main(String args[]) {
     //Queue<Integer> q = new LinkedList();
	// Add elements to the queue
	 
	 Queue<Integer> queue = new ArrayDeque<>();
     // Add elements to the queue
     queue.add(1);
     queue.add(2);
     queue.add(3);
     // Print the queue
     System.out.println("Queue: " + queue);
     
    System.out.println("---------------------");
     // Remove the element at the front of the queue
     Integer removed = queue.remove();
     System.out.println("Removed element: " + removed);
     System.out.println("------------------------------");
     // Print the updated queue
     System.out.println("Queue after removal: " + queue);
     // Peek at the element at the front of the queue
     Integer peeked = queue.peek();
     System.out.println("Peeked element: " + peeked);
     System.out.println("--------------------------------");
     // Print the updated queue
     System.out.println("Queue after peek: " + queue);

 }
}

