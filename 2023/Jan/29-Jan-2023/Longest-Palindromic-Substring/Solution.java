
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

            if (s.length() == 1) {
                return s;
            } 
            else if (i != endIndex) {
                // Checking for the biggest palindrome
                String substr = s.substring(i, endIndex + 1);
                String reversed = (new StringBuffer(substr).reverse()).toString();
                boolean isPalindrome = substr.equals(reversed);

                if (isPalindrome && (substr.length() > maxPalin)) {
                    Palin = substr;
                    maxPalin = substr.length();
                }
                // When we can't find the biggest we try to find the next biggest with it.
                else {
                     int mid;
                    
                        mid = endIndex-1;
                        int recentindex = s.indexOf(letter, mid);
                        while (recentindex != endIndex) {
                            substr = s.substring(i, recentindex + 1);
                            isPalindrome = substr.equals((new StringBuffer(substr).reverse()).toString());

                            if (isPalindrome && (substr.length() > maxPalin)) {
                                Palin = substr;
                                maxPalin = substr.length();
                            }
                            mid = endIndex-1;
                            recentindex = s.indexOf(letter, mid);
                        }
                    
                }

            }else if (maxPalin == 0) {
                Palin = letter;
                maxPalin = 1;
            }

        }

        return Palin;
    }

    public static void main(String[] args) {

        // String s = "babad";
        // String s = "cbbd";
        // String s= "a";

        String s;
        // s= "ac";
        // s = "aaabaaaa";
        s="bacabab";

        System.out.println(longestPalindrome(s));

    }
}