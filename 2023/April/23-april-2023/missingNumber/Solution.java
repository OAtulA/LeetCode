class Solution {
    /* public static void main(String[] args) {
 
         int arr[]= {0,1,2};
         System.out.println( missingNumber(arr) );
     }
     */
     public static int missingNumber(int[] nums) 
         {
         int n = nums.length;
         sort(nums);
         int gap = n;
 
         for (int i = 0; i < nums.length; i++) {
             if(nums[i]!=i){
                 gap = i;
                 break;
             }
         }
         return gap;
     }
 
     static void sort(int arr[]){
         int i =0, n= arr.length;
         while( i< n){
             
             int correct = arr[i];
 
             // to swap
             if((n!= arr[i])&& (arr[i] != arr[correct]) )
             {
                 int temp = arr[correct];
                 arr[correct] = arr[i];
                 arr[i]=  temp;
             }
 
             // to move
             else{
                 i++;
             }
 
         }
     }
 
 }