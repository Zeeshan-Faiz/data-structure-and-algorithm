public class CountSort {

    /*
    Given an array, sort the array using CountSort.
    */

    public static void countSort(int[] array) {

        if (array == null || array.length <= 1)
            return;

        // find the max element from the array
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }

        // create a frequencyArray to track the numbers in the original array
        int[] countArray = new int[max + 1];
        for (int num : array) {
            countArray[num]++;
        }

        //now update the original array according to frequencyArray
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                array[index] = i;
                index++;
                //reduce the frequency of that index after each addition to the original array
                countArray[i]--;
            }
        }
    }
}