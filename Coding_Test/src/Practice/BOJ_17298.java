package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
public static void main(String[] args) throws IOException {
	Stack<int[]> stack = new Stack<int[]>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(st.nextToken());
	int []rst = new int[N];
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < N; i++) {
		int num = Integer.parseInt(st.nextToken());
		while(!stack.isEmpty() && stack.peek()[1] < num) { // 스택이 비지 않고 받은 값이 더 클때
			rst[stack.peek()[0]] = num;
			stack.pop();
		}
		stack.push(new int[] {i,num});
	}
	while(!stack.isEmpty()) {
		rst[stack.pop()[0]] = -1;
	}
	
	for (int i = 0; i < N; i++) {
		sb.append(rst[i] + " ");
	}
	System.out.println(sb);
}
}
