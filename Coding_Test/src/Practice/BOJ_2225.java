package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2225 {
	static Integer[][] dp;
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int K = Integer.parseInt(st.nextToken());
	dp = new Integer[N+1][K+1];
	for (int i = 1; i <= N; i++) {
		dp[i][1] = 1;
	}
	for (int i = 0; i <= K; i++) {
		dp[0][i] = 1;
	}
	System.out.println(plus(N,K));
	br.close();
}

public static int plus(int n, int k) {
	if (dp[n][k] == null) {
		dp[n][k] = 0;
		for (int i = 0; i <= n; i++) {
			dp[n][k] = (dp[n][k] + plus(i, k - 1)) % 1000000000;
		}
	}
	return dp[n][k];
}

}
