package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9012 {
	public static int index;
	public static int[] stack;
	static StringBuilder sb = new StringBuilder();
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int num = Integer.parseInt(st.nextToken());
	while(num-- > 0) {
		sb.append(solve(br.readLine())).append("\n");
	}
	System.out.println(sb);
}


public static String solve(String cmd) {
	index = 0;
	for(char val : cmd.toCharArray()) {
		if (val == '(') {
			index ++;
		}
		else if (val == ')') {
			if (index == 0) {
				return "NO";
			}
			else {
				index --;
			}
		}
	}
	if (index == 0) {
		return "YES";
	}
	else {
		return "NO";
	}
}
}
