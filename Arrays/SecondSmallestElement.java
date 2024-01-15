import java.util.Scanner;

public class SecondSmallestElement {
    
    /*
     * Write a program to find the second smallest element in an array.
     * 
     * Example arr = {20,42,6,25,30,88}
     * O/P = 20
    */

    static int secLargest(int arr[]){

        int min1=0, min2=0;
        if(arr[0] < arr[1]){
            min1 = arr[0];
            min2 = arr[1];
        }
        else{
            min1 = arr[1];
            min2 = arr[0];
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] < min2)
                min2 = arr[i];
        }
        return min2;
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

        System.out.println("Second Smallest element in the given array is = " + secLargest(arr));
        
        sc.close();

    }

}
