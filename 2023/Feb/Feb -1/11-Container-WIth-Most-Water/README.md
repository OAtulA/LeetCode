# Solution

## Question

Q 11. Container With Most Water
Medium  

## Approach 1

### Step 1

Store the sorted array in 2D array.  
With the original index in 2nd array i.e. 2DArr[1].  

### Step 2

h = 2DArr[0]  
x= 2DArr[1]  
Nested Loop to get abs(  h[i+1]-(h[i+1] - h[i]) )  
consecutively try to find abs(x[i]- x[i+1])  
Find the max area

Time complexity O(n^2)

## Approach 2

Just do a nested loop for heights.  
Find the max area.  

### Time COmplexity

O(n^2)

## Approach 3 : 2 pointer approach

Start a single loop with half length.  
2 pointers start and end.  
move the pointer only if the height increases.  
Calculate and compare the area.

## Approach 4: 2 pointer approach but optimised

move that pointer whose height is less till the start < end pointer.
