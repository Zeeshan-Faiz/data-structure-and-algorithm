import java.util.Scanner;

public class LengthOfConsec1 {
    
    /*
     * Write a program to input a number and find the length of consecutive 1's in its binary representation
     * Example n = 101; 0 1 1 0 0 1 0 1
     * length of consecutive 1's = 2
     * 
     * Example n = 73;  0 1 0 0 1 0 0 1
     * length of consecutive 1's = 1
     * 
    */

    /*
     * Approach : Observation 1: If we do (n & (n<<1)), and if n has any consecutive 1's then
     * n will never be 0 OR (n & (n<<1)) ≠ 0 (for consecutive 1's)
     * 
     * Example n = 101, 
     *           = 0 1 1 0 0 1 0 1
     *    n << 1 = 1 1 0 0 1 0 1 0 (AND)
     *           = 0 1 0 0 0 0 0 0 ≠ 0 (for consecutive 1's)
     * 
     * Similarly for n = 73,
     *                 = 0 1 0 0 1 0 0 1
     *          n << 1 = 1 0 0 1 0 0 1 0 (AND)
     *                 = 0 0 0 0 0 0 0 0 = 0 (no consecutive 1's)        
     * 
     * Now that we know whether a number has consectuive 1's or not we can now proceed to our next
     * next step.
     * If we do (n & (n <<1)) and itertate over it until n becomes zero and keep a track
     * of each iterations, we'll get the same count as the number of consecutive 1's
     * 
     * Example n = 101,
     * iteration 1: 
     *           = 0 1 1 0 0 1 0 1
     *    n << 1 = 1 1 0 0 1 0 1 0 (AND)
     *           = 0 1 0 0 0 0 0 0 (count = 1)
     * 
     * iteration 2:
     *           = 0 1 0 0 0 0 0 0
     *    n << 1 = 1 0 0 0 0 0 0 0 (AND)
     *           = 0 0 0 0 0 0 0 0 (count = 2)
     * 
    */

    static void countConsecutive(int n){

        int count = 0;
        int temp = n;
        while(n > 0){

            n = (n & (n << 1));
            count ++;
        }

        System.out.println("Number of consecutive 1's in " + Integer.toBinaryString(temp) + " is : " + count);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        countConsecutive(n);

        sc.close();
    }

}
