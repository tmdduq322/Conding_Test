package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {
	static int [] dp = new int[1001];
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 3;
	System.out.println(sq(N));
}
public static int sq(int n) {
	if(dp[n] == 0) {
		dp[n] =  sq(n-1) + sq(n-2);
	}
	if(dp[n] > 10007) {
		dp[n] = dp[n]%10007;
	}
	return dp[n];
	
}
}
