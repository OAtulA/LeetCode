
class Solution {

    public static int tellArea(int start,int end, int endIndex,int i, int maxEndIndex,  int area, int[] height) {

        if (end < height[endIndex]){
            end = height[endIndex];
            maxEndIndex = endIndex;
        }
            

        // TO find the effective height
        int wallHeight = Math.min(start, end);
        int width = Math.abs(maxEndIndex - i);
        int newArea = wallHeight * width;

        if (area < newArea)
            area = newArea;        
        
        return area;
    }
    public static int maxArea(int[] height) {
        int area = 0;
        int start, end, endIndex;
        int maxEndIndex, maxStartIndex=0;
        maxEndIndex = (height.length)-1;
        start = height[0];
        end = height[height.length - 1];
        area =  Math.min(start, end) * Math.abs(height.length -1);
        endIndex = height.length - 1 ;
        for (int i = 0; i <= height.length / 2 ; i++) {

            // preventing same wall
            if (i != height.length - 1 - i) {

                // moving the pointer only if next is greater
                if (start < height[i]){
                    start = height[i];
                    maxStartIndex =i;
                }
                    
                //don't move at mid postion twice on same wall both for start and end.
                if(height.length %2 !=0 && i!= height.length/2){
                    endIndex = height.length - 1 - i;
                }  
                //move all position in even size array
                else if(height.length %2 ==0){
                    endIndex = height.length - 1 - i;
                }   
                area = tellArea(start, end, endIndex, maxStartIndex, maxEndIndex, area, height);
            }
        }
        return area;
    }

    public static void main(String[] args) {

        //int[] arr = { 2, 3, 4, 5 };
        // int[] height = {1,8,6,2,5,4,8,3,7};
        // int[] height = {1,1};
        System.out.println("max area: " + maxArea(height));

    }
}
