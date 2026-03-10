package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2589 {
	static int n;
	static int m;
	static char arr[][];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	
public static int bfs(int y,int x) {
	Queue<int[]> q = new LinkedList<int[]>();
	q.offer(new int[] {y,x});
	int[][] dist = new int[n+1][m+1];
	dist [y][x] = 1;
	int max = 0;
	
	while(!q.isEmpty()) {
		int[] node = q.poll();
		for (int j = 0; j < 4; j++) {
			int nx = node[1] + dx[j];
			int ny = node[0] + dy[j];
			if(0 < nx && nx <= m && 0 < ny && ny <= n) {
				if(arr[ny][nx] == 'L' && dist[ny][nx] == 0) {
					q.offer(new int[] {ny,nx});
					dist[ny][nx] = dist[node[0]][node[1]] + 1;
					max = Math.max(max, dist[ny][nx]);
				}
			}
		}
	}
	return max == 0 ? 0 : max-1;
}
	
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	n = Integer.parseInt(st.nextToken());
	m = Integer.parseInt(st.nextToken());
	arr = new char[n+1][m+1];
	for (int i = 1; i <= n; i++) {
		String s = br.readLine();
		for (int j = 1; j <= m; j++) {
			arr[i][j] = s.charAt(j-1);
		}
	}
	int max = 0;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {
			if(arr[i][j] == 'L') {
				max = Math.max(max, bfs(i,j));
			}
		}
	}
	System.out.println(max);
}
}
