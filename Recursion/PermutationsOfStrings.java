import java.util.Scanner;

public class PermutationsOfStrings {
    
    /*
     * Write a program to find the permutations of all Strings using recursions.
     * 
     * Example str = "ABC"
     * O/P = "ABC","ACB","BAC","BCA","CBA","CAB" 
    */

    /*
     * Approach : As we know that the number of permutations combinations can be derived from the length of given
     * string. If length = 3 then no. of permutations combinations are 3! = 6
     * 
     * Suppose we take exmple of ABC then we have 3 different blocks to fill with the help of A,B,C
     *          3x2x1 = 6
     *          _ _ _
     * 
     * The first block can have three different combinations from which we can choose from and we can add either A or B or C
     * the second block contains two different combinations and the last block has only one combination.
     * 
     * We'll write our code in such a way that for first call to our function, we'll add A to our first block and then
     * fill other two blocks using other characters by doing permutations, and similarly we can choose B or C and fill the 2nd and 3rd blocks simultaneously.
     * We'll also use an index variable fi to keep the track of our block.
     * 
     * Base Condition = if(fi == arr.length-1)
    */

    static void permutations(char arr[], int fi){

        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }

        for(int i = fi; i< arr.length; i++){
            swap(arr,i,fi);
            permutations(arr, fi+1);
            swap(arr,i,fi);//just to bring back the original array which might have got changed due to previous swapping
        }
    }

    //to swap two characters
    static void swap(char arr[], int i, int fi){

        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();

        System.out.println("All combinations of String " + str + " is : " );
        permutations(str.toCharArray(), 0);

        sc.close();
    }

}
