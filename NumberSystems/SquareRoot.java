import java.util.Scanner;

public class SquareRoot {
    
    /*
     * Write a program to find the square root of a number. If the given number n is not perfect square then return floor(sqrt(n))
     * Example 1 n = 25
     * O/P = 5
     * 
     * Example 2 n = 23
     * O/P = 4
     * Here n = 23, which lies between the square root of 4 and 5 so we'll take the floor(4,5) = 4
    */

    /*
     * Appraoch : We know that for any given number the square root of that particular will always be less than n/2.
     * For example square root of 16 = 4, here the number range that are the candidate to be a square root of 16 lies between 1 to (16/2) = 1 to 8
     * So instead of us looping every number till n to find the square root, if we loop until n/2 will also give us the
     * value of square root of n.
     * 
     * Example 25, so the possible value of the sqrt(25) lies between 1 to 25
     * However we'll focus in the number series betweem 1 to 12 only.
     *                            
     *                           |     
     * 1,2,3,4,5,6,7,8,9,10,11,12|13,14,15,16,17,18,19,20,21,22,23,24,25
     *                           |<---------------ignore---------------->
     * 
     * so now we can see that we can apply binary search to find the value of square root of 25.
     * Also we know that for number which is not a perfect square, we'll store the previous low (mid) in result
     * as according to the question in such cases we need to return floor(sqrt(n))   
     * 
    */

    static int sqrt(int n){

        if(n == 1 || n == 0)
            return n;

        int l = 2, h = n/2, res = 0;
        while(l <= h){
            
            int m = (l+h)/2;
            if(m * m == n)
                return m;
            
            else if(m * m < n){
                l = m + 1;
                res = m;
            }
            
            else
                h = m - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println("The square root of "+ n + " is : " + sqrt(n));
        sc.close();
    }
}