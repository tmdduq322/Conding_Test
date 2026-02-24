package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_2812 {
public static void main(String[] args) throws IOException {
	Deque<Character> dQ = new ArrayDeque<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(st.nextToken());
	int K = Integer.parseInt(st.nextToken());
	int originK= K;
	char [] cmd = br.readLine().toCharArray();
	for (int i = 0; i < N; i++) {
		while(K > 0 && !dQ.isEmpty() && dQ.peek() < cmd[i]) {
			dQ.pop();
			K--;
		}
		dQ.push(cmd[i]);
	}
	int length = N - originK;
	for (int i = 0; i < length; i++) {
		sb.append(dQ.pollLast());
	}
	System.out.println(sb.toString());
	
}
}
