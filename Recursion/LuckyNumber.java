import java.util.Scanner;

public class LuckyNumber {
    
    /*
     * Write a program to print whether the given number is a lucky number or not.
     * Assume the counter starts from 2.
     * 
     * A lucky number is a number which is not removed from the series of numbers starting from
     * 1 to n, with respect to the increasing counter.
     * 
     * Example n = 13.
     * O/P : true
     * 
     * Explanation
     * the number stream will be : 1,2,3,4,5,6,7,8,9,10,11,12,13 (counter 2)
     * after removing every 2nd number : 1,3,5,7,9,11,13 (counter 3)
     * after removing every 3rd number : 1,3,7,9,13 (counter 4)
     * after removing every 4th number : 1,3,7,13(counter 5 > number of remaining numbers) 
     * 
     * Hence, 13 is indeed a lucky number.
    */

    /*
     * Approach : We can observe that the very first condition is if the counter > number, then surely our given
     * number is a lucky number.
     * And every time the counter increases the number series decreases, we can assume our given number
     * to check whether it's divisible by the incremented counter, if it's divisible then surely our given number is not
     * a lucky number otherwise it is.
     * 
    */

    static boolean isLucky(int n, int counter){

        if(n < counter)
            return true;

        if(n % counter == 0)
            return false;
        
        return isLucky(n - (n/counter), counter+1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

        System.out.println("Is the given number " + n + " lucky ? " + isLucky(n,2));

        sc.close();
    }


}
