import java.util.Scanner;

public class SwapEvenOddBit {
    
    /*
     * Write a program to input a number and swap the even and odd bits
     * Example n = 181; 1 0 1 1 0 1 0 1 
     *   Swapped bits = 0 1 1 1 1 0 1 0
     * 
    */

    /*
     * Approach 1: To swap even and odd bits we'll use 2 different numbers.
     * -1431655766 (O x AAAAAAAA) [.........0 1 0 1 0 1 0 1 0 1 0 1]
     *  1431655765 (O x 55555555) [.........1 0 1 0 1 0 1 0 1 0 1 0]
     * 
     * so if n = 181;   (8 7 6 5 4 3 2 1)
     *                 = 1 0 1 1 0 1 0 1
     * (O x AAAAAAAA)  = 1 0 1 0 1 0 1 0 (AND)
     *                 = 1 0 1 0 0 0 0 0 
     *         (>>> 1) = 0 1 0 1 0 0 0 0 (we can observe that all even bits are now shited to odd position)
     * 
     * 
     * Similary n = 181; (8 7 6 5 4 3 2 1)
     *                  = 1 0 1 1 0 1 0 1
     * (O x 55555555)   = 0 1 0 1 0 1 0 1 (AND)
     *                  = 0 0 0 1 0 1 0 1
     *          (<< 1)  = 0 0 1 0 1 0 1 0 (we can observe that all odd bits are now shited to even position) 
     * 
     * We'll merge both the answers using OR operations
     *                  = 0 1 0 1 0 0 0 0
     *                  = 0 0 1 0 1 0 1 0 (OR)
     *                  = 0 1 1 1 1 0 1 0 (We got the swapped even and odd bits)
     * 
    */

    static void swapBits(int n){

        int temp = n;
        int swapped = (((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1));
        System.out.println("Original Number : " + Integer.toBinaryString(temp));
        System.out.println("Swapped Bits : " + Integer.toBinaryString(swapped));

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        swapBits(n);

        sc.close();
    }

}
