package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6603 {
	static int[] arr;
	static int[] sarr = new int[6];
	static int k;
	static StringBuilder sb = new StringBuilder();
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] sarr = new int[6];
	while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		if(k == 0) {
			break;
		}
		arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		bt(0,0);
		sb.append("\n");
	}
	System.out.println(sb);
}
public static void bt(int index,int depth) {
	if(depth == 6) {
		for (int val : sarr) {
			sb.append(val).append(" ");
		}
		sb.append("\n");
		return;
	}
	for (int i = index; i < k; i++) {
		sarr[depth] = arr[i]; 
        bt(i + 1, depth + 1);
	}
}


}
