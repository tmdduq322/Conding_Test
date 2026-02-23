package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_11286 {

public static void main(String[] args) throws IOException {
	PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			if (Math.abs(o1) == Math.abs(o2)) return o1 - o2;
			else return Math.abs(o1) -Math.abs(o2);
		}
	});
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	while(N-- > 0) {
		int x = Integer.parseInt(br.readLine());
		if (x == 0) {
			if(pQ.isEmpty()) {
				sb.append(0).append("\n");
				continue;
			}
			else {
				sb.append(pQ.poll()).append("\n");
				continue;
			}
		}
		pQ.offer(x);
	}
	System.out.println(sb);
}
}
