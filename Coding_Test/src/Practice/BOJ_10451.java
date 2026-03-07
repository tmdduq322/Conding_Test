package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10451 {
	static int [][] graph;
	static boolean[] visited;
	
public static void dfs(int v) {
	visited[v] = true;
	for (int i = 1; i < graph[v].length; i++) {
		int node = graph[v][i];
		if(!visited[i] && node ==1) {
			dfs(i);
		}
	}
}
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	int TC = Integer.parseInt(st.nextToken());
	while(TC-- > 0) {
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			graph[Integer.parseInt(st.nextToken())][i] = 1;
		}
		for (int i = 1; i <= N; i++) {
			if(!visited[i]) {
				dfs(i);
				cnt ++;
			}
		}
		sb.append(cnt+"\n");
	}
	System.out.println(sb);
}
}
