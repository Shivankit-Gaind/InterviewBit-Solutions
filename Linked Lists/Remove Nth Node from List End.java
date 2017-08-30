/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    if(a==null)
	        return null;
	   ListNode head = a;
	    ListNode temp2=a,prev=a,temp1=a;
	    int length=0;
	    while(temp1!=null){
	        length++;
	        temp1 = temp1.next;
	        if(length>b){
	            prev = temp2;
	            temp2 = temp2.next;
	        }
	    }
	    if(prev==temp2)
	        return temp2.next;
	    prev.next = prev.next.next;
	    return a;
	}
}

