package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
	public static int cnt =0;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] Cab = new int[M][N];
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				Cab[a][b] = 1;
			}
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < M; x++) {
					if (Cab[x][y] == 1) {
						cnt ++;
						dfs(M,N,Cab,x,y);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	public static void dfs(int m, int n,int[][]Cab, int x, int y) {
		Cab [x][y] = 0;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if ( 0<=nx && nx<m && 0<=ny && ny<n ) {
				if(Cab[nx][ny] == 1 ) {
					dfs(m,n,Cab,nx,ny);
				}
				
			}
		}
	}
}
