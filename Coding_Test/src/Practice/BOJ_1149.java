package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
static int[][] dp;
static int[][] price;
static int N;
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	N = Integer.parseInt(st.nextToken());
	dp =new int[N][3];
	price = new int[N][3];
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < 3; j++) {
			price[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	for (int i = 0; i < 3; i++) {
		dp[0][i] = price[0][i];
	}
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < 3; i++) {
		min = Math.min(min, home(N-1,i));
	}
	System.out.println(min);
}

public static int home(int x,int color) {
	if (dp[x][color] != 0) {
		return dp[x][color];
	}
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < 3; i++) {
		if(i == color) {
			continue;
		}
		min = Math.min(min, home(x-1,i));
	}
	dp[x][color] = price[x][color] + min;
	return dp[x][color];
}
}
