package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_5430 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	Deque<Integer> dq = new LinkedList<Integer>();
	int TC = Integer.parseInt(br.readLine());
	while(TC-- > 0) {
		boolean error = false;
		boolean isFirst = true;
		dq.clear();
		char[] p = br.readLine().toCharArray();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer( br.readLine() , ",[]");
		for (int i = 0; i < n; i++) {
			dq.add(Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < p.length; i++) {
			if (p[i] == 'R') {
				isFirst = !isFirst;
			}
			else {// D인 상황
				if(dq.isEmpty()) {
					sb.append("error").append("\n");
					error  = true;
					break;
				}
				if(isFirst) {
					dq.poll();
				}
				else {
					dq.pollLast();
				}
			
		}
		}
		if (!error) {
			sb.append("[");
			while(!dq.isEmpty()) {
				sb.append(isFirst ? dq.pollFirst() : dq.pollLast());
				if(!dq.isEmpty()) sb.append(",");
			}
			sb.append("]").append("\n");
		}
	}
	System.out.println(sb);
	
}
}
