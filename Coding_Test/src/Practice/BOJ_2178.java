package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static int [][]arr;
	static boolean [][] visited;
	static int rst;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int N;
	static int M;
	
public static void bfs(int x,int y) {
	Queue<int[]> q = new LinkedList<int[]>();
	q.offer(new int[]{y,x});
	visited[y][x] = true;
	int cnt = 1;
	while(!q.isEmpty()) {
		int qs = q.size();
		for (int j = 0; j < qs; j++) {
			int []node = (int[]) q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = node[1] + dx[i];
				int ny = node[0] + dy[i];
				if(0 < nx && nx <= M && 0 < ny && ny <= N && arr[ny][nx] == 1 && !visited[ny][nx]) {
					if(ny == N && nx == M) {
						rst = cnt+1;
						return;
					}
					q.offer(new int[]{ny,nx});
					visited[ny][nx] = true;
				}
			}
		}
		cnt ++;
	}
}
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	N = Integer.parseInt(st.nextToken());
	M = Integer.parseInt(st.nextToken());
	arr = new int [N+1][M+1];
	visited = new boolean [N+1][M+1];
	for (int i = 1; i <= N; i++) {
		String s = br.readLine();
		for (int j = 1; j <= M; j++) {
			arr[i][j] = s.charAt(j-1) - '0';
		}
	}
	rst = 0;
	bfs(1,1);
	System.out.println(rst);
}
}
