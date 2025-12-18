package QueueImpUsingLinkedlist;

public class Queue {
	Node head;
	int count;
	Node tail;
	
	public void add(Object ele) {
		if(head==null) {
			head=new Node(ele);
			tail=head;
			count++;
			return;
			
		}
		tail.next=new Node(ele);
		tail=tail.next;
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
	public Object poll() {
	    if (isEmpty()) {  // Check if the queue is empty
	        return null;  // Return null if the queue is empty
	    }
	    Object ele = head.ele;
	    head = head.next;
	    count--;  // Decrement count when an element is removed
	    return ele;
	}
}
