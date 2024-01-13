import java.util.Scanner;

public class SubsetSum {
    
    /*
     * Given a set of non-negative integers and a value sum, determine the number of subsets
     * of the given set with sum equal to the given sum.
     * 
     * Example arr = {10,20,15,5} ; sum = 25
     * O/P = 2; (10,15) & (20,5)
     * Here 2 means that we can have 2 subsets from the given array which when added together gives the
     * same sum as the given sum.
    */

    /*
     * Approach : To find the subsets from the given array such that it's sum is equal to the given sum,
     * we'll try to pick an element at ith position once and ignore it in the second instance, so for example
     * For i=0 we can take arr[0] = 10 and on the second instance we'll ignore 10.We'll also be using index i
     * to keep a track of the position in the array.
     * 
     * We'll also change the given sum with respect to the number selected.
     * if 10 is selected then our new sum will be (25-10) = 15
     * and with this new value of sum we'll go and check the next number i.e 20; which will then make our new sum as (15-20) = -5
     * and if we don't select 20 and skip to 15; our new sum will be (15-15) = 0, and we can perform the same actions recursively for all the given numbers.
     * 
     * Now if we get new sum value as 0, it means we've got the first subset and we'll return 1
     * if we get sum value as < 0, it means we can't have a subset with this number and we'll return 0.
     * and if we reach the end of the array (i == arr.length) then there's no other number left to check for the new sum and hence we'll return 0.
    */

    static int countSubsets(int arr[],int sum, int i){

        if(sum == 0)
            return 1;
        if(sum < 0)
            return 0;
        if(i == arr.length)
            return 0;

                //to pick the number                     //to not pick the number
        return countSubsets(arr, (sum - arr[i]), i+1) + countSubsets(arr, sum, i+1) ;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter numbers : ");
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter value of sum");
        int sum = sc.nextInt();

        System.out.println("Number of subsets that can be formed from the given array which when added gives the same sum as " + sum + " : " + countSubsets(arr, sum, 0));

        sc.close();
    }

}
