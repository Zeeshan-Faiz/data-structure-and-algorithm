import java.util.Scanner;

public class FloorAndCeil {
    
    /*
     * Write a program to find the floor and Ciel of a given number in the provided sorted array.
     * 
     * Example arr = {19,23,56,61,72,88,92}
     * O/P 
     * Ceil of 65 = 72
     * Floor of 65 = 61 
    */

    /*
     * Approach : In order to find the ciel and floor of a given number we've to keep in mind certain things.
     * In the arr = {19,23,56,61,72,88,92},
     * Ceil(56) = 56                Floor(56) = 56
     * Ceil(70) = 72                Floor(70) = 61
     * Ceil(89) = 92                Floor(89) = 88
     * Ceil(105) = Doesn't exist    Floor(18) = Doesn't exist
     * 
     * As the array is already sorted, we'll be using Binary Search to find the Ceil and Floor of the given number.
     * If we get the given number in the array then we'll directly return the same number however if the number is not
     * present in the array then variable high will give the floor value and variable low will give the Ceil value.
     * 
     * We'll also be using a condition just to check the value we're returning is not exceeding the array length.
    */

    static int ceil(int arr[], int key){

        int low = 0, high = arr.length-1, mid = 0;

        while(low <= high){

            mid = (low+high)/2;
            if(arr[mid] == key)
                return arr[mid];
            if(arr[mid] >= key)
                high = mid - 1;
            else
                low = mid + 1;
            
        }

        if(low < arr.length)
            return arr[low];
        else
            return -1;
    }

    static int floor(int arr[], int key){

        int low = 0, high = arr.length-1, mid = 0;

        while(low <= high){

            mid = (low+high)/2;
            if(arr[mid] == key)
                return arr[mid];
            if(arr[mid] >= key)
                high = mid - 1;
            else
                low = mid + 1;
            
        }

        if(high >= 0)
            return arr[high];
        else
            return -1;
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

        System.out.println("Enter the value for which you want to find the Ceil and Floor :");
        int key = sc.nextInt();

        System.out.println("Ciel of the given number " + key + " in the array is : " +ceil(arr, key));
        System.out.println("Floor of the given number " + key + " in the array is : " +floor(arr, key));
    
        sc.close();
    }
}
