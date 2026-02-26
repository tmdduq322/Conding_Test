package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9461 {
	static Long [] dp = new Long[101];
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T = Integer.parseInt(br.readLine());
	dp[0] = dp[1] = dp[2] = dp[3] = 1L;
	while(T-- > 0) {
		sb.append(wave(Integer.parseInt(br.readLine()))).append("\n");
	}
	System.out.println(sb);
}
public static long wave(int n) {
	if(dp[n] == null) {
		dp[n] =wave(n-3) + wave(n-2);
	}
	return dp[n];
}
}
