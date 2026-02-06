package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2606 {
	public static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	public static int cnt = 0;
	public static void dfs(int s, boolean[] visited) {
		int y = 0;
		visited[s] = true;
		for (int i = 0; i < al.get(s).size(); i++) {
			y = al.get(s).get(i);
			if (!visited[y]) {
				cnt ++;
				dfs(y, visited);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		boolean [] visited = new boolean[m+1];
		for (int i = 0; i <= m; i++) {
			al.add(new ArrayList<Integer>());
		}
		int a= 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			al.get(a).add(b);
			al.get(b).add(a);
		}
		dfs(1, visited);
		System.out.println(cnt);
		br.close();
	}
}
