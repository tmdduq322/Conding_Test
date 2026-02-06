package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
	public static ArrayList<ArrayList<Integer>> LL = new ArrayList<ArrayList<Integer>>();
	
	static void dfs(int V,boolean[] visited) {
		visited[V] = true;
		System.out.print(V + " ");
		int y = 0;
		for (int i = 0; i < LL.get(V).size(); i++) {
			y = LL.get(V).get(i);
			if(!visited[y]) {
				dfs(y,visited);
			}
		}
	}
	
	static void bfs(int V, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(V);
		visited[V] = true;
		int x= 0;
		int y = 0;
		while(!q.isEmpty()) {
			x= q.poll();
			System.out.print(x + " ");
			for (int i = 0; i < LL.get(x).size(); i++) {
				y = LL.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		boolean[] visited_d = new boolean[N+1]; 
		boolean[] visited_b = new boolean[N+1]; 
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i <= N; i++) {
		    LL.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			LL.get(a).add(b);
			LL.get(b).add(a);
		}
		for (int i = 1; i < LL.size(); i++) {
			Collections.sort(LL.get(i));
		}
		dfs(V, visited_d);
		System.out.print("\n");
		bfs(V, visited_b);
		br.close();
	}
}
