
// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode iterator = head ;
        ListNode temp = head;
        int len =0;
        
        temp = head;
        // to count number of elemnts
        while(temp.next !=  null) {
            len++;
            temp = temp.next;
        }
        temp =head;
        //this will iterate just before the deletion node
        for (int i = 0; i < len - n -1; i++) {
            temp = temp.next;
        }

        /*
         * The below statement boils down to 
         *  ( (n-1)th_Node.next) = (n+1)th_Node.next
         */
        ListNode Del= temp.next;

        temp.next = Del.next;
        
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();

        for (int i = 1; i <= 7; i++) {
            ListNode Node = new ListNode(i);            
        }
        int n =3;

        ListNode ans = removeNthFromEnd(head, n);
        System.out.println(" Done: "+ ans.toString() );
    }
}