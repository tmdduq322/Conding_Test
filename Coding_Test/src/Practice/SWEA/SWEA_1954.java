package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1954 {
	static int[][] snail;
	static int N;
	static boolean[][] visited;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
public static void main(String[] args) throws NumberFormatException, IOException {
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	for (int tc = 1; tc <= T; tc++) {
		N = Integer.parseInt(br.readLine());
		snail = new int[N][N];
		visited = new boolean[N][N];
		dfs(1,0,0,0);
		
		sb.append("#" + tc );
		for (int i = 0; i < N; i++) {
			sb.append("\n");
			for (int j = 0; j < N; j++) {
				sb.append(snail[i][j]+ " ");
			}
		}
		sb.append("\n");
	}
	System.out.println(sb);
}

public static void dfs(int v,int y, int x,int dir) {
	visited[y][x] = true;
	snail[y][x] = v;
	int nx = x + dx[dir%4];
	int ny = y + dy[dir%4];
	if( 0 <= nx && nx < N && 0 <= ny && ny < N && !visited[ny][nx] ) {//방향대로 가기
		dfs(v+1,ny,nx,dir);
	}
	else {// 방향 바꾸기
		dir ++;
		int nnx = x + dx[dir%4];
		int nny = y + dy[dir%4];
		if( 0 <= nnx && nnx < N && 0 <= nny && nny < N && !visited[nny][nnx] ) {
			dfs(v+1,nny,nnx,dir);
		}
	}
}
}
