public class Solution3 {

    public static int myAtoi(String s) {
        s = s.trim();

        String[] words = s.split(" ");
        int ans= 0;

        for (int i = 0; i < words.length; i++) {
            try{
                //checking for letters in word                
                int wordEnd = words[i].length();
                int j = 0;
                for (; j < words[i].length(); j++) {
                    boolean isALpha = Character.isAlphabetic(words[i].charAt(j));
                    boolean symbolCheck = ( (words[i].charAt(j)=='-' || words[i].charAt(j)=='+' )&& j!=0 )  ;

                    if( isALpha  || symbolCheck ) {
                    wordEnd = j;
                    break;
                    }
                }
                //debug purpose
                //
                //System.out.println("j "+j);

                String number = words[i].substring(0, wordEnd);

                if( Double.parseDouble( number ) + ans >= Integer.MAX_VALUE ){
                    ans = Integer.MAX_VALUE;
                    return ans;
                }
                else if( Double.parseDouble( number ) + ans <= Integer.MIN_VALUE ){
                    ans = Integer.MIN_VALUE;
                    return ans;
                }
                else{
                    ans = (int)( Double.parseDouble( number ) + ans);
                    return ans;
                }
            }
            
            catch(NumberFormatException e)
            {
                break;
            }

            //checking for next word
            /* 
            try {
                double d = Double.parseDouble(words[i+1]);
            } catch (Exception e) {
                break;
            }
            */
            
        }

        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(myAtoi("42 word -234"));
        // System.out.println(myAtoi("3.14159")); 
        //System.out.println(myAtoi("  -0012a42"));
        //System.out.println(myAtoi("   +0 123"));
        System.out.println(myAtoi("-5-"  ) );
    }
    
}
