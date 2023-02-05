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

### COmmit id 8b8e2d3

From the edutorial  
In Solution2.java  

Using 2 pointers  
1st pointer fast moves n times first.  
Then we start to move the slow pointer starting at head.  
We are moving fast and slow together.  
Since we need 1 inded before the nth index  
To link it to next of next  

### Modifiactions Commit id 6de3491

I learnt that it n might end up being the number of elements.  
So I corrected the code.  

### Modifications Commit id 091a184

I removed the codition from bottom and placed it at upper end  
