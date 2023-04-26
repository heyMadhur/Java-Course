package L23_Backtracking;

public class Imp_T6_Sudoku_Solver {

    public static boolean checkValue(int[][] board, int row, int col, int value) {
        // Check Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }
        // Check Column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }
        // Check Grid
        int minRow = (row / 3) * 3;
        int minCol = (col / 3) * 3;
        for (int i = minRow; i < minRow + 3; i++) {
            for (int j = minCol; j < minCol + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int[][] sudokuBoard, int row, int col) {
        if (row == sudokuBoard.length) {
            System.out.println("Final");
            printBoard(sudokuBoard);
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }

        if (sudokuBoard[row][col] != 0)
            return sudokuSolver(sudokuBoard, nextRow, nextCol);
        for (int i = 1; i <= sudokuBoard.length; i++) {
            if (checkValue(sudokuBoard, row, col, i)) {
                sudokuBoard[row][col] = i;
                if (sudokuSolver(sudokuBoard, nextRow, nextCol)) {      // Soln Exist
                    return true;
                }
                sudokuBoard[row][col] = 0;

            }
        }

        return false;

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
        int[][] sudokuBoard = {
                { 7, 0, 0, 0, 0, 0, 2, 0, 0 },
                { 4, 0, 2, 0, 0, 0, 0, 0, 3 },
                { 0, 0, 0, 2, 0, 1, 0, 0, 0 },
                { 3, 0, 0, 1, 8, 0, 0, 9, 7 },
                { 0, 0, 9, 0, 7, 0, 6, 0, 0 },
                { 6, 5, 0, 0, 3, 2, 0, 0, 1 },
                { 0, 0, 0, 4, 0, 9, 0, 0, 0 },
                { 5, 0, 0, 0, 0, 0, 1, 0, 6 },
                { 0, 0, 6, 0, 0, 0, 0, 0, 8 }
        };

        sudokuSolver(sudokuBoard, 0, 0);

    }
}
