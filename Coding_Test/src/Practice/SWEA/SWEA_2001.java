package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2001 {
static int [][] fly;
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T = Integer.parseInt(br.readLine());
	StringTokenizer st;
	for (int tc = 1; tc <= T; tc++) {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		fly = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				fly[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int max = 0;
		for (int i = 0; i < N -M+1; i++) {
			for (int j = 0; j < N - M+1; j++) {
				int tmp = total(i,j,M);
				max = Math.max(max, tmp);
			}
		}
		sb.append("#" + tc + " ").append(max).append("\n");
	}
	System.out.println(sb);
}

public static int total(int y, int x, int M) {
	int rst = 0;
	for (int i = y; i < y + M; i++) {
		for (int j = x; j < x + M; j++) {
			rst += fly[i][j];
		}
	}
	return rst;
}
}
