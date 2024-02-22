import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    
    /*
     * Write a program to print all the subsets of given array iteratively.
     * Ex arr[] = {1,2,3}
     * O/P = 
    */

     static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
