package LinkedList;

public class LinkedListImp {
    Node head;
    int count = 0;

    // Add element at the end of the list
    public void add(Object ele) {
        if (head == null) {
            head = new Node(ele);
            count++;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(ele, null);
        count++;
    }

    // Get size of the list
    public int size() {
        return count;
    }

    // Get element at a specific index
    public Object get(int in) {
        if (in < 0 || in >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < in; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    // Add element at a specific position
    public void addPos(Object ele, int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        Node n = new Node(ele);
        if (index == 0) {
            addFirst(ele);
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        n.next = curr.next;
        curr.next = n;
        count++;
    }

    // Add element at the beginning
    public void addFirst(Object ele) {
        Node n = new Node(ele);
        n.next = head;
        head = n;
        count++;
    }

    // Display all elements of the list
    public void Display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    // Check if the list contains a specific element
    public boolean contains(Object ele) {
        Node curr = head;
        while (curr != null) {
            if (curr.ele.equals(ele)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // Remove element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        if (index == 0) {
            head = head.next;
            count--;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
    }

    // Traverse the list (for testing purposes)
    public static void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.ele);  // Print the element of each node
            current = current.next;  // Move to the next node
        }
    }
}
