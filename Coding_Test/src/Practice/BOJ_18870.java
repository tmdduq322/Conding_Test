package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	HashMap<Integer,Integer> Hm = new HashMap<Integer,Integer>();
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int[] arr = new int [N];
	int[] sorted = new int[N];
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < N; i++) {
		arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
	}
	
	Arrays.sort(sorted);
	int rank = 0;
	
	for (int s : sorted) {
		if(!Hm.containsKey(s)) {
			Hm.put(s, rank++);
		}
	}
	StringBuilder sb = new StringBuilder();
	for(int key : arr) {
		int ranking = Hm.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
		sb.append(ranking).append(' ');
	}
	
	System.out.println(sb);
	br.close();
}
}
