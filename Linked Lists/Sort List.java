/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class Solution {
	public ListNode sortList(ListNode a) {
	    if(a==null || a.next==null)
	        return a;
	   
	   ListNode head1 = a;
	   ListNode head2 = front_back_split(a);
	   
	   head1 = sortList(head1);
	   head2 = sortList(head2);
	   
	   return merge(head1,head2);
	}
	
	//Splits the Linked List into two halves
	public ListNode front_back_split(ListNode a){
	    ListNode slow = a;
	    ListNode fast = a.next;
	    
	    while(fast!=null && fast.next!=null){
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    ListNode temp = slow.next;
	    slow.next=null;
	    return temp;
	}
	
	//Merge two linked lists
	public ListNode merge(ListNode a, ListNode b){
	    ListNode node=new ListNode(0),head = node; //Dummy Node
	    ListNode temp1=a,temp2 = b;
	    while(temp1!=null && temp2!=null){
	        if(temp1.val<temp2.val){
	            node.next = temp1;
	            node = node.next;
	            temp1 = temp1.next;
	        }
	        else{
	            node.next = temp2;
	            node = node.next;
	            temp2 = temp2.next;
	        }
	    }
	    
	    while(temp1!=null){
	       node.next = temp1;
	       node = node.next;
	       temp1 = temp1.next;
	    }
	    
	    while(temp2!=null){
	        node.next = temp2;
	        node = node.next;
	        temp2 = temp2.next;
	    }
	    
	    return head.next;
	}
}


/**

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 
 
 //Quick Sort on Linked List
public class Solution {
	public ListNode sortList(ListNode a) {
	    ListNode end = getTail(a);
	    ListNode newHead = sortList_UTIL(a,end);
	    return newHead;
	}
	
	public ListNode getTail(ListNode a){
	    if(a==null || a.next==null)
	        return a;
	   ListNode temp = a;
	   while(temp.next!=null)
	        temp = temp.next;
	   return temp;
	}
	
	public ListNode sortList_UTIL(ListNode head, ListNode end){
	    if(head==null || head==end)
	        return head;
	   ListNode newHead = partition(head, end);
	   
	   if(newHead!=end){
	       ListNode temp = newHead;
	       while(temp.next!=end)
	            temp = temp.next;
	       temp.next = null;
	       newHead = sortList_UTIL(newHead,temp);
	       ListNode x = getTail(newHead);
	       x.next = end;
	   }
	   end.next = sortList_UTIL(end.next,getTail(end.next));
	   return newHead;
	}
	
	public ListNode partition(ListNode head, ListNode end){
	    ListNode newHead = head,newend = end;
	    int value = end.val;
	    ListNode prev = null,temp = head;
	    while(temp!=end){
	        if(temp.val>value){
	            if(prev==null){
	                newHead = temp.next;
	                newend.next = temp;
	                temp.next = null;
	                newend = newend.next;
	                temp = newHead;
	            }
	            else{
	                prev.next = temp.next;
	                newend.next = temp;
	                temp.next = null;
	                newend = newend.next;
	                temp = prev.next;
	            }
	        }
	        else{
	            prev = temp;
	            temp = temp.next;
	        }
	    }
	    return newHead;
	}
}

**/

