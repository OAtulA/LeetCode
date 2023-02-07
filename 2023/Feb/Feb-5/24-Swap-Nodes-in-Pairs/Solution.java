
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next= head;
        ListNode itr = dummy;
        
        while( itr!= null){
            ListNode first = itr.next;
            ListNode second = null;
            
            if(first!= null)
                second = first.next;

            if(second != null){
                ListNode secondNext = second.next;
                second.next = first;
                itr.next =second;
                first.next = secondNext;
                itr = first;
                //swaping completed

                itr = first;                
                // So that in next iteration 
                // first starts at the first of next pair
            }
            else{
                // since we have no more pair left;
                break;
            }

        }
        

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = head;

        for (int i = 2; i <= 4; i++) {
            ListNode node = new ListNode(i);
            if (i == 2) {
                tail = node;
                head.next = tail;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        ListNode ans = swapPairs(head);
        System.out.println("ans: [");
        while (ans.next != null) {
            System.out.print(" " + ans.val);
            ans = ans.next;
        }
        System.out.println(" ]");
        // System.out.println("ans: "+ Listnode.toString());
    }

}
