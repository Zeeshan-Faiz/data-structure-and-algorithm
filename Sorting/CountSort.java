public class CountSort {

    /*
     * Given an array, sort the array using CountSort.
    */

    public static void countSort(int[] array) {
        
        if(array == null || array.length <= 1) {
          return;
        }
    
        //find the max element from the array
        int max = array[0];
        for(int num : array) {
          if(num > max) 
            max = num;
        }
    
        //create a frequencyArray to track the numbers in the original array
        int[] countArray = new int[max + 1];
    
        for(int num : array) {
          countArray[num]++;
        }
        
    }
}