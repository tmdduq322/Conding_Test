package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
	static boolean visited[] =  new boolean[100001] ;
	static int K;
	static int cnt=0;
	
public static void bfs(int n) {
	Queue<Integer> q = new LinkedList<Integer>();
	q.offer(n);
	visited[n] = true;
	while(true) {
		if (visited[K]) {
			break;
		}
		int qs = q.size();
		for (int i = 0; i < qs; i++) {
			int node = q.poll();
			int a = node - 1;
			int b = node + 1;
			int c = node * 2;
			if (0 <= a && a <=100000 && !visited[a]) {
				q.offer(a);
				visited[a] = true;
			}
			if (b <=100000 && !visited[b] ){
				q.offer(b);
				visited[b] = true;
			}
			if (c <=100000 && !visited[c]) {
				q.offer(c);
				visited[c] = true;
			}
		}
		cnt ++;
	}
}
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	K = Integer.parseInt(st.nextToken());
	bfs(N);
	System.out.println(cnt);
}
}
