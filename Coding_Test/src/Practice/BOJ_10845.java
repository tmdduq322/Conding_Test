package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_10845 {
public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	StringBuilder sb = new StringBuilder();
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int cnum = 0;
	for (int i = 0; i < num; i++) {
		String cmd = sc.next();
		switch(cmd) {
		case "push":
			int x = cnum = sc.nextInt();
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
	sc.close();
}
}
