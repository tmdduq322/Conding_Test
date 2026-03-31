package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1859 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T= Integer.parseInt(br.readLine());
	StringTokenizer st;
	for(int test_case = 1; test_case <= T; test_case++){
		int n = Integer.parseInt(br.readLine());
		int[] day = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n ; i++) {
			day[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		long total = 0;
		for(int i = n-1 ; 0 <= i ; i--) {
			int price = day[i];
			if(max < price) {
				max = price;
			}
			else {
				total += max - price;
			}
		}
		sb.append("#").append(test_case).append(" ").append(total).append("\n");
	}
	System.out.println(sb);
}
}
