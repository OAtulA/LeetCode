#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        int ans = -1;
        if( haystack.find(needle) != string::npos ){
            ans = haystack.find(needle);
        }        
        //just to debug
        // cout<<haystack.find(needle)<<endl;
        // if(ans ==4) ans =5;

        return ans;
    }
};

int main(int argc, char const *argv[])
{
    string haystack =  "sadbutnotsad"; 
    string needle = "sad";

    Solution obj;
    obj.strStr(haystack, needle);

    return 0;
}
