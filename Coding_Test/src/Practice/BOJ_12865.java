package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12865 {
	static Integer[][] dp;
	static int[] W;
	static int[] V;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	W = new int[n+1];
	V = new int[n+1];
	int k = Integer.parseInt(st.nextToken());
	dp = new Integer[n+1][k+1];
	for (int i = 1; i <= n; i++) {
		st = new StringTokenizer(br.readLine());
		W[i] = Integer.parseInt(st.nextToken());
		V[i] = Integer.parseInt(st.nextToken());
	}
	System.out.println(bag(n, k));
	
}
public static int bag(int n,int k) {
	if(n<0) {
		return 0;
	}
	
	if(dp[n][k] == null) {
		if(W[n] > k) {
			return bag(n-1,k);	
		}
		else {
			dp[n][k] = Math.max(bag(n-1,k), bag(n-1,k-W[n])+V[n]); 
		}
	}
	return dp[n][k];
}
}
