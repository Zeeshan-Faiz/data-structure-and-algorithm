import java.util.Scanner;

public class SpanOfArray {
    
    /*
     * Write a program to find the span of an array.
     * Span = max(element) - min(element)
     * 
     * Example arr = {20,42,88,10,99,6}
     * O/P = 93 (max{99} - min{6}) 
    */

    static int spanOfArray(int arr []){

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];

        }
        return (max-min);
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

        System.out.println("Span of the given array is = " + spanOfArray(arr));
        
        sc.close();

    }
}
