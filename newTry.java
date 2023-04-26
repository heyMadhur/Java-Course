public class newTry {
   public static void printSubsets(String str, int idx, String newStr) {
      if (str.length() == idx) {
         System.out.println(newStr);
         return;
      }
      char c = str.charAt(idx);
      // Choose
      printSubsets(str, idx + 1, newStr + c);
      // Dont Chooses
      printSubsets(str, idx + 1, newStr);
   }

   public static void printPermutation(String str, String newStr) {
      // Base Condition
      if (str.length() == 0) {
         System.out.println(newStr);
         return;
      }

      for (int i = 0; i < str.length(); i++) {
         char c = str.charAt(i);
         String temp = str.substring(0, i) + str.substring(i + 1);
         printPermutation(temp, newStr + c);
      }

   }

   public static void nQueens(char[][] board, int row) {
      if (row == board.length) {
         printBoard(board);
         return;
      }
      for (int col = 0; col < board.length; col++) {
         if (isSafe(board, row, col)) {
            board[row][col] = 'Q';
            nQueens(board, row + 1);
            board[row][col] = '.';
         }
      }
   }

   public static boolean isSafe(char[][] board, int row, int col) {
      // Upper Diagonal Left
      for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
         if (board[i][j] == 'Q')
            return false;
      }
      // Vertical Check
      for (int i = 0; i < row; i++) {
         if (board[i][col] == 'Q')
            return false;
      }
      // Upper Right Diagonal
      for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
         if (board[i][j] == 'Q')
            return false;
      }
      return true;
   }

   public static void printBoard(char[][] board) {
      System.out.println("--------Chess Board-------------");
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static int count = 0;

   public static void gridWays(int[][] arr, int row, int col) {
      if (row == arr.length - 1 && col == arr[0].length - 1) {
         count++;
         return;
      }
      // Move Right
      if (col < arr[0].length)
         gridWays(arr, row, col + 1);
      // Move Down
      if (row < arr.length)
         gridWays(arr, row + 1, col);
   }

   public static void printBoard(int[][] board) {
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {
            System.out.print(board[i][j] + " ");

         }
         System.out.println();
      }
   }

   public static boolean sudokuSolver(int[][] arr, int row, int col) {
      if (row == arr.length) {
         printBoard(arr);
         return true;
      }

      int nextRow = row, nextCol = col + 1;
      if (nextCol == arr.length) {
         nextCol = 0;
         nextRow = row + 1;
      }

      if (arr[row][col] != 0) {
         return sudokuSolver(arr, nextRow, nextCol);
      }
      for (int i = 1; i <= arr.length; i++) {
         if (isCorrect(arr, row, col, i)) {
            arr[row][col] = i;
            if (sudokuSolver(arr, nextRow, nextCol)) {
               return true;
            }
            arr[row][col] = 0;

         }
      }

      return false;

   }

   public static boolean isCorrect(int[][] arr, int row, int col, int value) {
      // Row Check
      for (int i = 0; i < arr.length; i++) {
         if (arr[row][i] == value) {
            return false;
         }
      }
      // Column Check
      for (int i = 0; i < arr.length; i++) {
         if (arr[i][col] == value) {
            return false;
         }
      }
      // Grid Check
      int startRow = (row / 3) * 3;
      int startCol = (col / 3) * 3;
      for (int i = startRow; i < startRow + 3; i++) {
         for (int j = startCol; j < startCol + 3; j++) {
            if (arr[i][j] == value) {
               return false;
            }

         }

      }

      return true;
   }
    public static int size=4;
    public static int [][] matrix= new int[size][size];
   public static void ratInMaze(int[][] maze, int row, int col, String prev) {
      // Base Condition
      if (row == maze.length - 1 && col == maze[0].length - 1) {
         matrix[row][col]=1;
         count++;
         return ;
      }
      // Chooses to go UP
      if (row > 0 && maze[row - 1][col] != 0 && (!prev.equals("UP"))) {
         System.out.println("UP");
         matrix[row][col]=1;
         ratInMaze(maze, row - 1, col, "DOWN");
      }

      // Chooses to Move Down
      if (row < maze.length - 1 && maze[row + 1][col] != 0 && (!prev.equals("DOWN"))) {
         System.out.println("DOWN");
         matrix[row][col]=1;
         ratInMaze(maze, row + 1, col, "UP");
      }

      // Chooses to Move Left
      if (col > 0 && maze[row][col - 1] != 0 && (!prev.equals("LEFT"))) {
         System.out.println("LEFT");
         matrix[row][col]=1;
         ratInMaze(maze, row, col - 1, "RIGHT");
      }

      // Chooses to Move Right
      if (col < maze[0].length - 1 && maze[row][col + 1] != 0 && (!prev.equals("RIGHT"))) {
         System.out.println("RIGHT");
         matrix[row][col]=1;
         ratInMaze(maze, row, col + 1, "LEFT");
      }

   }

   // public static void printBoard(int[][] board) {
   // for (int i = 0; i < board.length; i++) {
   // for (int j = 0; j < board.length; j++) {
   // System.out.print(board[i][j] + " ");
   // }
   // System.out.println();
   // }
   // }

   public static void main(String[] args) {

      // printSubsets("abc", 0, "");
      // printPermutation("abc", "");

      // int size = 3;
      // char[][] board = new char[size][size];
      // for (int i = 0; i < board.length; i++) {
      // for (int j = 0; j < board.length; j++) {
      // board[i][j] = '.';
      // }
      // }
      // // nQueens(board, 0);
      // int[][] arr = new int[size][size];
      // gridWays(arr, 0, 0);
      // System.out.println(count);

      // int[][] sudokuBoard = {
      // { 7, 0, 0, 0, 0, 0, 2, 0, 0 },
      // { 4, 0, 2, 0, 0, 0, 0, 0, 3 },
      // { 0, 0, 0, 2, 0, 1, 0, 0, 0 },
      // { 3, 0, 0, 1, 8, 0, 0, 9, 7 },
      // { 0, 0, 9, 0, 7, 0, 6, 0, 0 },
      // { 6, 5, 0, 0, 3, 2, 0, 0, 1 },
      // { 0, 0, 0, 4, 0, 9, 0, 0, 0 },
      // { 5, 0, 0, 0, 0, 0, 1, 0, 6 },
      // { 0, 0, 6, 0, 0, 0, 0, 0, 8 }
      // };

      // sudokuSolver(sudokuBoard, 0, 0);

      int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 1, 1 },
            { 0, 1, 0, 1 },
            { 1, 1, 1, 1 }
      };

      ratInMaze(maze, 0, 0, "");
      System.out.println(count);
      printBoard(matrix);

   }
}
