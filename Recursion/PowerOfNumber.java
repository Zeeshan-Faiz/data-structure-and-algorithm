import java.util.Scanner;

public class PowerOfNumber {
    
    /*
     * Write a program to print the power of a given number.
     * Example x = 5, y = 8
     * O/P = 390625
     * 
    */

    /*
     * Approach 1 : We know that we can recursively solve this question starting from the given power until
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

    /*
     * Appraoch 2 : Even if we have got the correct answer with the approach 1 but it's to be noted that if the
     * power is a bigger number like 500,1000 then in that case huge amount of stack memory will be used, so in order
     * to tackle that we'll be trying to generate a logic such that if we have even value as a power we'll directly deduce
     * it to half in order to reduce the stack memory by reducing the number of recursive calls.
     * 
     * So for example if x = 5 , y = 4 then,
     * 5^4 = 5^2 * 5^2
    */

    static long approach2(int x, int y){

        if(y == 0)
            return 1;

        if(y % 2 == 0)
            return approach1(x, y/2) * approach1(x, y/2); 
        else
            return approach1(x, y-1) * x;
    }

    /*
     * Approach 3: We've tackled the continuous increase of stack memory by dividing the power value to half at
     * each recursive calls, however there's one last thing to be noticed, that in our approach 2, we're calling the same function twice
     * which will generate the same output [approach1(x, y/2) * approach1(x, y/2)].
     * In this case we'll store the value of one function and store it in a variable and then directly return the
     * calculated variable multiplied by itself in order to save computing power.
    */

    static long approach3(int x, int y){

        if(y == 0)
            return 1;

        if(y % 2 == 0){

            long res = approach1(x, y/2);
            return res * res;

        }
            
        else
            return approach1(x, y-1) * x;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number and it's power: ");
		int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Power of " + x + "^" + y + " is : " + approach3(x,y));

        sc.close();
    }

}
