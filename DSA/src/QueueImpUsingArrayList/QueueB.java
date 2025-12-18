package QueueImpUsingArrayList;

public class QueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;
        }

        // O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

        public static void display() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Removed: " + q.remove()); // removes the first element (1)
        System.out.println("Peek: " + q.peek()); // displays the front element (2)
        
        System.out.println("====================================");

        System.out.println("Is queue empty? " + q.isEmpty());

        // Displaying the elements of the queue
        q.display(); // Should show the remaining elements [2, 3]

        // Add more elements and display the queue again
      
        q.add(4);
        q.add(5);
        q.add(6); // This will cause overflow because the queue is full now
        System.out.println("==============================================");
        q.display(); // Should show [2, 3, 4, 5]
        
    }
}
