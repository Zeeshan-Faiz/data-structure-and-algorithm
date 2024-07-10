/*
Given two strings of length m and n, find the longest common subsequence between them.
*/

public class LongestCommonSubsequenceTTB {
    

    public static void main(String args[])
    {

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

        System.out.println("Length of LCS is "
                           + lcs(X, Y, m, n, dp));
    }
}