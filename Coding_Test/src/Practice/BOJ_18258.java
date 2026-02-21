package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18258 {
public static void main(String[] args) throws IOException {
	Queue<Integer> queue = new LinkedList<Integer>();
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int num = Integer.parseInt(st.nextToken());
	int cnum = 0;
	for (int i = 0; i < num; i++) {
		st = new StringTokenizer(br.readLine());
		String cmd = st.nextToken();
		switch(cmd) {
		case "push":
			int x = cnum = Integer.parseInt(st.nextToken());
			queue.add(x);
			break;
			
		case "pop":
			if(queue.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				sb.append(queue.remove()).append("\n");
				break;
			}
			
		case "size":
			sb.append(queue.size()).append("\n");
			break;
			
		case "empty":
			if(queue.isEmpty()) {
				sb.append(1).append("\n");
				break;
			}
			else {
				sb.append(0).append("\n");
				break;
			}
			
		case "front":
			if(queue.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				sb.append(queue.peek()).append("\n");
				break;
			}
			
		case "back" :
			if(queue.isEmpty()) {
				sb.append(-1).append("\n");
				break;
			}
			else {
				sb.append(cnum).append("\n");
				break;
			}
		}
	}
	System.out.println(sb);
	br.close();
}
}
