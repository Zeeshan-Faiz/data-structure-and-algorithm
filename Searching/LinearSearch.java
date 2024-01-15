import java.util.Scanner;

public class LinearSearch {
    
    /*
     * Write a program to input a key value and check whether this key is present in the 
     * given array using Linear Search if yes then print it's position in the array.
     * 
     * Example arr = {50,10,33,40,26} ; key = 40
     * O/P = 3
    */

    /*
     * Approach : With the given key we'll traverse each element of the array and check whether the given key
     * is equal to the array element. If yes then we'll directly return the position of the element otherwise
     * we'll return -1 stating that the given key is not present in the array.
     * 
     * Time Complexity = O(n)
    */

    static int linearSearch(int arr[], int key){

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == key)
                return i;
        }
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

        System.out.println("Enter Key value to be searched : ");
        int key = sc.nextInt();

        System.out.println("Positon of key = "+ key + " in the given array is " + linearSearch(arr, key));
        
        sc.close();

    }

}
