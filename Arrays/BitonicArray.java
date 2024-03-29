public class BitonicArray {
    
    /*
     * Given a Bitonic sequence A of N distinct elements, write a program to find a given element B in the
     * Bitonic sequence in O(Log N) time complexity.
     * NOTE : A bitonic sequence is a sequence of numbers which is first strictly increasing then after a point
     * strictly decreasing.
     * 
     * Example arr = {3,9,10,20,17,5,1} ; b = 20
     * O/P = 3
     * 
     * Example arr = {5,6,7,8,9,10,3,2,1} ; b = 30
     * O/P = -1
    */

    /*
     * Approach : We'll first try to find the element (Bitonic Element) where we can split the given array.
     * We can search for Bitonic element which is the maximum value in a bitonic sequence and the index associated
     * with this element is called bitonic index.
     * We'll then check if the number to be searched is at the bitonic index, if YES we'll directly return bitonic
     * index otherwise we'll perform Binary Search on the right or left side of the bitonic index(bi).
     *                           
     *                          bi <----->(desc)
     * Example arr = {5,6,7,8,9,10,3,2,1}
     *              <----------->(asc)
     * 
     * 
     * Time Complexity = O(ascBinarySearch) + O(descBinarySearch) + O(findBitonicPoint)
     *                 = O(Log N) + O(Log N) + O(Log N) = O(3 Log N) ~ O(Log N)
    */

    static int findBitonicPoint(int [] arr){

        int l = 0, r = arr.length-1, mid = 0;
        while(l <= r){

            mid = (l+r)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){ //we got the bitnoic index
                return mid;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){ //we are still at the left side of array move l to mid
                l = mid;
            }
            else //we are at the right side of array move r to mid
                r = mid;
        }
        return -1;
    }

    static int ascBinarySearch(int[] arr, int key, int bIndex){

        int low = 0, high = bIndex-1, mid = 0;
        while(low <= high){

            mid = (low+high)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
            
        }
        return -1;
    }

    static int descBinarySearch(int[] arr, int key, int bIndex){

        int low = bIndex-1, high = arr.length-1, mid = 0;

        while(low <= high){

            mid = (low+high)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
            
        }
        return -1;
    }

    static int searchElement(int[] arr, int key, int bIndex){

        if(key == arr[bIndex])
            return bIndex;
        if(key > arr[bIndex])
            return -1;
        
        int res1 = ascBinarySearch(arr, key, bIndex);
        if(res1 != -1)
            return res1;
            
        int res2 = descBinarySearch(arr, key, bIndex);
        if(res2 != -1)
            return res2;
            
        return -1;
    }

    public static void main(String[] args){

        int arr[] = {5,6,7,8,9,10,3,2,1};
        int b = 8;

        int bIndex = findBitonicPoint(arr);
        System.out.println("Position of the target element in the Bitonic array is : " + searchElement(arr, b, bIndex));
    }

}
