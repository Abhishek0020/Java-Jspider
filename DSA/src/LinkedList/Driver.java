package LinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();  // Create an instance of your custom LinkedListImp

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add("abhi");
        list.add(true);

        // Print the size of the list
        System.out.println("Size of the list: " + list.size());

        // Print all elements of the list
        System.out.println("All elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  // Get and print each element
        }

        // Print specific element at index 2
        System.out.println("Element at index 2: " + list.get(2));  // "abhi"

        // Check if the list contains a specific element
        System.out.println("Contains 20? " + list.contains(20)); // true

        System.out.println("================================");

        // Display all elements using the Display method from LinkedListImp
        System.out.println("Displaying list elements using Display method:");
        list.Display();

        System.out.println("==================================");

        // Remove the element at index 2 (removes "abhi")
        list.remove(2);
        System.out.println("List after removing element at index 2:");
        list.Display();  // Print the list after removal

        // Traverse the list manually
        System.out.println("==================================");
        System.out.println("Traversing the list manually:");
        LinkedListImp.traverse(list.head);  // You need to use the 'head' node to traverse
    }
}
