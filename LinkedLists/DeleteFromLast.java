
/*
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

public class DeleteFromLast {


	public static void main(String [] args) {


	}

	public ListNode removeFromLast(ListNode head, int n) {


		if (head == null) return head; 

		if(head.next == null && n ==1){return null;}


		//We need to pad the linked list with a dummy node
		ListNode nn = new ListNode(0);
		//Initialize two heads and point both to nn 
		ListNode p1 = nn, p2 = nn;

		//Make list node n point to head
		nn.next = head;

		//Move the p2 by n dist and then move them simultaneously
		for(int i = 0;i<=n;i++) {

			//Check if p2 is not null, i.e. the linkedlist is not shorter than n
			if(p2!=null) {
				p2=p2.next;
			}else{
				return null;
			}
		}

		//Now move p2 till it reaches the last node
		while(p2 != null) {
			p1=p1.next;
			p2=p2.next;
		}

		//So the first pointer will be at the element whose next node we are supposed to remove
		ListNode temp = p1.next;
		p1.next = p1.next.next;


		return nn.next;

	}
}
