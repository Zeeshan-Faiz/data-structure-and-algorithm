/*
You are given a set of coins (1,5,7) and a target 18, Calculate the minimum number of coins required
to reach the target.
*/

public class MinimumCoin{

    public static void main(String[] args) {

		int n = 18;
		int a[] = {7, 5, 1};
		
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int ans = minCoins(n, a, dp);
		System.out.println(ans);
		
		for(int x: dp) {
			System.out.print(x+" ");
		}
	}
}