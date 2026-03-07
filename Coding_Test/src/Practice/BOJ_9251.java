package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9251 {
	static Integer[][] dp;
	static char[] A;
	static char[] B;
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	A = br.readLine().toCharArray();
	B = br.readLine().toCharArray();
	int al = A.length;
	int bl = B.length;
	dp = new Integer[al+1][bl+1];
	System.out.println(check(al,bl));
}

public static int check(int a,int b) {
	if(a== 0 || b == 0) {
		dp[a][b] = 0;
	}
	if (dp[a][b] == null) {
		if(A[a-1] == B[b-1]) {
			dp[a][b] = check(a-1,b-1)+1;
		}
		else {
			dp[a][b] = Math.max(check(a,b-1),check(a-1,b));
		}
	}
	return dp[a][b];
}
}
