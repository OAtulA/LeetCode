//
  // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 //

class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode itr = head,temp;
        ListNode nextStart;

        // Here itr is to iterate, temp to have 2nd immediate node
        // nextStart is for next start point
        try{
        while (itr.next!= null && itr != null) {
            
            temp = itr;
            itr = itr.next;
            nextStart = itr.next;
            itr.next = temp;

            temp.next =  nextStart;
            //Move to next pair
            itr = nextStart;
        }
        }
        catch (NullPointerException e){
             int flag =1 ;
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