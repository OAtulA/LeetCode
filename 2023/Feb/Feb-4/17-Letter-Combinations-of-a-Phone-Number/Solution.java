// package 2023.Feb.Feb-4.17-Letter-Combinations-of-a-Phone-Number;

import java.util.List;
class Solution {
    public static List<String> letterCombinations(String digits) {
        int digitsCount = digits.length();
        List<String> combi = new List<String>(){
            List<String>.set(int, String) ;
        } ;        

        return combi;
    }

    public static void main(String[] args) {
        String digits = "3121" ;
        List<String> letters = letterCombinations(digits);
        System.out.println("Number of permutations: "+ letters.toString() );
    }
}