/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    int curr;
	public ListNode deleteDuplicates(ListNode a) {
	    if(a == null||a.next==null)
	        return a;
	   ListNode temp = a,prev = a,head=a,temp2;
	   while(temp!=null){
	       if(temp.next!=null){
	           if(temp.val==temp.next.val){
	               temp2 = temp;
	               while(temp2!=null && temp2.val==temp.val)
	                    temp2 = temp2.next;
	               if(prev==temp){
	                   prev = temp2;
	                   head=temp2;
	               }
	               else
	                    prev.next = temp2;
	                
	               temp = temp2;
	           }
	           else{
	               prev = temp;
	               temp = temp.next;
	           }
	                
	       }
	       else{
	           temp = temp.next;
	       }
	   }
	   return head;
	   
	}
}

