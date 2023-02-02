#include <bits/stdc++.h>
using namespace std;


class Solution {
public:
    int maxArea(vector<int>& height) {
        int right = 0,left =  height.size()-1 ;
        int maxArea =0;
        while(right>left){
            int h = min(height[right], height[left]);
            int w= right- left;
            int area= h*w;
            maxArea = max(area, maxArea);
            if( (height[left] > height[right]) )           
             right--;
            else if (height[left] < height[right])
            left++;
            else{
                right--;
                left++;
            }
        }
        return maxArea;
    }
};

int main(int argc, char const *argv[])
{
    vector<int> height;
    // height= {1,1};
    height = {1,8,6,2,5,4,8,3,7};
    Solution obj;
    cout<<obj.maxArea(height)<<endl;
    return 0;
}
