import java.util.Scanner;

public class GreatestCommonDivisor {

    /*
     * Write a program to find the Greatest Common Divisor between 2 numbers.
     * NOTE: Asssume both numbers are positive
     * Example number1 = 20 (Factors of 20 = 1,2,5,10,20)
     *         number2 = 15 (Factors of 15 = 1,3,5,15)
     * 
     * GCD = 5
     */


    /*
     * Approach 1 (Brute Force) : Find the minimum of both numbers
     * Use the for loop and start i = min(n1,n2) till i = 1
     * Inside the loop check i is a common divisor for both the numbers
     * If true then return i
     *  
     * Time Complexity = O(min(n1,n2))
     */

    static int approach1(int n1,int n2){

        int min = 0;

        if(n1<n2)
            min = n1;
        else
            min = n2;

        for (int i = min; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0)
                return i;
        }
        
        return -1;

    }

    /*
     * Approach 2 [Euclid's Algorithm](Optimized) : Find the larger number between n1 & n2
     * Replace the larger number with the difference of n1 & n2
     * Repeat the process until both of the n1 & n2 become equal 
     * 
     * Time Complexity = O(max(a,b)) // in worst case
     * 
     */

    static int approach2(int n1, int n2){

        while(n1 != n2){
           
            if(n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }

        return n1; //we can return n2 as well as by this step both of n1 & n2 are equal

    }

    /*
     * Approach 3 [Gabriel Lame] Best Optimized : We'll divide both n1 & n2 depending upon
     * the greatest number between the two.
     * As soon as either one of the two numbers becomes equal we'll return the other number
     * 
     * Time Complexity = O(Log(min(n1,n2))) 
     */

    static int approach3(int n1, int n2){

        while(n1 != 0 && n2 != 0){
            
            if(n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
            
        }
        if(n1 != 0)
            return n1;
        else
            return n2;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //int gcd = approach1(n1, n2);
        //int gcd = approach2(n1, n2);
        int gcd = approach3(n1, n2);

        if(gcd != -1)
            System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd);
        else
            System.out.println("There's no GCD between " + n1 + " and " + n2);
        
    }

}
