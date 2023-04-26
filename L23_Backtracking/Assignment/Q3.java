package L23_Backtracking.Assignment;


public class Q3 {

    public static int ans=0;

    public static void knightMove(int[][] board, int row, int col, int count) {
        // Base Case
        if(row<0 || row>= board.length || col<0 || col>= board[0].length || board[row][col]>0){
            ans++;
            // System.out.print("False"+ " ");
            return;
        }
        else if(count == board.length * board[0].length){
            board[row][col]= count;
            printBoard(board);
            // board[row][col]= 0;
            return;
        }

        board[row][col]= count;
        knightMove(board, row-2, col+1, count+1);
        knightMove(board, row-1, col+2, count+1);
        knightMove(board, row+1, col+2, count+1);
        knightMove(board, row+2, col+1, count+1);
        knightMove(board, row+2, col-1, count+1);
        knightMove(board, row+1, col-2, count+1);
        knightMove(board, row-1, col-2, count+1);
        knightMove(board, row-2, col-1, count+1);
        board[row][col]= 0;

    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Q3 Knight’s Tour
        // Given a N*N board with the Knight placed on the first block of an empty board. Moving according to the rules of chess, knights must visit each square exactly once. Print the order of each cell in which they are visited. (NOT DONE)

        int[][] board = new int[5][5];
        knightMove(board, 0, 0, 1);
        System.out.println(ans);
    }

}
