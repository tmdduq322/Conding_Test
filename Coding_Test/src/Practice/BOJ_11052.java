package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11052 {
	static Integer[] dp;
	static int[] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
	 arr= new int[n+1];
     dp = new Integer[n+1];
     StringTokenizer st = new StringTokenizer(br.readLine());
     for (int i = 1; i <= n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
     }
     dp[0] = 0;
     System.out.println(budget(n));
}

public static int budget(int n) {
	if(dp[n] == null) {
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, budget(n-i) + arr[i]);
		}
		dp[n] = max;
	}
	return dp[n];
}
}
