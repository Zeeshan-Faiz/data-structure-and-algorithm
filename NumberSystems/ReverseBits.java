import java.util.Scanner;

public class ReverseBits {
    
    /*
     * Write a program to reverse all bits present in a 8 bit unsigned integer.
     * Example n = 101; 0 1 1 0 0 1 0 1 
     * Reversed bits =  1 0 1 0 0 1 1 0
     * 
    */

    /*
     * Approach : We'll take reverese variable as(0 0 0 0 0 0 0 0) 
     *                                            f             l
     *                      and input number =   (0 1 1 0 0 1 0 1)
     * 
     * We'll move our pointers f and l and check whether bits present in this position
     * are set/unset. And accordingly we'll change our reverse variable and the iteration
     * happens until (f>l)
     * 
     * Step 1: Our first step is to check whether the bits present at f and l are set or
     * not. For checking the bit is set on postion f we can have a mask (1 << f) 
     * and we'll do AND operation with N
     * 
     *            f             l   
     *        n = 0 1 1 0 0 1 0 1 
     * (1 << f) = 1 0 0 0 0 0 0 0 (AND) 
     *          = 0 0 0 0 0 0 0 0 (0 signifies that the bit present at f position is unset)
     * 
     * Similary for checking the bit is set on postion l we can have a mask (1 << l) 
     * and we'll do AND operation with N
     * 
     *            f             l   
     *        n = 0 1 1 0 0 1 0 1 
     * (1 << l) = 0 0 0 0 0 0 0 1 (AND)
     *          = 0 0 0 0 0 0 0 1 (1 signifies that the bit present at l position is set)
     * 
     * Once we get set bit in position l, we'll add this bit to position f in our reverse variable,
     * so our rev after first iteration = 1 0 0 0 0 0 0 0
     *                                    f             l
     * Time Complexity = O(Log N/2) ~ O(Log N) [As f & l only traverse half of the bits]
     * 
    */

    static void reverseBits(int n){

        int f = 8, l = 0;
        int rev = 0;
        int temp = n;

        while(f > l){

            if((n & (1 << f)) != 0)
                rev = rev | (1 <<l);
            
            if((n & (1 << l)) != 0)
                rev = rev | (1 << f);

        f--;
        l++;

        }

        System.out.println("Original Number : " + Integer.toBinaryString(temp));
        System.out.println("Number after reversing bits : " + Integer.toBinaryString(rev));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        reverseBits(n);
        sc.close();
    }

}
