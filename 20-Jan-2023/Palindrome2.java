
class Solution {
    public static boolean isPalindrome(int x) {        

        //We have to find palindrome;
        if (x<0){
            return false;
        }
        else{
            StringBuffer original, reverse;
            original = new StringBuffer(Integer.toString(x));
            System.out.println(original);
            reverse = original.reverse();
            
            System.out.println(reverse);
            if( StringBuffer.toString(original).equals( StringBuffer.toString(reverse)) ){
                return true;                
            }
            else{
                return false;
            }
        }        
    }   
    
    public static void main(String[] args) {
        boolean bi= isPalindrome(10);
    }
}

/*
class Palindrome extends Solution{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        int n = Integer.parseInt(br.readLine());
        boolean b= isPalindrome(n);
    }
}
 */