

class Solution2 {
    public static int myAtoi(String s) {
        s = s.trim();

        String[] words = s.split(" ");
        int ans= 0;

        for (int i = 0; i < words.length; i++) {
            try{
            // ans += Integer.parseInt(words[i]);
            //ans += Long.parseLong( words[i] )>= Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.parseInt(words[i]);

            // ans = Long.parseLong( words[i] ) + ans >= Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.parseInt(words[i]) + ans;
            if( Long.parseLong( words[i] ) + ans >= Integer.MAX_VALUE ){
                ans = Integer.MAX_VALUE;
            }
            /* 
            else{
                ans = Integer.parseInt(words[i]) + ans;
            }
            */

            //for lowerbound int value checking

            else if( Long.parseLong( words[i] ) + ans <= Integer.MIN_VALUE ){
               ans = Integer.MIN_VALUE;
            }
            else{
                ans = Integer.parseInt(words[i]) + ans;
            }
            

            }
            catch(NumberFormatException e)
            {
                break;
            }
            try {
                //if next word isn't a number
                // we break out
                // not using isDigit as - sign may be present
                Long n= Long.parseLong(words[i+1]);
            } catch ( Exception e) {                
             break;   
            }                        
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(myAtoi("42 word -234"));
        System.out.println(myAtoi("3.14159"));
    }
}
