package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    int count;
    Node tail;

    // Add an element at the end of the list
    public void add(Object ele) {
        if (head == null) {
            head = new Node(ele);
            tail = head;  // Set tail as the first node
            count++;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(curr, ele, null);  // Set the new node's prev to current node and next to null
        tail = curr.next;  // Update tail
        count++;
    }

    // Get the size of the list
    public int size() {
        return count;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Display the list from head to tail
    public void Display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    // Reverse display the list from tail to head
    public void reverseDisplay() {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.prev;
        }
    }

    // Check if the list contains a certain element
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

    // Add element at the beginning
    public void addFirst(Object ele) {
        Node n = new Node(ele);
        n.next = head;
        if (head != null) {
            head.prev = n;
        }
        head = n;
        if (tail == null) {
            tail = head;  // If list was empty, set tail to head
        }
        count++;
    }

    // Add element at the end
    public void addLast(Object ele) {
        Node n = new Node(ele);
        if (tail != null) {
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
        if (head == null) {
            head = tail;  // If list was empty, set head to tail
        }
        count++;
    }

    // Add element at a specific position
    public void addPos(Object ele, int index) {
        if (index < 0 || index > size())  // Correct the condition here
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(ele);
            return;
        }
        if (index == size()) {
            addLast(ele);
            return;
        }
        Node n = new Node(ele);
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        n.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = n;
        }
        curr.next = n;
        n.prev = curr;
        count++;
    }

    // Remove element at a specific position
    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            count--;
            return;
        }
        if (index == size() - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
            count--;
            return;
        }
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next != null) {
            curr.next.prev = curr;
        }
        count--;
    }
}
