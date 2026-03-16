package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5014 {
static boolean[] visited;
static int F;
static int S;
static int G;
static int U;
static int D;
public static int bfs() {
	Queue<Integer> q = new LinkedList<Integer>();
	q.offer(S);
	visited[S] = true;
	int cnt = 0;
	while(!q.isEmpty()) {
		if(visited[G]) {
			return cnt;
		}
		int qs = q.size();
		for (int i = 0; i < qs; i++) {
			int n = q.poll();
			int up = n + U;
			if (up <= F && !visited[up]) {
				q.offer(up);
				visited[up] = true;
			}
			int down = n - D;
			if (0 < down && !visited[down]) {
				q.offer(down);
				visited[down] = true;
			}
		}
		cnt ++;
	}
	return -1;
}
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	F = Integer.parseInt(st.nextToken());
	visited = new boolean[F+1];
	S = Integer.parseInt(st.nextToken());
	G = Integer.parseInt(st.nextToken());
	U = Integer.parseInt(st.nextToken());
	D = Integer.parseInt(st.nextToken());
	int rst = bfs();
	if(rst == -1) {
		System.out.println("use the stairs");
	}
	else {
		System.out.println(rst);
	}
}
}
