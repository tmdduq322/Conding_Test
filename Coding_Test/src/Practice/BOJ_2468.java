package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2468 {
static boolean[][] visited;
static int[][] arr;
static int N;
static int[] dx = {1,-1,0,0};
static int[] dy = {0,0,1,-1};
public static void dfs(int y, int x,int level) {
	visited[y][x] = true;
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		
		if (0 < nx && nx <= N && 0 < ny && ny <= N) {
			if(!visited[ny][nx] && arr[ny][nx] > level) {
				dfs(ny,nx,level);
			}
		}
	}
}


public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N = Integer.parseInt(br.readLine());
	arr = new int[N+1][N+1];
	StringTokenizer st;
	for (int i = 1; i <= N; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 1; j <= N; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}	
	int max = 0;
	boolean isOver = false;	
	int level = 0;
	while(!isOver) {
		visited = new boolean[N+1][N+1];
		isOver = true;
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int height = arr[i][j];
				if(height > level && !visited[i][j]) {
					isOver = false;
					cnt ++;
					dfs(i,j,level);
				}
			}
		}
		level ++;
		max = Math.max(max, cnt);
	}
	System.out.println(max);
	
}
}
