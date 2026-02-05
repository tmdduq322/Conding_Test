package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
	static String[] White = {"WBWBWBWB","BWBWBWBW"};
	static String[] Black = {"BWBWBWBW","WBWBWBWB"};
	
	static int getCount(int row, int col, String[] c, String[] Pattern) {
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(c[row + i].charAt(col + j) != Pattern[i%2].charAt(j)) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String [] chess = new String[N];
		
		for (int i = 0; i < N; i++) {
			chess[i] = br.readLine();
		}
		
		int rst = Integer.MAX_VALUE;
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				int Bcnt = getCount(i,j,chess,Black);
				int Wcnt = getCount(i,j,chess,White);
				rst = Math.min(rst, Math.min(Wcnt, Bcnt));
			}
		}
		br.close();
		System.out.println(rst);
	}
}
