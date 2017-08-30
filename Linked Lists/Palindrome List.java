/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public int lPalin(ListNode a) {
        ListNode slow_ptr = a, fast_ptr = a.next;
	    while(fast_ptr!=null && fast_ptr.next!=null){
	        slow_ptr = slow_ptr.next;
	        fast_ptr = fast_ptr.next.next;
	    }
	    
	    //Separating the two halves 
	    ListNode head1 = a;
	    ListNode head2 = slow_ptr.next;
	    slow_ptr.next = null;
	    
	    
	    //Reversing the latter half
	    head2 = reverse_list(head2);
	    
	    ListNode temp1 = head1;
	    ListNode temp2 = head2;
	    
	    while(temp1!=null && temp2!=null){
	        if(temp1.val!=temp2.val)
	            return 0;
	       temp1 = temp1.next;
	       temp2 = temp2.next;
	    }
	    return 1;
    }
    
    public ListNode reverse_list(ListNode a){
	    ListNode head=null;
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
    ListNode temp;
    public int lPalin(ListNode A) {
        temp = A;
        return lPalin_util(A);
    }
    
    public int lPalin_util(ListNode A){
        if(A==null){
            return 1;
        }
        
        int x = lPalin_util(A.next);
        
        if(x==0)
            return 0;
            
        if(A.val!=temp.val)
            return 0;
            
        temp = temp.next;
        return 1;
            
    }
}
**/
    
	

