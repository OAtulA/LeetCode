class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0, end =  nums.length;
        int mid = (start+ end)/2;

        while (start< mid) {
            if(nums[mid]== target)
                return mid;
            else if(nums[mid]> target)
                end = mid -1;
            else 
                
        }
    }
}