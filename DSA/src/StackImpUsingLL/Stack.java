package StackImpUsingLL;

public class Stack {
Node head;
int count;
public void push(Object ele) {
	if(head==null) {
		head=new Node(ele);
	
		count++;
		return;
	}
	head=new Node(ele,head);
	count++;
}
public int size() {
	return count;
}
public boolean isEmpty() {
	return count==0;
}
public Object peek() {
	return head.ele;
}
public Object pop() {
    if (isEmpty()) {  // Check if the stack is empty
        return null;  // Return null if the stack is empty
    }
    Object ele = head.ele;
    head = head.next;
    count--;
    return ele;
}

}
