// package 2023.Feb.Feb-4.19-Remove-Nth-Node-From-End-of-List;

 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode fast =head;
     int len =0;
     for (int i = 0; i < n; i++) {
        fast = fast.next;
        len++;
     }
     ListNode slow =head;
     // We are finding one before the nth element
     
     while(fast.next!= null){
        fast = fast.next;
        slow = slow.next;    
        len++;    
     }
     if(n != len)
     slow.next = (slow.next).next;
     else return head.next;
     
     return head;
    }
}
