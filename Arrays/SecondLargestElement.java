import java.util.Scanner;

public class SecondLargestElement {
    
    /*
     * Write a program to find the second largest element in an array.
     * 
     * Example arr = {20,42,6,25,30,88}
     * O/P = 42
    */

    static int secLargest(int arr[]){

        int max1=0, max2=0;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
                max2 = arr[i];
        }
        return max2;
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

        System.out.println("Second Largest element in the given array is = " + secLargest(arr));
        
        sc.close();

    }
    
}
