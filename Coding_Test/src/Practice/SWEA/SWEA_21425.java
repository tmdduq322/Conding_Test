package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_21425 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T= Integer.parseInt(br.readLine());
	StringTokenizer st;
	for(int test_case = 1; test_case <= T; test_case++)
	{
		st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int cnt = 0;
		while(A <= N && B <= N) {
			if( A < B) {
				A += B;
			}
			else {
				B += A;
			}
			cnt ++;
		}
		sb.append("#").append(test_case).append(" ").append(cnt).append("\n");
	}
	System.out.println(sb);
}
}
