/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    if(a==null || a.next == null)
	        return a;
	        
	   ListNode temp = a, pretemp = null,pretemp2 = null,head = a,returned_node=null,hold=null,x=null;
	    int length = 1;
	    while(temp!=null){
	        if(length==m){
	            hold = pretemp;
	            while(length<=n){
	                x = temp.next;
	                temp.next = pretemp2;
	                pretemp2 = temp;
	                temp = x;
	                length++;
	            }
	            break;
	        }
	        length++;
	        pretemp = temp;
	        temp = temp.next;
	            
	    }
	    
	    if(hold==null){
	         head = pretemp2;
	         hold = pretemp2;
	    }
	       
	    else
	        hold.next = pretemp2;
	    temp = hold;
	    
	    while(temp.next!=null)
	        temp = temp.next;
	        
	   temp.next = x;
	   
	   return head;
	    
	}
	

}

