package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2493 {
public static void main(String[] args) throws IOException {
	Stack<int[]> stack = new Stack<int[]>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(st.nextToken());
	st = new StringTokenizer(br.readLine());
	for (int i = 1; i <= N; i++) {
		int height = Integer.parseInt(st.nextToken());
		while(!stack.isEmpty()) {
			if (height <= stack.peek()[1]) {
				sb.append(stack.peek()[0]+ " ");
				break;
			}
			else {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			sb.append("0 ");
		}
		stack.add(new int [] {i,height});
	}
	System.out.println(sb);
}
}
