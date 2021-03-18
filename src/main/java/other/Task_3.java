package other;

public class Task_3  implements ListNode {
    static ListNode head; 
  
    static class ListNode { 
  
        int data; 
        ListNode next; 
  
        ListNode(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    ListNode reverse(ListNode node) { 
        ListNode prev = null; 
        ListNode current = node; 
        ListNode next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        Task_3 list = new Task_3(); 
        list.head = new ListNode(33); 
        list.head.next = new ListNode(1); 
        list.head.next.next = new ListNode(5); 
        list.head.next.next.next = new ListNode(91); 
          
        
    }

	public int getItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	public other.ListNode getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNext(other.ListNode next) {
		// TODO Auto-generated method stub
		
	} }
interface ListNode {
    int getItem();
    ListNode getNext();
    void setNext(ListNode next);
}
