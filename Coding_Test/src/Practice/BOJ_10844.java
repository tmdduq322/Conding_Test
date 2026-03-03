package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10844 {
	static Long[][] dp;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp = new Long[N+1][10];
	for (int i = 0; i <=9; i++) {
		dp[1][i] = 1L;
	}
	
	long rst = 0;
	for (int i = 1; i <= 9; i++) {
		rst += recur(N,i);
	}
	System.out.println(rst % 1000000000);
	br.close();
	
}

public static long recur(int x, int y) {
	if(x == 1) {
		return dp[x][y];
	}
	if(dp[x][y] == null) {
		if(y == 0) {
			dp[x][y] = recur(x-1,1);
		}
		else if (y == 9) {
			dp[x][y] = recur(x-1,8);
		}
		else {
			dp[x][y] = recur(x-1,y-1) + recur(x-1,y+1);
		}
	}
	
	
	return dp[x][y] % 1000000000;
}
}
