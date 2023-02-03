// import javax.sound.midi.Soundbank;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start =0, end =  nums.length;
        int mid = (start+ end)/2;

        while (start< mid) {
            if(nums[mid]== target)
                return mid;
            else if(nums[mid]> target)
                end = mid;
            else 
                start = mid+1;
            
            mid = (start+ end)/2;
        }
        /*
        if( mid != nums.length-1)
         mid++;
        */
        /*
         I got my mistake.
         To propose its probable index 
         I simply need to once more compare the value with the mid value.
         If the nums[mid] > target, target should be immediately before it.
         else If the nums[mid] > target, target should be immediately after it.
         */
        if(nums[mid]> target && mid!=0 )
        // if(nums[mid]> target)
            mid--;
        else if(nums[mid]< target && mid!= nums.length-1 )      
            mid++;
        return mid;

    }
    public static void main(String[] args) {
        int[] n = {1,3,5,6};
        System.out.println(searchInsert(n, 7));
    }
}