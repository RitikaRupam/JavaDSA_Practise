package BackTracking;
/*
 * Algoritm technique, Recursively, Search/Explore
 * 1. Decision Problem
 * 2. Optimisation Problem
 * 3. Enumeration Problem(Permutation)
 */
public class NQueen {

    static boolean queenSafe(boolean [][]board,int row,int col){
        //checking in above row
        for(int i=row;i>=0;i--){
            if(board[i][col]){  //there is a queen
                return false;
            }
        }
        //check left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //Check right diagonal
        for(int i=row,j=col;i>=0 && j<board[row].length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    static int countNumberOfWays(boolean board[][],int currentRow){
        int count=0;
        //termination case
        if(currentRow==board.length){
            return 1;
        }
        //From the Row(Need to traverse each column)
        for(int column=0;column<board[currentRow].length;column++){
            //Place the queen in the column but before placing check if queen is safe or not
            if(queenSafe(board, currentRow, column)){
                board[currentRow][column]=true; //Placing the queen 
                int result=countNumberOfWays(board, currentRow+1);
                count=count+result;
                //Stack Fall(Backtracking)
                board[currentRow][column]=false;    //undo option
            }
        }
        return count;
    }
    public static void main(String[] args) {
        final int N=1;
        boolean chessBoard[][]=new boolean[N][N];
        int count=countNumberOfWays(chessBoard, 0);
        System.out.println(count);
        
    }
}
