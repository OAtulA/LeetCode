/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode itr = head,temp;

        while (itr.next!= null) {
            temp = itr;
            itr = itr.next;
            itr.next = temp;
            //Move to next pair
            itr = itr.next.next;
        }
        
        return head;
    }
}
