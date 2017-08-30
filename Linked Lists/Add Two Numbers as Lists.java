/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    int carry=0,sum,rem=0;
	    ListNode head=null,curr=null,temp1=a,temp2=b;
	    while(temp1!=null && temp2!=null){
	        sum = carry+temp1.val+temp2.val;
	        carry = sum/10;
	        rem = sum%10;
	        
	        ListNode n = new ListNode(rem);
	        if(curr==null){
	            curr = n;
	            head = n;
	        }
	       else{
	           curr.next = n;
	           curr = curr.next;
	       }
	       
	       temp1 = temp1.next;
	       temp2 = temp2.next;
	    }
	    
	    while(temp1!=null){
	        sum = carry+temp1.val;
	        carry = sum/10;
	        rem = sum%10;
	        ListNode n = new ListNode(rem);
	        if(curr==null){
	            curr = n;
	            head = n;
	        }
	       else{
	           curr.next = n;
	           curr = curr.next;
	       }
	       
	       temp1 = temp1.next;
	    }
	    
	    while(temp2!=null){
	        sum = carry+temp2.val;
	        carry = sum/10;
	        rem = sum%10;
	        ListNode n = new ListNode(rem);
	        if(curr==null){
	            curr = n;
	            head = n;
	        }
	       else{
	           curr.next = n;
	           curr = curr.next;
	       }
	       
	       temp2 = temp2.next;
	    }
	    
	    if(carry!=0){
	        ListNode n = new ListNode(carry);
	        if(curr==null){
	            curr = n;
	            head = n;
	        }
	       else{
	           curr.next = n;
	           curr = curr.next;
	       }
	    }
	    
	    return head;
	}
}

