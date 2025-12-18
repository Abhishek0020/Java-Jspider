package QueueImpUsingLinkedlist;

public class Driver {
    public static void main(String[] args) {
        Queue q = new Queue();

        // Add elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Check the size of the queue
        System.out.println("Size of the queue: " + q.size());  // Expected output: 5

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());  // Expected output: false

        // Peek the first element in the queue
        System.out.println("Peek the first element: " + q.peek());  // Expected output: 10

        System.out.println("================================================================");

        // Poll (remove and return) elements from the queue
        while (!q.isEmpty()) {
            System.out.println("Poll element: " + q.poll());  // Expected output: 10, 20, 30, 40, 50
        }
        System.out.println("===========================================================");

        // Now that the queue is empty, polling again will return null
        System.out.println("Poll from empty queue: " + q.poll());  // Expected output: null

        System.out.println("============================================================");
        System.out.println("Is the queue empty? " + q.isEmpty());  // Expected output: true
        System.out.println("Size of the queue: " + q.size());  // Expected output: 0
    }
}
