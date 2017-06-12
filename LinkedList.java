
public class LinkedList {
	
	Node root;
	
	class Node{
		
		int key;
		Node next;
		
		Node(int x){
			
			key = x;
			next = null;
		}
	}
	
	Node mergeSort(Node head1 , Node head2 , Node reference) {
		
		Node new_head = null;
		Node p = head1;
		Node q = head2;
		
		if(head1 == null) {
			
			return p;
		}
		
		if(head2 == null) {
			
			return q;
		}
		
		if(p.key < q.key) { 
			
			reference = p;
			p = p.next;
		}
		
		else if(p.key > q.key) {
			
			reference = q;
			q = q.next;
		}
		
		if(new_head == null) {
			
			new_head = reference;
		}
		
		while(p != null && q != null) {
			
			if(p.key < q.key) {
				
				reference.next = p;
				reference = p;
				p = reference.next;
			}
			
			else {
				
				reference.next = q;
				reference = q;
				q=reference.next;
			}
			
		}
		
		if(p== null) {
			
			return q;
		}
		
		if(q == null) {
			
			return p;
		}
		
		printList(new_head);
		
		
	}
	
	void printList(Node h) {
		
		while(h != null) {
			
			System.out.println(h.key);
			h = h.next;
		}
	}
	
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
		
		
	}
}
