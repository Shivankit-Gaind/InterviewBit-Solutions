/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    ListNode head=null;
	    ListNode temp1 = a,temp2=b;
	    ListNode curr=null;
	    ListNode new_node;
	    while(temp1!=null&&temp2!=null){
	        if(temp1.val<temp2.val){
	            new_node = new ListNode(temp1.val); temp1=temp1.next;}
	        else{
	            new_node = new ListNode(temp2.val); temp2 = temp2.next;}
	       
	       if(curr!=null){
	                curr.next = new_node; curr=curr.next;}
	                
	           else{
	               head = new_node;
	               curr = new_node;
	           }
	    }
	    
	    while(temp1!=null){
	        new_node = new ListNode(temp1.val);
	        if(curr!=null){
	                curr.next = new_node;curr=curr.next;}
	           else{
	               head = new_node;
	               curr = new_node;
	           }
	       temp1=temp1.next;
	    }
	    while(temp2!=null){
	        new_node = new ListNode(temp2.val);
	        if(curr!=null){
	                curr.next = new_node;curr=curr.next;}
	           else{
	               head = new_node;
	               curr = new_node;
	           }
	       temp2=temp2.next;
	    }
	    return head;
	}
}

