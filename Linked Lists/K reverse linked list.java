/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode a, int k) {
        if(a==null || k==1)
            return a;
        int count = 1;
        ListNode temp = a,prev = null;
        ListNode first = a;
        while(count<=k){
            ListNode x  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = x;
            count++;
        }
        first.next = reverseList(temp,k);
        
        return prev;
    }
}
