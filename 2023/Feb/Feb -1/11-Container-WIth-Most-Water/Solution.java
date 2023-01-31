
class Solution {
    public static int maxArea(int[] height) {
        int area = 0;
        int start, end, newArea, wallHeight, endIndex;
        start = height[0];
        end = height[height.length - 1];
        for (int i = 0; i < height.length / 2 + 1; i++) {

            // preventing same wall
            if (i != height.length - 1 - i) {

                // moving the pointer only if next is greater
                if (start < height[i])
                    start = height[i];

                endIndex = height.length - 1 - i;
                if (end < height[endIndex])
                    end = height[endIndex];

                // TO find the effective height
                wallHeight = Math.min(start, end);
                newArea = wallHeight * Math.abs(endIndex - i);

                if (area < newArea)
                    area = newArea;
            }
        }
        return area;
    }

    public static void main(String[] args) {

        //int[] arr = { 2, 3, 4, 5 };
        
        System.out.println("max area: " + maxArea(arr));

    }
}
