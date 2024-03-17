import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSortUsingHash {

    /*
    Given an array, sort the array using CountSort via HashMap.
    */

    public static void countSortHash(int[] arr) {
        
        if (arr == null || arr.length <= 1) 
            return;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();
        //add the frequency of each element in the given array to the map as key & value
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //now update the original array using the key-value pair of this map
        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}