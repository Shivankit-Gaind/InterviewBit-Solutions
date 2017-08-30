/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode a, int b) {
	   ListNode temp1 = a,prev=a;
	   ListNode temp2 = a,prev2 = a;
	   
	   ListNode head = a;
	   
	   while(temp1!=null){
	       
	       if(temp1.val<b){
	           
	           if(temp1==temp2){
	               prev = temp1;
	               prev2 = temp2;
	               temp1=temp1.next;
	               temp2 = temp2.next;
	               continue;
	           }
	           
	           ListNode x = temp1;
	           prev.next = prev.next.next;
	           temp1 = prev.next;
	           
	           
	           if(prev2==head && temp2 ==head){
	               x.next = temp2;
	               prev2 = x;
	               head = x;
	               continue;
	           }
	           
	           
	           x.next = temp2;
	           prev2.next = x;
	           temp2 = x.next;
	           prev2 = x;
	        }
	       else{
	           prev = temp1;
	           temp1 = temp1.next;
	       }
	   }
	   return head;
	}
	
	public void swap(ListNode a, ListNode b){
	    int temp = a.val;
	    a.val = b.val;
	    b.val = temp;
	}
}

