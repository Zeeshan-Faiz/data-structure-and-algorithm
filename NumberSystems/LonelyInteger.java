import java.util.Arrays;
import java.util.HashSet;
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

    static int approach1(int arr[], int n){

        Arrays.sort(arr);
        for(int i = 0; i <= n-2; i = i+2){

            if(arr[i] != arr[i+1])
                return arr[i];
        }
        return arr[n-1];

    }

    /*
     * Approach 2 (Efficient) :  Using set --> A data structure that only stores unique element
     * We'll start adding elements in the set one by one, and element which is getting 
     * added in the set is already present before then we'll that element from the set,
     * by repeating this step we'll have only 1 element in the set which doesn't has any
     * duplicate.
     * 
     * Time Complexity = O(N), we have increased the space complexity by using a set.
    */

    static int approach2(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){

            if(set.contains(i))
                set.remove(i);

            else
                set.add(i);
        }
        for(int i : set)
            return i;

        return -1;

    }

    /*
     * Approach 3 (Most Optimized) : Using XOR operations.
     * As we know that XOR Operation is a commutative operation therefore
     * 5 ^ 5 ^ 4 = 5 ^ 4 ^ 5
     *   0 ^ 4   =   1 ^ 5
     *     4     =     4
     * 
     * So using this logic if there are pair in the array using XOR operations all duplicate
     * elements will cancel out each other and what left will be the Lonely Integer.
     * 
    */

    static int approach3(int arr[]){

        int res = 0;
        for(int i : arr){

            res = res ^ i;
        }
        return res;
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

        //int lonelyInteger = approach1(arr , n);
        int lonelyInteger = approach2(arr);
        System.out.println("Lonely Integer in the given array is : " + lonelyInteger);

        sc.close();
    }





}
