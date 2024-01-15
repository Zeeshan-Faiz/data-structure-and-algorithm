import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    /*
     * Write a program to input a key value and check whether this key is present in the 
     * given array using Binary Search if yes then print it's position in the array.
     * 
     * Example arr = {50,10,33,40,26} ; key = 40
     * O/P = 3
     * 
    */

    /*
     * Approach : To check for the given key present in an array we'll be using three different variables,
     * low,high and mid. After each iteration we'll divide our search range to half and start finding the array
     * element in the half in which we have higher probability of getting an element which is
     * equal to the provided key.
     * 
     * Initially,our low variable will be pointing to the starting index of the array and our high variable will
     * be at the last index. And our mid will have the middle element of the array (low+mid)/2.
     * If the number at mid position is greater than the key, then we'll change our high to mid - 1
     * else if the number at mid position is less than the key, then we'll change our low to mid + 1,
     * we'll itertate over the same steps until our low variable is less than or equal to high if any incase
     * our condition becomes false we'll return -1 which signifies that there's no element in the array which is
     * equal to the given key.
     * 
     * NOTE : To use Binary Search we need to first sort the array.
     * Time Complexity of sorting an array = O(n Log n)
     * Time Complexity of finding an element using Binary Search = O(Log n)
     * 
     * Total Complexity = O(n Log n + Log n)
    */

    static int binarySearch(int arr[], int key){

        int low = 0, high = arr.length-1, mid = 0;

        while(low <= high){

            mid = (low+high)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] >= key)
                high = mid - 1;
            else
                low = mid + 1;
            
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

        Arrays.sort(arr);

        for(int i = 0; i<= arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }

        System.out.println();
        System.out.println("Positon of key = "+ key + " in the given array is " + binarySearch(arr, key));
        
        sc.close();

    }

}
