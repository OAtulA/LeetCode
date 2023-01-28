import java.util.ArrayList;

public class Solution {
    public static int myAtoi(String s) {
        s = s.trim();
        ArrayList<Integer> nums = new ArrayList<Integer>() ;
        int ans = 0;
        
        //debug
        System.out.println(s);
        // char[] letters = s.toCharArray();

        // Loop to get all numbers from the given String
        int startNumIndex =0,nextSpaceIndex=0;
        for (int i = 0; i < s.length(); i++) {
            boolean plus_min_num= (s.charAt(i+1) == '-' || s.charAt(i+1)== '+' || Character.isDigit(s.charAt(i+1))) ;
            // To check if the next letters are for number.

            /*
             startNumIndex!= nextSpaceIndex as while iterating we will reach next space 
             and both are equal we won't get a number.
             */
          
            if(s.charAt(i) == ' ' && startNumIndex!= nextSpaceIndex ) {
                nextSpaceIndex =i;
                String number = s.substring(startNumIndex, nextSpaceIndex) ;
                int num=Integer.parseInt( number );

                nums.add(num);

                // so that the next num starts from the next index.
                if(plus_min_num){
                    startNumIndex = nextSpaceIndex +1;
                }
            }
            // As this is the mentioned condition in the given problem
            else if( Character.isAlphabetic(s.charAt(i)) )          
                break;
        }

        // Adding all the numbers
        for (int i = 0; i < nums.size(); i++) {
            
                ans += nums.get(i);
            
        }


        return ans;
    }
        

    public static void main(String[] args) {
        System.out.println( myAtoi("  -131 word"));
    }
}
