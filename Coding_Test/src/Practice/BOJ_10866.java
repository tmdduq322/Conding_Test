package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {
public static void main(String[] args) throws IOException {
	Deque<Integer> deque = new LinkedList<Integer>();
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int num = Integer.parseInt(st.nextToken());
	int x = 0;
	for (int i = 0; i < num; i++) {
		st = new StringTokenizer(br.readLine());
		String cmd = st.nextToken();
		switch(cmd) {
		case "push_front":
			x = Integer.parseInt(st.nextToken());
			deque.addFirst(x);
			break;
			
		case "push_back":
			x = Integer.parseInt(st.nextToken());
			deque.addLast(x);
			break;
			
		case "pop_front":
			if(deque.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				x= deque.removeFirst();
				sb.append(x).append("\n");
				break;
			}
			
		case "pop_back":
			if(deque.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				x = deque.removeLast();
				sb.append(x).append("\n");
				break;
			}
		case "size":
			sb.append(deque.size()).append("\n");
			break;
			
		case "empty":
			if(deque.isEmpty()) {
				sb.append(1).append("\n");
				break;
			}
			else {
				sb.append(0).append("\n");
				break;
			}
			
		case "front":
			if(deque.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				sb.append(deque.peekFirst()).append("\n");
				break;
			}
			
		case "back" :
			if(deque.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				sb.append(deque.peekLast()).append("\n");
				break;
			}
		}
	}
	System.out.println(sb);
	br.close();
}
}
