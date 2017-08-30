/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    ListNode head = a;
	    if(a==null)
	        return null;
	    
	    ListNode slow_ptr = a;
	    ListNode fast_ptr = a;
	    
	    while(fast_ptr!=null && fast_ptr.next!=null){
	        slow_ptr = slow_ptr.next;
	        fast_ptr = fast_ptr.next.next;
	        
	        if(slow_ptr==fast_ptr)
	            break;
	    }
	    
	    if(fast_ptr==null || fast_ptr.next==null)
	        return null;
	    
	    ListNode temp = fast_ptr;
	    fast_ptr = fast_ptr.next;
	    
	    // Counting total number of nodes in the loop
	    int count = 1;
	    while(fast_ptr!=temp){
	        count++;
	        fast_ptr=fast_ptr.next;
	    }
	    
	    slow_ptr = head;
	    fast_ptr = head;
	    
	    //Moving one pointer at a distance of COUNT from the head
	    int x = 0;
	    while(x<count){
	        x++;
	        fast_ptr = fast_ptr.next;
	    }
	    
	    while(slow_ptr!=fast_ptr){
	        slow_ptr = slow_ptr.next;
	        fast_ptr = fast_ptr.next;
	    }
	    
	    return slow_ptr;
	}
}

/**

public class Solution {
	public ListNode detectCycle(ListNode a) {
	    if(a==null)
	        return null;
	    HashSet<ListNode> set = new HashSet<ListNode>();
	    ListNode temp = a;
	    while(temp!=null){
	        if(set.contains(temp))
	            return temp;
	       else set.add(temp);
	       temp = temp.next;
	    }
	    return null;
	}
}

**/


