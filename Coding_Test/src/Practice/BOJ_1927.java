package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {
	
public static void main(String[] args) throws IOException {
	PriorityQueue<Integer> pQ = new PriorityQueue<>();
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
				int rst = pQ.poll();
				sb.append(rst).append("\n");
				continue;
			}
		}
		pQ.offer(x);
	}
	System.out.println(sb);
}
}
