package Practice;

import java.util.Scanner;

public class BOJ_10974 {
	 static int N;
	 static int [] arr;
	 static boolean [] visited = new boolean[9];
	 static StringBuilder sb = new StringBuilder();
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	arr = new int[N];
	backtraking(0);
	System.out.println(sb);
	sc.close();
}

public static void backtraking(int depth) {
	if(depth == N) {
		for(int val : arr) {
			sb.append(val).append(" ");
		}
		sb.append("\n");
		return;
	}
	for (int i = 0; i < N; i++) {
		if(!visited[i]) {
			visited[i] = true;
			arr[depth] = i+1;
			backtraking(depth+1);
			visited[i] = false;
		}
	}
}
}
