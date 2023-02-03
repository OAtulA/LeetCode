// import javax.sound.midi.Soundbank;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start =0, end =  nums.length;
        int mid = (start+ end)/2;

        while (start< mid) {
            if(nums[mid]== target)
                return mid;
            else if(nums[mid]> target)
                end = mid -1;
            else 
                start = mid+1;
            
            mid = (start+ end)/2;
        }
        if( mid != nums.length-1)
         mid++;
        
         return mid;
    }
    public static void main(String[] args) {
        int[] n = {1,3,5,6};
        System.out.println(searchInsert(n, 2));
    }
}