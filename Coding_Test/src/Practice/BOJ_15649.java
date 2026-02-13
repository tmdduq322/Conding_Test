package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {
	static boolean[] visited; 
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		arr = new int[M];
		backtraking(N,M,0);
		System.out.println(sb);
		br.close();
	}
	
	
	public static void backtraking(int N, int M, int depth) {
		if (depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				backtraking(N, M, depth + 1);
				visited[i] = false;
			}
		}
	}
}

