/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    int l1 = get_length(a);
	    int l2 = get_length(b);
	    
	    if(l1>l2)
	        return getIntersectionNode_UTIL(a,b,l1-l2);
	   else return getIntersectionNode_UTIL(b,a,l2-l1);
	}
	
	public ListNode getIntersectionNode_UTIL(ListNode a, ListNode b, int n){
	    for(int i=0;i<n;i++)
	        a=a.next;
	   while(a!=b){
	       a=a.next;
	       b=b.next;
	   }
	   return a;
	}
	
	int get_length(ListNode a){
	   int length = 0;
	    while(a!=null){
	        length++;
	        a=a.next;
	    }
	   return length;
	        
	}
}

