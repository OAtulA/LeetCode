import java.io.*;

class Solution{
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), maxLen=0,subLen=0;
        
        for (int i = 0; i < s.length(); i++) {
            //to get starting letter
            boolean brk2 = false;
            for (int j = i; ( j < s.length() -1); j++) {
                //to get letters of the substring

                //This substring is before this char
                // we will compare and then add this char
                String sub = s.substring(i,j);
                subLen = sub.length();
                
                //checking if this letter is already present in subsstring
                                
                boolean containsLetter = sub.contains( Character.toString(s.charAt(j) ));
                if(containsLetter){
                    brk2 =true;
                    break;
                }                                    
            }
            // sublen +1 as we have not included the s.chartAt(j) in the substring.            
            //maxLen = Math.max(subLen +1, maxLen);

            //Let's check it for debug purpose.
            maxLen = Math.max(subLen , maxLen);
            
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s;

        s ="sldfhlsd sofsdfsd sofjsdoifj";
        System.out.println("Longest non repeating substring "+lengthOfLongestSubstring(s));
    }

}