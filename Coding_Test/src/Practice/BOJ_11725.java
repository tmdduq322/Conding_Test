package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11725 {
	static int[] parent;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>>al = new ArrayList<ArrayList<Integer>>(); 
	
public static void dfs(int node) {
	visited[node] = true;
	for (int i = 0; i < al.get(node).size(); i++) {
		int n = al.get(node).get(i);
		if(!visited[n]) {
			parent[n] = node;
			dfs(n);
		}
	}
}

public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st ;
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	parent = new int[N+1];
	visited = new boolean[N+1];
	for (int i = 0; i <= N; i++) {
		al.add(new ArrayList<>());
	}
	
	for (int i = 0; i < N-1; i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		al.get(a).add(b);
		al.get(b).add(a);
	}
	dfs(1);
	
	for (int i = 2; i <= N; i++) {
		sb.append(parent[i] + "\n");
	}
	System.out.println(sb);
}
}
