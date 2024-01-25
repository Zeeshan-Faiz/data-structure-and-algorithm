import java.util.ArrayList;
import java.util.List;

public class SprialOrder {
    
    /*Give a mxn matrix return a list of elements of matrix in spiral order.
     * 
     * Example ar = {{1,2,3,4},
     *              {5,6,7,8},
     *              {9,10,11,12}},
     * 
     * O/P = [1,2,3,4,8,12,11,10,9,5,6,7]
    */

    /*
     * Approach :  
     *                         left         right
     *                          ⬇️           ⬇️
     * Example =       (top)➡️{{1,2,3,4,5,6,7,8},
     *                         {9,10,11,12,13,14,15,16},
     *                         {17,18,19,20,21,22,23,24},
     *              (bottom)➡️{25,26,27,28,29,30,31,32}}
     * 
     * We'll be assigning 4 different variables to keep a track of position in the matrix.
     * If we want to get all the elements of the matrix in sprial order, we can follow a simple order
     * of printing/getting the elements.
     * i)➡️(left_to_right) : mat[top][left-->right]
     * ii)⬇️(top_to_bottom) : mat[top-->bottom][right]
     * iii)⬅️(right_to_left) : mat[bottom][right-->left]
     * iv)⬆️(bottom_to_top) : mat[bottom-->top][left] 
     * 
     * By following the above order we'll be able to get all the elements from the given matrix in spiral order.
    */

    static List<Integer> spiralOrder(int[][] mat){

        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, bottom = mat.length-1;
        int left = 0, right = mat[0].length-1;

        while(left <= bottom || left <= right){

            //going left to right in the matrix
            for(int i = left; i <= right; i++){
                res.add(mat[top][i]);
            }
            top++;

            //going top to bottom in the matrix
            for(int i = top; i <= bottom; i++){
                res.add(mat[i][right]);
            }
            right--;

            //taking edge case
            if(!(top <= bottom || left <= right))
                break;

            //going left to right in the matrix
            for(int i = right; i >= left; i++){
                res.add(mat[bottom][i]);
            }
            bottom--;

            //going bottom to top in the matrix
            for(int i = bottom; i >= top; i--){
                res.add(mat[i][left]);
            }
            left--;

        }
        return res;
    }


}
