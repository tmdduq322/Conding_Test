package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_11866 {
	public static void main(String[] args) throws IOException{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int index = 0;
		sb.append("<");
		for (int i = 1; i <= N; i++) {
			ll.add(i);
		}
		
		while(N>1) {
			index = (index + (K-1))%N;
			sb.append(ll.remove(index)).append(", ");
			N--;
		}
		sb.append(ll.remove(0)).append(">");
		System.out.println(sb);
		br.close();
	}

}
