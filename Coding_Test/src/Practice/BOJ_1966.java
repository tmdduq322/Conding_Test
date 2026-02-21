package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1966 {
public static void main(String[] args) throws IOException {
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int TC = Integer.parseInt(br.readLine());
	while(TC-- > 0) {
		LinkedList<int[]> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			queue.add(new int [] {i,Integer.parseInt(st.nextToken())});
		}
		int cnt = 0;
		while(!queue.isEmpty()) {
			int[] front = queue.poll();
			boolean isMax = true;
			for (int i = 0; i < queue.size(); i++) {
				if(front[1] < queue.get(i)[1]) {
					queue.offer(front);
					for(int j = 0; j < i; j++) {
						queue.offer(queue.poll());
					}
					isMax = false;
					break;
				}
			}
			if(isMax == false) {
				continue;
			}
			cnt ++;
			if(front[0] == M) {	
				break;
			}
		}
		sb.append(cnt).append("\n");
	}
	System.out.println(sb);
}
}
