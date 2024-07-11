/*
You are given two strings s1 and s2, find the minimum number of operations to convert String s1 to
s2. (Opearations available -->Insert,Delete,Replace)

Example :
s1 = DOG
s2 = DIG

O/P = 1
*/
public class ConvertString {

    public int minOperations(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            dp[i][0] = i;
        for (int j = 0; j <= m; j++)
            dp[0][j] = j;

        for(int i = 0; i <=m; i++)
        {
            for(int j = 0; j <=n; j++)
            {
                //rule 1 : If characters are same
                if(s1.charAt(i) == s2.charAt(j))
                    dp[i][j] = dp[i-1][j-1];
                //rule 2 : If characters are not same
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]),dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }
}