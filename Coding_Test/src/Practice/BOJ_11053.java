package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11053 {
	static int[] dp;
	static int[] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp = new int[N];
	arr = new int[N];
	StringTokenizer st = new StringTokenizer(br.readLine());
	for (int i = 0; i < N; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	int max = 0;
	for (int i = 0; i < N; i++) {
		max = Math.max(Su(i),max);
	}
	System.out.println(max);
}

public static int Su(int n) {
	if(dp[n] == 0) {
		dp[n] = 1;
		for (int i = n-1; i >= 0; i--) {
			if(arr[i] < arr[n]) {
				dp[n] = Math.max(dp[n], Su(i)+1);
			}
		}
	}
	return dp[n];
}
}
