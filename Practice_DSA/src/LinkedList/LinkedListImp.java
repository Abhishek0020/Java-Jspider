package LinkedList;

public class LinkedListImp {
	

	public static void traversalList(Node head) {
		
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}	
	}
}
