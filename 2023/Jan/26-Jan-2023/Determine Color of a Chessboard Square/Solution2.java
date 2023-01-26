

public class Solution2 {
    
    public static boolean squareIsWhite(String coordinates) {
        //char row = coordinates[0]; //letters
        // char col = coordinates[1]; //digits
        int col = Integer.parseInt(coordinates.substring(1, 2));
        /*
        earlier I used 
        int col = Integer.parseInt(coordinates.substring(1, 2));
        where coordinates.substring(1, 2) returned a for coordinates ="a1"
        So It was a logical error
        Silly me
        */
        String chess_row =  "abcdefgh";
        boolean oddRow =true, oddCol;
        if(col/2!=0){ //odd digits
            oddCol = true;
        }
        else oddCol = false;

        for (short i = 0; i < chess_row.length(); i++) {
            if(chess_row.charAt(i) == coordinates.charAt(0) )
            {
                if( (i+1)/2!=0 ) oddRow = false;
                else oddRow = true;
                break;
            }
        }

        if(oddCol == oddRow) return false;
        else return true;

    }

    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ans= squareIsWhite("a1");
        System.out.println(ans);

    }
}
