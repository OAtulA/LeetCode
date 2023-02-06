


  // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode itr = head,temp;
        ListNode nextStart = itr.next.next;

        while (itr.next!=null && itr.next!= null ) {
            temp = head.next;
            if(temp.next != null){
                nextStart = temp.next;
                temp.next = itr;
                itr.next = nextStart;
                //for last pair we need last node of last pair
                if(nextStart.next.next == null) 
                    nextStart = itr;
                else
                itr = nextStart; 

            }
            // Since there is nothing after the last pair
            else{
                //here the nextStart is for the last term of prev pair
                itr = nextStart.next;
                temp = itr.next;
                nextStart.next = temp;
                temp.next = itr;
                //nextStart.next = 


            }
            /*
            temp = itr;
            itr = itr.next;
            itr.next = temp;
            //Move to next pair
            itr = itr.next.next;
            */
        }
        
        return head;
    }

        public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail= head;

        for (int i = 2; i <= 4; i++) {
            ListNode node = new ListNode(i);
            if(i==2)
            {
                tail = node;
                head.next = tail;
            }
            else{
                tail.next = node;                        
                tail = node;
            }                
        }
        ListNode ans = swapPairs(head);
        System.out.println("ans: [");
        while (ans.next != null) {
            System.out.print(" "+ans.val);
        }
        System.out.println(" ]");
        // System.out.println("ans: "+ Listnode.toString());
    }

}
