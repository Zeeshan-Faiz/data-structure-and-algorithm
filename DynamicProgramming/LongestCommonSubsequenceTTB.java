/*
Given two strings of length m and n, find the longest common subsequence between them.
*/

public class LongestCommonSubsequenceTTB {

    static int lcs(String X, String Y, int m, int n, int[][] dp) {

        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (X.charAt(m - 1) == Y.charAt(n - 1))
            return dp[m][n] = 1 + lcs(X, Y, m - 1, n - 1, dp);
        else 
            return dp[m][n] = Math.max(lcs(X, Y, m, n - 1, dp), lcs(X, Y, m - 1, n, dp));
    }

    public static void main(String args[]) {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Length of LCS is " + lcs(X, Y, m, n, dp));
    }
}