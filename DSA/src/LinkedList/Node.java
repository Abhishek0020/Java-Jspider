package LinkedList;

public class Node {
	int data;
	Node head;
	Object ele;
	Node next;
	public Node curr;
	Node(Object ele) {
				this.ele=ele;				
	}
	Node(int data){
		this.data=data;
	}
	public Node(Object ele,Node next) {
		this.ele=ele;
		this.next=next;	
	}
}
