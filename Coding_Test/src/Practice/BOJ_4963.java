package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4963 {
	static StringBuilder sb = new StringBuilder();
	static boolean[][] visited;
	static int[][] arr;
	static int[] width= {1,-1,0,0,-1,1,-1,1};
	static int[] height= {0,0,1,-1,1,1,-1,-1};
	static int cnt;
	
public static void dfs(int h, int w) {
	visited[h][w] = true;
	for (int i = 0; i < 8; i++) {
		int nw = w+width[i];
		int nh = h+height[i];
		if (0 < nw && nw < arr[1].length && 0 < nh && nh < arr.length && arr[nh][nw] == 1 &&!visited[nh][nw]) {
			dfs(nh,nw);
		}
		
	}
	
}
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	while(true) {
		cnt = 0;
		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		if (w == 0 && h == 0) {
			break;
		}
		visited = new boolean[h+1][w+1];
		arr = new int[h+1][w+1];
		for (int i = 1; i <= h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= w; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (arr[i][j] == 1 && !visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		sb.append(cnt+ "\n");
	}
	System.out.println(sb);
}
}
