import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    
    /*
     * Write a program to print all the subsets of given array iteratively.
     * Ex arr[] = {1,2,3}
     * O/P = [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    */

     static List<List<Integer>> subset(int[] arr) {

        //outer list
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                //take previous list present in outer list and directly add in the internal list
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        
        System.out.println(subset(new int[]{1,2,3}));
    }
}
