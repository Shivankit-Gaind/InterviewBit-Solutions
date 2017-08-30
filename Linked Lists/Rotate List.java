/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int k) {
	    ListNode temp1=a,temp2=a,pretemp1=null,pretemp2=null;
	    
	    int length = get_length(a);
	    k = k%length;
	    if(k==0)
	        return a;
	        
	  ListNode hold = a;
	   for(int i=0;i<k;i++){
	       pretemp1 = temp1;
	       temp1=temp1.next;
	   }
	   while(temp1!=null){
	       pretemp1 = temp1;
	       temp1=temp1.next;
	       pretemp2 = temp2;
	       temp2 = temp2.next;
	   }
	   pretemp1.next=hold;
	   pretemp2.next = null;
	   return temp2;
	}
	
	int get_length(ListNode a){
	    if(a==null)     
	        return 0;
	   int length = 0; 
	   while(a!=null){
	       a=a.next;
	       length++;
	   }
	    return length;
	}
}

