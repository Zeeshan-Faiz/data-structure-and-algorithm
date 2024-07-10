/*
Given two strings of length m and n, find the longest common subsequence between them.
*/

public class LongestCommonSubsequenceTabulation {

    static int lcsTabulation(String X, String Y, int m, int n, int[][] dp) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //rule 1
                if(X.charAt(i-1) == Y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                //rule 2
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        System.out.println("Length of LCS is " + lcsTabulation(X, Y, m, n, dp));
    }
}