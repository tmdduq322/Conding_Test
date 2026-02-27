package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1912 {
	static Integer[] dp;
	static int[] arr;
	static int max;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp = new Integer[N];
	arr = new int[N];
	StringTokenizer st = new StringTokenizer(br.readLine());
	for (int i = 0; i < N; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	dp[0] = arr[0];
	max = arr[0];
	Su(N-1);
	System.out.println(max);
}

static int Su(int n) {
	if (dp[n]== null) {
		dp[n] = Math.max(arr[n], Su(n-1)+arr[n]);
		}
	
	max = Math.max(max, dp[n]);
	return dp[n];
}
}
