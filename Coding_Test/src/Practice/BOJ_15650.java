package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650 {
	static boolean[] visited;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	visited = new boolean[N];
	arr = new int[M];
	backtraking(N,M,1,0);
	System.out.println(sb);
}

public static void backtraking(int N, int M,int at, int depth){
	if (depth == M) {
		for(int val : arr) {
			sb.append(val).append(' ');
		}
		sb.append('\n');
		return;
	}
	
	for (int i = at ; i <= N; i++) {	
		arr[depth] = i;
		backtraking(N, M, i+1, depth+1);
	}
	
}
}
