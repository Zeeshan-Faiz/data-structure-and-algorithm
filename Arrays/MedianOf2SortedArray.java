public class MedianOf2SortedArray {
    
    /*
     * Write a program to find the median of two sorted arrays.
     * Example ar1 = {1,3,8,17}
     *         ar2 = {5,6,7,19,21,25}
     * 
     * Merged array mar (ar1 + ar2) = {1,3,5,6,7,8,17,19,21,25}
     * 
     * case 1: Odd number of elements
     * median(odd) = mar.length/2
     * 
     * case 2: Even number of elements
     * median(even) = (mar[m]+mar[m-1])/2
    */

    /*
     * Approach 1 (Brute Force) : To find the median of two sorted arrays, first we need to combine both the array
     * and then find the median depending upon the total number of elements being even or odd.
     * To merge two arrays we'll have two indexes i & j amd a third empty array with the index k.
     * 
     * Time Complexity = O(m+n), where m & n are the length of two arrays
     *
    */

    static float findMedian1(int[] ar1, int[] ar2){

        int i = 0, j = 0, k = 0;
        int[] m = new int[ar1.length+ar2.length];

        while(i < ar1.length && j < ar2.length){
            
            if(ar1[i] < ar2[j]){
                m[k] = ar1[i];
                k++;
                i++;
            }
            else{
                m[k] = ar2[j];
                k++;
                j++;
            }
        }
        //to add the rest elements if left out any
        while(i < ar1.length){
            m[k] = ar1[i];
            k++;
            i++;
        }
        while(j < ar2.length){
            m[k] = ar2[j];
            k++;
            j++;
        }

        if(m.length % 2 == 0){
            int mid = m.length/2;
            return (float)(m[mid] + m[mid-1])/2;
        }
        else{
            int mid = m.length/2;
            return m[mid];

        }

    }

    public static void main(String[] args) {
        
        int[] ar1 = {1,3,8,17};
        int[] ar2 = {5,6,7,19,21,25};

        System.out.println(findMedian1(ar1, ar2));
    }



}
