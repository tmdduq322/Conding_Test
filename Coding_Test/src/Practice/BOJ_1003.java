package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1003 {
	public static int[][] dp = new int[41][2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 41 ; j++) {
				Arrays.fill(dp[j],-1);
			}
			int n = sc.nextInt();
			dp[n] = fibo(n);
			System.out.printf("%d %d\n",dp[n][0],dp[n][1]);
		}
		sc.close();
	}
	
	public static int[] fibo(int n) {
		if (dp[n][0] == -1 && dp[n][1] == -1) {
			dp[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
			dp[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
		}
		return dp[n];
	}
}
