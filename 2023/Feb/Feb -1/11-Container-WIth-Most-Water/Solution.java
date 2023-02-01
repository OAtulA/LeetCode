
class Solution {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left= 0, right = height.length -1;                

        while(left< right){
            int h = Math.min(height[left], height[right]);
            int w = right -left;
            int area = h* w;

            maxArea = Math.max(maxArea, area);

            if(height[left]< height[right]) left++;
            else if(height[left]> height[right]) right--;
            else {
                left++;
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        //int[] arr = { 2, 3, 4, 5 };
        // int[] height = {1,8,6,2,5,4,8,3,7};
        // int[] height = {1,1};
        int[] height = {1,2,4,3};
        System.out.println("max area: " + maxArea(height));

    }
}
