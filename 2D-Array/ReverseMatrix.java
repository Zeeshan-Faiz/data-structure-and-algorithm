public class ReverseMatrix {
    
    /*
     * Write a program to reverse(mirror) the columns of a given matrix. 
     * 
     *                              (mirror)
     * Example mat = {{1,6,11,16,21},  |  {21,16,11,6,1}
     *               {2,7,12,17,22},   |  {22,17,12,7,2}
     *               {3,8,13,18,23},   |  {23,18,13,8,3}
     *               {4,9,14,19,24},   |  {24,19,14,9,4}
     *               {5,10,15,20,25}}  |  {25,20,15,10,5}  
    */

    /*
     * Approach : If we take a row from the matrix as an example and observe how it is transforming, we can 
     * see that - 
     *                          (mirror)
     *                            |
     *      1   6   11   16   21  |   21   16   11   6   1
     *                            |   
     * the last element in this row is swapped with the first element, and the second last element is swapped with
     * second element and so on.
     * We'll be having two indexes left and right to help us swap elements accordingly.
    */


}
