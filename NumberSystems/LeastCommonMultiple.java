import java.util.Scanner;

public class LeastCommonMultiple {
    
    /*
     * Write a program to find the Least Common Multiple between two numbers
     * Example number1 = 2 (Multiples of 2 = 2,4,6,8,10,12,14,16..........)
     *         number2 = 5 (Multiples of 5 = 5,10,15,20,25..........)
     * 
     * LCM = 10
     */

     /*
      * Approach 1 (Brute Force) : Find the maximum number between n1 & n2
      * Divide the max by both n1 & n2 otherwise increment max by 1
      * Once the loop terminates, we'll have the LCM between n1 & n2 stored in max.
      * Time Complexity = O(n1xn2 - max(n1,n2))
      */

    static int approach1(int n1, int n2){

        int max = Math.max(n1, n2);
        while(true){

            if(max % n1 == 0 && max % n2 == 0)
                break;
            
            max++;
        }
        return max;
    }

    /*
     * Approach 2 (Optimized): We know that LCM(n1,n2) X GCD(n1,n2) = n1 x n2
     * => LCM(n1,n2) = n1 x n2 / (GCD(n1,n2))
     * 
     * For finding GCD we'll use Euclid's Algorithm which has time complexity of O(Log(min(n1,n2)))  
     */

    static int eucliedGCD(int n1, int n2){

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

    static int approach2(int n1, int n2){

        return (n1*n2)/eucliedGCD(n1, n2);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //int lcm = approach1(n1, n2);
        int lcm = approach2(n1, n2);
        System.out.println("Lowest Common Multiple between " + n1 + " and " + n2 + " : " + lcm);

        sc.close();
    }


}
