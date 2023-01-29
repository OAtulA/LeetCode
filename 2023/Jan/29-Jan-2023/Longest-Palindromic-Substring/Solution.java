
/**
 * Solution
 */
public class Solution {

    public static String longestPalindrome(String s) {
        String Palin = "";
        int maxPalin = 0;

        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            int endIndex = s.lastIndexOf(letter);

            if(s.length()==1){
                return s;
            }

            else if (i != endIndex) {
                //Checking for the biggest palindrome
                String substr = s.substring(i, endIndex + 1);
                boolean isPalindrome = substr.equals((new StringBuffer(substr).reverse()).toString());

                if (isPalindrome && (substr.length() > maxPalin)) {
                    Palin = substr;
                    maxPalin = substr.length();
                } 
                // When we can't find the biggest we try to find the next biggest with it.
                else {
                    /* Thought process
                    // going back in reverse order to find the next recent same letter
                    // to check for palindrome
                    // similar to like binary search
                     */
                    int mid = (i + endIndex) / 2;
                    int recentindex = s.indexOf(letter, mid);
                    while (recentindex != endIndex) {
                        substr = s.substring(i, recentindex + 1);
                        isPalindrome = substr.equals((new StringBuffer(substr).reverse()).toString());

                        if (isPalindrome && (substr.length() > maxPalin)) {
                            Palin = substr;
                            maxPalin = substr.length();
                        }
                        endIndex = recentindex;
                    }
                }
        
            }
            

        }
        


        return Palin;
    }

    public static void main(String[] args) {
        //String s = "babad";
        //String s = "cbbd";
        String s= "a";

        System.out.println(longestPalindrome(s));
        
    }
}