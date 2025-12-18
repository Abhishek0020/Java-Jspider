package LinkedList;

import java.util.LinkedList;  // For the built-in LinkedList

public class Driver {

    public static void main(String[] args) {
    	
    	Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	
    	System.out.println("build in custom linkedlist : ");
    	
    	LinkedListImp.traversalList(head);
    	
    	LinkedList<Object>l=new LinkedList<Object>();
    	l.add(10);
    	l.add(20);
    	l.add(30);
    	l.add(40);
    	
    	//print all the element in building linkedList using for-each loop
    	System.out.println("buid in linked ist");
    	for(Object element:l) {
    		System.out.println(element+"");
    	} 	
        
    }
}
