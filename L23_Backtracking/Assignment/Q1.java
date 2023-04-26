package L23_Backtracking.Assignment;


public class Q1 {

    public static int count=0;
    public static int size=4;
    public static int [][] matrix= new int[size][size];
    
    public static void ratInMaze(int [][] maze, int row, int col,String prev) {
        // Base Condition
        if(row==maze.length-1 && col==maze[0].length-1){
            matrix[row][col]=1;
            count++;
            return;
        }
        // Chooses to go UP
        if(row>0 && maze [row-1][col]!= 0 && (!prev.equals("UP"))){
            matrix[row][col]=1;
            ratInMaze(maze, row-1, col, "DOWN");
        }
        // Chooses to Move Down
        if(row<maze.length-1 && maze [row+1][col]!= 0 && (!prev.equals("DOWN"))){
            matrix[row][col]=1;
            ratInMaze(maze, row+1, col, "UP");
        }
        // Chooses to Move Left
        if(col>0 && maze [row][col-1]!= 0 && (!prev.equals("LEFT"))){
            matrix[row][col]=1;
            ratInMaze(maze, row, col-1, "RIGHT");
        }
        // Chooses to Move Right
        if(col<maze[0].length-1 && maze [row][col+1]!= 0 && (!prev.equals("RIGHT"))){
            matrix[row][col]=1;
            ratInMaze(maze, row, col+1, "LEFT");
        }
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        // Rat in a Maze Problem
        // Q1 You are given a starting position for a rat which is stuck in a maze at an initial point(0,0) (the maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a square matrix of order N*N where the cells with value 0 represent the maze’s blocked locations while value 1 is the open/available path that the rat can take to reach its destination. The rat's destination is at (N - 1, N - 1).
        // Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze. 
        // The possible directions that it can take to move in the maze are 'U'(up) i.e.(x,y-1),'D'(down) i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
        // (This problem is similar to Grid ways.)
        
        int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 1, 1 },{ 0, 1, 0, 1 },{ 1, 1, 1, 1 } };
        ratInMaze(maze, 0, 0,"");
        System.out.println(count);
        printBoard(matrix);


        
    }
}
