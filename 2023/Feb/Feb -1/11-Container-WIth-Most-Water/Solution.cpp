#include <bits/stdc++.h>
using namespace std;


class Solution {
public:
    int maxArea(vector<int>& height) {
        int right = 0;
        int left =  height.size()-1 ;
        int maxArea =0;
        while(right>left){
            int h = min(height[right], height[right]);
            int w= right- left;
            int area= h*w;
            maxArea = max(area, maxArea);
            if( (height[left] > height[right]) )           
             right--;
            else left++;
        }
        return maxArea;
    }
};

int main(int argc, char const *argv[])
{
    vector<int> height= {1,1};
    Solution obj;
    cout<<obj.maxArea(height)<<endl;
    return 0;
}
