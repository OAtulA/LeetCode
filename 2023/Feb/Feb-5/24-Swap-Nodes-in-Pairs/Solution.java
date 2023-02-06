
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
        ListNode itr = head, temp;
        ListNode nextStart = itr.next.next;

        while (itr != null && itr.next != null) {
            temp = head.next;
            if (temp.next != null) {
                nextStart = temp.next;
                temp.next = itr;
                // We will now check for the last pair

                // for last pair we need last node of last pair
                if (nextStart.next.next == null) {
                    // I am on the last pair
                    // I will just operate on it and done

                    // The below just does it to point last part of current pair to 2nd node of next
                    // pair
                    itr.next = nextStart.next;

                    temp = nextStart;
                    temp.next = itr;
                    break;
                } else
                    // Moving on to next pair
                    itr.next = nextStart;
                itr = nextStart;

            }

            /*
             * temp = itr;
             * itr = itr.next;
             * itr.next = temp;
             * //Move to next pair
             * itr = itr.next.next;
             */
        }

        return head;
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
