/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode a) {
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
	    head2 = reverse_list(head2);;
	    
	    
	    //Merging
	    ListNode temp1 = head1;
	    ListNode temp2 = head2;
	    ListNode final_head = new ListNode(0); //Dummy Node
	    ListNode result = final_head;
	    while(temp1!=null || temp2!=null){
	        if(temp1!=null){
	            final_head.next = temp1;
	            final_head = final_head.next;
	            temp1 = temp1.next;
	        }
	        if(temp2!=null){
	            final_head.next = temp2;
	            final_head = final_head.next;
	            temp2 = temp2.next;
	        }
	    }
	    final_head.next=null;
	    return result.next;
	    
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
    ListNode temp,prev,y; int flag=0;
	public ListNode reorderList(ListNode a) {
	    temp = a;
	    prev = null;
	    reorderList_UTIL(a);
	    return a;
	}
	
	public void reorderList_UTIL(ListNode a){
	    if(a==null)
	        return;
	    reorderList_UTIL(a.next);
	    if(flag==0){
	        if(prev!=null)
	        prev.next = temp;
    	    y = temp.next;
    	    
    	    if(a==temp){
    	        flag = 1;
    	        temp.next=null;
    	    }
    	    else{
    	        if(a==temp.next)
    	            flag=1;
    	        temp.next = a;
        	    prev = a;
        	    temp = y;
        	    if(flag==1)
        	        prev.next = null;
    	    }
	    }
	}
}

**/
