package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class BOJ_10989 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		int [] a = new int[cnt];
//		for (int i = 0; i < cnt; i++) {
//			a[i] =  Integer.parseInt(br.readLine());
//		}
//		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			sb.append(a[i]).append("\n");
//		}
//		System.out.println(sb);
//	}
//}

public class BOJ_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		int [] a = new int[10001];
		for (int i = 0; i < cnt; i++) {
			a[Integer.parseInt(br.readLine())] ++;
		}
		for (int i = 1; i < 10001; i++) {
			while(a[i]>0) {
				sb.append(i).append("\n");
				a[i] --;
			}
		}
		System.out.println(sb);
	}
}