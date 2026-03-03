package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11057 {
	static Long[][] dp;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp = new Long[N+1][10];
	for (int i = 0; i <=9; i++) {
		dp[1][i] = 1L;
	}
	long rst = 0L;
	for (int i = 0; i <= 9; i++) {
		rst += recur(N,i);
	}
	System.out.println(rst%10007);
}

public static long recur(int x, int y) {
	if(x == 1) {
		return dp[x][y];
	}
	if(dp[x][y] == null) {
		if(y == 0) {
			dp[x][y] = recur(x-1,0);
		}
		else {
			dp[x][y] = 0L;
			for (int i = 0; i <= y; i++) {
				dp[x][y] += recur(x-1,y-i);
			}
		}
	}
	
	return dp[x][y] % 10007;
}
}
