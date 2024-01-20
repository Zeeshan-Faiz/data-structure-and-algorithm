import java.util.concurrent.SynchronousQueue;

public class LeadersInArray {
    
    /*
     * Write a program to find the leaders of an array. An element is a leader if it is strictly greater than all 
     * the elements to it's right side and the rightmost element is always the leader.
     * 
     * Example ar = {8,11,5,11,7,6,5}
     * O/P = 11,7,6,3
     * 
     * Example ar2 = {50,60,70} (sorted in ascending order)
     * O/P = 70
     * 
     * Example ar3 = {100,90,80} (sorted in descending order)
     * O/P = 100,90,80
    */

    /*
     * Approach 1 (Brute Force) : We'll iterate over the whole array and try to check if the element is greater
     * than all the right elements in the array and we'll check for this condition for all the elemnts in the array and
     * print the leader elements only.
     * 
     * Time Compplexity = O(nxn)
    */

    static void printLeadersApproach1(int[] ar){

        for(int i = 0; i < ar.length; i++){
            boolean isLeader = true;
            for(int j = i+1; j < ar.length; j++){
                if(ar[j] >= ar[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
                System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args){

        int ar[] = {8,11,5,11,7,6,5};
        System.out.println("Leaders in array :");
        for(int i = 0; i < ar.length ; i++){
            System.out.print(ar[i] + " ");
        }

        System.out.println("are :");
        printLeadersApproach1(ar);

    }


}
