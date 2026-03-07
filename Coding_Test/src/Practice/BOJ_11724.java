package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11724 {
	public static int [][] graph;
	static boolean[] visited;
	static int cnt = 0;
	
public static void dfs(int v) {
	visited[v] = true;
	for (int i = 0; i < graph[v].length; i++) {
		if(!visited[i] && graph[v][i] == 1) {
			dfs(i);
		}
	}
}

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	visited = new boolean[N+1];
	int M = Integer.parseInt(st.nextToken());
	graph = new int[N+1][N+1];
	for (int i = 0; i < M; i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		graph[a][b] = 1;
		graph[b][a] = 1;
	}
	for (int i = 1; i <= N; i++) {
		if(!visited[i]) {
			dfs(i);
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
