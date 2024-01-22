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
            for(int j = i; j < ar.length; j++){
                if(ar[i] == ar[j])
                    count++;
            }
            if(count > ar.length/2)
                return ar[i];
        }
        return -1;
    }

    /*
     * Approach 2 (Optimized - Boyer-Moore Majorrity Voting Algorithm) : The algorithm works by maintaining a 
     * candidate majority element and a counter. It iterates through the sequence, updating the candidate and 
     * counter based on the current element. The key insight is that if the majority element exists, it will 
     * survive the elimination of other elements.
     * 
     * Algorithm:
     * i)Initialize a candidate majority element (maj) and a counter (count) to 1.
     * ii)Iterate through the sequence:
     * iii)If the counter is 0, update the candidate to the current element.
     * iv)If the current element is equal to the candidate, increment the counter; otherwise, decrement the counter.
     * v)After the iteration, the candidate is a potential majority element.
     * vi)Verify whether the candidate is a true majority element by counting its occurrences in the sequence. If it appears
     * more than n/2 times, it is the majority element; otherwise, there is no majority element.
     * 
     * Time Complexity = O(n)
    */

    static int majorityElement2(int[] ar){

        
    }

    public static void main(String[] args){

        int ar[] = {8,5,8,1,2,8,8};
        System.out.println(majorityElement1(ar));
    }



}
