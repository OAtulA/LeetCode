#include <bits/stdc++.h>
using namespace std;

  // Definition for singly-linked list.
typedef struct ListNode {
      int val;
                        ListNode next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode next) : val(x), next(next) {}
  } ListNode ;
 
class Solution {
public:
    ListNode swapPairs(ListNode head) {
        ListNode itr = head;
        if(itr.val == 0)
            return head;
        while (itr.val != 0 )
        {
            ListNode first = itr;
            ListNode second = NULL;
            if(first.val != 0){
                second = first.next;
            }
            if(second.val != 0){
                ListNode temp = first;
                ListNode nextFirst= second.next;
                second.next = first;
                first.next = nextFirst;
                itr = first;
            }
            else
            {
                break;
            }                                                    
        }
        
        return head;

    }
};