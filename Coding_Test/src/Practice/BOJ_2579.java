package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
	static Long[][] dp;
	static Long [] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	dp = new Long[N+1][2]; //x까지 왔을 때 최대값, y = 0이면 2칸을 탔을 경우, y = 1이면 1칸을 탔을 경우
	arr = new Long[N];
	for (int i = 0; i <N; i++) {
		arr[i] = Long.parseLong(br.readLine());
	}
	dp[0][1] = dp[0][0] = 0L;
	dp[1][1] = dp[1][1] = arr[0];
	System.out.println(Math.max(recur(N,0),recur(N,1)));
}

public static long recur(int x,int cnt) {
	if (x <= 0) return 0;
	
	if (dp[x][cnt] != null) return dp[x][cnt];
	
	if(cnt == 0) { // 2칸 타고 온 경우 그 전에 1칸타고 온 경우와 2칸타고 온 경우 비고
		dp[x][cnt] = Math.max(recur(x-2,1), recur(x-2,0)) + arr[x-1];
	}
	else { // 1칸 타고 온 경우 그 전에는 2칸타고 왔을테니 2칸타고온 경우만 생각
		dp[x][cnt] = recur(x-1,0) + arr[x-1];
	}
	return dp[x][cnt];
}
}
