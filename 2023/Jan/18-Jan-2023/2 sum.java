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
// public class ListNode {}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //int sol[]= new int[100];

        ListNode v1=l1,v2=l2,sol = new ListNode(),tail = new ListNode();
        int i = 0;
        
        while (v1.next != null) {
            int ans=0;

            ListNode node = new ListNode();
            ans += v1.val + v2.val;
            
            if(i==0) {
                sol.ListNode(ans, tail);
                tail =sol;
            }
            else{
                int nextSum = v1.next.val + v2.next.val;
                // Checking this first as its better
                if (nextSum>=10){
                    ans+=nextSum/10;
                }

                if(ans>=10 && i!=0){  
                
              
                //if encountered after 1st value.
                //node.val= ans-10;
                //subtracting tens digit.
                ans = ans-(ans/10)*10;                                              
                }
                //To be continued from here.
                node.ListNode(ans); 
                tail.next = node;
            //tail.ListNode(ta)
                tail =node;                                                  
                }
            /* 
            else{            
            if(ans>=10 && i!=0){  
                
              
                //if encountered after 1st value.
                node.val= ans-10;
                                              
            }            
            else {
                node.val= ans;
            } 
            
            }*/

            
            i++;       

        }
        return sol;
        /*
        int response[]= new int[i];
        for (int j = 0; j < i; j++) {
            response[j]= sol[j];
        }
        return response;
        */

        
    }
}