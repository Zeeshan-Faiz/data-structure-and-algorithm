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
     * To merge two arrays we'll have two indexes i & j and a third empty array with the index k.
     * 
     * Time Complexity = O(m+n), where m & n are the length of two arrays
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

    /*
     * As the median depends only untill the middle of the merged array in that case we don't need to have the 
     * the merged array to be filled completely instead if we are able to get atleast half of the elements that
     * will suffice for calculating the median.
     * 
     * So in the above mentioned approach we can have new conditions like:
     * while(i < ar1.length && j < ar2.length && k <= m.length/2)
     * while(i < ar1.length && k <= m.length/2)
     * while(j < ar2.length && k <= m.length/2)
     * 
     * By doing this we don't need to traverse the whole length of both the arrays.
     * Time Complexity = O((m+n)/2) ~ O(m+n)
    */

    /*
     * Approach 2 (Optimized) : 
     * Example ar1 = {1,3,8,17}
     *         ar2 = {5,6,7,19,21,25}
     *                  
     *                                <--------->  
     * Merged array mar (ar1 + ar2) = {1,3,5,6,7||8,17,19,21,25} 
     *                                           <------------->   
     * 
     * Our idea is to pick random elements from array 1 & array 2 and check whether this randomly generated 
     * combination satisfies 3 conditions.
     * 1)All the elements in the left half is smaller than all the elements in the right half.
     * 2)Right most element of the left half(7) is larger than all the elements in the left half.
     * 3)Left most elements of the right half(8) is smaller than all the elements in the right half.
     * 
     * Now we can have different combinations by dividing both the given array from m1 and m2 points
     *           
     * m1 = (l+h)/2   
     *       l  m1   h
     * ar1 = {1,3|8,17}
     * 
     * m2 = ((len(ar1) + len(ar2))+1)/2 - m1
     * ar2 = {5,6,7,19,21,25}
     * 
     * 
     * i)Taking 3 elements from array 1(m1 = 3) and 2 elements from array 2(m2 = 2)
     *  
     *      ar1 -> 3  |  ar2 -> 2
     *      1 3 8(L1) |  (R1)17
     *      5 6(L2)   |  (R2)7  19 21 25
     * 
     * ii)Taking 2 elements from array 1(m1 = 2) and 3 elements from array 2(m2 = 3)
     *  
     *      ar1 -> 2  |  ar2 -> 2
     *      1 3(L1)   |  (R1)8 17
     *      5 6 7(L2) |  (R2)19 21 25
     * 
     * To find whether the generated combination is valid or not we'll have two conditions.
     * if(L1 <= R2) && (L2 <= R1) if yes then we got the combination which will help us find the median.
     * 
     * L1 = ar1[m1-1]
     * R1 = ar1[m1]
     * L2 = ar2[m2-1]
     * R2 = ar2[m2]
     * 
     * For Median(even) = (max(L1,L2) + min(R1,R2))/2 
     * For Median(odd) = max(L1,L2)
     * 
     * And according to our logic we'll always take smaller array to start generating the combination of merged
     * array.
     * 
     * Time Complexity = O(Log(m+n))
    */

    static float findMedian2(int[] ar1, int[] ar2){

        //to always have the first array smaller
        if(ar2.length < ar1.length)
            return findMedian2(ar2, ar1);

        int l = 0, h = ar1.length, m1 = 0, m2 = 0;
        while( l <= h){
            m1 = (l+h)/2;
            m2 = ((ar1.length + ar2.length)+1)/2 - m1;

            //check for edge cases(going out of array boundary)
            int l1 = (m1 == 0) ? Integer.MIN_VALUE : ar1[m1 - 1];
            int r1 = (m1 == ar1.length) ? Integer.MAX_VALUE : ar1[m1];

            int l2 = (m2 == 0) ? Integer.MIN_VALUE : ar2[m2 - 1];
            int r2 = (m2 == ar2.length) ? Integer.MAX_VALUE : ar2[m2];

            if(l1 <= r2 && l2 <= r1){

                //even median
                if((ar1.length+ar2.length) %2 == 0)
                    return (float)(Integer.max(l2, l2) + Integer.min(r1, r2)) / 2;
                else
                    return (float)(Integer.max(l1, l2));
            }
            else if(l2 > r1)
                l = m1 + 1;
            else
                h = m1 - 1;
        }
        return 0.0f;

    }


    public static void main(String[] args) {
        
        int[] ar1 = {1,3,8,17};
        int[] ar2 = {5,6,7,19,21,25};

        System.out.println(findMedian1(ar1, ar2));
    }



}
