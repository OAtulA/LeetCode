public class Solution3 {

    public static int myAtoi(String s) {
        s = s.trim();

        String[] words = s.split(" ");
        int ans= 0;

        for (int i = 0; i < words.length; i++) {
            try{
                if( Double.parseDouble( words[i] ) + ans >= Integer.MAX_VALUE ){
                    ans = Integer.MAX_VALUE;
                }
                else if( Double.parseDouble( words[i] ) + ans <= Integer.MIN_VALUE ){
                    ans = Integer.MIN_VALUE;
                }
                else{
                    ans = (int)( Double.parseDouble(words[i]) + ans);
                }
            }
            catch(NumberFormatException e)
            {
                break;
            }

            //checking for next word

            try {
                double d = Double.parseDouble(words[i+1]);
            } catch (Exception e) {
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
