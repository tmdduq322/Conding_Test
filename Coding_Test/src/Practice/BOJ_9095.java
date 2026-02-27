package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095 {
	static int[] dp = new int[12];
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T = Integer.parseInt(br.readLine());
	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 4;
	while(T-- > 0) {
		int n = Integer.parseInt(br.readLine());
		if(dp[n] == 0) {
			for (int i = 4; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
		}
		sb.append(dp[n]+"\n");
	}
	System.out.println(sb);
}
}
