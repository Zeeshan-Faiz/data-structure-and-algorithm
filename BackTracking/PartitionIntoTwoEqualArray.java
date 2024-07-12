/*
Given an array of integers find whether the array can be partition into two parts containing equal sums.
*/

import java.util.ArrayList;

public class PartitionIntoTwoEqualArray {

    public static void main(String[] args) {

        int[] a = { 2, 1, 2, 3, 4, 8 };
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];

        ArrayList<Integer> ans = new ArrayList<>();
        boolean isPossible = (sum % 2 == 0) && partition(a, sum / 2, 0, ans);

        if (isPossible) {
            for (int ele : ans)
                System.out.println(ele + " ");
        } else
            System.out.println("Not Possible");
    }

    private static boolean partition(int[] a, int sum, int i, ArrayList<Integer> ans) {

        if (i >= a.length || sum < 0)
            return false;
        if (sum == 0)
            return true;

        ans.add(a[i]);
        boolean leftPossible = partition(a, sum - a[i], i + 1, ans);

        if (leftPossible)
            return true;

        // backtrack
        ans.remove(ans.size() - 1);
        return partition(a, sum, i + 1, ans); // go right
    }
}