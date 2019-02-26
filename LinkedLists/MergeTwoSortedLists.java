
public class MergeTwoSortedLists {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		//check if l1 or l2 is null, then return the other
		if(l1 ==null) return l2;

		if(l2 == null) return l1;

		//recurse 
		
		//if l1 pointer is less then l2 pointer value then add the mergeTwoLists to l1.next
		if(l1.val <=l2.val){
			l1.next =  mergeTwoLists(l1.next,l2);
			return l1;
		}
		else{
			l2.next = mergeTwoLists(l1,l2.next);
			return l2;
		}

	}


}
