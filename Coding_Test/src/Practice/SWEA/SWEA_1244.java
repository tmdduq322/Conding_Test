package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1244 {
	static boolean [][] visited;
	static int N;
	static int max;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st;
	int T = Integer.parseInt(br.readLine());
	for (int tc = 1; tc <= T; tc++) {
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		N = Integer.parseInt(st.nextToken());
		visited = new boolean[N+1][1000000];
		max = 0;
		dfs(s,0);
		sb.append("#").append(tc).append(" ").append(max).append("\n");
	}
	System.out.println(sb);
}
public static void dfs(String s, int cnt) {
	int val = Integer.parseInt(s);
	if(visited[cnt][val]) {
		return;
	}
	visited[cnt][val] = true;
	if(cnt == N) {
		max = Math.max(max, val);
		return;
	}
	
	for (int i = 0; i < s.length()-1; i++) { // i,j 바꾸기
		for (int j = i + 1; j < s.length(); j++) {
			String tmpS = swap(i,j,s);
			dfs(tmpS,cnt +1);
		}
	}
}

public static String swap(int i, int j,String s) {
	char[] c = s.toCharArray();
	char tmp = c[i];
	c[i] = c[j];
	c[j] = tmp;
	return String.valueOf(c);
}
}
