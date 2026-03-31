package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5215 {
	static int L;
	static int[] kcal;
	static int[] score;
	static int rst;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st;
	int T = Integer.parseInt(br.readLine());
	for (int tc = 1; tc <= T; tc++) {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		kcal =  new int[N];
		score = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			score[i] = Integer.parseInt(st.nextToken());
			kcal[i] = Integer.parseInt(st.nextToken());
		}
		int max = Math.max(hambuger(N-2,0,0),hambuger(N-2,kcal[N-1],score[N-1]));
		sb.append("#" +tc+ " ").append(max).append("\n");
	}
	System.out.println(sb);
}
public static int hambuger(int n, int nkcal,int nscore) {
	if( L< nkcal) {
		return 0;
	}
	if(nkcal == L || n < 0) {
		return nscore;
	}
	return Math.max(hambuger(n-1,nkcal,nscore), hambuger(n-1,nkcal + kcal[n],nscore + score[n]));
}
}
