

public class OptimisedSolution {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        char[] letters = s.toCharArray();
        int wordLen =0;
        //Reverse traversing to get the last word.
        for (int i = letters.length-1; i >=0; i--) {
            // If last char is a symbol like . or ? I am not including it in word length.
            /* 
            if((i==  (letters.length-1) && ( Character.isLetter( letters[i] )) ))
            {
                wordLen++;
            }
            else
            */
            if (i >=0 &&  ( Character.isLetter( letters[i] ) || letters[i]== '\'')  ) wordLen++;
            //Since word can also end at "
            // else if(letters[i]==' ' || letters[i]== '\'' || letters[i] == '\"' )
            // commented the above line as ' is often used as mom's , Ronbin's etc.

            else if(letters[i]==' ' || letters[i] == '\"' )
            {
                return wordLen;
            }

        }
        return wordLen;
    }

    public static void main(String[] args) {
        String sentence= "   fly me   to   the moon  ";

        System.out.println("last word length "+ lengthOfLastWord(sentence) );
    }
    
}
