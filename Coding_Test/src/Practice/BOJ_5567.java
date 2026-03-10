package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5567 {
	static int arr[][];
	static boolean visited[];
	
public static void bfs(int n) {
	Queue<Integer> q = new LinkedList<Integer>();
	visited[n] = true;
	q.offer(n);
	int cnt = 0;
	while(!q.isEmpty()) {
		if (cnt == 2) {
			break;
		}
		int qs = q.size();
		for (int j = 0; j < qs; j++) {
			int node = q.poll();
			for (int i = 1; i < arr[node].length; i++) {
				if( arr[node][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		cnt ++;
	}
}
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int n = Integer.parseInt(br.readLine());
	int m = Integer.parseInt(br.readLine());
	visited = new boolean[n+1];
	arr = new int[n+1][n+1];
	for (int i = 0; i < m; i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		arr[a][b] = 1;
		arr[b][a] = 1;
	}
	bfs(1);
	int rst = 0;
	for (int i = 2; i <= n; i++) {
		if(visited[i] == true) {
			rst ++;
		}
	}
	System.out.println(rst);
}
}
