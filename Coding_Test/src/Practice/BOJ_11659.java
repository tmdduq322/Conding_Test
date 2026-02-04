package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(st.nextToken());
		int qNo = Integer.parseInt(st.nextToken());
		long[]s = new long[suNo+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < suNo+1; i++) {
			s[i] = s[i-1] + Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < qNo; j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(s[end]-s[start-1]);
		}
	}

}
