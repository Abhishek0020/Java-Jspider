package DoublyLinkedList;

public class Driver {

    public static void main(String[] args) {
        // Create a new doubly linked list
        DoublyLinkedList d = new DoublyLinkedList();

        // Add some elements to the list
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.add(60);

        // Print the size of the list
        System.out.println("Size of the list: " + d.size()); // Expected output: 6

        // Check if the list is empty
        System.out.println("Is the list empty? " + d.isEmpty()); // Expected output: false

        // Display all elements in the list
        System.out.println("Displaying list:");
        d.Display();  // Expected output: 10 20 30 40 50 60

        // Reverse display the list (optional)
        System.out.println("Displaying list in reverse:");
        d.reverseDisplay();  // Expected output: 60 50 40 30 20 10

        System.out.println("===============");

        // Add an element at position 5 (index starts from 0)
        d.addPos(25, 5);  // Adds 25 at position 5 (between 20 and 30)

        // Display the list after adding the element at position 5
        System.out.println("List after adding 25 at position 5:");
        d.Display();  // Expected output: 10 20 25 30 40 50 60

        // Remove the element at position 3 (index 3)
        d.remove(3);  // Removes 30 from the list

        // Display the list after removal
        System.out.println("List after removing element at position 3:");
        d.Display();  // Expected output: 10 20 25 40 50 60
    }
}
