package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_12852 {
static int dp[];
static int log[];// 가장 빠른 이전 상황
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	dp = new int[N+1];
	log = new int [N+1];
	dp[1] = 0;
	for (int i = 2; i <= N; i++) {
		dp[i] = dp[i-1] + 1;
		log[i] = i-1;
		
		if(i % 2 == 0 && dp[i/2] < dp[i]) {
			dp[i] = dp[i/2] + 1;
			log[i] = i/2;
		}
		
		if(i % 3 == 0 && dp[i/3] < dp[i]) {
			dp[i] = dp[i/3] + 1;
			log[i] = i/3;
		}
	}
	sb.append(dp[N]+"\n");
	int current = N;
	while(current != 0) {
		sb.append(current+" ");
		current = log[current];
	}
	System.out.println(sb);
}
}
