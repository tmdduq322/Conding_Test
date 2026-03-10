package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16234 {
	static int N;
	static int L;
	static int R;
	static int [][] arr;
	static boolean [][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	
public static int bfs(int y,int x) {
	Queue<int[]> q = new LinkedList<int[]>();
	ArrayList<int[]> al = new ArrayList<>();
	visited[y][x] = true;
	q.offer(new int [] {y,x});
	int sum = arr[y][x];
	int size = 1;
	al.add(new int [] {y,x});
	while(!q.isEmpty()) {
		int[] node = q.poll();
		for (int i = 0; i < 4; i++) {
			int nx = node[1] + dx[i];
			int ny = node[0] + dy[i];
			
			if(0 < nx && nx <= N && 0 < ny && ny <= N ) {
				int dist = Math.abs(arr[node[0]][node[1]] - arr[ny][nx]);
				if(!visited[ny][nx] && L <= dist && dist <= R) {
					int [] node2 = {ny,nx};
					q.offer(node2);
					al.add(node2);
					sum += arr[ny][nx];
					size ++;
					visited[ny][nx] = true;
				}
			}
		}
	}
	int value = sum / size;
	for (int i = 0; i < al.size(); i++) {
		int[] node = al.get(i);
		arr[node[0]][node[1]] = value; 
	}
	return size;
	
}

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	N = Integer.parseInt(st.nextToken());
	L = Integer.parseInt(st.nextToken());
	R = Integer.parseInt(st.nextToken());
	arr = new int[N+1][N+1];
	for (int i = 1; i <= N; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 1; j <= N; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	boolean isMoved = true;
	int rst = 0;
	while(isMoved) {
		isMoved = false;
		visited = new boolean[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(!visited[i][j]) {
					int size = bfs(i,j);
					if (size > 1) {
						isMoved = true;
					}
				}
			}
		}
		if(isMoved) {
			rst ++;
		}
	}
	System.out.println(rst);
	
}
}
