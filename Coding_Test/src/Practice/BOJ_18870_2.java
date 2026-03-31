package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870_2 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	HashMap<Integer, Integer> hm = new HashMap<>();
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	int[] arr = new int[N];
	int[] sorted= new int[N];
	StringTokenizer st = new StringTokenizer(br.readLine());
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sorted[i] =Integer.parseInt(st.nextToken());
	}
	Arrays.sort(sorted);
	int rank = 0;
	for(int num : sorted) {
		if(!hm.containsKey(num)) {
			hm.put(num, rank++);
		}
	}
	for(int num : arr) {
		sb.append(hm.get(num)+" ");
	}
	System.out.println(sb);
}
}
