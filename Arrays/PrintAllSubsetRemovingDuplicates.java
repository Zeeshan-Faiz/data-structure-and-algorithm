import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsetRemovingDuplicates {

    /*
     * Write a program to print all the subsets of a given array, and remove all the duplicate subsets if present.
     * Ex arr[] = {1,2,2}
     * O/P = [[],[1],[2],[1, 2],[2, 2],[1, 2, 2]]
    */

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        
        //sort the given array to bring duplicate elements adjacent to each other
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        
        //take start and end index to select from which subset we need to add the next array element
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1])
                start = end + 1;
            
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                //take previous list present in outer list and directly add in the internal list
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
