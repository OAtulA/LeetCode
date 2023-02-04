# Approach

## Approach 1

Since we have to delete nth node from end  
its same as node at (length-1 -n)  
So I will iterate till (length-1 -n-1):  
&emsp; temp = node  

Next = temp->next->next
temp-> next = Next

### COmmit id b8d88c9

I tried it on Solution.java but it didn't work.  
I ended up learning something.  

## Approach 2

From the edutorial  
In Solution2.java  

Using 2 pointers  
1st pointer fast moves n times first.  
Then we start to move the slow pointer starting at head.  
We are moving fast and slow together.  
Since we need 1 inded before the nth index  
To link it to next of next  
