
/*
 * Question link: https://leetcode.com/problems/two-sum/
*/
//brute force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sol[]= new int[2];
        
        for (int i = 0; i < nums.length; i++) {            
            for (int j = 0; j < nums.length; j++) {                
                if(nums[i]+nums[j] == target && i!=j){
                    sol[0] =i;
                    sol[1]=j;                    
                    return sol;                    
                }
            }
        }
        return sol;
    }
}  