

class Solution {
    
    
    public static int lengthOfLastWord(String s) {
        int lastWordLen ;
        s= s.trim();
        // removed extra space
        int lastWordIndex= s.lastIndexOf(" ");
        lastWordIndex++;
        //as word begins after " "
        lastWordLen = s.substring(lastWordIndex).length() ;
        return lastWordLen;
    }
    
    public static void main(String[] args) {
        int lastWordLen=  Solution.lengthOfLastWord("luffy is still joyboy");
        System.out.println(lastWordLen);
    }
    
}