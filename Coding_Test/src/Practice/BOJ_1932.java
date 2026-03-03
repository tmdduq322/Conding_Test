package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {
	static Integer[][] dp;
	static int[][] arr;
	static int N;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	N = Integer.parseInt(st.nextToken());
	arr = new int[N][N];
	dp = new Integer[N][N];
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < i+1; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	for (int i = 0; i < N; i++) {
		dp[N-1][i] = arr[N-1][i];
	}
	System.out.println(recur(0,0));
}

public static int recur(int x,int y) {
	if (x == N-1) {
		return dp[x][y];
	}
	if (dp[x][y] == null) {
		dp[x][y] = Math.max(recur(x+1,y), recur(x+1,y+1)) + arr[x][y];
	}
	return dp[x][y];
	
}
}
