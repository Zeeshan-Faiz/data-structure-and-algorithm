public class MajorityElement {
    
    /*
     * Given an array of size n, return the majority element. The majority element is the element that appears 
     * more than (n/2) times,
     * 
     * Example ar = {8,5,8,1,2,8,8}
     * O/P = 8
    */

    /*
     * Approach 1 (Brute Force) : We'll traverse the whole element and check the count for each element and find
     * the maximum occurence an element and then return it accordingly.
     * 
     * Time Complexity = O(n^2)
    */

    static int majorityElement1(int[] ar){

        for(int i = 0; i < ar.length; i++){
            int count = 1;
            for(int j = i=1; j < ar.length; j++){
                if(ar[i] == ar[j])
                    count++;
            }
            if(count > ar.length/2)
                return ar[i];
        }
        return -1;
    }

    



}
