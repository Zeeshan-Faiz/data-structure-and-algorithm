import java.util.Scanner;

public class BalancedParanthesis {
    
    /*
     * Write a program to generate all the balanced paranthesis using recursion.
     * Example n = 2
     * O/P = ()(), (())
     * 
     * Example n = 3
     * O/P = ()()(), (())(), ()(()), ((())), (()())
     * 
    */

    /*
     * To find the solution for this problem we'll be having o and c variable to add 
     * open and close paranthesis.
     * As we all know that everytime a paranthesis starts with opening, so in this case
     * we can directly make the first position with an open '(' paranthesis.
     * 
     * Suppose we take n = 2, then o = 0, c = 0, i = 0
     *                      _ _ _ _
     *                      0 1 2 3
     * 
     * We've condition as if (o<n) we'll add '(' and if (c<o) we'll add ')'
     * Starting with (o<n)
     * 
     *              (o<n)   ( _ _ _     i=1,n=2,o=1,c=0
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ( _ _     i=2,n=2,o=2,c=0
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ( ) _     i=3,n=2,o=2,c=1
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ( ) )     i=4,n=2,o=2,c=2
     *              (c<o)   0 1 2 3
     * 
     * 
     * similarly we can have the same combination for (c<o):
     * 
     *              (o<n)   ( _ _ _     i=1,n=2,o=1,c=0
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ) _ _     i=2,n=2,o=1,c=1
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ) ( _     i=3,n=2,o=2,c=1
     *              (c<o)   0 1 2 3
     * 
     *              (o<n)   ( ) ( )     i=4,n=2,o=2,c=2
     *              (c<o)   0 1 2 3
     * 
     * Base condition : if(i == arr.length)
    */

    static void balParanthesis(char arr[], int n, int i, int o, int c){

        if(i == arr.length)
            System.out.println(arr);
        
        if(o < n){
            arr[i] = '(';
            balParanthesis(arr, n, i+1, o+1, c);
        }

        if(c < o){
            arr[i] = ')';
            balParanthesis(arr, n, i+1, o, c+1);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of balanced paranthesis you want : ");
		int n = sc.nextInt();

        balParanthesis(new char[2*n], n, 0, 0, 0);

        sc.close();
    }

}
