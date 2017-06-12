
public class LL_Length {
	
	Node head ;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int x){
			
			data = x;
			next = null;
		}
		
	}
	
	void insert(int x ){
			
			Node new_node = new Node(x);
			
			if(head == null){
				
				head = new_node;
			}
			
			else{
				
				Node temp = head;
				
				while(temp.next != null){
					
					temp = temp.next;
				}
				
				temp.next = new_node;
			}
		}
		
		int length(Node node){
			
			Node temp = node;
			
			if(temp == null) {
				
				return 0;
			}
			
			return 1 + length(temp.next);
			
		}
	
	
	public static void main(String args[]){
		
		LL_Length obj = new LL_Length();
		
		obj.insert(3);
		obj.insert(2);
		obj.insert(4);
		obj.insert(1);
		obj.insert(5);
		obj.insert(7);
		
		System.out.println("Length = "+obj.length(obj.head));
		
	}

}
