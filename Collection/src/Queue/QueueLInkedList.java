package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLInkedList {
	public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // Print the queue
        System.out.println("Queue: " + queue);
        // Remove the element at the front of the queue
        Integer removed = queue.remove();
        System.out.println("Removed element: " + removed);
        // Print the updated queue
        System.out.println("Queue after removal: " + queue);
        // Peek at the element at the front of the queue
        Integer peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        // Print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}
