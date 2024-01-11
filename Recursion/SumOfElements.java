import java.util.Scanner;

public class SumOfElements {
    
    /*
     * Write a program to input an array and print the sum of all elements using recursion.
     * Example arr = {1,2,3,4}
     * O/P = 10
     * 
    */

    /*
     * Approach : For finding the sum of each elements in an array we'll follow the recurrence relation:
     * sumOfElements(arr,i) = sumOfElements(arr,i+1) + arr[i]
     * 
     * and our base condition is (i == arr.length)
     *
    */


    static int sumOfElements(int arr[], int i){

        if(i == arr.length)
            return 0;

        return sumOfElements(arr, i+1) + arr[i];
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i<= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array elemets: " + sumOfElements(arr, 0));
        
        sc.close();
    }

    
}
