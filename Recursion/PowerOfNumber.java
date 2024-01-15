public class PowerOfNumber {
    
    /*
     * Write a program to print the power of a given number.
     * Example x = 5, y = 8
     * O/P = 390625
     * 
    */

    /*
     * Approach 1 : We know that we can recursively solve this question starting from the given power 8 until
     * the power reaches 0 and at this point we'll return 1.
     * 
     * So for example if x = 5 , y = 4 then,
     * 5^4 = 5^3 * 5
     * 5^3 = 5^2 * 5
     * 5^2 = 5^1 * 5
     * 5^1 = 5^0 * 5
     * 5^0 = 1
     * 
     * Recurrence Relation ==> x^y = (x^y-1) * x
    */

    static long approach1(int x, int y){

        if(y == 0)
            return 1;
        
        return approach1(x, y-1) * x;
    }




    
}
