public class NQueens {

    /*
     * You are given n size of a board, print all the possibilities of adding n queens such that no 2 queens
     * eliminate each other.
    */

    static int queens(boolean[][] board, int row) {
        
        //it means we've put all the queens on the board successfully
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe cell
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }
    
}
