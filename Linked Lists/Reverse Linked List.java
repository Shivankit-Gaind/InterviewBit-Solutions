/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode head;
	public ListNode reverseList(ListNode a) {
	    ListNode prev = null, temp = a;
	    while(temp!=null){
	        if(temp.next==null)
	            head=temp;
	        ListNode x = temp.next; 
	        temp.next = prev;
	        prev = temp;
	        temp = x;
	    }
	    return head;
	}	
}

/**
public class Solution {
    ListNode head;
	public ListNode reverseList(ListNode a) {
	    reverseList_UTIL(a,null);
	    return head;
	}
	
	public void reverseList_UTIL(ListNode next, ListNode prev){
	    if(next==null)
	        return;
	   if(next.next==null)
	        head = next;
	   reverseList_UTIL(next.next,next);
	   next.next = prev;
	}
}
**/
