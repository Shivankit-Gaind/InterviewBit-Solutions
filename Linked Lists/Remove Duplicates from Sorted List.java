/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    ListNode temp = a;
	    while(temp!=null){
	        if(temp.next==null)
	            return a;
	       if(temp.next.val==temp.val)
	            temp.next = temp.next.next;
	       else temp = temp.next;
	    }
	    return a;
	}
}

