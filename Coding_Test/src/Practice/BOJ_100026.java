package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_100026 {
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static int n;
public static void dfs(int y, int x) {
	visited[y][x] = true;
	char color = arr[y][x];
	if(color == 'G') {
		arr[y][x] = 'R';
	}
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		if(0 < nx && nx <= n && 0 < ny && ny <= n) {
			if(arr[ny][nx] == color && !visited[ny][nx]) {
				dfs(ny,nx);
			}
		}
	}
}
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	n = Integer.parseInt(br.readLine());
	arr = new char[n+1][n+1];
	for (int i = 1; i <= n; i++) {
		String s = br.readLine();
		for (int j = 1; j <= n; j++) {
			arr[i][j] = s.charAt(j-1);
		}
	}
	int cnt = 2;
	while (cnt-- > 0) {
		int rst = 0;
		visited = new boolean[n+1][n+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					rst ++;
				}
			}
		}
		sb.append(rst + " ");
	}
	System.out.println(sb);
}
}
