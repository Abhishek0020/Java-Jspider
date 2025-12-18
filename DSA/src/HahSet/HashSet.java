package HahSet;

public class HashSet {
	int count=0;
	Node[] a=new Node[10];
	public boolean add(Object ele) {
		int hc=Math.abs(ele.hashCode());
		int index=hc%a.length;
		if(a[index]==null) {
			a[index]=new Node(ele);
			count++;
			return true;
			
		}
		Node curr=a[index];
		while(curr.next!=null) {
			if(curr.ele.equals(ele)) 
				return true;
			curr=curr.next;
		}
		curr.next=new Node(ele);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.ele);
				curr=curr.next;
			}
		}
	}
	public boolean contains(Object ele) {
		int hc=Math.abs(ele.hashCode());
		int index=hc%a.length;
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele))
				return true;
			curr=curr.next;
		}
		return false;
	}

//	public boolean remove(Object ele) {
//		int hc=Math.abs(ele.hashCode());
//		int index=hc%a.length;
//		Node prev=null;
//		Node curr=a[index];
//		while(curr!=null) {
//			if(curr.ele.equals(ele)) {
//				if(prev==null) {
//					a[index]=a[index].next;
//					count--;
//					return true;
//				}
//				
//			}
//		}
//		return false;
//		
//		
//	}
	public boolean remove(Object ele) {
	    int hc = Math.abs(ele.hashCode());   // Calculate the hash code
	    int index = hc % a.length;           // Find the index in the hash table
	    Node prev = null;
	    Node curr = a[index];
	    
	    while (curr != null) {
	        if (curr.ele.equals(ele)) {       // Check if the current node matches the element to remove
	            if (prev == null) {
	                // The element to remove is the first node in the bucket
	                a[index] = curr.next;
	            } else {
	                // The element to remove is not the first node, link the previous node to the next node
	                prev.next = curr.next;
	            }
	            count--;  // Decrease the count of elements
	            return true;  // Element found and removed
	        }
	        prev = curr;     // Move prev to the current node
	        curr = curr.next; // Move curr to the next node in the linked list
	    }
	    
	    return false;  // Element not found
	}
}
