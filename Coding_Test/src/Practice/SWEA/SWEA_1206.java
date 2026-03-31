package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st;
	int T = 10;
	for (int test_case = 1 ; test_case <= T ; test_case ++) {
		int l = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] Apt = new int[l];
		
		for(int i = 0 ; i < l ;i++) {
			Apt[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		for(int i = 2 ; i < l-2 ; i++) {
			int max = Math.max(Apt[i-2], Math.max(Apt[i-1], Math.max(Apt[i+1], Apt[i+2])));
			int rst = Apt[i] - max;
			if(rst > 0) {
				cnt += rst;
			}
		}
		sb.append("#").append(test_case).append(" ").append(cnt).append("\n");
	}
	System.out.println(sb);
}
}
