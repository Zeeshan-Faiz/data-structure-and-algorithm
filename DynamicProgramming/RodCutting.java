/*
Given the prices of different length of rods, find the maximum profit that can be generated for any
given length.

Example :
lenght : 1 2 3 4  5  6  7  8
prices : 1 5 6 9 11 12 14 16

Length = 8,
max profit = 20
*/

public class RodCutting {

    static int cutRod(int[] price, int n) {

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], price[j] + dp[i - j - 1]);
            }
        }
        return dp[n];
    }
}