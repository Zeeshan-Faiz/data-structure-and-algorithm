import java.util.Scanner;

public class TrailingZeroes {

	/*
	 * Write a program to find the number of trailing zeroes in the factorial
	 * of the given number.
	 * Example 1: if number = 5, then
	 * 5! => 120, Number of Trailing Zeroes = 1
	 * 
	 * Example 2: if number = 4, then
	 * 4! => 24, Number of Trailing Zeroes = 0
	 * 
	 * Example 3: if number = 10, then
	 * 10! => 3628800, Number of Trailing Zeroes = 2
	 * 
	 */
	
	
	/*
	 * Approach 1: We'll find the factorial of the given number and then 
	 * count the number of trailing zeroes accordingly.
	 * Time Complexity = O(N)
	 * 
	 */
	
	static int approach1(int n) {
		
		long f = 1;
		int count = 0;
		
		for(int i = 1; i <= n; i ++) {
			f = f * i;
		}
		
		while(f>0) {
			
			int r = (int) (f % 10);
			if(r == 0) {
				count ++;
			}
			else {
				break;
			}
			f = f / 10;
		}
		
		return count;
		
	}
	
	/*
	 * Approach 2: We can use another logic as, how many times 5 or multiples of 5 is
	 * present in a number and then that's same number of 5 is also the number of trailing
	 * zeroes. With a side case that if the given number > 25 then we need to add +1
	 * 
	 * Example 1: if number = 5, then
	 * 5/5 + 5/25 + 5/125 + 5/625 + ............. + infinity
	 * 1 + 0 + 0 + ........... = 1 (Therefore Number of trailing zeroes for 5! = 1)
	 * 
	 * Example 2: if number = 10, then
	 * 10/5 + 10/25 + 10/125 + 10/625 + .............. + infinity
	 * 2 + 0 + 0 + ........... = 2 (Therefore Number of trailing zeroes for 10! = 2)
	 * 
	 * Example 3: if number = 200, then
	 * 200/5 + 200/25 + 200/125 + 200/625 + .................. + infinity
	 * 40 + 8 + 1 + 0 + 0 + ................ = 49 (Therefore Number of trailing zeroes for 200! = 49)
	 * 
	 */
	
	
	static int approach2(int n) {
		
		int count = 0;
		int powerOf5 = 5;
		
		while(n >= powerOf5) {
			
			count = count + (n/powerOf5);
			powerOf5 = powerOf5 * 5;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		//int noOfZeroes = approach1(n);
		
		int noOfZeroes = approach2(n);
		System.out.println("Number of trailing zeroes in " + n + "! = " + noOfZeroes);

		sc.close();
	}

}
