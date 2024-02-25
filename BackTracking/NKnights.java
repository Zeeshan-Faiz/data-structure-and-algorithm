public class NKnights {

    /*
     * You are given n size of a board, print all the possibilities of adding n knights such that no 2 knights
     * eliminate each other.
     * Ex if n = 4 (size of board) and 4 (number of knights to be placed on board)
     * 
    */

    static void knight(boolean[][] board, int row, int col, int knights) {
        
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        //reached last cell do nothing
        if (row == board.length - 1 && col == board.length) {
            return;
        }

        //When you reach the last column of a row, start checking for new rows keeping the previous positions of knights intact
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        //move ahead if cell is not fit to place the knight
        knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                //knight is already present in this cell can't put the new knight in the current cell
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                //knight is already present in this cell can't put the new knight in the current cell
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                //knight is already present in this cell can't put the new knight in the current cell
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                //knight is already present in this cell can't put the new knight in the current cell
                return false;
            }
        }
        return true;
    }

    //check whether we are inside the board and not going out of bound
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

}