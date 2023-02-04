# Approach

Since we have to delete nth node from end  
its same as node at (length-1 -n)  
So I will iterate till (length-1 -n-1):  
&emsp; temp = node  

Next = temp->next->next
temp-> next = Next
