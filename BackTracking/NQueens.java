public class NQueens {

    /*
     * You are given n size of a board, print all the possibilities of adding n queens such that no 2 queens
     * eliminate each other.
     * Ex if n = 4 (size of board) and 4 (number of queens to be placed on board)
     * 
     * O/P = 2 (possibilites)
       X Q X X 
       X X X Q
       Q X X X
       X X Q X

       X X Q X
       Q X X X
       X X X Q
       X Q X X
     
     * Time Complexity = O(N!)
     * Space Complexity = O(NxN)
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
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                //queen is already present in the vertical position, so this current cell is not safe
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                //queen is already present in upper left diagonal, this current cell is not safe
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                //queen is already present in upper reight diagonal, this current cell is not safe
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    
}