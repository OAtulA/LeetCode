
// Easy Problem
class Solution{

    public static boolean squareIsWhite(String coordinates) {
        /* 
         coordinates[0] letters row
         coordinates[1] digits column    
         */        
        short col = Short.parseShort(coordinates.substring(1, 2));
        /*
        earlier I used 
        int col = Integer.parseInt(coordinates.substring(0, 1));
        where coordinates.substring(0, 1) returned a for coordinates ="a1"
        So It was a logical error
        Silly me
        */
        String chess_row =  "abcdefgh";
        boolean oddRow =true, oddCol;

        // System.out.println("COlumn: "+ col);

        /*
         * Another logical blunder
         * if(col/2!=0)
         * whereas intended to do if(col%2!=0)
         */
        if(col%2!=0){ //odd digits
            oddCol = true;
        }
        else oddCol = false;

        //just to debug 
        // System.out.println("COlumn: "+oddCol);

        for (short i = 0; i < chess_row.length(); i++) {
            if(chess_row.charAt(i) == coordinates.charAt(0) )
            {
                if( (i+1)%2!=0 ) oddRow = true;
                else oddRow = false;
                break;
            }
        }

        // System.out.println("ROw: "+oddRow);

        if(oddCol == oddRow) return false;
        else return true;

    }

    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ans= squareIsWhite("a1");
        System.out.println(ans);

    }
}