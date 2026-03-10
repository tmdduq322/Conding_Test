package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2667 {
	static int n;
	static int arr[][];
	static boolean [][]visited;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static StringBuilder sb = new StringBuilder();
	static int cnt;
	
	
public static void dfs(int y, int x) {
	visited[y][x] = true;
	cnt ++;
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		if(0 < nx && nx <= n && 0 < ny && ny <= n && arr[ny][nx] == 1 && !visited[ny][nx]) {
			dfs(ny,nx);
		}
	}
}
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	ArrayList<Integer> al = new ArrayList<Integer>();
	n = Integer.parseInt(br.readLine());
	arr = new int[n+1][n+1];
	visited = new boolean[n+1][n+1];
	for (int i = 1; i <= n; i++) {
		String s = br.readLine();
		for (int j = 1; j <= n; j++) {
			arr[i][j] = ((int)s.charAt(j-1)) - 48 ;
		}
	}
	int num = 0;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if(arr[i][j] == 1 && !visited[i][j]) {
				dfs(i,j);
				num += 1;
				al.add(cnt);
				cnt = 0;
			}
		}
	}
	Collections.sort(al);
	for (int i = 0; i < al.size(); i++) {
		sb.append(al.get(i)+"\n");
	}
	System.out.println(num + "\n" +sb);
}
}
