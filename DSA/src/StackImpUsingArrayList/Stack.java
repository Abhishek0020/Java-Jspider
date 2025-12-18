package StackImpUsingArrayList;

public class Stack {
    private int[] stack; // Array to store stack elements
    private int top;     // Points to the top element
    private int capacity; // Maximum size of the stack

    // Constructor
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation (view top element)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

   
}

