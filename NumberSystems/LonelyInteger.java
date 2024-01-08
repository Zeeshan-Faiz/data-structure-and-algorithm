import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {
    
    /*
     * Write a program to input an array of integer and print the the number which is lonely.
     * A lonely integer is the one which doesn't occur twice in a given array. 
     * 
     * Example arr = [5, 1, 4, 4, 3, 1, 5] 
     * Lonely Integer = 3
     * 
    */


    /*
     * Approach 1 (Brute Force) :  We'll try to sort the given array and then check whether
     * the number present at the ith position is equal to the number present at (i+1)th position
     * if YES then we'll continue and the moment we didn't get any such number we'll directly 
     * return the number.
     * 
     * Time Complexity = O(N Log N)
     * 
    */

    static int approach2(int arr[], int n){

        Arrays.sort(arr);
        for(int i = 0; i <= n-2; i = i+2){

            if(arr[i] != arr[i+1])
                return arr[i];
        }
        return arr[n-1];

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        
        System.out.println("Enter the array numbers: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int lonelyInteger = approach2(arr , n);
        System.out.println("Lonely Integer in the given array is : " + lonelyInteger);

        sc.close();
    }





}
