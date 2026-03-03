package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_9465 {
	static Integer[][] dp;
	static int[][] arr;
	static int N;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int TC = Integer.parseInt(st.nextToken());
	while(TC-- > 0) {
		int n = Integer.parseInt(br.readLine());
		arr = new int[2][n];
		dp = new Integer[3][n];
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = 0;
		dp[1][0] = arr[0][0];
		dp[2][0] = arr[1][0];
		bw.write(Math.max(sticker(1,n-1),sticker(2,n-1))+"\n");
	}
	bw.flush();
	bw.close();
}
public static int sticker(int x,int y) {
	if(y == 0) {
		return dp[x][y];
	}
	if(dp[x][y] == null) {
		if(x == 0) {
			dp[x][y] = Math.max(sticker(1,y-1),sticker(2,y-1));
		}
		else if(x == 1) {
			dp[x][y] = Math.max(sticker(0,y-1),sticker(2,y-1))+ arr[0][y];  
		}
		else {
			dp[x][y] =  Math.max(sticker(1,y-1),sticker(0,y-1))+ arr[1][y];  
		}
	}
	return dp[x][y];
}
}
