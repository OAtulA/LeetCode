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

     //As there is a possibilty n = no. of elements.
     if(fast == null) 
        return head.next;

     while(fast.next!= null){
        fast = fast.next;
        slow = slow.next;    
        len++;    
     }
     //The below if is not needed as we have already checked above.
     //if(n != len)
     slow.next = (slow.next).next;

     return head;
    }
}
