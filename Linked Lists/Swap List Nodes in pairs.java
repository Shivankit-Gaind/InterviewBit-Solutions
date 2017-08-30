/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
	    
	    if(a==null || a.next==null)
	        return a;
	    
	    ListNode temp = a;
    	ListNode prev = null;
    	ListNode head = null;
    	
    	while(temp!=null && temp.next!=null){
    	    ListNode x = temp;
    	    ListNode y = temp.next;
    	    ListNode z = temp.next.next;
    	    
    	    y.next = x;
    	    
    	    if(prev==null){
    	        head = y;
    	    }
    	    else{
    	        prev.next = y;
    	    }
    	    prev = y.next;
    	    temp = z;
    	}
    	
    	prev.next = temp;
    	return head;
	}
}

/**
public class Solution {
	public ListNode swapPairs(ListNode a) {
	    if(a==null || a.next==null)
	        return a;
	    ListNode temp1 = a;
	    ListNode temp2 = a.next;
	    
	   ListNode temp3 = a.next.next;
	   temp2.next = temp1;
	   temp1.next = swapPairs(temp3);
	   return temp2;
	   
	}
}

**/

