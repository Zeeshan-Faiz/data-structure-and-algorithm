public class SudokuSolver {

    /*
     * A Sudoku board is a (9x9) matrix, where in we have to put numbers from 1-9 in each row and 1-9 in each
     * column provided no two equal numbers are adjcent, also keep in mind that each (3x3) sub matrix should only
     * contains numbers from 1-9.
    */

    static boolean solve(int[][] board) {
        
        int n = board.length, row = -1, col = -1;
        boolean emptyLeft = true;

        // Everytime find an empty cell and assign it's index to row and col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        // soduko is solved
        if (emptyLeft == true) {
            return true;
        }

        //Put (1-9) in the matrix
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is already there in the row previosuly
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (int[] nums : board) {
            // check if the number is already there in the col previosuly
            if (nums[col] == num) {
                return false;
            }
        }

        //check for (3x3) sub matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    

    
}