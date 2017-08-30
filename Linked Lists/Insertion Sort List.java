/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode insertionSortList(ListNode a) {
	    insertionSortList_UTIL(a);
	    return a;
	}
	
	public void insertionSortList_UTIL(ListNode a){
	    if(a==null)
	        return;
	   insertionSortList_UTIL(a.next);
	   insert_in_order(a.val,a);
	}
	
	public void insert_in_order(int key, ListNode a){
	    if(a==null||a.next==null)
	        return;
	   if(key<=a.next.val)
	        return;
	   else{
	       int temp = a.next.val;
	       a.next.val = key;
	       a.val = temp;
	       insert_in_order(key,a.next);
	   }
	    
	}
}

